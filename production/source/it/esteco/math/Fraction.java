package it.esteco.math;

public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int integerValue) {
        this(integerValue, 1);
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction that) {
        if (this.denominator == that.denominator) {
            return new Fraction(this.numerator + that.numerator, this.denominator);
        } else {
            return new Fraction(this.numerator * that.denominator + that.numerator * this.denominator,
                    this.denominator * that.denominator);
        }
    }

    public int intValue() {
        return this.numerator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }
}
