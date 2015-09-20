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

    /**
     * Es una relacion de amigos
     */
    public final int AMISTAD = 0;

    /**
     * Una relacion familiar
     */
    public final int FAMILIA = 1;

    /**
     * Una realcion amorosa, no comprometidos
     */
    public final int NOVIAZGO = 2;
    
    /**
     *Una relacion de Esposo-Esposa
     */
    public final int MATRIMONIO = 3;
    private int tipo;

    public Relaciones(int tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        if(tipo == AMISTAD)
            return "Amistad";
        if(tipo == FAMILIA)
            return "Familia";
        if(tipo == NOVIAZGO)
            return "Noviazgo";
        if(tipo == MATRIMONIO)
            return "Matrimonio";
        return "No hay relacion";
    }

    public void setTipo(int tipo) {
        if(tipo < 0 || tipo > 3){
            tipo = 0;
        }
        this.tipo = tipo;
    }
    
}
