public class Person {
    private String firstName;
    private String lastName;
    private double age;
    private String pesel;

    public Person(String firstName, String lastName, double age, String pesel) throws NameUndefinedException, IncorrectAgeException {
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

    public void setFirstName(String firstName) throws NameUndefinedException {
        checkName(firstName, lastName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NameUndefinedException {
        checkName(firstName, lastName);
        this.lastName = lastName;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) throws IncorrectAgeException {
        checkAge(age);
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    private void checkName(String firstName, String lastName) throws NameUndefinedException {
        if(lastName == null || firstName == null || lastName.length() < 2 || firstName.length() < 2 ) {
            throw new NameUndefinedException(firstName, lastName);
        }
    }

    private void checkAge(double age) throws IncorrectAgeException {
        if(age < 1) {
            throw new IncorrectAgeException(age);
        }
    }
}
