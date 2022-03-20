package utils;

import errors.NonExistentVariableException;
import errors.RepeatedVariableException;
import lexer.sym;
import model.Variable;

import java.util.HashMap;
import java.util.Map;

public class Store {
    public static HashMap<String, Variable> addVar(String dataType, HashMap<String, Variable> vars, String identifier, String value) throws RepeatedVariableException {
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

    public static HashMap<String, Variable> updateValue(HashMap<String, Variable> vars, String identifier, String value) throws NonExistentVariableException {
        if(checkExistence(vars, identifier)) {
            Variable aux = vars.get(identifier);

            aux.setValue(parseValue(aux.getDataType(), value));
            if(aux.getValue() != null)
                aux.setClazz(aux.getValue().getClass());

            vars.put(identifier, aux);

            return vars;
        }else {
            throw new NonExistentVariableException("The variable does not exist!");
        }
    }

    public static Variable getVar(String identifier, HashMap<String, Variable> vars) throws NonExistentVariableException {
        if(checkExistence(vars, identifier)) {
            return vars.get(identifier);
        }else {
            throw new NonExistentVariableException("The variable does not exist!");
        }
    }

    public static boolean checkExistence(HashMap<String, Variable> variables, String identifier) {
        return variables.containsKey(identifier);
    }

    public static Object parseValue(String dataType, String value) {
        Object aux = value;
        if(value != null) {
            if(dataType.equalsIgnoreCase("ENTERO")) aux = Integer.parseInt(value);
            if(dataType.equalsIgnoreCase("FLOTANTE")) aux = Float.parseFloat(value);
            if(dataType.equalsIgnoreCase("CADENA")) aux = dataType;
        }
        return aux;
    }

    public static Object castValue(String dataType, Number value) {
        return switch (dataType) {
            case "ENTERO" -> value.intValue();
            case "FLOTANTE" -> value.floatValue();
            default -> value;
        };
    }

    public static boolean isNumberType(String type) {
        return type.equals("FLOTANTE") || type.equals("ENTERO");
    }

    public static void printVars(HashMap<String, Variable> vars) {
        for(Map.Entry<String, Variable> entry: vars.entrySet()) {
            System.out.println("key = "+ entry.getKey() + "; " + entry.getValue());
        }
    }
}
