public class Name {
    private String lastName;
    private String firstName;
    private String middleName;

    // Конструктор
    public Name (String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    // Конструктор, принимающий только имя
    public Name(String firstName) {
        this(null, firstName, null);
    }

    // Конструктор, принимающий имя и фамилию
    public Name(String lastName, String firstName) {
        this(lastName, firstName, null);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String toString() {
        if (lastName == null) {
            if (middleName == null) return firstName;
            return firstName + " " + middleName;
        }
        else if (middleName == null) return lastName + " " + firstName;
        return lastName + " " + firstName + " " + middleName;
    }
}
