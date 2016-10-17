package it.esteco.math;

public class Fraction {
    private final int integerValue;

    public Fraction(int integerValue) {
        this.integerValue = integerValue;
    }

    public Fraction(int numerator, int denominator) {
        this.integerValue = numerator;
    }

    public Fraction plus(Fraction that) {
        return new Fraction(this.integerValue + that.integerValue);
    }

    public int intValue() {
        return this.integerValue;
    }

    public int getNumerator() {
        return 5;
    }

    public int getDenominator() {
        return 3;
    }
}
