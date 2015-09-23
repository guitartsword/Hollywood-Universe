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
public class Pelicula{
    private String titulo;
    private int añoDeExhibicion;
    private String studio;

    public Pelicula(String titulo, int añoDeExhibicion, String studio) {
        this.titulo = titulo;
        this.añoDeExhibicion = añoDeExhibicion;
        this.studio = studio;
    }

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñoDeExhibicion() {
        return añoDeExhibicion;
    }

    public void setAñoDeExhibicion(int añoDeExhibicion) {
        this.añoDeExhibicion = añoDeExhibicion;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    @Override
    public String toString() {
        return titulo+" ("+añoDeExhibicion+")";
    }
    
    
}
