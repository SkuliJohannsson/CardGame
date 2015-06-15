package test.com.company;

import com.company.Util;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by skuli on 15.06.15.
 */
public class UtilTest {

    @Test
    public void testToSimplerString() {
        Assert.assertEquals("", Util.toSimplerString(new String[]{}));
        Assert.assertEquals("a", Util.toSimplerString(new String[]{"a"}));
        Assert.assertEquals("a b", Util.toSimplerString(new String[]{"a", "b"}));
    }

    @Test
    public void testGetArgs() {
        Assert.assertEquals(0, Util.getArgs("").length);
        Assert.assertEquals(0, Util.getArgs("a").length);
        Assert.assertEquals("b", Util.toSimplerString(Util.getArgs("a b")));
        Assert.assertEquals("b c", Util.toSimplerString(Util.getArgs("a b c")));
    }

    @Test
    public void testIsPositive() {
        Assert.assertFalse(Util.IsPositiveNumber(""));
        Assert.assertFalse(Util.IsPositiveNumber("a"));
        Assert.assertFalse(Util.IsPositiveNumber("-1"));
        Assert.assertTrue(Util.IsPositiveNumber("0"));
        Assert.assertTrue(Util.IsPositiveNumber("1"));
    }
}
