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
public class Electrico extends Automoviles {

    private int autonomia;
    private int baterias;
    private int aceleracion;
    private int carga;
    private int fallo;

    public Electrico() {
        super();
    }

    public Electrico(int autonomia, int baterias, int aceleracion, int carga, int fallo, String modelo, String vin, String carroceria, int pasajeros, int maletero) {
        super(modelo, vin, carroceria, pasajeros, maletero);
        this.autonomia = autonomia;
        this.baterias = baterias;
        this.aceleracion = aceleracion;
        this.carga = carga;
        this.fallo = fallo;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getBaterias() {
        return baterias;
    }

    public void setBaterias(int baterias) {
        this.baterias = baterias;
    }

    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
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
        return "Electrico{" + "autonomia=" + autonomia + ", baterias=" + baterias + ", aceleracion=" + aceleracion + ", carga=" + carga + ", fallo=" + fallo + '}';
    }

    public double formulaElectrico() {
        return (2021 - ((baterias + carga) * (super.getPasajeros() / aceleracion)));
    }

}
