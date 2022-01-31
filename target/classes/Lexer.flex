package lexer;
import java_cup.runtime.Symbol;
%%
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
(ENTERO)      { return new Symbol(sym.INTEGER,    (int) yychar, yyline, yytext()); } /* 1.  Tipo de Dato Entero */
(FLOTANTE)    { return new Symbol(sym.FLOAT,      (int) yychar, yyline, yytext()); } /* 2.  Tipo de Dato Flotante */
(CADENA)      { return new Symbol(sym.STRING,     (int) yychar, yyline, yytext()); } /* 3.  Tipo de Dato Cadena de Texto */
(VACIO)       { return new Symbol(sym.VOID,       (int) yychar, yyline, yytext()); } /* 4.  Tipo de Dato NO Retorno */
(VERDADERO)   { return new Symbol(sym.TRUE,       (int) yychar, yyline, yytext()); } /* 4.  Tipo de Dato NO Retorno */
(FALSO)       { return new Symbol(sym.FALSE,       (int) yychar, yyline, yytext()); } /* 4.  Tipo de Dato NO Retorno */

/* ********************     BLOQUES     ******************** */
(SALIDA)      { return new Symbol(sym.PRINT,      (int) yychar, yyline, yytext()); } /* 5.  Salida de datos */
(SI)          { return new Symbol(sym.IFC,        (int) yychar, yyline, yytext()); } /* 6.  Bloque condicional */
(SINO)        { return new Symbol(sym.ELSEC,      (int) yychar, yyline, yytext()); } /* 7.  Bloque condicional (caso contrario) */
(MIENTRAS)        { return new Symbol(sym.WHILE,      (int) yychar, yyline, yytext()); } /* 7.  Bloque Mientras */
(DEVOLVER)     { return new Symbol(sym.RETURNC,    (int) yychar, yyline, yytext()); } /* 8.  Retorno */

/* ********************   OPERACIONES   ******************** */
("=")         { return new Symbol(sym.ASSIGN,     (int) yychar, yyline, yytext()); } /* 9.  Asignacion */
("+")         { return new Symbol(sym.ADD,        (int) yychar, yyline, yytext()); } /* 10. Suma */
("-")         { return new Symbol(sym.SUBTRACT,   (int) yychar, yyline, yytext()); } /* 11. Resta */
("*")         { return new Symbol(sym.MULTIPLY,   (int) yychar, yyline, yytext()); } /* 12. Multiplicacion */
("/")         { return new Symbol(sym.DIVIDE,     (int) yychar, yyline, yytext()); } /* 13. Division */

/* ********************    AGRUPACION   ******************** */
("\"")        { return new Symbol(sym.QUOTES,     (int) yychar, yyline, yytext()); } /* 14. Comillas */
("(")         { return new Symbol(sym.POPEN,      (int) yychar, yyline, yytext()); } /* 15. Parentesis de Apertura */
(")")         { return new Symbol(sym.PCLOSE,     (int) yychar, yyline, yytext()); } /* 16. Parentesis de Cierre */
("{")         { return new Symbol(sym.WOPEN,      (int) yychar, yyline, yytext()); } /* 17. Llave de Apertura */
("}")         { return new Symbol(sym.WCLOSE,     (int) yychar, yyline, yytext()); } /* 18. Llave de Cierre */
(";")         { return new Symbol(sym.EOL,        (int) yychar, yyline, yytext()); } /* 19. Fin de linea */

/* ********************  COMPARADORES   ******************** */
{C}           { return new Symbol(sym.COMPARATOR, (int) yychar, yyline, yytext()); } /* 20. Mayor (o igual), menor (o igual) */
("<>")        { return new Symbol(sym.COMPARATOR, (int) yychar, yyline, yytext()); } /* 21. Diferencia */
("==")        { return new Symbol(sym.COMPARATOR, (int) yychar, yyline, yytext()); } /* 22. Igualdad */

 /* ********************     DATOS      ******************** */
{D}           { return new Symbol(sym.NUMBER,     (int) yychar, yyline, yytext()); } /* 23. Numeros Enteros */
{F}           { return new Symbol(sym.NFLOAT,     (int) yychar, yyline, yytext()); } /* 24. Numeros Decimales */

/* ******************** IDENTIFICADORES ******************** */
{L}({L}|{D})* { return new Symbol(sym.IDENTIFIER, (int) yychar, yyline, yytext()); } /* 25. Variables */

/* ********************      ERROR      ******************** */
.             { return new Symbol(sym.ERROR,      (int) yychar, yyline, yytext()); } /* 27. Error */