import org.junit.Test;

import org.junit.Assert;

public class StringUtilsTest {

    @Test
    public void testReverse() {
        Assert.assertEquals("dcba", StringUtils.reverse("abcd"));
        Assert.assertEquals("madam", StringUtils.reverse("madam"));
        Assert.assertEquals("", StringUtils.reverse(""));
        Assert.assertNull(StringUtils.reverse(null));
    }

    @Test
    public void testIsPalindrome() {
        Assert.assertTrue(StringUtils.isPalindrome("madam"));
        Assert.assertTrue(StringUtils.isPalindrome("racecar"));
        Assert.assertFalse(StringUtils.isPalindrome("hello"));
        Assert.assertFalse(StringUtils.isPalindrome(null));
        Assert.assertTrue(StringUtils.isPalindrome(""));
    }

    @Test
    public void testToUpperCase() {
        Assert.assertEquals("HELLO", StringUtils.toUpperCase("hello"));
        Assert.assertEquals("WORLD", StringUtils.toUpperCase("world"));
        Assert.assertEquals("", StringUtils.toUpperCase(""));
        Assert.assertNull(StringUtils.toUpperCase(null));
    }
}