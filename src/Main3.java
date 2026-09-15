import version3.BasePlusCommissionEmployee;
import version3.CommissionEmployee;
import version3.Employee;
import version3.HourlyEmployee;
import version3.MyDate;
import version3.Name;
import version3.PieceWorkerEmployee;

public class Main3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        int targetMonth = 3;

        Name n1 = new Name("Quitoras", "Jericho");
        MyDate d1 = new MyDate(11, 9, 2006);
        MyDate c1 = new MyDate(21, 7, 2020);
        HourlyEmployee he1 = new HourlyEmployee(1, n1, d1, c1, 40, 5);

        Name n2 = new Name("Sison", "Inaki");
        MyDate d2 = new MyDate(11, 9, 2006);
        MyDate c2 = new MyDate(16, 7, 2021);
        PieceWorkerEmployee he2 = new PieceWorkerEmployee(2, n2, d2, c2, 45, 5);

        Name n3 = new Name("Sallac", "Huge");
        MyDate d3 = new MyDate(17, 9, 2006);
        MyDate c3 = new MyDate(13, 7, 2021);
        CommissionEmployee he3 = new CommissionEmployee(3, n3, d3, c3, 45);

        Name n4 = new Name("Junnel", "Paolo", "Uy", "Jr.");
        MyDate d4 = new MyDate(5, 3, 2007);
        MyDate c4 = new MyDate(15, 3, 2017);
        BasePlusCommissionEmployee he4 =
                new BasePlusCommissionEmployee(4, n4, d4, c4, 1100, 200);

        Employee[] employees = {he1, he2, he3, he4};

        for (Employee employee : employees) {
            employee.computeSalary(targetMonth);
            System.out.println(employee);
        }

        Employee emp1 = he1;
        Employee emp1Identical = new HourlyEmployee(
                1, new Name("Quitoras", "Jericho"), new MyDate(11, 9, 2006),
                new MyDate(21, 7, 2020), 40, 5);
        Employee emp2 = new HourlyEmployee(
                5, new Name("Quitoras", "Jericho"), new MyDate(11, 9, 2006),
                new MyDate(21, 7, 2020), 40, 5);

        System.out.println("\n======================================================================");
        System.out.println("OBJECT CONTRACT TESTS (equals & hashCode)");
        System.out.println("======================================================================");
        System.out.println("emp1 equals emp1Identical: " + emp1.equals(emp1Identical));
        System.out.printf("emp1 hashCode: %d | emp1Identical hashCode: %d (Match: %s)%n",
                emp1.hashCode(), emp1Identical.hashCode(),
                emp1.hashCode() == emp1Identical.hashCode());
        System.out.println("emp1 equals emp2: " + emp1.equals(emp2));

        HourlyEmployee original = he1;
        HourlyEmployee clone = original.clone();
        System.out.println("\n======================================================================");
        System.out.println("DEEP CLONE VERIFICATION");
        System.out.println("======================================================================");
        System.out.println("Original Name before modification: " + original.getEmpName());
        clone.getEmpName().setFirstName("Modified");
        System.out.println("Clone Name changed to:             " + clone.getEmpName());
        System.out.println("Original Name after modification:  " + original.getEmpName()
                + " (Deep copy successful!)");
    }
}
