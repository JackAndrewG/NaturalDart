package utils;

import errors.ArithmeticDataTypeException;
import errors.RepeatedVariableException;
import model.Variable;

import java.util.HashMap;

public class Store {
    public static HashMap addVar(String dataType, HashMap vars, String identifier, String value) throws ArithmeticDataTypeException, RepeatedVariableException {
        Variable variable = new Variable();
        variable.setName(identifier);
        variable.setDataType(dataType);
        variable.setValue(parseValue(dataType, value));

        if(variable.getValue() != null) variable.setClazz(variable.getValue().getClass());
        if(checkExistence(vars, identifier)) {
            throw new RepeatedVariableException("The variable has been declared previously!");
        }else{
            vars.put(identifier, variable);
        }

        return vars;
    }

    public static boolean checkExistence(HashMap variables, String identifier) {
        return variables.containsKey(identifier);
    }

    public static  Object parseValue(String dataType, String value) {
        Object aux = value;
        if(value != null) {
            if(dataType.equalsIgnoreCase("INTEGER")) aux = Integer.parseInt(value);
            if(dataType.equalsIgnoreCase("FLOAT")) aux = Float.parseFloat(value);
            if(dataType.equalsIgnoreCase("STRING")) aux = dataType;
        }
        return aux;
    }
}
