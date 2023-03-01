import java.util.*;

public class Calculator {
    // Method to perform addition of two numbers
    public void add(int a, int b) {
        System.out.println("Addition : " + (a + b));
    }

    // Method to perform exponentiation of two numbers
    public void power(int a, int b) {
        System.out.println("Power : " + Math.pow(a, b));
    }

    // Method to perform subtraction of two numbers
    public void sub(int a, int b) {
        System.out.println("Subtraction : " + (a - b));
    }

    // Method to perform division of two numbers
    public void div(int a, int b) {
        System.out.println("Division : " + (a / b)); // fixed error
    }

    // Method to perform multiplication of two numbers
    public void multi(int a, int b) {
        System.out.println("Multiplication : " + (a * b));
    }

    // Method to calculate mean of an ArrayList of integers
    public void mean(ArrayList<Integer> arr) {
        int sum = 0;
        int count = arr.size();
        for (Integer i : arr) {
            sum = sum + i;
        }
        System.out.println("Mean : " + sum / count);
    }

    // Method to calculate standard deviation of an ArrayList of integers
    public void standardDeviation(ArrayList<Integer> arr) {
        int sum = 0, sd = 0;
        int count = arr.size();
        for (Integer i : arr) {
            sum = sum + i;
        }
        int mean = sum / count;
        for (Integer i : arr) {
            sd = (int) (sd + Math.pow((i - mean), 2));
        }
        sd = sd / count;
        System.out.println("Standard Deviation : " + Math.sqrt(sd));
    }
}
