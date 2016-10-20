package it.esteco.math;

public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int integerValue) {
        this(integerValue, 1);
    }

    public Fraction(int numerator, int denominator) {
        int gcd = NumberTheory.gcd(numerator, denominator);
        int sign = denominator > 0 ? 1 : -1;
        this.numerator = numerator / gcd * sign;
        this.denominator = denominator / gcd * sign;
    }

    public Fraction plus(Fraction that) {
        return new Fraction(this.numerator * that.denominator + that.numerator * this.denominator,
                this.denominator * that.denominator);
    }

    public Fraction times(Fraction that) {
        return new Fraction(this.numerator * that.numerator, this.denominator * that.denominator);
    }

    @Override
    public String toString() {
        return String.format("%d/%d", this.numerator, this.denominator);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            Fraction that = (Fraction) obj;
            return this.numerator == that.numerator && this.denominator == that.denominator;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.numerator * 19 + this.denominator;
    }

    public Fraction minus(Fraction that) {
        return this;
    }
}
