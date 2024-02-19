#! /bin/bash 
echo "STARTING JFLEX COMPILING"
java -jar ~/CUNOC/bin/jflex-full-1.9.1.jar -d ../../../../../java/com/jgranados/compi1_2024/flexycup/ ContadorOperacionesLexer.jflex

echo "STARTING CUP COMPILING"
java -jar ~/CUNOC/bin/java-cup-11b.jar -parser ContadorOperacionesParser ContadorOperacionesParser.cup
mv ContadorOperacionesParser.java ../../../../../java/com/jgranados/compi1_2024/flexycup/ContadorOperacionesParser.java
mv sym.java ../../../../../java/com/jgranados/compi1_2024/flexycup/sym.java