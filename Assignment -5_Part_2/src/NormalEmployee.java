public class NormalEmployee extends Employee {
    public NormalEmployee(String name, String uan, String employeeID, String pfNo, String designation, String esiNo,
                          String department, String bankName, String doj, String bankAccountNo, double grossWage,
                          int totalWorkingDays, int paidDays, int lopDays, int leavesTaken) {
        super(name, uan, employeeID, pfNo, designation, esiNo, department, bankName, doj, bankAccountNo, grossWage,
                totalWorkingDays, paidDays, lopDays, leavesTaken);
    }

    public double calculateBasicWage() {
        return ((grossWage / totalWorkingDays) * paidDays * 0.45);
    }

    public double calculateHRA() {
        return calculateBasicWage() * 0.4;
    }

    public double calculateConveyanceAllowances() {
        return ((1600 / totalWorkingDays) * paidDays);
    }

    public double calculateMedicalAllowances() {
        // Medical allowances is 2% of the gross wage
        return ((1250 / totalWorkingDays) * paidDays);
    }

    public double calculateOtherAllowances() {
        // Other allowances is 3% of the gross wage
        return (((grossWage / totalWorkingDays) * paidDays) - (calculateBasicWage() + calculateHRA() + calculateConveyanceAllowances() + calculateMedicalAllowances()));
    }

    public double calculateTotalEarnings() {
        // Total earnings is the sum of basic wage, HRA, conveyance allowances, medical allowances, and other allowances
        return calculateBasicWage() + calculateHRA() + calculateConveyanceAllowances() +
                calculateMedicalAllowances() + calculateOtherAllowances();
    }


    public double calculateEPFDeduction() {
        // EPF deduction is 12% of the basic wage
        if(calculateBasicWage()>=15000)
        {
            return(15000*0.12);
        }
        else
        {
            return calculateBasicWage()*0.15;
        }

    }

    public double calculateESIDeduction() {
        // ESI/Health Insurance deduction is 1.75% of the gross wage
        if(grossWage<=21000)
        {
            return grossWage*0.0075;
        }
        else
        {
            return 0;
        }
    }
    public double calculateProfessionalTax() {
        return 0;
    }

    public double calculateLoanRecovery() {

        return 0;
    }

    public double calculateTotalDeductions() {
        // Total deductions is the sum of EPF, ESI/Health Insurance, Professional Tax, and Loan Recovery
        return calculateEPFDeduction() + calculateESIDeduction() + calculateProfessionalTax() + calculateLoanRecovery();
    }

    public double calculateNetSalary()
    {
        return calculateTotalEarnings()-calculateTotalDeductions();
    }

}