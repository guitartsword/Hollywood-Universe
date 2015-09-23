/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KevinBacon;

/**
 *
 * @author Isaias
 */
public class Relaciones {
    private String tipo;
    private String a1;
    private String a2;

    public Relaciones(String relacion, String a1, String a2) {
        tipo=relacion;
        this.a1=a1;
        this.a2=a2;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    
    @Override
    public String toString() {
        return a1 +" relacion de " + tipo + " con " + a2;
    }
}