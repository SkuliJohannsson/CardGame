package test.com.company;

import com.company.Card;
import com.company.Util;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by skuli on 11.06.15.
 */
public class CardTest {

    @Test
    public void testEquals() {
        Assert.assertEquals(new Card("AS"), new Card("AS"));
        Assert.assertEquals(new Card("2C"), new Card("2C"));
        Assert.assertNotEquals(new Card("AS"), new Card("AH"));
        Assert.assertNotEquals(new Card("AS"), new Card("KS"));
        Assert.assertNotEquals(new Card("AS"), new Card("KH"));
    }

    @Test
    public void testToString() {
        Assert.assertEquals("AS", new Card("AS").toString());
        Assert.assertEquals("KH", new Card("KH").toString());
        Assert.assertEquals("4C", new Card("4C").toString());
        Assert.assertEquals("10D", new Card("10D").toString());
    }

    @Test
    public void testSortCards() throws Exception {
        assertSortedCardsEqual("AS 10S JS QS KS", "AS KS QS JS 10S");
        assertSortedCardsEqual("AC 5D 3H 2S", "2S 3H 5D AC");
        assertSortedCardsEqual("AH 2H 3H 4H", "4H 3H 2H AH");
        assertSortedCardsEqual("AH AH 2H 2H", "2H AH 2H AH");
    }

    private void assertSortedCardsEqual(String expected, String cards) {
        String[] sCards = cards.split(" ");
        Card[] cs = new Card[sCards.length];
        for (int i = 0; i < sCards.length; i++) {
            cs[i] = new Card(sCards[i]);
        }
        Arrays.sort(cs);
        Assert.assertEquals(expected, Util.toSimplerString(cs));
    }
}