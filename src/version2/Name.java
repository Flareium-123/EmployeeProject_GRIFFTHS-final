package version2;

public class Name {
    private String firstName;
    private  String midName;
    private  String lastName;
    private  String suffix;

    public Name() {
    }

    public Name(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Name(String firstName, String midName, String lastName, String suffix) {
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
        this.suffix = suffix;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void displayName(){
        System.out.println("Employee Name: " + lastName + "," + firstName + midName + suffix);
    }
}


