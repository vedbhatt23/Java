import java.util.Scanner;

public class StudentManager {
    private Student[] students;
    private int count;

    public StudentManager(int size) {
        students = new Student[size];
        count = 0;
    }

    public void addStudent(Student student) {
        if (count < students.length) {
            students[count] = student;
            count++;
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Student array is full. Unable to add student.");
        }
    }

    public void display() {
        System.out.println("PRN\tName\t\tDOB\t\tMarks");
        for (int i = 0; i < count; i++) {
            Student student = students[i];
            System.out.print(student.getPrn() + "\t" + student.getName() + "\t" + student.getDob() + "\t");
            double[] marks = student.getMarks();
            for (int j = 0; j < marks.length; j++) {
                System.out.print(marks[j] + " ");
            }
            System.out.println();
        }
    }

    public void searchByPrn(int prn) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            Student student = students[i];
            if (student.getPrn() == prn) {
                System.out.println("PRN\tName\t\tDOB\t\tMarks");
                System.out.print(student.getPrn() + "\t" + student.getName() + "\t" + student.getDob() + "\t");
                double[] marks = student.getMarks();
                for (int j = 0; j < marks.length; j++) {
                    System.out.print(marks[j] + " ");
                }
                System.out.println();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with PRN " + prn + " not found.");
        }
    }

    public void searchByName(String name) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            Student student = students[i];
            if (student.getName().equals(name)) {
                System.out.println("PRN\tName\t\tDOB\t\tMarks");
                System.out.print(student.getPrn() + "\t" + student.getName() + "\t" + student.getDob() + "\t");
                double[] marks = student.getMarks();
                for (int j = 0; j < marks.length; j++) {
                    System.out.print(marks[j] + " ");
                }
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Student with name " + name + " not found.");
        }
    }

    public void searchByPosition(int position) {
        if (position >= 1 && position <= count) {
            Student student = students[position - 1];
            System.out.println("PRN\tName\t\tDOB\t\tMarks");
            System.out.print(student.getPrn() + "\t" + student.getName() + "\t" + student.getDob() + "\t");
            double[] marks = student.getMarks();
            for (int j = 0; j < marks.length; j++) {
                System.out.print(marks[j] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Invalid position.");
        }
    }

    public void updateStudent(int prn) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            Student student = students[i];
            if (student.getPrn() == prn) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter new name: ");
                String name = input.nextLine();
                System.out.print("Enter new date of birth: ");
                String dob = input.nextLine();
                System.out.print("Enter new marks (separated by spaces): ");
                String marksStr = input.nextLine();
                String[] marksArr = marksStr.split(" ");
                double[] marks = new double[marksArr.length];
                for (int j = 0; j < marksArr.length; j++) {
                    marks[j] = Double.parseDouble(marksArr[j]);
                }
                student = new Student(prn, name, dob, marks);
                students[i] = student;
                System.out.println("Student updated successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with PRN " + prn + " not found.");
        }
    }

    public void deleteStudent(int prn) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            Student student = students[i];
            if (student.getPrn() == prn) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                count--;
                System.out.println("Student deleted successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with PRN " + prn + " not found.");
        }
    }
}
