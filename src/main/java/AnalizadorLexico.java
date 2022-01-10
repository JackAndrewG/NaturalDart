import java.io.File;
import java.io.FileReader;

import jflex.Main;
import model.Tokens;

public class AnalizadorLexico {
    public static void main(String[] args) throws Exception {
        // fileGenerator();
        try {
            // Lexer lexer = new Lexer(new FileReader(ruta + "code.jg"));
            Lexer lexer = new Lexer(new FileReader(ruta + "code.jg"));
            String result = "";
            while (true) {
                Tokens token = lexer.yylex();
                if (token == null) {
                    result += "Fin";
                    break;
                }
                switch (token) {
                    case ERROR:
                        result += lexer.lexema + " Es un simbolo desconocido";
                        break;
                    case ADD:
                        result += lexer.lexema + " Es una suma";
                        break;
                    case SUBSTRACT:
                        result += lexer.lexema + " Es una resta";
                        break;
                    case MULTIPLY:
                        result += lexer.lexema + " Es una multiplicación";
                        break;
                    case INCREMENT:
                        result += lexer.lexema + " Es un incremento";
                        break;
                    case NUMBER:
                        result += lexer.lexema + " Es un número";
                        break;
                    case DIV:
                        result += lexer.lexema + " Es una división";
                        break;
                    case ASSIGNAMENT:
                        result += lexer.lexema + " Es una asignación";
                        break;
                    case RESERVED_WORD:
                        result += lexer.lexema + " Es una palabra reservada";
                        break;
                    case IDENTIFIER:
                        result += lexer.lexema + " Es un identificador";
                        break;

                    default:
                        break;
                }
                System.out.println(result);
                result = "";
            }
        } catch (Exception e) {
            System.out.println("Exception" + e);
        }
    }

    private static String ruta = "datos" + File.separatorChar;

    public static void fileGenerator() {
        try {
            String[] archivos = { (ruta + "Lexer.flex") };
            Main.generate(archivos);
        } catch (Exception e) {
            System.out.println("Exception" + e);
        }
    }
}
