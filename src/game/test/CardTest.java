package game.test;

import game.Card;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CardTest {

    Card check = new Card("Clubs", "2");
    @Test
    public void isAPair() {
        final List<Card> HAND1 = List.of(new Card("Clubs", "2"), new Card("Spades", "2"));
        //String s = check.isAPair(HAND1);
        assertEquals("Finding a pair without sorting",9, check.isAPair(HAND1));

    }

    @Test
    public void isTwoPair() {
        final List<Card> HAND1 = List.of(new Card("Clubs", "2"), new Card("Spades", "2"), new Card("Diamonds", "3"), new Card("Hearts", "3"));
        assertEquals("Finding a two pair without sorting", 8, check.isTwoPair(HAND1));
    }
}