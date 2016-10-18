package it.esteco.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreatestCommonDivisorTest {

    @Test
    public void sameArguments() throws Exception {
        assertEquals(1, NumberTheory.gcd(1,1));
        assertEquals(2, NumberTheory.gcd(2,2));
    }

    @Test
    public void relativelyPrime() throws Exception {
        assertEquals(1, NumberTheory.gcd(7, 9));
    }

    @Test
    public void oneMultipleOfTheOther() throws Exception {
        assertEquals(2, NumberTheory.gcd(2, 4));
    }

    @Test
    public void commonFactor() throws Exception {
        assertEquals(2, NumberTheory.gcd(18, 8));
    }

    @Test
    public void negativeIntegers() throws Exception {
        // We like always positive gcd
        assertEquals(4, NumberTheory.gcd(-4, 8));
        assertEquals(3, NumberTheory.gcd(9, -30));
        assertEquals(2, NumberTheory.gcd(-6, -20));
    }

    @Test
    public void zeroAsArgument() throws Exception {
        assertEquals(4, NumberTheory.gcd(4,0));
        assertEquals(5, NumberTheory.gcd(0, 5));
        assertEquals(1, NumberTheory.gcd(0, 0));
    }
}
