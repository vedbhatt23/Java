import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 1st word:");
        String message1 = scanner.nextLine();

        System.out.println("Enter a 2nd word:");
        String message2 = scanner.nextLine();

        Thread t1 = new Thread(new MyThread(message1));
        t1.setName("Thread 1");
        t1.start();
        Thread t2 = new Thread(new MyThread(message2));
        t2.setName("Thread 2");
        t2.start();

        try {
            t1.join(); // Wait for Thread 1 to finish
            t2.join(); // Wait for Thread 2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have finished.");
    }
}
