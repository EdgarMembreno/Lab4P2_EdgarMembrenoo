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
public class Combustion extends Automoviles {

    private int consumoCombustible;
    private int aceite;
    private int velocidadMax;
    private String cambios;
    private double fallo;

    public Combustion() {
        super();
    }

    public Combustion(int consumoCombustible, int aceite, int velocidadMax, String cambios, double fallo, String modelo, String vin, String carroceria, int pasajeros, int maletero) {
        super(modelo, vin, carroceria, pasajeros, maletero);
        this.consumoCombustible = consumoCombustible;
        this.aceite = aceite;
        this.velocidadMax = velocidadMax;
        this.cambios = cambios;
        this.fallo = fallo;
    }

    public int getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(int consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    public int getAceite() {
        return aceite;
    }

    public void setAceite(int aceite) {
        this.aceite = aceite;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public String getCambios() {
        return cambios;
    }

    public void setCambios(String cambios) {
        this.cambios = cambios;
    }

    public double getFallo() {
        return fallo;
    }

    public void setFallo(double fallo) throws Excepcion {
        if (fallo > 30) {
            this.fallo = formulaCombustion();
        } else {
            throw new Excepcion(30, "Tiene que cambiar la informacion del vehiculo");
        }

    }

    @Override
    public String toString() {
        return "Combustion{" + "consumoCombustible=" + consumoCombustible + ", aceite=" + aceite + ", velocidadMax=" + velocidadMax + ", cambios=" + cambios + ", fallo=" + fallo + '}';
    }

    public double formulaCombustion() {
        return (2021 - (((super.getPasajeros()) * (consumoCombustible)) - (aceite) * consumoCombustible));
    }

}
