package errors;

public class NonExistentVariableException extends Exception {
    public NonExistentVariableException() {}

    public NonExistentVariableException(String msg) {
        super(msg);
    }
}
