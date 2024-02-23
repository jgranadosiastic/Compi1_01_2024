/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jgranados.compi1_2024.flexycup;

import java.io.StringReader;

/**
 *
 * @author jose
 */
public class Main {
    public static void main(String[] args) {
        String contenido = "26*1;9*87;1/1;";
        StringReader reader = new StringReader(contenido);
        ContadorOperacionesLexer lexer = new ContadorOperacionesLexer(reader);
        ContadorOperacionesParser parser = new ContadorOperacionesParser(lexer);
        
        try {
            parser.parse();
        } catch (Exception e) {
            System.out.println("manejo de exception");
        }
        
    }
}
