package utils;

import lexer.sym;
import model.Variable;

import java.util.HashMap;

public class Operations {
    public static Number addOp(Variable a, Variable b) {
        if(a.getDataType().equalsIgnoreCase(b.getDataType())) {
            if(Store.isNumberType(a.getDataType())) {
                if(a.getValue() instanceof Float) return (Float) a.getValue() + (Double) b.getValue();
                if(a.getValue() instanceof Integer) return (Integer) a.getValue() + (Integer) b.getValue();
            }
        }

        return 0;
    }

    public static Number subsOp(Variable a, Variable b) {
        if(a.getDataType().equalsIgnoreCase(b.getDataType())) {
            if(Store.isNumberType(a.getDataType())) {
                if(a.getValue() instanceof Float) return (Float) a.getValue() - (Double) b.getValue();
                if(a.getValue() instanceof Integer) return (Integer) a.getValue() - (Integer) b.getValue();
            }
        }

        return 0;
    }

    public static Integer getOpType(String type) {
        return switch (type) {
            case "ADD" -> sym.ADD;
            case "SUBTRACT" -> sym.SUBTRACT;
            case "MULTIPLY" -> sym.MULTIPLY;
            case "DIVIDE" -> sym.DIVIDE;
            default -> 0;
        };
    }

    public static Number execute(HashMap<String, Variable> vars, Integer type, String a, String b) {
        if(vars.containsKey(a) && vars.containsKey(b)) {
            return switch (type) {
                case sym.ADD -> addOp(vars.get(a), vars.get(b));
                case sym.SUBTRACT -> subsOp(vars.get(a), vars.get(b));
                default -> null;
            };
        }
        return 0;
    }

    public static Number execute(HashMap<String, Variable> vars, Integer type, Number a, Number b, String variable) {
        String dataType = vars.get(variable).getDataType();
        return switch (type) {
            case sym.ADD -> dataType.equals("ENTERO") ? a.intValue() + b.intValue() : a.floatValue() + b.floatValue();
            case sym.SUBTRACT -> dataType.equals("ENTERO") ? a.intValue() - b.intValue() : a.floatValue() - b.floatValue();
            default -> null;
        };
    }
}
