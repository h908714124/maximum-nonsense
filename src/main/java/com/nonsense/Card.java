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

  RED_OVALS_SOLID_ONE(RED, OVALS, SOLID, ONE),
  RED_OVALS_SOLID_TWO(RED, OVALS, SOLID, TWO),
  RED_OVALS_SOLID_THREE(RED, OVALS, SOLID, THREE),
  RED_OVALS_STRIPED_ONE(RED, OVALS, STRIPED, ONE),
  RED_OVALS_STRIPED_TWO(RED, OVALS, STRIPED, TWO),
  RED_OVALS_STRIPED_THREE(RED, OVALS, STRIPED, THREE),
  RED_OVALS_OUTLINED_ONE(RED, OVALS, OUTLINED, ONE),
  RED_OVALS_OUTLINED_TWO(RED, OVALS, OUTLINED, TWO),
  RED_OVALS_OUTLINED_THREE(RED, OVALS, OUTLINED, THREE),
  RED_SQUIGGLES_SOLID_ONE(RED, SQUIGGLES, SOLID, ONE),
  RED_SQUIGGLES_SOLID_TWO(RED, SQUIGGLES, SOLID, TWO),
  RED_SQUIGGLES_SOLID_THREE(RED, SQUIGGLES, SOLID, THREE),
  RED_SQUIGGLES_STRIPED_ONE(RED, SQUIGGLES, STRIPED, ONE),
  RED_SQUIGGLES_STRIPED_TWO(RED, SQUIGGLES, STRIPED, TWO),
  RED_SQUIGGLES_STRIPED_THREE(RED, SQUIGGLES, STRIPED, THREE),
  RED_SQUIGGLES_OUTLINED_ONE(RED, SQUIGGLES, OUTLINED, ONE),
  RED_SQUIGGLES_OUTLINED_TWO(RED, SQUIGGLES, OUTLINED, TWO),
  RED_SQUIGGLES_OUTLINED_THREE(RED, SQUIGGLES, OUTLINED, THREE),
  RED_DIAMONDS_SOLID_ONE(RED, DIAMONDS, SOLID, ONE),
  RED_DIAMONDS_SOLID_TWO(RED, DIAMONDS, SOLID, TWO),
  RED_DIAMONDS_SOLID_THREE(RED, DIAMONDS, SOLID, THREE),
  RED_DIAMONDS_STRIPED_ONE(RED, DIAMONDS, STRIPED, ONE),
  RED_DIAMONDS_STRIPED_TWO(RED, DIAMONDS, STRIPED, TWO),
  RED_DIAMONDS_STRIPED_THREE(RED, DIAMONDS, STRIPED, THREE),
  RED_DIAMONDS_OUTLINED_ONE(RED, DIAMONDS, OUTLINED, ONE),
  RED_DIAMONDS_OUTLINED_TWO(RED, DIAMONDS, OUTLINED, TWO),
  RED_DIAMONDS_OUTLINED_THREE(RED, DIAMONDS, OUTLINED, THREE),
  PURPLE_OVALS_SOLID_ONE(PURPLE, OVALS, SOLID, ONE),
  PURPLE_OVALS_SOLID_TWO(PURPLE, OVALS, SOLID, TWO),
  PURPLE_OVALS_SOLID_THREE(PURPLE, OVALS, SOLID, THREE),
  PURPLE_OVALS_STRIPED_ONE(PURPLE, OVALS, STRIPED, ONE),
  PURPLE_OVALS_STRIPED_TWO(PURPLE, OVALS, STRIPED, TWO),
  PURPLE_OVALS_STRIPED_THREE(PURPLE, OVALS, STRIPED, THREE),
  PURPLE_OVALS_OUTLINED_ONE(PURPLE, OVALS, OUTLINED, ONE),
  PURPLE_OVALS_OUTLINED_TWO(PURPLE, OVALS, OUTLINED, TWO),
  PURPLE_OVALS_OUTLINED_THREE(PURPLE, OVALS, OUTLINED, THREE),
  PURPLE_SQUIGGLES_SOLID_ONE(PURPLE, SQUIGGLES, SOLID, ONE),
  PURPLE_SQUIGGLES_SOLID_TWO(PURPLE, SQUIGGLES, SOLID, TWO),
  PURPLE_SQUIGGLES_SOLID_THREE(PURPLE, SQUIGGLES, SOLID, THREE),
  PURPLE_SQUIGGLES_STRIPED_ONE(PURPLE, SQUIGGLES, STRIPED, ONE),
  PURPLE_SQUIGGLES_STRIPED_TWO(PURPLE, SQUIGGLES, STRIPED, TWO),
  PURPLE_SQUIGGLES_STRIPED_THREE(PURPLE, SQUIGGLES, STRIPED, THREE),
  PURPLE_SQUIGGLES_OUTLINED_ONE(PURPLE, SQUIGGLES, OUTLINED, ONE),
  PURPLE_SQUIGGLES_OUTLINED_TWO(PURPLE, SQUIGGLES, OUTLINED, TWO),
  PURPLE_SQUIGGLES_OUTLINED_THREE(PURPLE, SQUIGGLES, OUTLINED, THREE),
  PURPLE_DIAMONDS_SOLID_ONE(PURPLE, DIAMONDS, SOLID, ONE),
  PURPLE_DIAMONDS_SOLID_TWO(PURPLE, DIAMONDS, SOLID, TWO),
  PURPLE_DIAMONDS_SOLID_THREE(PURPLE, DIAMONDS, SOLID, THREE),
  PURPLE_DIAMONDS_STRIPED_ONE(PURPLE, DIAMONDS, STRIPED, ONE),
  PURPLE_DIAMONDS_STRIPED_TWO(PURPLE, DIAMONDS, STRIPED, TWO),
  PURPLE_DIAMONDS_STRIPED_THREE(PURPLE, DIAMONDS, STRIPED, THREE),
  PURPLE_DIAMONDS_OUTLINED_ONE(PURPLE, DIAMONDS, OUTLINED, ONE),
  PURPLE_DIAMONDS_OUTLINED_TWO(PURPLE, DIAMONDS, OUTLINED, TWO),
  PURPLE_DIAMONDS_OUTLINED_THREE(PURPLE, DIAMONDS, OUTLINED, THREE),
  GREEN_OVALS_SOLID_ONE(GREEN, OVALS, SOLID, ONE),
  GREEN_OVALS_SOLID_TWO(GREEN, OVALS, SOLID, TWO),
  GREEN_OVALS_SOLID_THREE(GREEN, OVALS, SOLID, THREE),
  GREEN_OVALS_STRIPED_ONE(GREEN, OVALS, STRIPED, ONE),
  GREEN_OVALS_STRIPED_TWO(GREEN, OVALS, STRIPED, TWO),
  GREEN_OVALS_STRIPED_THREE(GREEN, OVALS, STRIPED, THREE),
  GREEN_OVALS_OUTLINED_ONE(GREEN, OVALS, OUTLINED, ONE),
  GREEN_OVALS_OUTLINED_TWO(GREEN, OVALS, OUTLINED, TWO),
  GREEN_OVALS_OUTLINED_THREE(GREEN, OVALS, OUTLINED, THREE),
  GREEN_SQUIGGLES_SOLID_ONE(GREEN, SQUIGGLES, SOLID, ONE),
  GREEN_SQUIGGLES_SOLID_TWO(GREEN, SQUIGGLES, SOLID, TWO),
  GREEN_SQUIGGLES_SOLID_THREE(GREEN, SQUIGGLES, SOLID, THREE),
  GREEN_SQUIGGLES_STRIPED_ONE(GREEN, SQUIGGLES, STRIPED, ONE),
  GREEN_SQUIGGLES_STRIPED_TWO(GREEN, SQUIGGLES, STRIPED, TWO),
  GREEN_SQUIGGLES_STRIPED_THREE(GREEN, SQUIGGLES, STRIPED, THREE),
  GREEN_SQUIGGLES_OUTLINED_ONE(GREEN, SQUIGGLES, OUTLINED, ONE),
  GREEN_SQUIGGLES_OUTLINED_TWO(GREEN, SQUIGGLES, OUTLINED, TWO),
  GREEN_SQUIGGLES_OUTLINED_THREE(GREEN, SQUIGGLES, OUTLINED, THREE),
  GREEN_DIAMONDS_SOLID_ONE(GREEN, DIAMONDS, SOLID, ONE),
  GREEN_DIAMONDS_SOLID_TWO(GREEN, DIAMONDS, SOLID, TWO),
  GREEN_DIAMONDS_SOLID_THREE(GREEN, DIAMONDS, SOLID, THREE),
  GREEN_DIAMONDS_STRIPED_ONE(GREEN, DIAMONDS, STRIPED, ONE),
  GREEN_DIAMONDS_STRIPED_TWO(GREEN, DIAMONDS, STRIPED, TWO),
  GREEN_DIAMONDS_STRIPED_THREE(GREEN, DIAMONDS, STRIPED, THREE),
  GREEN_DIAMONDS_OUTLINED_ONE(GREEN, DIAMONDS, OUTLINED, ONE),
  GREEN_DIAMONDS_OUTLINED_TWO(GREEN, DIAMONDS, OUTLINED, TWO),
  GREEN_DIAMONDS_OUTLINED_THREE(GREEN, DIAMONDS, OUTLINED, THREE);


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

  final Color color;
  final Shape shape;
  final Shading shading;
  final Number number;

  Card(
      Color color,
      Shape shape,
      Shading shading,
      Number number) {
    this.color = color;
    this.shape = shape;
    this.shading = shading;
    this.number = number;
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

  @Override
  public String toString() {
    return "(" +
        color +
        "," + shape +
        "," + shading +
        "," + number +
        ')';
  }
}
