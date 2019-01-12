package com.nonsense;

import java.util.Arrays;

import static com.nonsense.Card.allCards;

final class Pair {

  private static final Pair[][] PAIRS = allPairs();

  private static Pair[][] allPairs() {
    Pair[][] result = new Pair[81][];
    int i = 0;
    for (Card card : allCards()) {
      result[card.ordinal] = new Pair[81];
      for (Card card2 : allCards()) {
        result[card.ordinal][card2.ordinal] = new Pair(card, card2, i++);
      }
    }
    return result;
  }

  private Pair(Card card0, Card card1, int ordinal) {
    this.card0 = card0;
    this.card1 = card1;
    this.ordinal = ordinal;
  }

  final Card card0;

  final Card card1;

  final int ordinal;

  static Pair[][] getAllPairs() {
    return PAIRS;
  }

  static Pair get(Card card0, Card card1) {
    return PAIRS[card0.ordinal][card1.ordinal];
  }

  boolean isSet(Card extraCard) {
    return Triple.isSet(card0, card1, extraCard);
  }

  @Override
  public String toString() {
    return "(" +
        card0 +
        "," + card1 +
        ')';
  }
}
