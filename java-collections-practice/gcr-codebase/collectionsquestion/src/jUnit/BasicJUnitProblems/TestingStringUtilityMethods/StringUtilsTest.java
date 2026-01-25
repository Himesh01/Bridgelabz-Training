package jUnit.BasicJUnitProblems.TestingStringUtilityMethods;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    StringUtils utils = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("olleh", utils.reverse("hello"));
    }

    @Test
    void testReverseEmpty() {
        assertEquals("", utils.reverse(""));
    }

    @Test
    void testReverseNull() {
        assertNull(utils.reverse(null));
    }

    @Test
    void testPalindromeTrue() {
        assertTrue(utils.isPalindrome("madam"));
    }

    @Test
    void testPalindromeCaseInsensitive() {
        assertTrue(utils.isPalindrome("Madam"));
    }

    @Test
    void testPalindromeFalse() {
        assertFalse(utils.isPalindrome("hello"));
    }

    @Test
    void testPalindromeNull() {
        assertFalse(utils.isPalindrome(null));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", utils.toUpperCase("hello"));
    }

    @Test
    void testToUpperCaseMixed() {
        assertEquals("JAVA", utils.toUpperCase("Java"));
    }

    @Test
    void testToUpperCaseNull() {
        assertNull(utils.toUpperCase(null));
    }
}