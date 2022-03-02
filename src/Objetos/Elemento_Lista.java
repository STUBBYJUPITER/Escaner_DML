/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author CYBERTRON
 */
public class Elemento_Lista {
    public int no;
    public int linea;
    public String token;
    public int tipo;
    public int codigo;
    
    public Elemento_Lista(int no, int linea, String token, int tipo, int codigo){
        this.no=no;
        this.linea=linea;
        this.token=token;
        this.tipo=tipo;
        this.codigo=codigo;
        
    
    
    }
    public Elemento_Lista(){
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
}
