/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1p2_edgarmembreño;

import java.util.Random;

/**
 *
 * @author edgarmembreno
 */
public class Lab1P2_EdgarMembreño {

    static Random r = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int col = 10;
        int fil = 10;
        
        String[][] tama = new String[fil][col];
        for (int i = 0; i < fil; i++) {
            int serp, esc;
            serp = r.nextInt(9);
            esc = r.nextInt(9);
            if (esc == serp) {
                esc = r.nextInt(9);
            }
            for (int j = 0; j < col; j++) {
                if (j == serp) {
                    tama[i][j] = "S";
                } else if (j == esc) {
                    tama[i][j] = "E";

                } else {
                    tama[i][j] = "0";
                }

            }

        }
        imprimeMatriz(tama, 0, 0);

        int turno = 1;
        int cont = 0;

        String jugador1 = "J1";
        int dado1;
        String jugador2 = "J2";
        int dado2;

        while (jugador1 != tama[0][0] || jugador2 != tama[0][0]) {  //Validacion para que se repita el while 
            dado1 = r.nextInt(6) + 1;
            dado2 = r.nextInt(6) + 1;
            if (dado1 == dado2) {
                dado1 = r.nextInt(6) + 1;

            }
            if (turno == 1) {
                System.out.println("");
                System.out.println(jugador1 + "saco: " + dado1);
                turno++;
                cont++;
                for (int i = 0; i < 10; i++) {
                    if (dado1 == i) {
                        tama[9][i - 1] = jugador1;

                        if (jugador2.equals("E")) {
                            tama[9 - 1][i - 1] = jugador1;
                        } else if (jugador2.equals("S")) {
                            tama[9 + 1][i - 1] = jugador1;
                        }
                        //imprimeMatriz(tama, 0, 0);
                    }

                }

                if (turno == 2) {
                    System.out.println(jugador2 + "saco: " + dado2);
                    turno--;
                    cont++;
                    for (int i = 0; i < 10; i++) {
                        if (dado2 == i) {
                            tama[9][i - 1] = jugador2;
                            if (jugador2.equals("E")) {
                                tama[9 - 1][i - 1] = jugador2;

                            } else if (jugador2.equals("S")) {
                                tama[9 + 1][i - 1] = jugador2;

                            }
                            System.out.println(" ");
                            imprimeMatriz(tama, 0, 0);

                        }

                    }
                }
            }
        }

        if (jugador1 == tama[0][0]) {
            System.out.println("Juador 1 Gano la partida ");

        } else if (jugador2 == tama[0][0]) {
            System.out.println("Jugador 2 gano la partida ");
        }

    }

    public static void imprimeMatriz(String matriz[][], int filas, int cols) {
        if (filas == matriz.length - 1 && cols == matriz[0].length - 1) {
            System.out.print(matriz[filas][cols] + "   ");
        } else {
            if (cols == matriz[0].length - 1) {
                System.out.println(matriz[filas][cols]);
                imprimeMatriz(matriz, filas + 1, 0);
            } else {
                System.out.print(matriz[filas][cols] + "   ");
                imprimeMatriz(matriz, filas, cols + 1);
            }
        }

    }

}
