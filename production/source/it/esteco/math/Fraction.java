package it.esteco.math;

public class Fraction {
    private final int integerValue;

    public Fraction(int integerValue) {
        this.integerValue = integerValue;
    }

    public Fraction plus(Fraction fraction) {
        return this;
    }

    public int intValue() {
        return integerValue;
    }
}
