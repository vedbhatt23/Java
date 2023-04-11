public abstract class Employee {
    private String name;
    private String uan;
    private String employeeID;
    private String pfNo;
    private String designation;
    private String esiNo;
    private String department;
    private String bankName;
    private String doj;
    private String bankAccountNo;
    double grossWage;
    int totalWorkingDays;
    int paidDays;
    int lopDays;
    int leavesTaken;

    public Employee(String name, String uan, String employeeID, String pfNo, String designation,
                    String esiNo, String department, String bankName, String doj, String bankAccountNo,
                    double grossWage, int totalWorkingDays, int paidDays, int lopDays, int leavesTaken) {
        this.name = name;
        this.uan = uan;
        this.employeeID = employeeID;
        this.pfNo = pfNo;
        this.designation = designation;
        this.esiNo = esiNo;
        this.department = department;
        this.bankName = bankName;
        this.doj = doj;
        this.bankAccountNo = bankAccountNo;
        this.grossWage = grossWage;
        this.totalWorkingDays = totalWorkingDays;
        this.paidDays = paidDays;
        this.lopDays = lopDays;
        this.leavesTaken = leavesTaken;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUan() {
        return uan;
    }

    public void setUan(String uan) {
        this.uan = uan;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getPfNo() {
        return pfNo;
    }

    public void setPfNo(String pfNo) {
        this.pfNo = pfNo;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEsiNo() {
        return esiNo;
    }

    public void setEsiNo(String esiNo) {
        this.esiNo = esiNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public double getGrossWage() {
        return grossWage;
    }

    public void setGrossWage(int grossWage) {
        this.grossWage = grossWage;
    }

    public int getTotalWorkingDays() {
        return totalWorkingDays;
    }

    public void setTotalWorkingDays(int totalWorkingDays) {
        this.totalWorkingDays = totalWorkingDays;
    }

    public int getPaidDays() {
        return paidDays;
    }

    public void setPaidDays(int paidDays) {
        this.paidDays = paidDays;
    }

    public int getLopDays() {
        return lopDays;
    }

    public void setLopDays(int lopDays) {
        this.lopDays = lopDays;
    }

    public int getLeavesTaken() {
        return leavesTaken;
    }

    public void setLeavesTaken(int leavesTaken) {
        this.leavesTaken = leavesTaken;
    }
}