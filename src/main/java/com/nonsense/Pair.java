package com.nonsense;

import static com.nonsense.Triple.isEqualOrDistinct;

class Pair {

  private static final Pair INSTANCE = new Pair();

  private Pair() {
  }

  private Card card0;

  private Card card1;

  static Pair get(Card card0, Card card1) {
    INSTANCE.card0 = card0;
    INSTANCE.card1 = card1;
    return INSTANCE;
  }

  Card getCard0() {
    return card0;
  }

  Card getCard1() {
    return card1;
  }

  boolean isSet(Card extraCard) {
    return isEqualOrDistinct(card0.color, card1.color, extraCard.color)
        &&
        isEqualOrDistinct(card0.shape, card1.shape, extraCard.shape)
        &&
        isEqualOrDistinct(card0.shading, card1.shading, extraCard.shading)
        &&
        isEqualOrDistinct(card0.number, card1.number, extraCard.number);
  }


  @Override
  public String toString() {
    return "(" +
        card0 +
        "," + card1 +
        ')';
  }
}
