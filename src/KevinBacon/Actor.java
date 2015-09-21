/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KevinBacon;

import java.util.ArrayList;

/**
 *
 * @author Isaias
 */
public class Actor {
    private String nombreCompleto;
    private int edad;
    private String nacionalidad;
    private ArrayList<Pelicula> participado;

    public Actor(String nombreCompleto, int edad, String nacionalidad) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        participado=new ArrayList();
    }

    public Actor() {
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public ArrayList<Pelicula> getParticapado() {
        return participado;
    }

    public void setParticapado(ArrayList<Pelicula> particapado) {
        this.participado = particapado;
    }
    
    public void addParticapado(Pelicula p) {
        participado.add(p);
    }

    @Override
    public String toString() {
        return nombreCompleto;
    }
    
}
