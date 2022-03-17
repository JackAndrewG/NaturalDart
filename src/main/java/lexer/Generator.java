package lexer;

import java_cup.runtime.Symbol;
import jflex.Main;

import java.io.File;
import java.io.StringReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Generator {
    private static final URL LEX = Generator.class.getResource("../Lexer.flex");
    private static final URL SYN = Generator.class.getResource("../Syntax.cup");

    public static void main(String[] args) {
//        generateFiles();
        testLexer();
    }

    private static void generateFiles() {
        try {
            String[] files = { LEX.getPath() };
            String[] files$ = { "-parser", "Syntax", SYN.getPath() };

            Main.generate(files);
            java_cup.Main.main(files$);

            Path sym = Paths.get(System.getProperty("user.dir") + File.separatorChar + "src" + File.separatorChar
                    + "main" + File.separatorChar + "java" + File.separatorChar + "lexer" + File.separatorChar
                    + "sym.java");
            Path syn = Paths.get(System.getProperty("user.dir") + File.separatorChar + "src" + File.separatorChar
                    + "main" + File.separatorChar + "java" + File.separatorChar + "lexer" + File.separatorChar
                    + "Syntax.java");
            Path lex = Paths.get(System.getProperty("user.dir") + File.separatorChar + "src" + File.separatorChar
                    + "main" + File.separatorChar + "java" + File.separatorChar + "lexer" + File.separatorChar
                    + "LexerCup.java");

            deletePath(sym);
            deletePath(syn);
            deletePath(lex);

            Files.move(Paths.get(System.getProperty("user.dir") + File.separatorChar + "sym.java"), sym);
            Files.move(Paths.get(System.getProperty("user.dir") + File.separatorChar + "Syntax.java"), syn);
            Files.move(Paths.get(System.getProperty("user.dir") + File.separatorChar + "target" + File.separatorChar
                    + "classes" + File.separatorChar + "LexerCup.java"), lex);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void deletePath(Path path) {
        try {
            if (Files.exists(path)) {
                Files.delete(path);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     private static void testLexer() {
         String text = """
             VACIO main() {
                 ENTERO b;
                 FLOTANTE c = 5.2;
                 ENTERO a = 4;
                 FLOTANTE a = 5.2;
             }
         """;
         Syntax s = new Syntax(new LexerCup(new StringReader(text)));

         try {
            s.parse();
         } catch (Exception e) {
             Symbol sym = s.getS();
             System.out.println("Error de Sintaxis. Línea " + (sym.right + 1) + " columna " + (sym.left + 1) + " Texto " + sym.value);
         }
     }

}
