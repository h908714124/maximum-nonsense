package com.nonsense;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static com.nonsense.Card.*;
import static com.nonsense.Shading.*;
import static com.nonsense.Shape.*;
import static org.junit.Assert.*;

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
  public void testExpand() {
    assertEquals(Optional.empty(), Deck.expand(Arrays.asList(
        green1(SQUIGGLES, SOLID),
        green2(SQUIGGLES, SOLID),
        green3(SQUIGGLES, SOLID))));
  }

  @Test
  public void testExpandMore() {
    List<Card> cards = Arrays.asList(
        purple3(DIAMONDS, OUTLINED),
        red2(SQUIGGLES, STRIPED),
        red3(DIAMONDS, OUTLINED),
        purple1(DIAMONDS, STRIPED),
        purple1(DIAMONDS, OUTLINED),
        purple2(OVALS, OUTLINED),
        purple3(OVALS, OUTLINED),
        red1(SQUIGGLES, SOLID),
        green2(SQUIGGLES, OUTLINED),
        purple1(SQUIGGLES, SOLID),
        red2(OVALS, OUTLINED));
    assertTrue(Deck.isIndependent(cards));
    Optional<Card> extraCard = Deck.expand(cards);
    assertTrue(extraCard.isPresent());
    assertTrue(Deck.isIndependent(cards, extraCard.get()));
    assertFalse(Deck.isIndependent(cards, purple3(SQUIGGLES, STRIPED)));
  }
}
