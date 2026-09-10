import version1.HourlyEmployee;
import version1.PieceWorkerEmployee;
import version1.CommissionEmployee;
import version1.BasePlusCommissionEmployee;

public class Main {
    public static void main(String[] args) {
        HourlyEmployee he1 = new HourlyEmployee(4, "Bob", 40, 5);
        PieceWorkerEmployee he2 = new PieceWorkerEmployee(4, "Jer", 45, 5);
        CommissionEmployee he3 = new CommissionEmployee(4, "Jer", 45);
        BasePlusCommissionEmployee he4 = new BasePlusCommissionEmployee(10, "Junnel", 200, 100);

        System.out.println(he1);
        System.out.println(he2);
        System.out.println(he3);
        System.out.println(he4);

    }
}