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
public class Texto {
    public String texto1 = "SELECT ANOMBRE, CALIFICACION, TURNO\n"
            + "FROM ALUMNOS, INSCRITOS, MATERIAS, CARRERAS\n"
            + "WHERE MNOMBRE=’LENAUT2’ AND TURNO = ‘TM’\n"
            + "AND CNOMBRE=’ISC’ AND SEMESTRE=’2020I’ AND CALIFICACION >= 70";

    public Texto() {
    }

    public String getTexto1() {
        return texto1;
    }

    public void setTexto1(String texto1) {
        this.texto1 = texto1;
    }


}
