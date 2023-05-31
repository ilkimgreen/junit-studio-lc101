package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Before
    public void beforeTest() {
        // this.balancedBrackets = new BalancedBrackets("xxx");
    }

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void twoBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void bracketsWithinBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void bracketsOfBracketsWithinBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]][]"));
    }

    @Test
    public void tripleBracketsWithinBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }

    @Test
    public void twoTripleBracketsWithinBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[][]]]"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void bracketsWithPizzaStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[pizza]"));
    }

    @Test
    public void onlyOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyClosedBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void mismatchedBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void unequalBracketsWithPizza() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[pizza[]"));
    }



}
