package com.nonsense;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static com.nonsense.Card.allCards;

final class Pair {

  private static final Pair[][] PAIRS = allPairs();

  private static Pair[][] allPairs() {
    Pair[][] result = new Pair[81][];
    int i = 0;
    for (Card card : allCards()) {
      result[card.ordinal] = new Pair[81];
      for (Card card2 : allCards()) {
        if (card2.ordinal > card.ordinal) {
          result[card.ordinal][card2.ordinal] = new Pair(card, card2, i++);
        }
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

  static Stream<Pair> getAllPairs() {
    Iterator<Pair> ito = new Iterator<Pair>() {
      int i = 0, j = 1;

      @Override
      public boolean hasNext() {
        return i >= 0;
      }

      @Override
      public Pair next() {
        Pair pair = PAIRS[i][j];
        if (j < 80) {
          j++;
        } else if (i < 79) {
          i++;
          j = i + 1;
        } else {
          i = -1; // stop signal
        }
        return pair;
      }
    };
    Iterable<Pair> it = () -> ito;
    return StreamSupport.stream(it.spliterator(), false);
  }

  static Pair get(Card card0, Card card1) {
    if (card1.ordinal > card0.ordinal) {
      return PAIRS[card0.ordinal][card1.ordinal];
    } else {
      return PAIRS[card1.ordinal][card0.ordinal];
    }
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
