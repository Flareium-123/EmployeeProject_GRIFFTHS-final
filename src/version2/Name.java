package version2;

public class Name {
    private String firstName;
    private String midName;
    private String lastName;
    private String suffix;

    public Name() {
        this("N/A", "N/A", "N/A", "");
    }

    public Name(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.midName = "";
        this.suffix = "";
    }

    public Name(String firstName, String midName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.midName = midName == null ? "" : midName;
        this.suffix = "";
    }

    public Name(String firstName, String midName, String lastName, String suffix) {
        this.firstName = firstName;
        this.midName = midName == null ? "" : midName;
        this.lastName = lastName;
        this.suffix = suffix == null ? "" : suffix;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? "" : firstName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName == null ? "" : midName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? "" : lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix == null ? "" : suffix;
    }

    public void displayName() {
        String mid = midName.isEmpty() ? "" : " " + midName.charAt(0);
        String end = suffix.isEmpty() ? "" : " " + suffix;
        System.out.println(lastName + "," + firstName + mid + end);
    }

    @Override
    public String toString() {
        String mid = midName.isEmpty() ? "" : " " + midName.charAt(0);
        String end = suffix.isEmpty() ? "" : " " + suffix;
        return lastName +
                "," +
                firstName +
                mid +
                end;

    }
}
