package com.nonsense;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

class Deck {

  static Stream<Triple> allTriples(List<Card> cards) {
    if (cards.size() < 3) {
      return Stream.empty();
    }
    Iterable<Triple> it = () -> new TripleIterator(cards);
    return StreamSupport.stream(it.spliterator(), false);
  }

  static boolean isIndependent(List<Card> cards) {
    return allTriples(cards).noneMatch(Triple::isSet);
  }


  static Optional<Card> expand(List<Card> cards) {
    for (Card candidate : Card.allCards()) {
      List<Card> newList = new ArrayList<>(cards.size() + 1);
      newList.addAll(cards);
      newList.add(candidate);
      if (isIndependent(newList)) {
        return Optional.of(candidate);
      }
    }
    return Optional.empty();
  }
}
