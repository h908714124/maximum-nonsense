package com.nonsense;

import org.junit.Test;

import static com.nonsense.Card.green3;
import static com.nonsense.Card.purple1;
import static com.nonsense.Card.red2;
import static com.nonsense.Pattern.EMPTY;
import static com.nonsense.Pattern.FILLED;
import static com.nonsense.Pattern.STRIPED;
import static com.nonsense.Shape.DIAMOND;
import static com.nonsense.Shape.PEANUT;
import static com.nonsense.Shape.ROD;
import static org.junit.Assert.assertTrue;

public class DeckTest {

  @Test
  public void testIsSet() {
    assertTrue(Deck.isSet(
        green3(PEANUT, FILLED),
        red2(ROD, STRIPED),
        purple1(DIAMOND, EMPTY)));

  }
}