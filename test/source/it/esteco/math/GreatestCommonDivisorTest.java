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

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
