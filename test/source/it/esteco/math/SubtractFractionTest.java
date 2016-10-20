package it.esteco.math;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SubtractFractionTest {

    private final Fraction expected;
    private final Fraction minuend;
    private final Fraction subtrahend;

    public SubtractFractionTest(Fraction expected, Fraction minuend, Fraction subtrahend) {
        this.expected = expected;
        this.minuend = minuend;
        this.subtrahend = subtrahend;
    }

    @Parameterized.Parameters
    public static Collection<Fraction[]> generateData() {
        return Arrays.asList(new Fraction[][]{
                {new Fraction(0), new Fraction(0), new Fraction(0)},
                {new Fraction(15), new Fraction(15), new Fraction(0)},
                {new Fraction(-1), new Fraction(0), new Fraction(1)},
                {new Fraction(2), new Fraction(0), new Fraction(-2)},
                {new Fraction(3), new Fraction(4), new Fraction(1)},
                {new Fraction(-8), new Fraction(-3), new Fraction(5)},
                {new Fraction(-8), new Fraction(-3), new Fraction(5)},
                {new Fraction(-4), new Fraction(-6), new Fraction(-2)},
                {new Fraction(1, 2), new Fraction(3, 4), new Fraction(1, 4)},
                {new Fraction(19, 28), new Fraction(10, 7), new Fraction(3, 4)},
                {new Fraction(-7, 11), new Fraction(-3, 11), new Fraction(4, 11)},
                {new Fraction(51, 19), new Fraction(-6, 19), new Fraction(-3)},
                {new Fraction(-3, 10), new Fraction(-1, 2), new Fraction(1, -5)}
        });
    }

    @Test
    public void subtractFractions() throws Exception {
        assertEquals(expected, minuend.minus(subtrahend));
    }

}
