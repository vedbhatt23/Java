import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int size = input.nextInt();
        StudentManager manager = new StudentManager(size);
        boolean loop = true;
        while (loop) {
            System.out.println("1. Add student");
            System.out.println("2. Display all students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by name");
            System.out.println("5. Search by position");
            System.out.println("6. Update student");
            System.out.println("7. Delete student");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter PRN: ");
                    int prn = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter name: ");
                    String name = input.nextLine();
                    System.out.print("Enter date of birth: ");
                    String dob = input.nextLine();
                    System.out.print("Enter marks (separated by spaces): ");
                    String marksStr = input.nextLine();
                    String[] marksArr = marksStr.split(" ");
                    double[] marks = new double[marksArr.length];
                    for (int i = 0; i < marksArr.length; i++) {
                        marks[i] = Double.parseDouble(marksArr[i]);
                    }
                    manager.addStudent(new Student(prn, name, dob, marks));
                    break;
                case 2:
                    manager.display();
                    break;
                case 3:
                    System.out.print("Enter PRN to search: ");
                    prn = input.nextInt();
                    manager.searchByPrn(prn);
                    break;
                case 4:
                    System.out.print("Enter name to search: ");
                    name = input.next();
                    manager.searchByName(name);
                    break;
                case 5:
                    System.out.print("Enter position to search: ");
                    int position = input.nextInt();
                    manager.searchByPosition(position);
                    break;
                case 6:
                    System.out.print("Enter PRN to update: ");
                    prn = input.nextInt();
                    manager.updateStudent(prn);
                    break;
                case 7:
                    System.out.print("Enter PRN to delete: ");
                    prn = input.nextInt();
                    manager.deleteStudent(prn);
                    break;
                case 8:
                    System.out.println("THANK YOU!");
                    loop = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }

}