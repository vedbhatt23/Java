import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c;

        System.out.println("Enter details for Normal Employee:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("UAN: ");
        String uan = scanner.nextLine();
        System.out.print("Employee ID: ");
        String employeeId = scanner.nextLine();
        System.out.print("PF Number: ");
        String pfNumber = scanner.nextLine();
        System.out.print("Designation: ");
        String designation = scanner.nextLine();
        System.out.print("ESI Number: ");
        String esiNumber = scanner.nextLine();
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Bank Name: ");
        String bankName = scanner.nextLine();
        System.out.print("Joining Date: ");
        String joiningDate = scanner.nextLine();
        System.out.print("Bank Account Number: ");
        String bankAccountNo = scanner.nextLine();

        System.out.print("Gross Wage: ");
        double grossWage = scanner.nextDouble();
        System.out.print("Total Working Days: ");
        int totalWorkingDays = scanner.nextInt();
        System.out.print("Paid Days: ");
        int paidDays = scanner.nextInt();
        System.out.print("LOP Days: ");
        int lopDays = scanner.nextInt();
        System.out.print("Leaves Taken: ");
        int leavesTaken = scanner.nextInt();


        System.out.println("\nType of Employee: ");
        System.out.println("1) Normal Employee");
        System.out.println("2) Bonus Employee");
        c = scanner.nextInt();
        switch (c)
        {
            case 1:
                NormalEmployee normalEmployee = new NormalEmployee(name, uan, employeeId, pfNumber, designation, esiNumber,
                        department, bankName, joiningDate, bankAccountNo, grossWage, totalWorkingDays,  paidDays,  lopDays,  leavesTaken);

                System.out.println("\nEarnings for Normal Employee:");
                System.out.println("Basic Wage: " + normalEmployee.calculateBasicWage());
                System.out.println("HRA: " + normalEmployee.calculateHRA());
                System.out.println("Conveyance Allowances: " + normalEmployee.calculateConveyanceAllowances());
                System.out.println("Medical Allowances: " + normalEmployee.calculateMedicalAllowances());
                System.out.println("Other Allowances: " + normalEmployee.calculateOtherAllowances());
                System.out.println("Total Earnings: " + normalEmployee.calculateTotalEarnings());

                System.out.println("\nDeductions for Normal Employee:");
                System.out.println("EPF Deduction: " + normalEmployee.calculateEPFDeduction());
                System.out.println("ESI Deduction: " + normalEmployee.calculateESIDeduction());
                System.out.println("Professional Tax: " + normalEmployee.calculateProfessionalTax());
                System.out.println("Loan Recovery: " + normalEmployee.calculateLoanRecovery());
                System.out.println("Total Deductions: " + normalEmployee.calculateTotalDeductions());

                System.out.println("\nNet Salary: "+normalEmployee.calculateNetSalary());
                break;

            case 2:
                BonusEmployee bonusEmployee = new BonusEmployee(name, uan, employeeId, pfNumber, designation, esiNumber,
                        department, bankName, joiningDate, bankAccountNo, grossWage, totalWorkingDays,  paidDays,  lopDays,  leavesTaken);

                System.out.println("\nEarnings for Bonus Employee:");
                System.out.println("Basic Wage: " + bonusEmployee.calculateBasicWage());
                System.out.println("HRA: " + bonusEmployee.calculateHRA());
                System.out.println("Conveyance Allowances: " + bonusEmployee.calculateConveyanceAllowances());
                System.out.println("Medical Allowances: " + bonusEmployee.calculateMedicalAllowances());
                System.out.println("Other Allowances: " + bonusEmployee.calculateOtherAllowances());
                System.out.println("Total Earnings: " + bonusEmployee.calculateTotalEarnings());

                System.out.println("\nDeductions for Bonus Employee:");
                System.out.println("EPF Deduction: " + bonusEmployee.calculateEPFDeduction());
                System.out.println("ESI Deduction: " + bonusEmployee.calculateESIDeduction());
                System.out.println("Professional Tax: " + bonusEmployee.calculateProfessionalTax());
                System.out.println("Loan Recovery: " + bonusEmployee.calculateLoanRecovery());
                System.out.println("Total Deductions: " + bonusEmployee.calculateTotalDeductions());

                System.out.println("\nNet Salary: "+bonusEmployee.calculateNetSalary());
        }
    }
}