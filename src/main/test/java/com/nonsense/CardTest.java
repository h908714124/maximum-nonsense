package com.nonsense;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class CardTest {

  @Test
  public void testAllCards() {
    Set<Card> cards = new HashSet<>();
    Card.allCards().forEach(cards::add);
    assertEquals(81, cards.size());
    // do it again to see if equals and hash code are correct
    Card.allCards().forEach(cards::add);
    assertEquals(81, cards.size());
  }
}
