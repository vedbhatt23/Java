import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        double marks;
        Functions fn = new Functions();
        int k=0;

        System.out.println("Table is as follows : ");
        System.out.println("ID\tName\tMarks");

        do {
            System.out.println("1) Add");
            System.out.println("2) Display All");
            System.out.println("3) Delete");
            System.out.println("4) Exit");
            System.out.println("Enter Choice: ");
            k = sc.nextInt();
            switch (k)
            {
                case 1:
                    System.out.println("Enter ID: ");
                    id = sc.nextInt();
                    System.out.println("Enter Name: ");
                    name = sc.next();
                    System.out.println("Enter Marks: ");
                    marks = sc.nextDouble();
                    fn.add(id, name, marks);
                    break;

                case 2:
                    fn.show();
                    break;

                case 3:
                    System.out.println("Enter ID to delete: ");
                    id = sc.nextInt();
                    fn.delete(id);
                    break;
                case 4:
                    k = 4;
                    break;
            }
        }while(k != 4);
    }
}
