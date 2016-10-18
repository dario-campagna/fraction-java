package it.esteco.math;

import com.sun.javafx.binding.StringFormatter;

public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int integerValue) {
        this(integerValue, 1);
    }

    public Fraction(int numerator, int denominator) {
        int sign = denominator > 0 ? 1 : -1;
        this.numerator = numerator * sign;
        this.denominator = denominator * sign;
    }

    public Fraction plus(Fraction that) {
        if (this.denominator == that.denominator) {
            return new Fraction(this.numerator + that.numerator, this.denominator);
        } else {
            return new Fraction(this.numerator * that.denominator + that.numerator * this.denominator,
                    this.denominator * that.denominator);
        }
    }

    @Override
    public String toString() {
        return StringFormatter.format("%d/%d", this.numerator, this.denominator).getValue();
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
}
