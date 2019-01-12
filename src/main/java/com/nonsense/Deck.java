package com.nonsense;

import java.util.*;
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
    Iterator<Card> it = cards.iterator();
    if (!it.hasNext()) {
      return true;
    }
    Card first = it.next();
    List<Card> rest = new ArrayList<>(cards.size() - 1);
    while (it.hasNext()) {
      rest.add(it.next());
    }
    return isIndependent(rest, first);
  }

  static boolean isIndependent(Collection<Card> cards, Card extraCard) {
    Stream<Pair> pairs = allPairs(cards);
    Optional<Pair> set = pairs.filter(pair -> pair.isSet(extraCard)).findFirst();
    return !set.isPresent();
  }

  static Optional<Card> expand(List<Card> cards) {
    for (Card candidate : Card.allCards()) {
      if (cards.contains(candidate)) {
        continue;
      }
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

  static List<Card> randomIndependentCards(int n) {
    List<Card> cards = new ArrayList<>(n);
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
      return Collections.emptyList();
    }
    return cards;
  }
}
