package com.nonsense;

import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import static com.nonsense.Color.GREEN;
import static com.nonsense.Color.PURPLE;
import static com.nonsense.Color.RED;
import static com.nonsense.Number.ONE;
import static com.nonsense.Number.THREE;
import static com.nonsense.Number.TWO;
import static com.nonsense.Shading.OUTLINED;
import static com.nonsense.Shading.SOLID;
import static com.nonsense.Shading.STRIPED;
import static com.nonsense.Shape.DIAMONDS;
import static com.nonsense.Shape.OVALS;
import static com.nonsense.Shape.SQUIGGLES;

enum Card {

  ONE_OUTLINED_RED_SQUIGGLE(ONE, OUTLINED, RED, SQUIGGLES),
  ONE_OUTLINED_RED_OVAL(ONE, OUTLINED, RED, OVALS),
  ONE_OUTLINED_RED_DIAMOND(ONE, OUTLINED, RED, DIAMONDS),
  ONE_OUTLINED_PURPLE_SQUIGGLE(ONE, OUTLINED, PURPLE, SQUIGGLES),
  ONE_OUTLINED_PURPLE_OVAL(ONE, OUTLINED, PURPLE, OVALS),
  ONE_OUTLINED_PURPLE_DIAMOND(ONE, OUTLINED, PURPLE, DIAMONDS),
  ONE_OUTLINED_GREEN_SQUIGGLE(ONE, OUTLINED, GREEN, SQUIGGLES),
  ONE_OUTLINED_GREEN_OVAL(ONE, OUTLINED, GREEN, OVALS),
  ONE_OUTLINED_GREEN_DIAMOND(ONE, OUTLINED, GREEN, DIAMONDS),
  ONE_STRIPED_RED_SQUIGGLE(ONE, STRIPED, RED, SQUIGGLES),
  ONE_STRIPED_RED_OVAL(ONE, STRIPED, RED, OVALS),
  ONE_STRIPED_RED_DIAMOND(ONE, STRIPED, RED, DIAMONDS),
  ONE_STRIPED_PURPLE_SQUIGGLE(ONE, STRIPED, PURPLE, SQUIGGLES),
  ONE_STRIPED_PURPLE_OVAL(ONE, STRIPED, PURPLE, OVALS),
  ONE_STRIPED_PURPLE_DIAMOND(ONE, STRIPED, PURPLE, DIAMONDS),
  ONE_STRIPED_GREEN_SQUIGGLE(ONE, STRIPED, GREEN, SQUIGGLES),
  ONE_STRIPED_GREEN_OVAL(ONE, STRIPED, GREEN, OVALS),
  ONE_STRIPED_GREEN_DIAMOND(ONE, STRIPED, GREEN, DIAMONDS),
  ONE_SOLID_RED_SQUIGGLE(ONE, SOLID, RED, SQUIGGLES),
  ONE_SOLID_RED_OVAL(ONE, SOLID, RED, OVALS),
  ONE_SOLID_RED_DIAMOND(ONE, SOLID, RED, DIAMONDS),
  ONE_SOLID_PURPLE_SQUIGGLE(ONE, SOLID, PURPLE, SQUIGGLES),
  ONE_SOLID_PURPLE_OVAL(ONE, SOLID, PURPLE, OVALS),
  ONE_SOLID_PURPLE_DIAMOND(ONE, SOLID, PURPLE, DIAMONDS),
  ONE_SOLID_GREEN_SQUIGGLE(ONE, SOLID, GREEN, SQUIGGLES),
  ONE_SOLID_GREEN_OVAL(ONE, SOLID, GREEN, OVALS),
  ONE_SOLID_GREEN_DIAMOND(ONE, SOLID, GREEN, DIAMONDS),
  TWO_OUTLINED_RED_SQUIGGLES(TWO, OUTLINED, RED, SQUIGGLES),
  TWO_OUTLINED_RED_OVALS(TWO, OUTLINED, RED, OVALS),
  TWO_OUTLINED_RED_DIAMONDS(TWO, OUTLINED, RED, DIAMONDS),
  TWO_OUTLINED_PURPLE_SQUIGGLES(TWO, OUTLINED, PURPLE, SQUIGGLES),
  TWO_OUTLINED_PURPLE_OVALS(TWO, OUTLINED, PURPLE, OVALS),
  TWO_OUTLINED_PURPLE_DIAMONDS(TWO, OUTLINED, PURPLE, DIAMONDS),
  TWO_OUTLINED_GREEN_SQUIGGLES(TWO, OUTLINED, GREEN, SQUIGGLES),
  TWO_OUTLINED_GREEN_OVALS(TWO, OUTLINED, GREEN, OVALS),
  TWO_OUTLINED_GREEN_DIAMONDS(TWO, OUTLINED, GREEN, DIAMONDS),
  TWO_STRIPED_RED_SQUIGGLES(TWO, STRIPED, RED, SQUIGGLES),
  TWO_STRIPED_RED_OVALS(TWO, STRIPED, RED, OVALS),
  TWO_STRIPED_RED_DIAMONDS(TWO, STRIPED, RED, DIAMONDS),
  TWO_STRIPED_PURPLE_SQUIGGLES(TWO, STRIPED, PURPLE, SQUIGGLES),
  TWO_STRIPED_PURPLE_OVALS(TWO, STRIPED, PURPLE, OVALS),
  TWO_STRIPED_PURPLE_DIAMONDS(TWO, STRIPED, PURPLE, DIAMONDS),
  TWO_STRIPED_GREEN_SQUIGGLES(TWO, STRIPED, GREEN, SQUIGGLES),
  TWO_STRIPED_GREEN_OVALS(TWO, STRIPED, GREEN, OVALS),
  TWO_STRIPED_GREEN_DIAMONDS(TWO, STRIPED, GREEN, DIAMONDS),
  TWO_SOLID_RED_SQUIGGLES(TWO, SOLID, RED, SQUIGGLES),
  TWO_SOLID_RED_OVALS(TWO, SOLID, RED, OVALS),
  TWO_SOLID_RED_DIAMONDS(TWO, SOLID, RED, DIAMONDS),
  TWO_SOLID_PURPLE_SQUIGGLES(TWO, SOLID, PURPLE, SQUIGGLES),
  TWO_SOLID_PURPLE_OVALS(TWO, SOLID, PURPLE, OVALS),
  TWO_SOLID_PURPLE_DIAMONDS(TWO, SOLID, PURPLE, DIAMONDS),
  TWO_SOLID_GREEN_SQUIGGLES(TWO, SOLID, GREEN, SQUIGGLES),
  TWO_SOLID_GREEN_OVALS(TWO, SOLID, GREEN, OVALS),
  TWO_SOLID_GREEN_DIAMONDS(TWO, SOLID, GREEN, DIAMONDS),
  THREE_OUTLINED_RED_SQUIGGLES(THREE, OUTLINED, RED, SQUIGGLES),
  THREE_OUTLINED_RED_OVALS(THREE, OUTLINED, RED, OVALS),
  THREE_OUTLINED_RED_DIAMONDS(THREE, OUTLINED, RED, DIAMONDS),
  THREE_OUTLINED_PURPLE_SQUIGGLES(THREE, OUTLINED, PURPLE, SQUIGGLES),
  THREE_OUTLINED_PURPLE_OVALS(THREE, OUTLINED, PURPLE, OVALS),
  THREE_OUTLINED_PURPLE_DIAMONDS(THREE, OUTLINED, PURPLE, DIAMONDS),
  THREE_OUTLINED_GREEN_SQUIGGLES(THREE, OUTLINED, GREEN, SQUIGGLES),
  THREE_OUTLINED_GREEN_OVALS(THREE, OUTLINED, GREEN, OVALS),
  THREE_OUTLINED_GREEN_DIAMONDS(THREE, OUTLINED, GREEN, DIAMONDS),
  THREE_STRIPED_RED_SQUIGGLES(THREE, STRIPED, RED, SQUIGGLES),
  THREE_STRIPED_RED_OVALS(THREE, STRIPED, RED, OVALS),
  THREE_STRIPED_RED_DIAMONDS(THREE, STRIPED, RED, DIAMONDS),
  THREE_STRIPED_PURPLE_SQUIGGLES(THREE, STRIPED, PURPLE, SQUIGGLES),
  THREE_STRIPED_PURPLE_OVALS(THREE, STRIPED, PURPLE, OVALS),
  THREE_STRIPED_PURPLE_DIAMONDS(THREE, STRIPED, PURPLE, DIAMONDS),
  THREE_STRIPED_GREEN_SQUIGGLES(THREE, STRIPED, GREEN, SQUIGGLES),
  THREE_STRIPED_GREEN_OVALS(THREE, STRIPED, GREEN, OVALS),
  THREE_STRIPED_GREEN_DIAMONDS(THREE, STRIPED, GREEN, DIAMONDS),
  THREE_SOLID_RED_SQUIGGLES(THREE, SOLID, RED, SQUIGGLES),
  THREE_SOLID_RED_OVALS(THREE, SOLID, RED, OVALS),
  THREE_SOLID_RED_DIAMONDS(THREE, SOLID, RED, DIAMONDS),
  THREE_SOLID_PURPLE_SQUIGGLES(THREE, SOLID, PURPLE, SQUIGGLES),
  THREE_SOLID_PURPLE_OVALS(THREE, SOLID, PURPLE, OVALS),
  THREE_SOLID_PURPLE_DIAMONDS(THREE, SOLID, PURPLE, DIAMONDS),
  THREE_SOLID_GREEN_SQUIGGLES(THREE, SOLID, GREEN, SQUIGGLES),
  THREE_SOLID_GREEN_OVALS(THREE, SOLID, GREEN, OVALS),
  THREE_SOLID_GREEN_DIAMONDS(THREE, SOLID, GREEN, DIAMONDS);


