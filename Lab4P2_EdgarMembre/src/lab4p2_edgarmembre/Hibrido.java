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
public class Hibrido extends Automoviles {

    private int bateria;
    private int capacidad;
    private int fallo;

    public Hibrido() {
        super();
    }

    public Hibrido(int bateria, int capacidad, int fallo, String modelo, String vin, String carroceria, int pasajeros, int maletero) {
        super(modelo, vin, carroceria, pasajeros, maletero);
        this.bateria = bateria;
        this.capacidad = capacidad;
        this.fallo = fallo;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getFallo() {
        return fallo;
    }

    public void setFallo(int fallo) throws Excepcion {
        if (fallo > 30) {
            this.fallo = fallo;
        } else {
            throw new Excepcion(100, "Tiene que cambiar la informacion del vehiculo");
        }

    }

    @Override
    public String toString() {
        return "Hibrido{" + "bateria=" + bateria + ", capacidad=" + capacidad + ", fallo=" + fallo + '}';
    }

    public double formulaHibrido() {
        return (2021 - (((capacidad) * (super.getMaletero())) / (super.getPasajeros())));
    }

}
