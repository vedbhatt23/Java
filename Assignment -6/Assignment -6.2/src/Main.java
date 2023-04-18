import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = sc.next();
        System.out.println("Enter Roll NO.: ");
        int roll_no = sc.nextInt();
        System.out.println("Marks 1: ");
        int marks1 = sc.nextInt();
        System.out.println("Marks 2: ");
        int marks2 = sc.nextInt();
        System.out.println("Marks 3: ");
        int marks3 = sc.nextInt();

        Result rs = new Result(name, roll_no, marks1, marks2, marks3);
        double percent = rs.percent_Cal();

        System.out.println("Percentage: "+percent+"%");
    }
}