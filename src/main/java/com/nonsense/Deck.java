package com.nonsense;

class Deck {

  static <E extends Enum<E>> boolean isEqualOrDistinct(
      Enum<E> property0,
      Enum<E> property1,
      Enum<E> property2) {
    if (property0 == property1) {
      return property1 == property2;
    }
    return property1 != property2 && property0 != property2;
  }

  static boolean isSet(
      Card card0,
      Card card1,
      Card card2) {
    return isEqualOrDistinct(card0.color, card1.color, card2.color)
        &&
        isEqualOrDistinct(card0.shape, card1.shape, card2.shape)
        &&
        isEqualOrDistinct(card0.pattern, card1.pattern, card2.pattern)
        &&
        isEqualOrDistinct(card0.number, card1.number, card2.number);
  }
}
