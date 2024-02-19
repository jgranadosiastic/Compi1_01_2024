/* codigo de usuario */
package com.jgranados.compi1_2024.lexico;
import java.io.StringReader;
%% //separador de area

/* opciones y declaraciones de jflex */

%class EjemploComplejo
%type Token //el valor retornado por cada lectura será del tipo Token
%line
%column
%public
%eofval{
	return Token.EOF;
%eofval}
LETRA = [a-zA-Z]
DIGITO = [0-9]
SEPARADORES = [ \n\r\t]

%{
     private String lexema;
    private String cadena;
    
    public String getLexema() {
        return lexema;
    }
    
    public EjemploComplejo() {
    }

    public void setCadena(String cadena) {
        this.zzReader = new StringReader(cadena);
    }
%}

%% // separador de areas

/* reglas lexicas */
{SEPARADORES} {/* ignoramos */}
{LETRA}({LETRA}|{DIGITO})* {lexema = yytext(); return Token.IDENTIFICADOR;}
{DIGITO}({DIGITO}*|({DIGITO}*[.]{DIGITO}*)) {lexema = yytext(); return Token.NUMERO;}
"=" {return Token.IGUAL;}
"+" {return Token.SUMA;}
"*" {return Token.MULTIPLICACION;}
"-" {return Token.RESTA;}
"/" {return Token.DIVISION;}
[^] {return Token.ERROR;}
