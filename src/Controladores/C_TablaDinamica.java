/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modulos.Modulo_Analisis;
import Modulos.Modulo_Errores;
import Modulos.Modulo_Resultados;
import e_regular.Expresiones;
import ventanas.tabla_dinamica;

/**
 *
 * @author CYBERTRON
 */
public class C_TablaDinamica {
    public tabla_dinamica tabla1;
    public Expresiones expresion1;
    public Modulo_Analisis modulo_analisis;
    public Modulo_Resultados modulo_resultados;
    public Modulo_Errores modulo_errores;
    public C_TablaDinamica(){
    
    }
    public void Iniciar(){
        this.tabla1=new tabla_dinamica();
        this.tabla1.setTitle("Traductor SQL");
        tabla1.setVisible(true);
        this.modulo_analisis=new Modulo_Analisis();
       
    
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
