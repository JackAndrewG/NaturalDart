package compilador;
import compilador.model.Tokens;
%%
%class Lexer
%type Tokens
palabra_reservada=[ENTERO]
identificador=[a-z0-9_]+
numero=[0-9]
salto_linea=[;,\n]+
espacio=[ ,\t,\r]+
%{
    public String lexema;
%}
%%
{salto_linea} {/*Ignore*/}
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"+" {lexema=yytext(); return Tokens.ADD;}
"-" {lexema=yytext(); return Tokens.SUBSTRACT;}
"*" {lexema=yytext(); return Tokens.MULTIPLY;}
"/" {lexema=yytext(); return Tokens.DIV;}
"++" {lexema=yytext(); return Tokens.INCREMENT;}
"=" {lexema=yytext(); return Tokens.ASSIGNAMENT;}
{numero}+ {lexema=yytext(); return Tokens.NUMBER;}
{palabra_reservada}+ {lexema=yytext(); return Tokens.RESERVED_WORD;}
{identificador}+ {lexema=yytext(); return Tokens.IDENTIFIER;}
. {lexema=yytext(); return Tokens.ERROR;}