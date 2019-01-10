package com.nonsense;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

class Deck {

  static Stream<Triple> allTriples(Collection<Card> cards) {
    if (cards.size() < 3) {
      return Stream.empty();
    }
    Iterable<Triple> it = () -> new TripleIterator(cards);
    return StreamSupport.stream(it.spliterator(), false);
  }

  static Stream<Pair> allPairs(Collection<Card> cards) {
    if (cards.size() < 2) {
      return Stream.empty();
    }
    Iterable<Pair> it = () -> new PairIterator(cards);
    return StreamSupport.stream(it.spliterator(), false);
  }

  static boolean isIndependent(Collection<Card> cards) {
    Optional<Triple> set = allTriples(cards).filter(Triple::isSet).findFirst();
    return !set.isPresent();
  }

  static boolean isIndependent(Collection<Card> cards, Card extraCard) {
    Stream<Pair> pairs = allPairs(cards);
    Optional<Pair> set = pairs.filter(pair -> pair.isSet(extraCard)).findFirst();
    return !set.isPresent();
  }

  static Optional<Card> expand(List<Card> cards) {
    for (Card candidate : Card.allCards()) {
      if (isIndependent(cards, candidate)) {
        return Optional.of(candidate);
      }
    }
    return Optional.empty();
  }

  static Set<Card> randomCards(int n) {
    Set<Card> cards = new HashSet<>(n);
    while (cards.size() < n) {
      cards.add(Card.randomCard());
    }
    return cards;
  }

  static Set<Card> randomIndependentCards(int n) {
    Set<Card> cards = new HashSet<>(n);
    while (cards.size() < n) {
      Card card = Card.randomCard();
      if (!cards.contains(card)) {
        cards.add(card);
      }
    }
    return cards;
  }
}
