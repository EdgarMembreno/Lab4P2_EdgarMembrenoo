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
public class Excepcion  extends Exception{
    private int dias;

    public Excepcion() {
         super();
    }

    public Excepcion(int dias, String message) {
        super(message);
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "Excepcion{" + "dias=" + dias + '}';
    }

   
    
    
}
