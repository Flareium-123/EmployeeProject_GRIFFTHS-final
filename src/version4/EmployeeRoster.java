package version4;

public class EmployeeRoster {
    private Employee[] empList = new Employee[10];
    private int max;
    private int count;


    public EmployeeRoster() {
        this(10);

    }

    public EmployeeRoster(int max) {
        this.empList = new Employee[this.max];
        this.max = max;
        this.count = 0;

    }

   public boolean addEmployee(Employee emp) {
        if (count >= max || emp == null) {
        return false;
        }
        else{
            empList[count] = emp;
            count++;
            return true;
    }

    }
    public Employee removeEmployee(int empID){
        int ref = 0;
        for(int i = 0; i < max; i++){
            if(empList[i].getEmpID() == empID){
                Employee removeEmployee = empList[i];
                ref = empList[i].getEmpID();
                return removeEmployee(i);
            }


        }
        for(int i = 0; i < max; i++){
            Employee temp = empList[0];
            empList[i] = empList[i + 1];
            empList[max - 1] = temp;
        }
        empList[max - 1] = null;
        count--;
        return null;
    }
    public Employee searchEmployee(int empID){
            for(int i = 0; i < max; i++){
                if(empList[i].getEmpID() == empID){
                    return empList[i];
                }
            }
    return null;
    }


}
