package com.nonsense;

class Triple {

  private static final Triple INSTANCE = new Triple();

  private Triple() {
  }

  private Card card0;

  private Card card1;

  private Card card2;

  static Triple get(Card card0, Card card1, Card card2) {
    INSTANCE.card0 = card0;
    INSTANCE.card1 = card1;
    INSTANCE.card2 = card2;
    return INSTANCE;
  }

  static <E extends Enum<E>> boolean isEqualOrDistinct(
      Enum<E> property0,
      Enum<E> property1,
      Enum<E> property2) {
    if (property0 == property1) {
      return property1 == property2;
    }
    return property1 != property2 && property0 != property2;
  }

  boolean isSet() {
    return isEqualOrDistinct(card0.color, card1.color, card2.color)
        &&
        isEqualOrDistinct(card0.shape, card1.shape, card2.shape)
        &&
        isEqualOrDistinct(card0.shading, card1.shading, card2.shading)
        &&
        isEqualOrDistinct(card0.number, card1.number, card2.number);
  }

  Card getCard0() {
    return card0;
  }

  Card getCard1() {
    return card1;
  }

  Card getCard2() {
    return card2;
  }

  @Override
  public String toString() {
    return "(" +
        card0 +
        "," + card1 +
        "," + card2 +
        ')';
  }
}
