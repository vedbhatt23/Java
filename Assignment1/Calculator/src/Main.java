import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Calculator obj = new Calculator();

        System.out.println("1) Addition (a+b)");
        System.out.println("2) Subtraction (a-b)");
        System.out.println("3) Multiplication (a*b)");
        System.out.println("4) Division (a/b)");
        System.out.println("5) Power (a^b)");
        System.out.println("6) Mean");
        System.out.println("7) Variance");
        int x = sc.nextInt();
        switch (x)
        {
            case 1:
            {
                System.out.println("Enter a : ");
                int a = sc.nextInt();
                System.out.println("Enter b : ");
                int b = sc.nextInt();
                obj.add(a,b);
                break;
            }
            case 2:
            {
                System.out.println("Enter a : ");
                int a = sc.nextInt();
                System.out.println("Enter b : ");
                int b = sc.nextInt();
                obj.sub(a,b);
                break;
            }
            case 3:
            {
                System.out.println("Enter a : ");
                int a = sc.nextInt();
                System.out.println("Enter b : ");
                int b = sc.nextInt();
                obj.multi(a,b);
                break;
            }
            case 4:
            {
                System.out.println("Enter a : ");
                int a = sc.nextInt();
                System.out.println("Enter b : ");
                int b = sc.nextInt();
                obj.div(a,b);
                break;
            }
            case 5:
            {
                System.out.println("Enter a : ");
                int a = sc.nextInt();
                System.out.println("Enter b : ");
                int b = sc.nextInt();
                obj.power(a,b);
                break;
            }
            case 6:
            {
                String input = "";
                ArrayList<Integer> arr = new ArrayList<>();
                System.out.println("Enter numbers for Mean and to stop enter 'end' : ");
                while (true) {
                    input = sc.nextLine();
                    if (input.equals("end")) {
                        break;
                    }
                    try {
                        int number = Integer.parseInt(input);
                        arr.add(number);
                    } catch (NumberFormatException e) {
                    }
                }
                obj.mean(arr);
                break;
            }
            case 7:
            {
                String input = "";
                ArrayList<Integer> arr = new ArrayList<>();
                System.out.println("Enter numbers for Standard Deviation and to stop enter 'end' : ");
                while (true) {
                    input = sc.nextLine();
                    if (input.equals("end")) {
                        break;
                    }
                    try {
                        int number = Integer.parseInt(input);
                        arr.add(number);
                    } catch (NumberFormatException e) {
                    }
                }
                obj.standardDeviation(arr);
                break;
            }
        }
    }
}
