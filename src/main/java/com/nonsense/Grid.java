package com.nonsense;

import java.util.EnumSet;

class Grid {

  static void print9x9(EnumSet<Card> cards) {
    for (Card card : Card.values()) {
      if (cards.contains(card)) {
        System.out.print("@");
      } else {
        System.out.print(" ");
      }
      int i = card.ordinal();
      int column = i % 9;
      if (column == 2 || column == 5) {
        System.out.print("|");
      }
      if (column == 8) {
        System.out.println();
        int row = i / 9;
        if (row == 2 || row == 5) {
          System.out.println("-----------");
        }
      }
    }
  }
}
