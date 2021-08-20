/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_edgarmembren;

import java.util.Date;

/**
 *
 * @author edgarmembreno
 */
public class Series {
    private String nombre;
    private int temporadas;
    private int calificacion;
    private Date estreno;
    private int actores;

    public Series() {
    }

    public Series(String nombre, int temporadas, int calificacion, Date estreno, int actores) {
        this.nombre = nombre;
        this.temporadas = temporadas;
        this.calificacion = calificacion;
        this.estreno = estreno;
        this.actores = actores;
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

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Date getEstreno() {
        return estreno;
    }

    public void setEstreno(Date estreno) {
        this.estreno = estreno;
    }

    public int getActores() {
        return actores;
    }

    public void setActores(int actores) {
        this.actores = actores;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
