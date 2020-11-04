public class NameUndefinedException extends Exception{
    public NameUndefinedException(String firstName, String lastName) {
        super("Nieprawidłowa wartość pola nazwisko: " + firstName + " " + lastName);
    }
}
