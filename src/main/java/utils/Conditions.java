package utils;

import errors.ArithmeticDataTypeException;
import model.Variable;

public class Conditions {
    public static boolean compare(String comparator, Variable a, Number b, String dataType) throws ArithmeticDataTypeException {
        if(a.getDataType().equalsIgnoreCase(dataType)) {
            return evaluate(comparator, (Number) a.getValue(), b);
        } else {
            throw new ArithmeticDataTypeException("Los tipos de dato no coinciden.");
        }
    }

    public static boolean compare(String comparator, Number a, Variable b, String dataType) throws ArithmeticDataTypeException {
        if(b.getDataType().equalsIgnoreCase(dataType)) {
            return evaluate(comparator, a, (Number) b.getValue());
        } else {
            throw new ArithmeticDataTypeException("\"Los tipos de dato no coinciden.");
        }
    }

    public static boolean compare(String comparator, Variable a, Variable b) throws ArithmeticDataTypeException {
        if(a.getDataType().equalsIgnoreCase(b.getDataType())) {
            return evaluate(comparator, (Number) a.getValue(), (Number) b.getValue());
        } else {
            throw new ArithmeticDataTypeException("\"Los tipos de dato no coinciden.");
        }
    }

    private static boolean evaluate(String comparator, Number a, Number b) {
        return switch (comparator) {
            case "<"
                    -> a instanceof Integer ?
                        (Integer) a < (Integer) b :
                        (Float) a < (Float) b;
            case ">" -> a instanceof Integer ?
                        (Integer) a > (Integer) b :
                        (Float) a > (Float) b;
            case "<=" -> a instanceof Integer ?
                        (Integer) a <= (Integer) b :
                        (Float) a <= (Float) b;
            case ">=" -> a instanceof Integer ?
                        (Integer) a >= (Integer) b :
                        (Float) a >= (Float) b;
            case "<>" -> !a.equals(b) ;
            case "==" -> a.equals(b);
            default -> false;
        };
    }
}
