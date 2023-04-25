import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a string: ");
            String inputString = sc.nextLine();
            if (!inputString.equals("India")) {
                throw new NoMatchExcp(9, inputString);
            }
            System.out.println("String is valid.");
        } catch (NoMatchExcp e) {
            System.out.println(e.getMessage());
        }
    }
}