package game;

import java.util.List;

public class PokerMain {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        //Card twoofdiamonds = new Card("Clubs", "2");
        //System.out.println("three of diamonds" +threeofdiamonds);

        final List<Card> HAND1 = List.of(new Card("Clubs", "2"), new Card("Spades", "3"));
        System.out.println("Printing HAND1 -> " +HAND1);
    }
}