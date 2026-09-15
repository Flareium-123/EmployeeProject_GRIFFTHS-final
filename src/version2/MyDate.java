package version2;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
        this(1,1,2000);
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day < 1 || day > 31){
            this.month = -1;
        }
        else{this.day = day;}
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month < 1 || month > 12){
            this.month = -1;

        }
        else{this.month = month;}
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void displayDate(){
        System.out.println(this);
    }
    public boolean isMonth(int currentMonth) {
        return month == currentMonth;
    }

    @Override
    public String toString() {
        String[] months = {"Jan", "Feb", "Mar","Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};

        return "BirthDate{" +
                  day +  months[month-1] + year + "}";
    }


}
