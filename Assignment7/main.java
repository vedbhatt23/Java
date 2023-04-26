import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first rational number (numerator/denominator): ");
            String[] parts1 = sc.nextLine().split("/");
            int num1 = Integer.parseInt(parts1[0]);
            int den1 = Integer.parseInt(parts1[1]);
            RationalNumber rn1 = new RationalNumber(num1, den1);

            System.out.print("Enter second rational number (numerator/denominator): ");
            String[] parts2 = sc.nextLine().split("/");
            int num2 = Integer.parseInt(parts2[0]);
            int den2 = Integer.parseInt(parts2[1]);
            RationalNumber rn2 = new RationalNumber(num2, den2);

            RationalNumber result = rn1.add(rn2);
            System.out.println("Addition: " + result.getNumerator() + "/" + result.getDenominator());

            result = rn1.subtract(rn2);
            System.out.println("Subtraction: " + result.getNumerator() + "/" + result.getDenominator());

            result = rn1.multiply(rn2);
            System.out.println("Multiplication: " + result.getNumerator() + "/" + result.getDenominator());

            result = rn1.divide(rn2);
            System.out.println("Division: " + result.getNumerator() + "/" + result.getDenominator());

            int compareResult = rn1.compareTo(rn2);
            if (compareResult < 0) {
                System.out.println("First rational number is less than second rational number");
            } else if (compareResult > 0) {
                System.out.println("First rational number is greater than second rational number");
            } else {
                System.out.println("Both rational numbers are equal");
            }

            System.out.println("First rational number as floating point: " + rn1.toDouble());
            System.out.println("Second rational number as floating point: " + rn2.toDouble());

            result = rn1.abs();
            System.out.println("Absolute value of first rational number: " + result.getNumerator() + "/" + result.getDenominator());

            result = rn2.abs();
            System.out.println("Absolute value of second rational number: " + result.getNumerator() + "/" + result.getDenominator());

        } catch (NumberFormatException e) {
            System.out.println("Invalid input: must be integers separated by a slash (/)");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
