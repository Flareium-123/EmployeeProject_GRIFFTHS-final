package version1;

public class BasePlusCommissionEmployee {
    private int empID;
    private String empName;
    private double totalSale;
    private double baseSalary;

    public BasePlusCommissionEmployee() {
    }

    public BasePlusCommissionEmployee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }

    public BasePlusCommissionEmployee(int empID, String empName, double totalSale, double baseSalary) {
        this.empID = empID;
        this.empName = empName;
        this.totalSale = totalSale;
        this.baseSalary = baseSalary;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(double totalSale) {
        this.totalSale = totalSale;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public double computeSalary(){
        double commission = 0;

        if (totalSale < 50000) {
            commission = totalSale * 0.05;
        } else if (totalSale > 50000 && totalSale < 100000) {
            commission = totalSale * 0.10;
        } else if (totalSale > 100000 && totalSale < 500000) {
            commission = totalSale * 0.15;
        } else if (totalSale > 500000) {
            commission = totalSale * 0.20;
        }
        return commission + baseSalary;
    }

    public void displayCommissionEmployee(){
        System.out.println("PieceWorkerEmployee{\n");
        System.out.println("EmployeeID: " + this.empID);
        System.out.println("Employee Name: " + this.empName);
        System.out.println("base Salary: " + this.totalSale);
        System.out.println("Total Sale: " + this.totalSale);
        System.out.println("Commission: " + computeSalary());
        System.out.println("}");
    }

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{\n" +
                "EmployeeID: " + empID +
                "\n, Employee Name: " + empName + '\'' +
                "\n, base Salary: " + totalSale +
                "\n, Total Sale: " + baseSalary +
                "\n, Commission: " + computeSalary() +
                '}';
    }
}
