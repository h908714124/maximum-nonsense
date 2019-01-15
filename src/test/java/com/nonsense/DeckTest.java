package com.nonsense;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

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
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DeckTest {

  @Test
  void testIsSet() {
    assertTrue(Triple.get(
        green3(SQUIGGLES, SOLID),
        red2(OVALS, STRIPED),
        purple1(DIAMONDS, OUTLINED)).isSet());
  }

  @Test
  void testAllTriples() {
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
  void testExpandMore() {
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
    assertTrue(Deck.isIndependent(EnumSet.copyOf(cards)));
    Optional<Card> extraCard = Deck.expand(EnumSet.copyOf(cards));
    assertTrue(extraCard.isPresent());
    assertTrue(Deck.isIndependent(EnumSet.copyOf(cards), extraCard.get()));
    assertFalse(Deck.isIndependent(EnumSet.copyOf(cards), purple3(SQUIGGLES, STRIPED)));
  }

  @Test
  void testFind18IndependentCards() {
    for (int i = 0; i < 10000; i++) {
      Set<Card> cards = Deck.randomIndependentCards(17);
      if (cards.isEmpty()) {
        continue;
      }
      Optional<Card> extraCard = Deck.expand(EnumSet.copyOf(cards));
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
  void test19IndependentCards() {
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
    assertTrue(Deck.isIndependent(EnumSet.copyOf(cards)));
  }

  @Test
  void test20IndependentCards() {
    List<Card> cards = Arrays.asList(
        get(RED, OVALS, STRIPED, ONE),
        get(RED, OVALS, STRIPED, THREE),
        get(PURPLE, SQUIGGLES, SOLID, ONE),
        get(PURPLE, SQUIGGLES, OUTLINED, ONE),
        get(PURPLE, SQUIGGLES, STRIPED, THREE),
        get(PURPLE, OVALS, STRIPED, TWO),
        get(PURPLE, OVALS, SOLID, THREE),
        get(PURPLE, OVALS, OUTLINED, THREE),
        get(PURPLE, DIAMONDS, SOLID, ONE),
        get(PURPLE, DIAMONDS, OUTLINED, ONE),
        get(PURPLE, DIAMONDS, STRIPED, THREE),
        get(GREEN, SQUIGGLES, STRIPED, ONE),
        get(GREEN, SQUIGGLES, SOLID, THREE),
        get(GREEN, SQUIGGLES, OUTLINED, THREE),
        get(GREEN, OVALS, SOLID, ONE),
        get(GREEN, OVALS, OUTLINED, ONE),
        get(GREEN, OVALS, STRIPED, TWO),
        get(GREEN, DIAMONDS, STRIPED, ONE),
        get(GREEN, DIAMONDS, SOLID, THREE),
        get(GREEN, DIAMONDS, OUTLINED, THREE));
    assertEquals(20, cards.size());
    assertTrue(Deck.isIndependent(EnumSet.copyOf(cards)));
  }

  @Test
  void testAllPairsSorted() {
    int[] previous = new int[]{-1};
    Pair.getAllPairs().forEach(pair -> {
      assertTrue(pair.ordinal > previous[0]);
      previous[0] = pair.ordinal;
    });
    assertEquals(3240, Pair.getAllPairs().count());
  }

  @Test
  void testFind15NonExtensible() {
    for (int i = 0; i < 5000000; i++) {
      EnumSet<Card> cards = Deck.randomIndependentCards(15);
      if (cards.isEmpty()) {
        continue;
      }
      boolean cap = Deck.isNonExtensible(cards);
      if (cap) {
        for (Card card : cards) {
          System.out.println(card);
        }
        Grid.print9x9(cards);
        break;
      }
    }
  }
}
