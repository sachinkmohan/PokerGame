package game;

public class Card {

    public final String suit;
    public final String value;

    String[] VALUE = { null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    String[] Suits = { "Clubs", "Diamonds", "Hearts", "Spades"};
    //public enum CardSuit { C, D, H, S };
    //public enum CardValue { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public Card(String suit, String value){
        this.suit = suit;
        this.value = value;
    }

    public String toString(){
        return value + " of " +suit;
    }
}
