import java.util.Scanner;
import pkg_Stack.Interface_STK;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Interface_STK stack = null;
        int choice1, choice2, value;

        while (true) {
            System.out.println("\nChoose stack implementation:");
            System.out.println("1. FixedIntStack");
            System.out.println("2. GrowableIntStack");
            System.out.println("3. Exit");
            System.out.print("Enter choice (1-3): ");
            choice1 = input.nextInt();

            switch (choice1) {
                case 1:
                    stack = new Fixed_stk();
                    while (true) {
                        System.out.println("\nChoose stack operation:");
                        System.out.println("1. Push");
                        System.out.println("2. Pop");
                        System.out.println("3. Display top element");
                        System.out.println("4. Display stack");
                        System.out.println("5. Exit");
                        System.out.print("Enter choice (1-5): ");
                        choice2 = input.nextInt();

                        switch (choice2) {
                            case 1:
                                System.out.print("Enter value to push: ");
                                value = input.nextInt();
                                stack.push(value);
                                break;
                            case 2:
                                value = stack.pop();
                                if (value != -1) {
                                    System.out.println("Popped value: " + value);
                                }
                                break;
                            case 3:
                                stack.displayStkTop();
                                break;
                            case 4:
                                stack.displayStk();
                                break;
                            case 5:
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Invalid choice!");
                                continue;
                        }
                    }

                case 2:
                    stack = new Growable_stk();
                    while (true) {
                        System.out.println("\nChoose stack operation:");
                        System.out.println("1. Push");
                        System.out.println("2. Pop");
                        System.out.println("3. Display top element");
                        System.out.println("4. Display stack");
                        System.out.println("5. Exit");
                        System.out.print("Enter choice (1-5): ");
                        choice2 = input.nextInt();

                        switch (choice2) {
                            case 1:
                                System.out.print("Enter value to push: ");
                                value = input.nextInt();
                                stack.push(value);
                                break;
                            case 2:
                                value = stack.pop();
                                if (value != -1) {
                                    System.out.println("Popped value: " + value);
                                }
                                break;
                            case 3:
                                stack.displayStkTop();
                                break;
                            case 4:
                                stack.displayStk();
                                break;
                            case 5:
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Invalid choice!");
                                continue;
                        }
                    }

                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");
                    continue;
            }
        }
    }
}