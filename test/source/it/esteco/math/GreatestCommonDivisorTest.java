package it.esteco.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreatestCommonDivisorTest {

    @Test
    public void sameArguments() throws Exception {
        assertEquals(1, gcd(1,1));
        assertEquals(2, gcd(2,2));
    }

    @Test
    public void relativelyPrime() throws Exception {
        assertEquals(1, gcd(7, 9));
    }

    @Test
    public void oneMultipleOfTheOther() throws Exception {
        assertEquals(2, gcd(2, 4));
    }

    @Test
    public void commonFactor() throws Exception {
        assertEquals(2, gcd(18, 8));
    }

    @Test
    public void negativeIntegers() throws Exception {
        // We like always positive gcd
        assertEquals(4, gcd(-4, 8));
        assertEquals(3, gcd(9, -30));
        assertEquals(2, gcd(-6, -20));
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return Math.abs(a);
    }
}
