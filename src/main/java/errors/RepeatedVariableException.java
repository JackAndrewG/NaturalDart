package errors;

public class RepeatedVariableException extends Exception {
    public RepeatedVariableException() {}

    public RepeatedVariableException(String msg){
        super(msg);
    }
}
