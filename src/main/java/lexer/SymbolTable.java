package lexer;

public class SymbolTable {
    public String rule;
    public String identifier;
    public Integer line;
    public Integer column;

    public SymbolTable(
            String type,
            String identifier,
            Integer line,
            Integer column) {
        this.rule = type;
        this.identifier = identifier;
        this.line = line;
        this.column = column;
    }

    public static void printTable(SymbolTable symbolTable) {
        System.out.println(
                "Regla: " + symbolTable.rule +
                        "\tIdentificador: " + symbolTable.identifier +
                        "\tLínea: " + symbolTable.line.toString() +
                        "\tColumna: " + symbolTable.column.toString());
    }
}
