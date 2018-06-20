/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author LN710Q
 */
public class Filtro {
    
    private int id, annio;
    private String nombre, director, pais, clasificacion;
    private boolean enProyeccion;

    public Filtro() {
    }

    public Filtro(int id, String nombre, String director, String pais, int annio, String clasificacion, boolean enProyeccion) {
        this.id = id;
        this.annio = annio;
        this.nombre = nombre;
        this.director = director;
        this.pais = pais;
        this.clasificacion = clasificacion;
        this.enProyeccion = enProyeccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public boolean isEnProyeccion() {
        return enProyeccion;
    }

    public void setEnProyeccion(boolean enProyeccion) {
        this.enProyeccion = enProyeccion;
    }
        
}
