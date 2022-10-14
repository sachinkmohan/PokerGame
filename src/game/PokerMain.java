/* Author - Sachin K Mohan */
/* Title - PokerMain.java */
/* Description - Main Program to test the Poker rankings between 2 hands */

package game;

import java.util.List;

public class PokerMain {

    private static final List<Card> HAND1 = List.of(new Card("Clubs", "2"), new Card("Spades", "2"));
    private static final List<Card> HAND2 = List.of(new Card("Clubs", "2"), new Card("Spades", "3"));
    private static int[] rankCompare = { 11, 11}; // Intializing to a higher value to do the comparison
    public static void main(String[] args) {
        testisAPair(); // to test a pair functionality for the 2 hands
    }

    private static void testisAPair() {
        Card check = new Card("Clubs", "2");
        int s1 = check.isAPair(HAND1);
        rankCompare[0]= s1;
        int s2 = check.isAPair(HAND2);
        rankCompare[1]= s2;
        if(rankCompare[0]<rankCompare[1]){
            System.out.println("Hand1 won the game");
        }
        else{
            System.out.println("Hand2 won the game");
        }
    }
}