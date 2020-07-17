package exeptions;

public class NoFoundExeption extends Exception {
    public NoFoundExeption(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " - на найдена";
    }
}