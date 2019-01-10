package com.nonsense;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class TripleIterator implements Iterator<Triple> {

  private final List<Card> cards;

  int i = 0, j = 1, k = 2;

  TripleIterator(List<Card> cards) {
    this.cards = cards;
  }

  TripleIterator(Collection<Card> cards) {
    this(new ArrayList<>(cards));
  }

  @Override
  public boolean hasNext() {
    return i >= 0;
  }

  @Override
  public Triple next() {
    Triple triple = Triple.get(cards.get(i), cards.get(j), cards.get(k));
    if (k < cards.size() - 1) {
      k++;
    } else if (j < cards.size() - 2) {
      j++;
      k = j + 1;
    } else if (i < cards.size() - 3) {
      i++;
      j = i + 1;
      k = i + 2;
    } else {
      i = -1; // stop signal
    }
    return triple;
  }
}
