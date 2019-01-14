package com.nonsense;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

final class Pair {

  private static final Pair[][] PAIRS = allPairs();

  private static Pair[][] allPairs() {
    Pair[][] result = new Pair[81][];
    int i = 0;
    for (Card card : Card.values()) {
      result[card.ordinal()] = new Pair[81];
      for (Card card2 : Card.values()) {
        if (card2.ordinal() > card.ordinal()) {
          result[card.ordinal()][card2.ordinal()] = new Pair(card, card2, i++);
        }
      }
    }
    return result;
  }

  private static Card findSetCard(Card card0, Card card1) {
    return Card.get(
        findSetColor(card0, card1),
        findSetShape(card0, card1),
        findSetShading(card0, card1),
        findSetNumber(card0, card1));
  }

  private static Color findSetColor(Card card0, Card card1) {
    if (card0.color == card1.color) {
      return card0.color;
    }
    int result = (card0.color.ordinal() + 1) % 3;
    if (result == card1.color.ordinal()) {
      result = (result + 1) % 3;
    }
    return Color.values()[result];
  }

  private static Shape findSetShape(Card card0, Card card1) {
    if (card0.shape == card1.shape) {
      return card0.shape;
    }
    int result = (card0.shape.ordinal() + 1) % 3;
    if (result == card1.shape.ordinal()) {
      result = (result + 1) % 3;
    }
    return Shape.values()[result];
  }

  private static Shading findSetShading(Card card0, Card card1) {
    if (card0.shading == card1.shading) {
      return card0.shading;
    }
    int result = (card0.shading.ordinal() + 1) % 3;
    if (result == card1.shading.ordinal()) {
      result = (result + 1) % 3;
    }
    return Shading.values()[result];
  }

  private static Number findSetNumber(Card card0, Card card1) {
    if (card0.number == card1.number) {
      return card0.number;
    }
    int result = (card0.number.ordinal() + 1) % 3;
    if (result == card1.number.ordinal()) {
      result = (result + 1) % 3;
    }
    return Number.values()[result];
  }

  private Pair(Card card0, Card card1, int ordinal) {
    this.card0 = card0;
    this.card1 = card1;
    this.setCard = findSetCard(card0, card1);
    this.ordinal = ordinal;
  }

  final Card card0;

  final Card card1;

  final Card setCard;

  final int ordinal;

  static Stream<Pair> getAllPairs() {
    Iterator<Pair> ito = new Iterator<>() {
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
    if (card1.ordinal() > card0.ordinal()) {
      return PAIRS[card0.ordinal()][card1.ordinal()];
    } else {
      return PAIRS[card1.ordinal()][card0.ordinal()];
    }
  }

  boolean isSet(Card extraCard) {
    return extraCard == setCard;
  }

  @Override
  public String toString() {
    return "(" +
        card0 +
        "," + card1 +
        ')';
  }
}
