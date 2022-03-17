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

    public static Number execute(HashMap<String, Variable> vars, Integer type, String a, String b) {
        if(vars.containsKey(a) && vars.containsKey(b)) {
            switch (type) {
                case sym.ADD: return addOp(vars.get(a.toString()), vars.get(b.toString()));
                default: return null;
            }
        }
        return 0;
    }
}
