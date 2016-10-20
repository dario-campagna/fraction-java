package it.esteco.math;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MultiplyFractionTest {

    private final Fraction expected;
    private final Fraction multiplier;
    private final Fraction multiplicand;

    public MultiplyFractionTest(Fraction expected, Fraction multiplier, Fraction multiplicand) {
        this.expected = expected;
        this.multiplier = multiplier;
        this.multiplicand = multiplicand;
    }

    @Parameterized.Parameters
    public static Collection<Fraction[]> generateData() {
        return Arrays.asList(new Fraction[][]{
                {new Fraction(0), new Fraction(0), new Fraction(0)},
                {new Fraction(0), new Fraction(1), new Fraction(0)},
                {new Fraction(0), new Fraction(0), new Fraction(3, 7)},
                {new Fraction(-4), new Fraction(-4), new Fraction(1)},
                {new Fraction(6, 5), new Fraction(6, 5), new Fraction(1)},
                {new Fraction(5), new Fraction(1), new Fraction(5)},
                {new Fraction(1, 4), new Fraction(1), new Fraction(1, 4)},
                {new Fraction(1, 40), new Fraction(1, 5), new Fraction(1, 8)},
                {new Fraction(3, 20), new Fraction(3, 5), new Fraction(1, 4)},
                {new Fraction(7, 12), new Fraction(2, 3), new Fraction(7, 8)},
                {new Fraction(-5, 64), new Fraction(-1, 8), new Fraction(5, 8)},
                {new Fraction(3, 10), new Fraction(-2, 5), new Fraction(-3, 4)},
        });
    }

    @Test
    public void multiplyFractions() {
        assertEquals(expected, multiplicand.times(multiplier));
    }

}
