/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import e_regular.Expresiones;
import ventanas.tabla_dinamica;

/**
 *
 * @author CYBERTRON
 */
public class C_TablaDinamica {
    public tabla_dinamica tabla1;
    public Expresiones expresion1;
    public C_TablaDinamica(){
    
    }
    public void Iniciar(){
        this.tabla1=new tabla_dinamica();
        tabla1.setVisible(true);
    
    }

    public tabla_dinamica getTabla1() {
        return tabla1;
    }

    public void setTabla1(tabla_dinamica tabla1) {
        this.tabla1 = tabla1;
    }

    public Expresiones getExpresion1() {
        return expresion1;
    }

    public void setExpresion1(Expresiones expresion1) {
        this.expresion1 = expresion1;
    }
    

}
