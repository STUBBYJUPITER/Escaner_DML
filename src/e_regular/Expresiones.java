/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_regular;

/**
 *
 * @author CYBERTRON
 */
public class Expresiones {
    
    
    public String palabrasReservadas = "SELECT|FROM|WHERE|IN|AND|OR|CREATE|TABLE|CHAR|NUMERIC|NOT|NULL|CONSTRAINT|KEY|PRIMARY|FOREING|REFERENCES|INSERT|INTO|VALUES";
    public String delimitadores= "[\\,\\.\\(\\)\\´]";
    public String operadores = "[\\+\\-\\*\\/]";
    public String constantes = "[ab]";
    public String relacionales = "[\\>\\<\\=\\>=\\<=]";
    public String identificadores = "ñ";
    public Expresiones() {

    }

    public String getpalabrasReservadas() {
        return palabrasReservadas ;
    }

    public void setpalabrasReservadas(String palabrasReservadas) {
        this.palabrasReservadas  = palabrasReservadas;
    }

    public String getdelimitadores() {
        return delimitadores;
    }

    public void setdelimitadores(String delimitadores) {
        this.delimitadores = delimitadores;
    }

    public String getoperadores() {
        return operadores;
    }

    public void setoperadores(String operadores) {
        this.operadores = operadores;
    }

    public String getconstantes () {
        return constantes ;
    }

    public void setconstantes (String constantes ) {
        this.constantes  = constantes ;
    }

   public String getrelacionales () {
        return relacionales ;
    }

    public void setrelacionales (String relacionales ) {
        this.relacionales  = relacionales;
    }
    

     public String getidentificadores() {
        return relacionales ;
    }

    public void setidentificadores(String identificadores ) {
        this.identificadores  = identificadores;
    }

}
