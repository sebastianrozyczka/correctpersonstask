public class IncorrectAgeException extends Exception {
    public IncorrectAgeException(double age) {
        super("Niepoprawna wartość pola wiek: " + age);
    }
}
