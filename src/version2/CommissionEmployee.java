package version2;

public class CommissionEmployee {
    private int empID;
    private String empName;
    private double totalSale;


    public CommissionEmployee() {

    }

    public CommissionEmployee(String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }

    public CommissionEmployee(int empID, String empName, double totalSale) {
        this.empID = empID;
        this.empName = empName;
        this.totalSale = totalSale;
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
    public double computeSalary() {
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
        return commission;
    }
    public void displayCommissionEmployee(){
        System.out.println("PieceWorkerEmployee{\n");
        System.out.println("EmployeeID: " + this.empID);
        System.out.println("Employee Name: " + this.empName);
        System.out.println("Total Sale: " + this.totalSale);
        System.out.println("Commission: " + computeSalary());
        System.out.println("}");
    }

    @Override
    public String toString() {
        return "CommissionEmployee{\n" +
                "EmployeeID: " + empID +
                "\n, Employee Name: " + empName + '\'' +
                "\n, Total Sale: " + totalSale +
                "\n, Commission: " + computeSalary() +
                '}';
    }
}

