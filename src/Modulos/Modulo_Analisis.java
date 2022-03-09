/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulos;

import Objetos.Elemento_Lista;
import e_regular.E_regular;
import e_regular.Expresiones;
import e_regular.Texto;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import ventanas.tabla_dinamica;

/**
 *
 * @author CYBERTRON
 */
public class Modulo_Analisis {
    public String texto;
    tabla_dinamica tabla1;
    Expresiones expresiones_regulares;
    Elemento_Lista elemento_lista;
    
    public Modulo_Analisis(){
    
    }
    public Modulo_Analisis(tabla_dinamica tabla1){
        this.tabla1=tabla1;
    
    
    }
    public static void ValidarExpresionpalabrasReservadas (String texto, Expresiones expresion) {
        int contador = E_regular.getCont();
        int codigo = 0;
        Pattern r = Pattern.compile(expresion.palabrasReservadas );
        Matcher m = r.matcher(texto);
        while (m.find()) {
             
            
             switch( m.group()){
                 case  "SELECT":
                     codigo=10;
                     break;
                 case  "FROM":
                     codigo=11;
                     break;
                 case  "WHERE":
                     codigo=12;
                     break;
                 case  "IN":
                     codigo=13;
                     break;
                 case  "AND":
                     codigo=14;
                     break;
                 case  "OR":
                     codigo=15;
                     break;
                 case  "CREATE":
                     codigo=16;
                     break;
                 case  "TABLE":
                     codigo=17;
                     break;
                 case  "CHAR":
                     codigo=18;
                     break;
                 case  "NUMERIC":
                     codigo=19;
                     break;
                 case  "NOT":
                     codigo=20;
                     break;
                 case  "NULL":
                     codigo=21;
                     break;
                case  "CONSTRAINT":
                     codigo=22;
                     break;
                 case  "KEY":
                     codigo=23;
                     break;
                 case  "PRIMARY":
                     codigo=24;
                     break;
                 case  "FOREING":
                     codigo=25;
                     break;
                 case  "REFERENCES":
                     codigo=26;
                     break;
                 case  "INSERT":
                     codigo=27;
                     break;
                 case  "INTO":
                     codigo=28;
                     break;
                 case  "VALUES":
                     codigo=29;
                     break;
             }
             
            System.out.println(contador + "  " + "  |" + m.start() + "        |" + m.group() + "      |"+codigo+"|" + " palabrasReservadas ");
            contador++;
            Elemento_Lista
            E_regular.setCont(contador);
        }

    }

    public static void ValidarExpresiondelimitadores(String texto, Expresiones expresion) {
        int contador = E_regular.getCont();
        int codigo=0;
        Pattern r = Pattern.compile(expresion.delimitadores);
        Matcher m = r.matcher(texto);
        while (m.find()) {

            
             switch( m.group()){
                 case  ",":
                     codigo=50;
                     break;
                 case  ".":
                     codigo=51;
                     break;
                 case  "(":
                     codigo=52;
                     break;
                 case  ")":
                     codigo=53;
                     break;
                 case  "´":
                     codigo=54;
                     break;
             }
            System.out.println(contador + "  " + "  |" + m.start() + "        |" + m.group() +codigo+ "      |" + " delimitadores");
            contador++;
            E_regular.setCont(contador);
            
        }

    }

    public static void ValidarExpresionoperadores(String texto, Expresiones expresion) {
        int contador = E_regular.getCont();
        int codigo=0;
        Pattern r = Pattern.compile(expresion.operadores);
        Matcher m = r.matcher(texto);
        while (m.find()) {
             switch( m.group()){
                 case  "+":
                     codigo=70;
                     break;
                 case  "-":
                     codigo=71;
                     break;
                 case  "*":
                     codigo=72;
                     break;
                 case  "/":
                     codigo=73;
                     break;
             }

            System.out.println(contador + "  " + "  |" + m.start() + "        |" + m.group()+"    "+codigo + "      |" + " operadores");
            contador++;
            E_regular.setCont(contador);
        }

    }

    public static void ValidarExpresionconstantes (String texto, Expresiones expresion) {
        int contador = E_regular.getCont();
        int codigo=0;
        Pattern r = Pattern.compile(expresion.constantes );
        Matcher m = r.matcher(texto);
        while (m.find()) {
               switch( m.group()){
                 case  "a":
                     codigo=61;
                     break;
                 case  "b":
                     codigo=62;
                     break;}
            System.out.println(contador + "  " + "  |" + m.start() + "        |" + m.group() +"     "+codigo+ "      |" + " constantes ");
            contador++;
            E_regular.setCont(contador);
        }

    }
    public static void Validarrelacionales(String texto, Expresiones expresion) {
        int contador = E_regular.getCont();
        int codigo=0;
        Pattern r = Pattern.compile(expresion.relacionales );
        Matcher m = r.matcher(texto);
        while (m.find()) {
               switch( m.group()){
                 case  ">":
                     codigo=81;
                     break;
                 case  "<":
                     codigo=82;
                     break;
                 case  "=":
                     codigo=83;
                     break;
                 case  ">=":
                     codigo=84;
                     break;
                 case  "<=":
                     codigo=85;
                     break;
               
               
               
               
               
               
               }
            System.out.println(contador + "  " + "  |" + m.start() + "        |" + m.group() +"     "+codigo+ "      |" + " relacionales ");
            contador++;
            E_regular.setCont(contador);
        }

    }
    
}
