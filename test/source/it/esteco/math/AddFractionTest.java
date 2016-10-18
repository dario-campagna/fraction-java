package it.esteco.math;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AddFractionTest {

    private final Fraction expected;
    private final Fraction augend;
    private final Fraction addend;

    public AddFractionTest(Fraction expected, Fraction augend, Fraction addend) {
        this.expected = expected;
        this.augend = augend;
        this.addend = addend;
    }

    @Parameterized.Parameters
    public static Collection<Fraction[]> generateData() {
        return Arrays.asList(new Fraction[][]{
                {new Fraction(0), new Fraction(0), new Fraction(0)},
                {new Fraction(7), new Fraction(7), new Fraction(0)},
                {new Fraction(11), new Fraction(0), new Fraction(11)},
                {new Fraction(13), new Fraction(4), new Fraction(9)},
                {new Fraction(1), new Fraction(-2), new Fraction(3)},
                {new Fraction(4), new Fraction(5), new Fraction(-1)},
                {new Fraction(-14), new Fraction(-6), new Fraction(-8)},
                {new Fraction(5, 3), new Fraction(1, 3), new Fraction(4, 3)},
                {new Fraction(4, 3), new Fraction(-1, 3), new Fraction(5, 3)},
                {new Fraction(9, 4), new Fraction(2), new Fraction(1, 4)},
                {new Fraction(5, 63), new Fraction(1, -7), new Fraction(-2, -9)},
                {new Fraction(1, 3), new Fraction(1, 9), new Fraction(2, 9)},
                {new Fraction(2), new Fraction(3, 4), new Fraction(5, 4)},
                {new Fraction(-2, 3), new Fraction(1, 6), new Fraction(-5, 6)},
                {new Fraction(1, 2), new Fraction(1, -4), new Fraction(6, 8)}
        });
    }

    @Test
    public void addFractions() throws Exception {
        assertEquals(expected, augend.plus(addend));
    }
}
