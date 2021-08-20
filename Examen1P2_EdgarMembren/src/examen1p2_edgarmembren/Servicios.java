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
public class Servicios {
    private String nombre;
    private int precio;
    private String calificacion;
    private Date fecha;
    private String empresa;

    public Servicios() {
    }

    public Servicios(String nombre, int precio, String calificacion, Date fecha, String empresa) {
        this.nombre = nombre;
        this.precio = precio;
        this.calificacion = calificacion;
        this.fecha = fecha;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Servicios{" + "nombre=" + nombre ;
    }
    
    
    
}
