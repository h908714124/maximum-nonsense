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
      int row = i / 9;
      int column = i % 9;
      if (column == 3 || column == 6) {
        System.out.print("|");
      }
      if (column == 0) {
        System.out.println();
      }
      if (column == 0 && (row == 3 || row == 6)) {
        System.out.println("-----------");
      }
    }
  }
}
