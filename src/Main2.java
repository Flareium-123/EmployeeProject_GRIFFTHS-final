import version2.BasePlusCommissionEmployee;
import version2.CommissionEmployee;
import version2.HourlyEmployee;
import version2.MyDate;
import version2.Name;
import version2.PieceWorkerEmployee;

public class Main2 {

    public static void main(String[] args) {
        int bdayMonth = 3;

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
        BasePlusCommissionEmployee he4 = new BasePlusCommissionEmployee(4, n4, d4, c4, 1100, 200);

        System.out.println(he1);
        System.out.println(he2);
        System.out.println(he3);
        System.out.println(he4);
    }
}
