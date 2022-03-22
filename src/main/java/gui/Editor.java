package gui;

import lexer.Syntax;
import lexer.LexerCup;
import java_cup.runtime.Symbol;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import static javax.swing.JOptionPane.showMessageDialog;

public class Editor extends JFrame implements ActionListener, Cloneable {
    public static Editor instance;

    private static JTextArea area;
    private static JFrame frame;
    private static int returnValue = 0;
    private JTextArea logs;

    public Editor() {
        instance = this;
        run();
    }

    public void run() {
        frame = new JFrame("Compilador");

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Editor.class.getName()).log(Level.SEVERE, null, ex);
        }

        area = new JTextArea();
        area.setText("""
                VACIO PRINCIPAL() {
                     ENTERO a;
                     FLOTANTE b;
    
                     ENTERO c = 10 + 1;
                     ENTERO d = 150;
                     FLOTANTE e = 21.0 / 3.1;
                     a = 10 + 5;
    
                     SI(a < 10){
                         SALIDA("RESPUESTA DE LA SUMA ");
                         SALIDA(a);
                     } SINO {
                        SALIDA(d);
                     }
    
                     SALIDA(e);
                }
                """);
        logs = new JTextArea(5,20);
        logs.setEditable(false);
        logs.setBackground(Color.DARK_GRAY);
        logs.setForeground(Color.GREEN);
        logs.setMargin(new Insets(10, 10, 10, 10));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 550);

        JMenuBar menu_main = new JMenuBar();

        JMenu menu_file = new JMenu("Archivo");
        JMenu menu_com = new JMenu("Compilación");

        JMenuItem menuitem_new = new JMenuItem("Nuevo");
        JMenuItem menuitem_open = new JMenuItem("Abrir");
        JMenuItem menuitem_save = new JMenuItem("Guardar");
        JMenuItem menuitem_quit = new JMenuItem("Salir");

        JMenuItem menuitem_compile = new JMenuItem("Comprobar sintaxis");

        menuitem_new.addActionListener(this);
        menuitem_open.addActionListener(this);
        menuitem_save.addActionListener(this);
        menuitem_quit.addActionListener(this);
        menuitem_compile.addActionListener(this);

        menu_main.add(menu_file);
        menu_main.add(menu_com);

        menu_com.add(menuitem_compile);

        menu_file.add(menuitem_new);
        menu_file.add(menuitem_open);
        menu_file.add(menuitem_save);
        menu_file.add(menuitem_quit);

        JScrollPane scrollA = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JScrollPane scrollB = new JScrollPane(logs, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        frame.setJMenuBar(menu_main);
        frame.getContentPane().add(BorderLayout.CENTER, scrollA);
        frame.getContentPane().add(BorderLayout.SOUTH, scrollB);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String ingest = null;
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setDialogTitle("Choose destination.");
        jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        String ae = e.getActionCommand();
        logs.setText(null);
        switch (ae) {
            case "Abrir" -> {
                returnValue = jfc.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File f = new File(jfc.getSelectedFile().getAbsolutePath());
                    try {
                        FileReader read = new FileReader(f);
                        Scanner scan = new Scanner(read);
                        while (scan.hasNextLine()) {
                            String line = scan.nextLine() + "\n";
                            ingest = ingest + line;
                        }
                        area.setText(ingest);
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    }
                }
            }
            case "Guardar" -> {
                returnValue = jfc.showSaveDialog(null);
                try {
                    File f = new File(jfc.getSelectedFile().getAbsolutePath());
                    FileWriter out = new FileWriter(f);
                    out.write(area.getText());
                    out.close();
                } catch (FileNotFoundException ex) {
                    Component f = null;
                    // JOptionPane.showMessageDialog(f, "File not found.");
                    addLog("Archivo no encontrado.");
                } catch (IOException ex) {
                    Component f = null;
                    addLog("Error al abrir el archivo.");
                }
            }
            case "Nuevo" -> area.setText("");
            case "Comprobar sintaxis" -> {
                Syntax s = new Syntax(new LexerCup(new StringReader(area.getText())));
                try {
                    s.parse();
                    showMessageDialog(null, "Sintaxis correcta.");
                } catch (Exception ex) {
                    Symbol sym = s.getS();
                    addLog("¡Sintaxis incorrecta! \n" + "     Error de Sintaxis. Línea " + (sym.right + 1)
                            + " columna " + sym.left + " Texto " + sym.value);

                }
            }
            case "Salir" -> System.exit(0);
        }
    }

    public void addLog(String log) {
        logs.append(">>  "+ log + '\n');
    }
}
