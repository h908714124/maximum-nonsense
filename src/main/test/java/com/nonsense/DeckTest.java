package com.nonsense;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.StreamSupport;

import static com.nonsense.Card.*;
import static com.nonsense.Shading.*;
import static com.nonsense.Shape.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeckTest {

  @Test
  public void testIsSet() {
    assertTrue(Triple.get(
        green3(SQUIGGLES, SOLID),
        red2(OVALS, STRIPED),
        purple1(DIAMONDS, OUTLINED)).isSet());

  }

  @Test
  public void testAllTriples() {
    assertEquals(1, Deck.allTriples(Arrays.asList(
        green1(SQUIGGLES, SOLID),
        green2(SQUIGGLES, SOLID),
        green3(SQUIGGLES, SOLID))).count());
    assertEquals(4, Deck.allTriples(Arrays.asList(
        green1(SQUIGGLES, SOLID),
        green2(SQUIGGLES, SOLID),
        green3(SQUIGGLES, SOLID),
        red1(SQUIGGLES, SOLID))).count());
    assertEquals(10, Deck.allTriples(Arrays.asList(
        green1(SQUIGGLES, SOLID),
        green2(SQUIGGLES, SOLID),
        green3(SQUIGGLES, SOLID),
        red1(SQUIGGLES, SOLID),
        red2(SQUIGGLES, SOLID))).count());
    assertEquals(20, Deck.allTriples(Arrays.asList(
        green1(SQUIGGLES, SOLID),
        green2(SQUIGGLES, SOLID),
        green3(SQUIGGLES, SOLID),
        red1(SQUIGGLES, SOLID),
        red2(SQUIGGLES, SOLID),
        red3(SQUIGGLES, SOLID))).count());
    assertEquals(35, Deck.allTriples(Arrays.asList(
        green1(SQUIGGLES, SOLID),
        green2(SQUIGGLES, SOLID),
        green3(SQUIGGLES, SOLID),
        red1(SQUIGGLES, SOLID),
        red2(SQUIGGLES, SOLID),
        red3(SQUIGGLES, SOLID),
        purple1(SQUIGGLES, SOLID))).count());
    assertEquals(56, Deck.allTriples(Arrays.asList(
        green1(SQUIGGLES, SOLID),
        green2(SQUIGGLES, SOLID),
        green3(SQUIGGLES, SOLID),
        red1(SQUIGGLES, SOLID),
        red2(SQUIGGLES, SOLID),
        red3(SQUIGGLES, SOLID),
        purple1(SQUIGGLES, SOLID),
        purple2(SQUIGGLES, SOLID))).count());
    assertEquals(84, Deck.allTriples(Arrays.asList(
        green1(SQUIGGLES, SOLID),
        green2(SQUIGGLES, SOLID),
        green3(SQUIGGLES, SOLID),
        red1(SQUIGGLES, SOLID),
        red2(SQUIGGLES, SOLID),
        red3(SQUIGGLES, SOLID),
        purple1(SQUIGGLES, SOLID),
        purple2(SQUIGGLES, SOLID),
        purple3(SQUIGGLES, SOLID))).count());
    assertEquals(120, Deck.allTriples(Arrays.asList(
        green1(SQUIGGLES, SOLID),
        green2(SQUIGGLES, SOLID),
        green3(SQUIGGLES, SOLID),
        red1(SQUIGGLES, SOLID),
        red2(SQUIGGLES, SOLID),
        red3(SQUIGGLES, SOLID),
        purple1(SQUIGGLES, SOLID),
        purple2(SQUIGGLES, SOLID),
        purple3(SQUIGGLES, SOLID),
        green1(DIAMONDS, SOLID))).count());
    assertEquals(165, Deck.allTriples(Arrays.asList(
        green1(SQUIGGLES, SOLID),
        green2(SQUIGGLES, SOLID),
        green3(SQUIGGLES, SOLID),
        red1(SQUIGGLES, SOLID),
        red2(SQUIGGLES, SOLID),
        red3(SQUIGGLES, SOLID),
        purple1(SQUIGGLES, SOLID),
        purple2(SQUIGGLES, SOLID),
        purple3(SQUIGGLES, SOLID),
        green1(DIAMONDS, SOLID),
        green2(DIAMONDS, SOLID))).count());
    assertEquals(220, Deck.allTriples(Arrays.asList(
        green1(SQUIGGLES, SOLID),
        green2(SQUIGGLES, SOLID),
        green3(SQUIGGLES, SOLID),
        red1(SQUIGGLES, SOLID),
        red2(SQUIGGLES, SOLID),
        red3(SQUIGGLES, SOLID),
        purple1(SQUIGGLES, SOLID),
        purple2(SQUIGGLES, SOLID),
        purple3(SQUIGGLES, SOLID),
        green1(DIAMONDS, SOLID),
        green2(DIAMONDS, SOLID),
        green3(DIAMONDS, SOLID))).count());
    assertEquals(286, Deck.allTriples(Arrays.asList(
        green1(SQUIGGLES, SOLID),
        green2(SQUIGGLES, SOLID),
        green3(SQUIGGLES, SOLID),
        red1(SQUIGGLES, SOLID),
        red2(SQUIGGLES, SOLID),
        red3(SQUIGGLES, SOLID),
        purple1(SQUIGGLES, SOLID),
        purple2(SQUIGGLES, SOLID),
        purple3(SQUIGGLES, SOLID),
        green1(DIAMONDS, SOLID),
        green2(DIAMONDS, SOLID),
        green3(DIAMONDS, SOLID),
        red1(DIAMONDS, SOLID))).count());
    assertEquals(364, Deck.allTriples(Arrays.asList(
        green1(SQUIGGLES, SOLID),
        green2(SQUIGGLES, SOLID),
        green3(SQUIGGLES, SOLID),
        red1(SQUIGGLES, SOLID),
        red2(SQUIGGLES, SOLID),
        red3(SQUIGGLES, SOLID),
        purple1(SQUIGGLES, SOLID),
        purple2(SQUIGGLES, SOLID),
        purple3(SQUIGGLES, SOLID),
        green1(DIAMONDS, SOLID),
        green2(DIAMONDS, SOLID),
        green3(DIAMONDS, SOLID),
        red1(DIAMONDS, SOLID),
        red2(DIAMONDS, SOLID))).count());
    assertEquals(455, Deck.allTriples(Arrays.asList(
        green1(SQUIGGLES, SOLID),
        green2(SQUIGGLES, SOLID),
        green3(SQUIGGLES, SOLID),
        red1(SQUIGGLES, SOLID),
        red2(SQUIGGLES, SOLID),
        red3(SQUIGGLES, SOLID),
        purple1(SQUIGGLES, SOLID),
        purple2(SQUIGGLES, SOLID),
        purple3(SQUIGGLES, SOLID),
        green1(DIAMONDS, SOLID),
        green2(DIAMONDS, SOLID),
        green3(DIAMONDS, SOLID),
        red1(DIAMONDS, SOLID),
        red2(DIAMONDS, SOLID),
        red3(DIAMONDS, SOLID))).count());
  }

  @Test
  public void tse() {
    StreamSupport.stream(Deck.allTriples(Arrays.asList(
        green1(SQUIGGLES, SOLID),
        green2(SQUIGGLES, SOLID),
        green3(SQUIGGLES, SOLID),
        red1(SQUIGGLES, SOLID),
        red2(SQUIGGLES, SOLID))).spliterator(), false)
        .map(DeckTest::sig)
        .forEach(System.out::println);

  }

  private static String sig(Card card) {
    return "(" + card.color + "," + card.number + ")";
  }

  private static String sig(Triple triple) {
    return "(" + sig(triple.getCard0()) +
        "," + sig(triple.getCard1()) +
        "," + sig(triple.getCard2()) +
        ')';
  }
}
