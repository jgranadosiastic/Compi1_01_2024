/* codigo de usuario */

%% //separador de area

%class EjemploBasico
%standalone
%line
%column

%% // separador de areas

/* reglas lexicas */

(a|b)*abb   {System.out.printf("*** Encontrada ocurrencia [%s] en linea %d, columna %d ***\n", yytext(), yyline+1, yycolumn+1);}

\n  { /* Nada */}
[^]   { /* Nada o manejo de errores*/}
