package it.esteco.math;

public class Fraction {
    private final int integerValue;

    public Fraction(int integerValue) {
        this.integerValue = integerValue;
    }

    public Fraction plus(Fraction that) {
        if (this.integerValue != 0) {
            return this;
        } else {
            return that;
        }
    }

    public int intValue() {
        return integerValue;
    }
}
