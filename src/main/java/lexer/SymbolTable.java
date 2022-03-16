package lexer;

// import java.util.ArrayList;
// import java.util.List;

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
    // public static List<String> rulesDescription = new ArrayList<String>();
    // public static List<String> rules = new ArrayList<String>();
    // public static List<Integer> lines = new ArrayList<Integer>();
    // public static List<Integer> columns = new ArrayList<Integer>();

    // public static List<String> getRules_description() {
    // return rulesDescription;
    // }

    // public static void setRulesDescription(List<String> rules_description) {
    // SymbolTable.rulesDescription = rules_description;
    // }

    // public static List<String> getRules() {
    // return rules;
    // }

    // public static void setRules(List<String> rules) {
    // SymbolTable.rules = rules;
    // }

    // public static List<Integer> getLines() {
    // return lines;
    // }

    // public static void setLines(List<Integer> lines) {
    // SymbolTable.lines = lines;
    // }

    // public static List<Integer> getColumns() {
    // return columns;
    // }

    // public static void setColumns(List<Integer> columns) {
    // SymbolTable.columns = columns;
    // }

    // public static void addRulesDescription(String rule) {
    // SymbolTable.rules.add(rule);
    // }

    // public static void addRules(String rule) {
    // SymbolTable.rules.add(rule);
    // }

    // public static void addLines(Integer line) {
    // SymbolTable.lines.add(line);
    // }

    // public static void addColumns(Integer column) {
    // SymbolTable.columns.add(column);
    // }

}
