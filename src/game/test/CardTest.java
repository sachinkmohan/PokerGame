package game.test;

import game.Card;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CardTest {

    @Test
    public void isAPair() {
        final List<Card> HAND1 = List.of(new Card("Clubs", "2"), new Card("Spades", "2"));
        Card check = new Card("Clubs", "2");
        //String s = check.isAPair(HAND1);
        assertEquals("Finding a pair without sorting","Pair found", check.isAPair(HAND1));

    }
}