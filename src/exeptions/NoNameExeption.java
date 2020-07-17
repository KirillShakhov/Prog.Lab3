package exeptions;

public class NoNameExeption extends RuntimeException {
    public NoNameExeption(String message) {
        super(message);
    }
}