  private static final Map<Color, Map<Shape, Map<Shading, Map<Number, Card>>>> CARDS = createAllCards();

  private static Map<Color, Map<Shape, Map<Shading, Map<Number, Card>>>> createAllCards() {
    Map<Color, Map<Shape, Map<Shading, Map<Number, Card>>>> colorMap = new EnumMap<>(Color.class);
    for (Card card : values()) {
      Map<Shape, Map<Shading, Map<Number, Card>>> shapeMap = colorMap.computeIfAbsent(card.color, color -> new EnumMap<>(Shape.class));
      Map<Shading, Map<Number, Card>> shadingMap = shapeMap.computeIfAbsent(card.shape, shape -> new EnumMap<>(Shading.class));
      Map<Number, Card> numberMap = shadingMap.computeIfAbsent(card.shading, shading -> new EnumMap<>(Number.class));
      numberMap.put(card.number, card);
    }
    return colorMap;
  }

  final Number number;
  final Shading shading;
  final Color color;
  final Shape shape;

  Card(
      Number number,
      Shading shading,
      Color color,
      Shape shape) {
    this.number = number;
    this.shading = shading;
    this.color = color;
    this.shape = shape;
  }

  static Card get(Color color, Shape shape, Shading shading, Number number) {
    return CARDS.get(color).get(shape).get(shading).get(number);
  }

  static Card randomCard() {
    return values()[ThreadLocalRandom.current().nextInt(81)];
  }

  static Card green1(Shape shape, Shading shading) {
    return get(GREEN, shape, shading, ONE);
  }

  static Card green2(Shape shape, Shading pattern) {
    return get(GREEN, shape, pattern, TWO);
  }

  static Card green3(Shape shape, Shading shading) {
    return get(GREEN, shape, shading, THREE);
  }

  static Card red1(Shape shape, Shading shading) {
    return get(RED, shape, shading, ONE);
  }

  static Card red2(Shape shape, Shading pattern) {
    return get(RED, shape, pattern, TWO);
  }

  static Card red3(Shape shape, Shading pattern) {
    return get(RED, shape, pattern, THREE);
  }

  static Card purple1(Shape shape, Shading pattern) {
    return get(PURPLE, shape, pattern, ONE);
  }

  static Card purple2(Shape shape, Shading pattern) {
    return get(PURPLE, shape, pattern, TWO);
  }

  static Card purple3(Shape shape, Shading pattern) {
    return get(PURPLE, shape, pattern, THREE);
  }
}
