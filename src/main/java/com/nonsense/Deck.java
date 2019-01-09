package com.nonsense;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

class Deck {

  static Stream<Triple> allTriples(List<Card> cards) {
    if (cards.size() < 3) {
      return Stream.empty();
    }
    Iterable<Triple> it = () -> new Iterator<Triple>() {

      int i = 0;
      int j = 1;
      int k = 2;

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
    };
    return StreamSupport.stream(it.spliterator(), false);
  }
}
