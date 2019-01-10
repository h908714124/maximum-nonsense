package com.nonsense;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class PairIterator implements Iterator<Pair> {

  private final List<Card> cards;

  int i = 0, j = 1;

  PairIterator(List<Card> cards) {
    this.cards = cards;
  }

  PairIterator(Collection<Card> cards) {
    this(new ArrayList<>(cards));
  }

  @Override
  public boolean hasNext() {
    return i >= 0;
  }

  @Override
  public Pair next() {
    Pair pair = Pair.get(cards.get(i), cards.get(j));
    if (j < cards.size() - 1) {
      j++;
    } else if (i < cards.size() - 2) {
      i++;
      j = i + 1;
    } else {
      i = -1; // stop signal
    }
    return pair;
  }
}
