/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_edgarmembre;

/**
 *
 * @author edgarmembreno
 */
public class Automoviles {
    private String modelo;
    private String vin;
    private String carroceria;
    private int pasajeros;
    private int maletero;

    public Automoviles() {
    }

    public Automoviles(String modelo, String vin, String carroceria, int pasajeros, int maletero) {
        this.modelo = modelo;
        this.vin = vin;
        this.carroceria = carroceria;
        this.pasajeros = pasajeros;
        this.maletero = maletero;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getMaletero() {
        return maletero;
    }

    public void setMaletero(int maletero) {
        this.maletero = maletero;
    }

    @Override
    public String toString() {
        return "Automoviles{" + "modelo=" + modelo + ", vin=" + vin + ", carroceria=" + carroceria + ", pasajeros=" + pasajeros + ", maletero=" + maletero + '}';
    }
    
    
    
}
