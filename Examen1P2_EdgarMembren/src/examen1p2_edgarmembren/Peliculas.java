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
public class Peliculas {

    private String nombre;
    private int temporadas;
    private int duracion;
    private Date estrenoCine;
    private Date estrenoStream;
    private String plot;

    public Peliculas() {
    }

    public Peliculas(String nombre, int temporadas, int duracion, Date estrenoCine, Date estrenoStream, String plot) {
        this.nombre = nombre;
        this.temporadas = temporadas;
        this.duracion = duracion;
        this.estrenoCine = estrenoCine;
        this.estrenoStream = estrenoStream;
        this.plot = plot;
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Date getEstrenoCine() {
        return estrenoCine;
    }

    public void setEstrenoCine(Date estrenoCine) {
        this.estrenoCine = estrenoCine;
    }

    public Date getEstrenoStream() {
        return estrenoStream;
    }

    public void setEstrenoStream(Date estrenoStream) {
        this.estrenoStream = estrenoStream;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
