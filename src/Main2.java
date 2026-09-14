import version2.BasePlusCommissionEmployee;
import version2.MyDate;
import version2.Name;

public class Main2 {

    public static void main(String[] args) {
        int bdayMonth = 3;

        Name n1 = new Name("Quitoras", "Jericho");
        MyDate d1 = new MyDate(bdayMonth, 2006, 9, 11);
        BasePlusCommissionEmployee he1 = new BasePlusCommissionEmployee(1, n1, d1, 1000, 200);

        Name n3 = new Name("Junnel", "Paulo", "Uy", "Jr.");
        MyDate d3 = new MyDate(bdayMonth, 2007, 3, 5);
        BasePlusCommissionEmployee he3 = new BasePlusCommissionEmployee(3, n3, d3, 1100, 200);

        System.out.println(he1);
        System.out.println(he3);

    }
}
