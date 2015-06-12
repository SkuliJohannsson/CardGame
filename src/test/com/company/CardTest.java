package test.com.company;

import com.company.Card;
import com.company.Rank;
import com.company.Suit;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by skuli on 11.06.15.
 */
public class CardTest {

    @Test
    public void testEquals() {
        Assert.assertEquals(new Card(Rank.ACE, Suit.SPADES),
                new Card(Rank.ACE, Suit.SPADES));
        Assert.assertEquals(new Card(Rank.TWO, Suit.CLUBS),
                new Card(Rank.TWO, Suit.CLUBS));
        Assert.assertNotEquals(new Card(Rank.ACE, Suit.SPADES),
                new Card(Rank.ACE, Suit.HEARTS));
        Assert.assertNotEquals(new Card(Rank.ACE, Suit.SPADES),
                new Card(Rank.KING, Suit.SPADES));
        Assert.assertNotEquals(new Card(Rank.ACE, Suit.SPADES),
                new Card(Rank.KING, Suit.HEARTS));
    }


    @Test
    public void testToString() throws Exception {
        Assert.assertEquals("A♠", new Card(Rank.ACE, Suit.SPADES).toString());
        Assert.assertEquals("K♥", new Card(Rank.KING, Suit.HEARTS).toString());
        Assert.assertEquals("10♦", new Card(Rank.TEN, Suit.DIAMONDS).toString());
        Assert.assertEquals("4♣", new Card(Rank.FOUR, Suit.CLUBS).toString());
    }
}