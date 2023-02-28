import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] even, odd;
        int n;

        // prompt user for number of elements
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        // initialize arrays with size n
        even = new int[n];
        odd = new int[n];

        // fill arrays with numbers from user
        fillArrays(even, odd, n, sc);

        // print even numbers
        System.out.print("Even numbers: ");
        printArray(even, countEven(even));
        System.out.println();

        // print odd numbers
        System.out.print("Odd numbers: ");
        printArray(odd, countOdd(odd));
    }

    // method to fill arrays with numbers from user
    public static void fillArrays(int[] even, int[] odd, int n, Scanner sc) {
        System.out.println("Enter " + n + " elements:");
        int i, j = 0, k = 0;
        for (i = 0; i < n; i++) {
            int num = sc.nextInt();

            // check if number is even
            if (num % 2 == 0) {
                even[j++] = num;
            } else {
                odd[k++] = num;
            }
        }
    }

    // method to print array
    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // method to count number of even numbers in array
    public static int countEven(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // method to count number of odd numbers in array
    public static int countOdd(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}