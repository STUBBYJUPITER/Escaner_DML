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

    
    public String real = "\\d+[.,]+([0-9]+[E])?\\d+";
    public String exponencial = "\\d+([.][0-9])?[E]\\d+";
    public String porcentaje = "[1]?[0-9]?\\d+[%]";
    public String natural = "\\d[^.$]";

    public Expresiones() {

    }

    public String getReal() {
        return real;
    }

    public void setReal(String real) {
        this.real = real;
    }

    public String getExponencial() {
        return exponencial;
    }

    public void setExponencial(String exponencial) {
        this.exponencial = exponencial;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getNatural() {
        return natural;
    }

    public void setNatural(String natural) {
        this.natural = natural;
    }

  
    

}
