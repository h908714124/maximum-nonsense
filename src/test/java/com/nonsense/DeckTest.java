package com.nonsense;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static com.nonsense.Card.get;
import static com.nonsense.Card.green1;
import static com.nonsense.Card.green2;
import static com.nonsense.Card.green3;
import static com.nonsense.Card.purple1;
import static com.nonsense.Card.purple2;
import static com.nonsense.Card.purple3;
import static com.nonsense.Card.red1;
import static com.nonsense.Card.red2;
import static com.nonsense.Card.red3;
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
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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

  @Test
  public void testFind19IndependentCards() {
    for (int i = 0; i < 10000; i++) {
      List<Card> cards = Deck.randomIndependentCards(18);
      if (cards.isEmpty()) {
        continue;
      }
      System.out.println(i);
      Optional<Card> extraCard = Deck.expand(cards);
      if (extraCard.isPresent()) {
        for (Card card : cards) {
          System.out.println(card);
        }
        System.out.println(extraCard.get());
        break;
      }
    }
  }

  @Test
  public void testRecord() {
    List<Card> cards = Arrays.asList(
        get(RED, SQUIGGLES, STRIPED, ONE),
        get(RED, SQUIGGLES, OUTLINED, ONE),
        get(RED, SQUIGGLES, OUTLINED, TWO),
        get(RED, SQUIGGLES, SOLID, TWO),
        get(RED, OVALS, SOLID, ONE),
        get(RED, OVALS, OUTLINED, ONE),
        get(RED, OVALS, OUTLINED, TWO),
        get(RED, OVALS, SOLID, THREE),
        get(RED, DIAMONDS, SOLID, TWO),
        get(PURPLE, SQUIGGLES, OUTLINED, ONE),
        get(PURPLE, DIAMONDS, SOLID, THREE),
        get(GREEN, SQUIGGLES, OUTLINED, TWO),
        get(GREEN, OVALS, OUTLINED, ONE),
        get(GREEN, OVALS, SOLID, TWO),
        get(GREEN, OVALS, SOLID, THREE),
        get(GREEN, OVALS, OUTLINED, THREE),
        get(GREEN, DIAMONDS, OUTLINED, TWO),
        get(GREEN, DIAMONDS, SOLID, THREE),
        get(GREEN, DIAMONDS, STRIPED, THREE));
    assertEquals(19, cards.size());
    assertTrue(Deck.isIndependent(cards));
  }
}