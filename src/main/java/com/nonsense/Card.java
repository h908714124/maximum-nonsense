package com.nonsense;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

class Card {

  private static final Map<Color, Map<Shape, Map<Shading, Map<Number, Card>>>> CARDS =
      Collections.unmodifiableMap(createAllCards());

  private static Map<Color, Map<Shape, Map<Shading, Map<Number, Card>>>> createAllCards() {
    Map<Color, Map<Shape, Map<Shading, Map<Number, Card>>>> m = new EnumMap<>(Color.class);
    for (Color color : Color.values()) {
      m.put(color, new EnumMap<>(Shape.class));
      for (Shape shape : Shape.values()) {
        m.get(color).put(shape, new EnumMap<>(Shading.class));
        for (Shading shading : Shading.values()) {
          m.get(color).get(shape).put(shading, new EnumMap<>(Number.class));
          for (Number number : Number.values()) {
            m.get(color).get(shape).get(shading).put(number, new Card(color, shape, shading, number));
          }
        }
      }
    }
    return m;
  }

  static Iterable<Card> allCards() {
    Color[] colors = Color.values();
    Shape[] shapes = Shape.values();
    Shading[] shadings = Shading.values();
    Number[] numbers = Number.values();
    Iterator<Card> ir = new Iterator<Card>() {

      int i;

      @Override
      public boolean hasNext() {
        return i < 81;
      }

      @Override
      public Card next() {
        Color color = colors[i % 3];
        Shape shape = shapes[(i / 3) % 3];
        Shading shading = shadings[(i / 9) % 3];
        Number number = numbers[(i / 27) % 3];
        Card card = get(color, shape, shading, number);
        i++;
        return card;
      }
    };
    return () -> ir;
  }

  final Color color;
  final Shape shape;
  final Shading shading;
  final Number number;

  private Card(
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
    Color[] colors = Color.values();
    Shape[] shapes = Shape.values();
    Shading[] shadings = Shading.values();
    Number[] numbers = Number.values();
    ThreadLocalRandom r = ThreadLocalRandom.current();
    int i = r.nextInt(3);
    int j = r.nextInt(3);
    int k = r.nextInt(3);
    int l = r.nextInt(3);
    Color color = colors[i];
    Shape shape = shapes[j];
    Shading shading = shadings[k];
    Number number = numbers[l];
    return get(color, shape, shading, number);
  }

  static Card green1(Shape shape, Shading shading) {
    return get(Color.GREEN, shape, shading, Number.ONE);
  }

  static Card green2(Shape shape, Shading pattern) {
    return get(Color.GREEN, shape, pattern, Number.TWO);
  }

  static Card green3(Shape shape, Shading shading) {
    return get(Color.GREEN, shape, shading, Number.THREE);
  }

  static Card red1(Shape shape, Shading shading) {
    return get(Color.RED, shape, shading, Number.ONE);
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
        "," + shading +
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
        shading == card.shading &&
        number == card.number;
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, shape, shading, number);
  }
}
