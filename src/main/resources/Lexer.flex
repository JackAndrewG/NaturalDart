package lexer;
import java_cup.runtime.Symbol;
%%
%public
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[A-z]+
D=[+|-]?[0-9]+
F=[+|-]?[0-9]+([.][0-9]+)+
C=[<>]+(=)?
space=[ ,\t,\r,\n]+
T=[!\"#\$%&\'\*\+\,\-\.\/:<=>\?@\[\]\\\^_\`{}]+

%{
    private Symbol symbol (int type, Object value) {
        return new Symbol (type,yyline,yycolumn,value);
    }
    private Symbol symbol (int type) {
        return new Symbol (type,yyline,yycolumn);
    }
%}

%%
{space}       { /*Ignore*/ } /* Espacios en blanco */
("//"(.)*)    { /*Ignore*/ } /* Comentarios */

/* ********************  TIPOS DE DATOS ******************** */
(ENTERO)
{ 
    SymbolTable symTable = new SymbolTable( "INTEGER", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.INTEGER, (int) yychar, yyline, yytext());
} /* 1.  Tipo de Dato Entero */
(FLOTANTE)    { 
    SymbolTable symTable = new SymbolTable( "FLOAT", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.FLOAT,      (int) yychar, yyline, yytext()); 
    } /* 2.  Tipo de Dato Flotante */
(CADENA)      { 
    SymbolTable symTable = new SymbolTable( "STRING", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.STRING,     (int) yychar, yyline, yytext()); } /* 3.  Tipo de Dato Cadena de Texto */
(VACIO)       { 
    SymbolTable symTable = new SymbolTable( "VOID", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.VOID,       (int) yychar, yyline, yytext()); } /* 4.  Tipo de Dato NO Retorno */
(VERDADERO)   { 
    SymbolTable symTable = new SymbolTable( "TRUE", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.TRUE,       (int) yychar, yyline, yytext()); } /* 4.  Tipo de Dato NO Retorno */
(FALSO)       { 
    SymbolTable symTable = new SymbolTable( "FALSE", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.FALSE,       (int) yychar, yyline, yytext()); } /* 4.  Tipo de Dato NO Retorno */

/* ********************     BLOQUES     ******************** */
(SALIDA)      { 
    SymbolTable symTable = new SymbolTable( "PRINT", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.PRINT,      (int) yychar, yyline, yytext()); } /* 5.  Salida de datos */
(SI)          { 
    SymbolTable symTable = new SymbolTable( "IFC", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.IFC,        (int) yychar, yyline, yytext()); } /* 6.  Bloque condicional */
(SINO)        { 
    SymbolTable symTable = new SymbolTable( "ELSEC", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.ELSEC,      (int) yychar, yyline, yytext()); } /* 7.  Bloque condicional (caso contrario) */
(MIENTRAS)        { 
    SymbolTable symTable = new SymbolTable( "WHILE", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.WHILE,  (int) yychar, yyline, yytext()); } /* 7.  Bloque Mientras */
(DEVOLVER)     { 
    SymbolTable symTable = new SymbolTable( "RETURNC", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.RETURNC,    (int) yychar, yyline, yytext()); } /* 8.  Retorno */

/* ********************   OPERACIONES   ******************** */
("=")         { 
    SymbolTable symTable = new SymbolTable( "ASSIGN", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.ASSIGN,     (int) yychar, yyline, yytext()); } /* 9.  Asignacion */
("+")         { 
    SymbolTable symTable = new SymbolTable( "ADD", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.ADD,        (int) yychar, yyline, yytext()); } /* 10. Suma */
("-")         { 
    SymbolTable symTable = new SymbolTable( "SUBTRACT", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.SUBTRACT,   (int) yychar, yyline, yytext()); } /* 11. Resta */
("*")         { 
    SymbolTable symTable = new SymbolTable( "MULTIPLY", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.MULTIPLY,   (int) yychar, yyline, yytext()); } /* 12. Multiplicacion */
("/")         { 
    SymbolTable symTable = new SymbolTable( "DIVIDE", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.DIVIDE,     (int) yychar, yyline, yytext()); } /* 13. Division */

/* ********************    AGRUPACION   ******************** */
("\"")        { 
    SymbolTable symTable = new SymbolTable( "QUOTES", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.QUOTES,     (int) yychar, yyline, yytext()); } /* 14. Comillas */
("(")         { 
    SymbolTable symTable = new SymbolTable( "POPEN", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.POPEN,      (int) yychar, yyline, yytext()); } /* 15. Parentesis de Apertura */
(")")         { 
    SymbolTable symTable = new SymbolTable( "PCLOSE", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.PCLOSE,     (int) yychar, yyline, yytext()); } /* 16. Parentesis de Cierre */
("{")         { 
    SymbolTable symTable = new SymbolTable( "WOPEN", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.WOPEN,      (int) yychar, yyline, yytext()); } /* 17. Llave de Apertura */
("}")         { 
    SymbolTable symTable = new SymbolTable( "WCLOSE", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.WCLOSE,     (int) yychar, yyline, yytext()); } /* 18. Llave de Cierre */
(";")         { 
    SymbolTable symTable = new SymbolTable( "EOL", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.EOL,        (int) yychar, yyline, yytext()); } /* 19. Fin de linea */

/* ********************  COMPARADORES   ******************** */
{C}           { 
    SymbolTable symTable = new SymbolTable( "COMPARATOR", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.COMPARATOR, (int) yychar, yyline, yytext()); } /* 20. Mayor (o igual), menor (o igual) */
("<>")        { 
    SymbolTable symTable = new SymbolTable( "COMPARATOR", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.COMPARATOR, (int) yychar, yyline, yytext()); } /* 21. Diferencia */
("==")        { 
    SymbolTable symTable = new SymbolTable( "COMPARATOR", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.COMPARATOR, (int) yychar, yyline, yytext()); } /* 22. Igualdad */

 /* ********************     DATOS      ******************** */
{D}           { 
    SymbolTable symTable = new SymbolTable( "NUMBER", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.NUMBER,     (int) yychar, yyline, yytext()); } /* 23. Numeros Enteros */
{F}           { 
    SymbolTable symTable = new SymbolTable( "NFLOAT", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.NFLOAT,     (int) yychar, yyline, yytext()); } /* 24. Numeros Decimales */

/* ******************** IDENTIFICADORES ******************** */
{L}({L}|{D})* { 
    SymbolTable symTable = new SymbolTable( "IDENTIFIER", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.IDENTIFIER, (int) yychar, yyline, yytext()); } /* 25. Variables */

{D}({L}|{D})* {
    SymbolTable symTable = new SymbolTable( "TEXT", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable);
    return new Symbol(sym.TEXT, (int) yychar, yyline, yytext()); } /* 25. Variables */
{T} {
       SymbolTable symTable = new SymbolTable( "TEXT", yytext(), yyline+1, yycolumn+1);
       SymbolTable.printTable(symTable);
       return new Symbol(sym.TEXT, (int) yychar, yyline, yytext()); } /* 25. Variables */
/* ********************      ERROR      ******************** */
.             { 
    SymbolTable symTable = new SymbolTable( "ERROR", yytext(), yyline+1, yycolumn+1);
    SymbolTable.printTable(symTable); 
    return new Symbol(sym.ERROR,      (int) yychar, yyline, yytext()); } /* 27. Error */