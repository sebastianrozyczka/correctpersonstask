public class IncorrectAgeException extends RuntimeException {
    public IncorrectAgeException() {
        super("Niepoprawna wartość pola wiek ! Wartość powinna być dodatnia");
    }
}
