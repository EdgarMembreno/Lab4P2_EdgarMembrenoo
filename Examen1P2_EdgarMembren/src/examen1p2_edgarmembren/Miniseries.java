/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_edgarmembren;

/**
 *
 * @author edgarmembreno
 */
public class Miniseries {

    private String nombre;
    private int temporadas;
    private String genero;
    private int duracion;
    private String descripcion;

    public Miniseries() {
    }

    public Miniseries(String nombre, int temporadas, String genero, int duracion, String descripcion) {
        this.nombre = nombre;
        this.temporadas = temporadas;
        this.genero = genero;
        this.duracion = duracion;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
