package com.nonsense;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Optional;
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

  private static Stream<Pair> allPairs(Collection<Card> cards) {
    if (cards.size() < 2) {
      return Stream.empty();
    }
    Iterable<Pair> it = () -> new PairIterator(cards);
    return StreamSupport.stream(it.spliterator(), false);
  }

  static boolean isIndependent(EnumSet<Card> cards) {
    Iterator<Card> it = cards.iterator();
    if (!it.hasNext()) {
      return true;
    }
    Card first = it.next();
    EnumSet<Card> rest = EnumSet.noneOf(Card.class);
    while (it.hasNext()) {
      rest.add(it.next());
    }
    return isIndependent(rest, first);
  }

  static boolean isIndependent(EnumSet<Card> cards, Card extraCard) {
    Stream<Pair> pairs = allPairs(cards);
    Optional<Pair> set = pairs.filter(pair -> pair.isSet(extraCard)).findFirst();
    return set.isEmpty();
  }

  static Optional<Card> expand(EnumSet<Card> cards) {
    for (Card candidate : Card.values()) {
      if (cards.contains(candidate)) {
        continue;
      }
      if (isIndependent(cards, candidate)) {
        return Optional.of(candidate);
      }
    }
    return Optional.empty();
  }

  static boolean isNonExtensible(Collection<Card> cards) {
    EnumSet<Card> set = EnumSet.noneOf(Card.class);
    allPairs(cards).forEach(pair -> set.add(pair.setCard));
    return set.size() == 81 - cards.size();
  }

  static EnumSet<Card> randomIndependentCards(int n) {
    EnumSet<Card> cards = EnumSet.noneOf(Card.class);
    int breaker = 1000000;
    while (breaker > 0 && cards.size() < n) {
      breaker--;
      Card card = Card.randomCard();
      if (cards.contains(card)) {
        continue;
      }
      if (isIndependent(cards, card)) {
        cards.add(card);
      }
    }
    if (cards.size() < n) {
      return EnumSet.noneOf(Card.class);
    }
    return cards;
  }
}
