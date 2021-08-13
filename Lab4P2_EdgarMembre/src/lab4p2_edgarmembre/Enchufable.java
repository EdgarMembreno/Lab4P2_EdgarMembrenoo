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
public class Enchufable extends Automoviles {

    private int kiloElectrico;
    private int motores;
    private int remolque;
    private String X4;
    private int fallo;

    public Enchufable() {
        super();
    }

    public Enchufable(int kiloElectrico, int motores, int remolque, String X4, int fallo, String modelo, String vin, String carroceria, int pasajeros, int maletero) {
        super(modelo, vin, carroceria, pasajeros, maletero);
        this.kiloElectrico = kiloElectrico;
        this.motores = motores;
        this.remolque = remolque;
        this.X4 = X4;
        this.fallo = fallo;
    }

    public int getKiloElectrico() {
        return kiloElectrico;
    }

    public void setKiloElectrico(int kiloElectrico) {
        this.kiloElectrico = kiloElectrico;
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public int getRemolque() {
        return remolque;
    }

    public void setRemolque(int remolque) {
        this.remolque = remolque;
    }

    public String getX4() {
        return X4;
    }

    public void setX4(String X4) {
        this.X4 = X4;
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
        return "Enchufable{" + "kiloElectrico=" + kiloElectrico + ", motores=" + motores + ", remolque=" + remolque + ", X4=" + X4 + ", fallo=" + fallo + '}';
    }

    public double formulaEnchufable() {
        return (2021 - ((super.getPasajeros() * motores) + (kiloElectrico / remolque)));
    }

}
