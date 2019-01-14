package com.nonsense;

import java.util.stream.Stream;

import static com.nonsense.Card.allCards;

final class Triple {

  private static final Triple[][] TRIPLES = allTriples();

  private static Triple[][] allTriples() {
    Triple[][] triples = new Triple[81 * 81][];
    Stream<Pair> pairs = Pair.getAllPairs();
    pairs.forEach(pair -> {
      triples[pair.ordinal] = new Triple[81];
      for (Card card : allCards()) {
        triples[pair.ordinal][card.ordinal()] = new Triple(pair, card);
      }
    });
    return triples;
  }

  private Triple(Pair pair, Card card) {
    this.pair = pair;
    this.card = card;
  }

  private final Pair pair;

  private final Card card;

  static Triple get(Card card0, Card card1, Card card2) {
    Pair pair = Pair.get(card0, card1);
    return TRIPLES[pair.ordinal][card2.ordinal()];
  }

  private static <E extends Enum<E>> boolean isEqualOrDistinct(
      Enum<E> property0,
      Enum<E> property1,
      Enum<E> property2) {
    if (property0 == property1) {
      return property1 == property2;
    }
    return property1 != property2 && property0 != property2;
  }

  static boolean isSet(Card card0, Card card1, Card card2) {
    return isEqualOrDistinct(card0.color, card1.color, card2.color)
        &&
        isEqualOrDistinct(card0.shape, card1.shape, card2.shape)
        &&
        isEqualOrDistinct(card0.shading, card1.shading, card2.shading)
        &&
        isEqualOrDistinct(card0.number, card1.number, card2.number);
  }

  boolean isSet() {
    return isSet(pair.card0, pair.card1, card);
  }

  @Override
  public String toString() {
    return "(" +
        pair.card0 +
        "," + pair.card1 +
        "," + card +
        ')';
  }
}
