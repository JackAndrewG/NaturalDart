package utils;

import model.Statement;
import model.StatementType;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Loops {
    private List<Statement> functions;

    public Loops() {
        functions = new ArrayList<>();
    }

    public void pushInit(Statement stat) {
        functions.add(0, stat);
    }

    public void clear() {
        functions.clear();
    }

    public void execute() {
        for (Statement s : functions) {
            if(s.getType().equals(StatementType.PRINT)) {
                s.getPrint().run();
            }
        }
    }
}
