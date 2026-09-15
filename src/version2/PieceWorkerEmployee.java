package version2;

public class PieceWorkerEmployee {
    private int empID;
    private Name empName;
    private MyDate birthDate;
    private MyDate dateHired;
    private int totalPiecesFinished;
    private double ratePerPiece;

    public PieceWorkerEmployee() {

            this(0, new Name(),new MyDate(), new MyDate(), 0, 0);

    }

    public PieceWorkerEmployee(int empID, Name empName, MyDate birthDate, MyDate dateHired) {
        this.empID = empID;
        this.empName = empName;
        this.birthDate = birthDate;
        this.dateHired = dateHired;
    }

    public PieceWorkerEmployee(int empID, Name name, MyDate birthDate,MyDate dateHired,
                               int totalPiecesFinished, double ratePerPiece) {
        this.empID = empID;
        this.empName = name;
        this.dateHired = dateHired;
        this.birthDate = birthDate;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = dateHired;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(MyDate birthDate) {
        this.birthDate = birthDate;
    }

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public double computeSalary() {
        double basePay = totalPiecesFinished * ratePerPiece;
        int bonusGroups = totalPiecesFinished / 100;
        return basePay + (bonusGroups * 10 * ratePerPiece);
    }

    public void displayPieceWorkerEmployee() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "PieceWorkerEmployee{\n" +
                "Employee ID: " + empID +
                ", \nEmployee Name: " + empName +
                ", \nBirth Date: " + birthDate +
                ", \nDate Hired: " + dateHired +
                ", \nTotal Pieces Finished: " + totalPiecesFinished +
                ", \nRate Per Piece: " + ratePerPiece +
                ", \nSalary: " + computeSalary() +
                "\n}";
    }
}
