public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.denominator = denominator;
    }

    public RationalNumber add(RationalNumber other) {
        int num = numerator * other.denominator + other.numerator * denominator;
        int den = denominator * other.denominator;
        return new RationalNumber(num, den);
    }

    public RationalNumber subtract(RationalNumber other) {
        int num = numerator * other.denominator - other.numerator * denominator;
        int den = denominator * other.denominator;
        return new RationalNumber(num, den);
    }

    public RationalNumber multiply(RationalNumber other) {
        int num = numerator * other.numerator;
        int den = denominator * other.denominator;
        return new RationalNumber(num, den);
    }

    public RationalNumber divide(RationalNumber other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        int num = numerator * other.denominator;
        int den = denominator * other.numerator;
        return new RationalNumber(num, den);
    }

    public int compareTo(RationalNumber other) {
        int num1 = numerator * other.denominator;
        int num2 = other.numerator * denominator;
        return Integer.compare(num1, num2);
    }

    public double toDouble() {
        return (double) numerator / denominator;
    }

    public RationalNumber abs() {
        int num = Math.abs(numerator);
        int den = Math.abs(denominator);
        return new RationalNumber(num, den);
    }
}