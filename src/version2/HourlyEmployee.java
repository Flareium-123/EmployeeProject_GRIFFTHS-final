package version2;

public class HourlyEmployee {
    private int empID;
    private String empName;
    private float totalHoursWorked;
    private double ratePerHour;

    public HourlyEmployee() {
        this(0,"N/A");
    }

    public HourlyEmployee(int empID, String empName) {
        this(empID, empName, 0, 0);
    }

    public HourlyEmployee(int empID, String empName, float totalHoursWorked, double ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
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

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    public double computeSalary(){
        double salary;

        if(totalHoursWorked <= 40){
            salary = totalHoursWorked * ratePerHour;
        }else
            salary = (40 * ratePerHour) + ((totalHoursWorked - 40) * (ratePerHour*1.5));

        return salary;
    }
    public void displayHourlyEmployee(){
        System.out.println("HourlyEmployee{\n");
        System.out.println("\nEmployee ID: "+ this.empID);
        System.out.println("\nEmployee Name: "+ this.empName);
        System.out.println("\nEmployee Total Hours Worked: "+ this.totalHoursWorked);
        System.out.println("\nratePerHour: "+ this.ratePerHour);
        System.out.println("}");
    }

    @Override
    public String toString() {
        return "HourlyEmployee{\n" +
                "Employee ID: " + empID +
                ", \nEmployee Name: " + empName + '\'' +
                ", \nEmployee Total Hours Worked: " + totalHoursWorked +
                ", \nRatePerHour: " + ratePerHour +
                ", \nSalary: " + computeSalary() +
                '}';
    }
}