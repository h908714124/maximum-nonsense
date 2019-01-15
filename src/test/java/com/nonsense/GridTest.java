package com.nonsense;

import org.junit.jupiter.api.Test;

import java.util.EnumSet;

import static com.nonsense.Card.ONE_OUTLINED_GREEN_DIAMOND;
import static com.nonsense.Card.ONE_OUTLINED_GREEN_SQUIGGLE;
import static com.nonsense.Card.ONE_OUTLINED_PURPLE_SQUIGGLE;
import static com.nonsense.Card.ONE_OUTLINED_RED_DIAMOND;
import static com.nonsense.Card.ONE_OUTLINED_RED_OVAL;
import static com.nonsense.Card.ONE_SOLID_PURPLE_DIAMOND;
import static com.nonsense.Card.ONE_SOLID_PURPLE_OVAL;
import static com.nonsense.Card.ONE_SOLID_RED_DIAMOND;
import static com.nonsense.Card.ONE_STRIPED_PURPLE_DIAMOND;
import static com.nonsense.Card.ONE_STRIPED_PURPLE_SQUIGGLE;
import static com.nonsense.Card.ONE_STRIPED_RED_OVAL;
import static com.nonsense.Card.THREE_OUTLINED_PURPLE_SQUIGGLES;
import static com.nonsense.Card.THREE_SOLID_GREEN_SQUIGGLES;
import static com.nonsense.Card.THREE_SOLID_PURPLE_DIAMONDS;
import static com.nonsense.Card.THREE_SOLID_PURPLE_SQUIGGLES;
import static com.nonsense.Card.THREE_SOLID_RED_DIAMONDS;
import static com.nonsense.Card.THREE_SOLID_RED_SQUIGGLES;
import static com.nonsense.Card.THREE_STRIPED_GREEN_DIAMONDS;
import static com.nonsense.Card.THREE_STRIPED_GREEN_SQUIGGLES;
import static com.nonsense.Card.THREE_STRIPED_PURPLE_DIAMONDS;
import static com.nonsense.Card.THREE_STRIPED_PURPLE_OVALS;
import static com.nonsense.Card.THREE_STRIPED_RED_OVALS;
import static com.nonsense.Card.TWO_OUTLINED_GREEN_SQUIGGLES;
import static com.nonsense.Card.TWO_OUTLINED_PURPLE_SQUIGGLES;
import static com.nonsense.Card.TWO_SOLID_PURPLE_OVALS;
import static com.nonsense.Card.TWO_SOLID_RED_DIAMONDS;
import static com.nonsense.Card.TWO_STRIPED_GREEN_DIAMONDS;
import static com.nonsense.Card.TWO_STRIPED_GREEN_SQUIGGLES;
import static com.nonsense.Card.TWO_STRIPED_PURPLE_SQUIGGLES;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GridTest {

  @Test
  void testGrid() {
    EnumSet<Card> cards = EnumSet.of(
        ONE_OUTLINED_RED_DIAMOND,
        ONE_OUTLINED_GREEN_DIAMOND,
        ONE_STRIPED_RED_OVAL,
        ONE_SOLID_RED_DIAMOND,
        ONE_SOLID_PURPLE_OVAL,
        TWO_OUTLINED_PURPLE_SQUIGGLES,
        TWO_STRIPED_PURPLE_SQUIGGLES,
        TWO_STRIPED_GREEN_SQUIGGLES,
        TWO_SOLID_RED_DIAMONDS,
        TWO_SOLID_PURPLE_OVALS,
        THREE_OUTLINED_PURPLE_SQUIGGLES,
        THREE_STRIPED_RED_OVALS,
        THREE_SOLID_RED_SQUIGGLES,
        THREE_SOLID_PURPLE_SQUIGGLES,
        THREE_SOLID_PURPLE_DIAMONDS);
    assertTrue(Deck.isIndependent(cards));
    assertTrue(Deck.isNonExtensible(cards));
    Grid.print9x9(cards);
  }

  @Test
  void testGrid2() {
    EnumSet<Card> cards = EnumSet.of(
        ONE_OUTLINED_RED_OVAL,
        ONE_OUTLINED_PURPLE_SQUIGGLE,
        ONE_OUTLINED_GREEN_SQUIGGLE,
        ONE_STRIPED_PURPLE_SQUIGGLE,
        ONE_STRIPED_PURPLE_DIAMOND,
        ONE_SOLID_PURPLE_DIAMOND,
        TWO_OUTLINED_GREEN_SQUIGGLES,
        TWO_STRIPED_GREEN_DIAMONDS,
        THREE_STRIPED_PURPLE_OVALS,
        THREE_STRIPED_PURPLE_DIAMONDS,
        THREE_STRIPED_GREEN_SQUIGGLES,
        THREE_STRIPED_GREEN_DIAMONDS,
        THREE_SOLID_RED_DIAMONDS,
        THREE_SOLID_PURPLE_DIAMONDS,
        THREE_SOLID_GREEN_SQUIGGLES);
    assertTrue(Deck.isIndependent(cards));
    assertTrue(Deck.isNonExtensible(cards));
    Grid.print9x9(cards);
  }
}
