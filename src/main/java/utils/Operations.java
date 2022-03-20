package utils;

import errors.ArithmeticDataTypeException;
import lexer.sym;
import model.Variable;

import java.util.HashMap;

public class Operations {
    public static Number addOp(Variable a, Variable b) throws ArithmeticDataTypeException {
        if(a.getDataType().equalsIgnoreCase(b.getDataType())) {
            if(Store.isNumberType(a.getDataType())) {
                if(a.getValue() instanceof Float) return (Float) a.getValue() + (Float) b.getValue();
                if(a.getValue() instanceof Integer) return (Integer) a.getValue() + (Integer) b.getValue();
            } else {
                throw new ArithmeticDataTypeException("Illegal data type for arithmetic operations!");
            }
        }else {
            throw new ArithmeticDataTypeException("Data types do not match");
        }

        return 0;
    }

    public static Number subsOp(Variable a, Variable b) throws ArithmeticDataTypeException {
        if(a.getDataType().equalsIgnoreCase(b.getDataType())) {
            if(Store.isNumberType(a.getDataType())) {
                if(a.getValue() instanceof Float) return (Float) a.getValue() - (Float) b.getValue();
                if(a.getValue() instanceof Integer) return (Integer) a.getValue() - (Integer) b.getValue();
            } else {
                throw new ArithmeticDataTypeException("Illegal data type for arithmetic operations!");
            }
        }else {
            throw new ArithmeticDataTypeException("Data types do not match");
        }

        return 0;
    }

    public static Number mulOp(Variable a, Variable b) throws ArithmeticDataTypeException {
        if(a.getDataType().equalsIgnoreCase(b.getDataType())) {
            if(Store.isNumberType(a.getDataType())) {
                if(a.getValue() instanceof Float) return (Float) a.getValue() * (Float) b.getValue();
                if(a.getValue() instanceof Integer) return (Integer) a.getValue() * (Integer) b.getValue();
            } else {
                throw new ArithmeticDataTypeException("Illegal data type for arithmetic operations!");
            }
        }else {
            throw new ArithmeticDataTypeException("Data types do not match");
        }

        return 0;
    }

    public static Number divOp(Variable a, Variable b) throws ArithmeticDataTypeException {
        if(a.getDataType().equalsIgnoreCase(b.getDataType())) {
            if(Store.isNumberType(a.getDataType())) {
                if(a.getValue() instanceof Float) return (Float) a.getValue() / (Float) b.getValue();
                if(a.getValue() instanceof Integer) return (Integer) a.getValue() / (Integer) b.getValue();
            } else {
                throw new ArithmeticDataTypeException("Illegal data type for arithmetic operations!");
            }
        }else {
            throw new ArithmeticDataTypeException("Data types do not match");
        }

        return 0;
    }

    public static Integer getOpType(String type) {
        return switch (type) {
            case "+" -> sym.ADD;
            case "-" -> sym.SUBTRACT;
            case "*" -> sym.MULTIPLY;
            case "/" -> sym.DIVIDE;
            default -> 0;
        };
    }

    public static Number execute(HashMap<String, Variable> vars, String op, String a, String b) throws ArithmeticDataTypeException {
        Integer type = Operations.getOpType(op);
        if(vars.containsKey(a) && vars.containsKey(b)) {
            return switch (type) {
                case sym.ADD -> addOp(vars.get(a), vars.get(b));
                case sym.SUBTRACT -> subsOp(vars.get(a), vars.get(b));
                case sym.MULTIPLY -> mulOp(vars.get(a), vars.get(b));
                case sym.DIVIDE -> divOp(vars.get(a), vars.get(b));
                default -> null;
            };
        }
        return 0;
    }

    public static Number execute(String op, Number a, Number b, String dataType) {
        Integer type = Operations.getOpType(op);
        return switch (type) {
            case sym.ADD -> dataType.equals("ENTERO") ? a.intValue() + b.intValue() : a.floatValue() + b.floatValue();
            case sym.SUBTRACT -> dataType.equals("ENTERO") ? a.intValue() - b.intValue() : a.floatValue() - b.floatValue();
            case sym.MULTIPLY -> dataType.equals("ENTERO") ? a.intValue() * b.intValue() : a.floatValue() * b.floatValue();
            case sym.DIVIDE -> dataType.equals("ENTERO") ? a.intValue() / b.intValue() : a.floatValue() / b.floatValue();
            default -> null;
        };
    }
}
