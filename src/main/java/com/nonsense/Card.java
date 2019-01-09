package com.nonsense;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Objects;

class Card {

  private static final Map<Color, Map<Shape, Map<Shading, Map<Number, Card>>>> CARDS =
      Collections.unmodifiableMap(createAllCards());

  private static Map<Color, Map<Shape, Map<Shading, Map<Number, Card>>>> createAllCards() {
    Map<Color, Map<Shape, Map<Shading, Map<Number, Card>>>> m = new EnumMap<>(Color.class);
    for (Color color : Color.values()) {
      m.put(color, new EnumMap<>(Shape.class));
      for (Shape shape : Shape.values()) {
        m.get(color).put(shape, new EnumMap<>(Shading.class));
        for (Shading pattern : Shading.values()) {
          m.get(color).get(shape).put(pattern, new EnumMap<>(Number.class));
          for (Number number : Number.values()) {
            m.get(color).get(shape).get(pattern).put(number, new Card(color, shape, pattern, number));
          }
        }
      }
    }
    return m;
  }

  final Color color;
  final Shape shape;
  final Shading pattern;
  final Number number;

  private Card(
      Color color,
      Shape shape,
      Shading pattern,
      Number number) {
    this.color = color;
    this.shape = shape;
    this.pattern = pattern;
    this.number = number;
  }

  static Card get(Color color, Shape shape, Shading pattern, Number number) {
    return CARDS.get(color).get(shape).get(pattern).get(number);
  }

  static Card green1(Shape shape, Shading pattern) {
    return get(Color.GREEN, shape, pattern, Number.ONE);
  }

  static Card green2(Shape shape, Shading pattern) {
    return get(Color.GREEN, shape, pattern, Number.TWO);
  }

  static Card green3(Shape shape, Shading pattern) {
    return get(Color.GREEN, shape, pattern, Number.THREE);
  }

  static Card red1(Shape shape, Shading pattern) {
    return get(Color.RED, shape, pattern, Number.ONE);
  }

  static Card red2(Shape shape, Shading pattern) {
    return get(Color.RED, shape, pattern, Number.TWO);
  }

  static Card red3(Shape shape, Shading pattern) {
    return get(Color.RED, shape, pattern, Number.THREE);
  }

  static Card purple1(Shape shape, Shading pattern) {
    return get(Color.PURPLE, shape, pattern, Number.ONE);
  }

  static Card purple2(Shape shape, Shading pattern) {
    return get(Color.PURPLE, shape, pattern, Number.TWO);
  }

  static Card purple3(Shape shape, Shading pattern) {
    return get(Color.PURPLE, shape, pattern, Number.THREE);
  }

  @Override
  public String toString() {
    return "(" +
        color +
        "," + shape +
        "," + pattern +
        "," + number +
        ')';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Card card = (Card) o;
    return color == card.color &&
        shape == card.shape &&
        pattern == card.pattern &&
        number == card.number;
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, shape, pattern, number);
  }
}
