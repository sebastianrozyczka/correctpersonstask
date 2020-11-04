public class Person {
    private String firstName;
    private String lastName;
    private double age;
    private String pesel;

    public Person(String firstName, String lastName, double age, String pesel) {
        checkName(firstName, lastName);
        checkAge(age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        checkName(firstName, lastName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        checkName(firstName, lastName);
        this.lastName = lastName;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        checkAge(age);
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    private void checkName(String firstName, String lastName) {
        if(lastName == null || firstName == null || lastName.length() < 2 || firstName.length() < 2 ) {
            throw new NameUndefinedException();
        }
    }

    private void checkAge(double age) {
        if(age < 1) {
            throw new IncorrectAgeException();
        }
    }
}
