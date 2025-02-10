/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.group8.blackjack;

/**
 *
 * @author suran
 */
import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int getValue() {
        int value = 0;
        int aceCount = 0;

        for (Card card : cards) {
            String rank = card.getRank();
            if ("2".equals(rank)) {
                value += 2;
            } else if ("3".equals(rank)) {
                value += 3;
            } else if ("4".equals(rank)) {
                value += 4;
            } else if ("5".equals(rank)) {
                value += 5;
            } else if ("6".equals(rank)) {
                value += 6;
            } else if ("7".equals(rank)) {
                value += 7;
            } else if ("8".equals(rank)) {
                value += 8;
            } else if ("9".equals(rank)) {
                value += 9;
            } else if ("10".equals(rank) || "Jack".equals(rank) || "Queen".equals(rank) || "King".equals(rank)) {
                value += 10;
            } else if ("Ace".equals(rank)) {
                value += 11;
                aceCount++;
            }
        }

        while (value > 21 && aceCount > 0) {
            value -= 10;
            aceCount--;
        }

        return value;
    }

    @Override
    public String toString() {
        StringBuilder handString = new StringBuilder();
        for (Card card : cards) {
            handString.append(card.toString()).append("\n");
        }
        return handString.toString();
    }
}
