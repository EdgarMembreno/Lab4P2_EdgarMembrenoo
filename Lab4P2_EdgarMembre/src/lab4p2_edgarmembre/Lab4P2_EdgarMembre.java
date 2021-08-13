/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_edgarmembre;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4P2_EdgarMembre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Excepcion {

        Scanner leer = new Scanner(System.in);
        ArrayList<Automoviles> autos = new ArrayList();
        ArrayList<Combustion> combus = new ArrayList();
        ArrayList<Hibrido> hibrido = new ArrayList();
        ArrayList<Enchufable> enchufable = new ArrayList();
        ArrayList<Electrico> electrico = new ArrayList();
        int opcion = 0;
        while (opcion != 6) {
            System.out.println("************MENU************");
            System.out.println("1.Agregar Automovil");
            System.out.println("2.Eliminar Automovil");
            System.out.println("3.Modificar Automobiles");
            System.out.println("4.Listar Automobiles");
            System.out.println("5.Ver Calculos");
            System.out.println("6.Salir");
            System.out.println("****************************");
            System.out.print("Ingrese su opcion: ");
            opcion = leer.nextInt();
            System.out.println("");
            switch (opcion) {
                case 1: {
                    while (opcion != 0) {
                        System.out.println("**Agregar Automovil");
                        System.out.println("1.Combustion");
                        System.out.println("2.Hibrido");
                        System.out.println("3.Hibrido Enchufable");
                        System.out.println("4.Electrico");
                        System.out.println("0.Salir");
                        System.out.print("Ingrese su opcion: ");
                        opcion = leer.nextInt();
                        switch (opcion) {
                            case 1: {
                                System.out.println("Ingrese el consumo de combustible: ");
                                int consumo = leer.nextInt();
                                System.out.println("Ingrese la duracion del aceite: ");
                                int aceite = leer.nextInt();
                                System.out.println("Ingrese la velocidad Maxima: ");
                                int velocidad = leer.nextInt();
                                System.out.println("Ingrese si es manual o automatico: M o A");
                                String cambio = leer.next();

                                System.out.println("Ingrese el modelo :");
                                String modelo = leer.next();
                                System.out.println("Ingrese el VIN");
                                String vin = leer.next();
                                double fallo = 72.3;
                                System.out.println("Ingrese la carroceria: ");
                                String carroceria = leer.next();
                                System.out.println("Ingrese la cantidad de pasajeros: ");
                                int pasajeros = leer.nextInt();
                                System.out.println("Ingrese la capacidad del maletero: ");
                                int maletero = leer.nextInt();

                                autos.add(new Automoviles(modelo, vin, carroceria, pasajeros, maletero));
                                combus.add(new Combustion(consumo, aceite, velocidad, cambio, 2021, modelo, vin, carroceria, pasajeros, maletero));

                                break;

                            }
                            case 2: {
                                System.out.println("Ingrese la capacidad de la bateria: ");
                                int bateria = leer.nextInt();
                                System.out.println("Ingrese la capacidad del motor electrico");
                                int capacidad = leer.nextInt();
                                System.out.println("Ingrese el modelo :");
                                String modelo = leer.next();
                                System.out.println("Ingrese el VIN");
                                String vin = leer.next();
                                System.out.println("Ingrese la carroceria: ");
                                String carroceria = leer.next();
                                System.out.println("Ingrese la cantidad de pasajeros: ");
                                int pasajeros = leer.nextInt();
                                System.out.println("Ingrese la capacidad del maletero: ");
                                int maletero = leer.nextInt();
                                autos.add(new Automoviles(modelo, vin, carroceria, pasajeros, maletero));
                                hibrido.add(new Hibrido(bateria, capacidad, 2021, modelo, vin, carroceria, pasajeros, maletero));

                                break;
                            }
                            case 3: {
                                System.out.println("Ingrese la cantdad de KM en modo electrico: ");
                                int kiloElectrico = leer.nextInt();
                                System.out.println("Ingrese la cantidad de motores: ");
                                int motores = leer.nextInt();
                                System.out.println("Ingrese la capacidad de remolque: ");
                                int remolque = leer.nextInt();
                                System.out.println("Ingrese si es 4x4 o no: ");
                                String x4 = leer.next();
                                System.out.println("Ingrese el modelo :");
                                String modelo = leer.next();
                                System.out.println("Ingrese el VIN");
                                String vin = leer.next();
                                System.out.println("Ingrese la carroceria: ");
                                String carroceria = leer.next();
                                System.out.println("Ingrese la cantidad de pasajeros: ");
                                int pasajeros = leer.nextInt();
                                System.out.println("Ingrese la capacidad del maletero: ");
                                int maletero = leer.nextInt();

                                autos.add(new Automoviles(modelo, vin, carroceria, pasajeros, maletero));
                                enchufable.add(new Enchufable(kiloElectrico, motores, remolque, x4, 2021, modelo, vin, carroceria, pasajeros, maletero));

                                break;
                            }
                            case 4: {
                                System.out.println("Ingrese la cantidad la autonomia: ");
                                int autonomia = leer.nextInt();
                                System.out.println("Ingrese la cantidad de baterias que almacena: ");
                                int baterias = leer.nextInt();
                                System.out.println("Ingrese la aceleracion: ");
                                int aceleracion = leer.nextInt();
                                System.out.println("Ingrese el tiempo de carga: ");
                                int carga = leer.nextInt();
                                System.out.println("Ingrese el modelo :");
                                String modelo = leer.next();
                                System.out.println("Ingrese el VIN");
                                String vin = leer.next();
                                System.out.println("Ingrese la carroceria: ");
                                String carroceria = leer.next();
                                System.out.println("Ingrese la cantidad de pasajeros: ");
                                int pasajeros = leer.nextInt();
                                System.out.println("Ingrese la capacidad del maletero: ");
                                int maletero = leer.nextInt();

                                autos.add(new Automoviles(modelo, vin, carroceria, pasajeros, maletero));
                                electrico.add(new Electrico(autonomia, baterias, aceleracion, carga, carga, modelo, vin, carroceria, pasajeros, maletero));

                                break;
                            }

                        }
                    }

                    break;
                }
                case 2: {
                    while (opcion != 3) {
                        System.out.println("**Eliminar Automovil");
                        System.out.println("1.Eliminar automovil");
                        System.out.println("2.Eliminar todos los automoviles");
                        System.out.println("3.Salir");
                        opcion = leer.nextInt();
                        switch (opcion) {
                            case 1: {
                                System.out.println("Ingrese el VIN del Auto que desea eliminar: ");
                                String nombre = leer.next();
                                for (int i = 0; i < autos.size(); i++) {
                                    if (nombre.equals(autos.get(i).getVin())) {
                                        autos.remove(i);
                                    } else {
                                        System.out.println("El Auto no existe: ");
                                    }
                                }

                                break;

                            }
                            case 2: {
                                for (int i = 0; i < autos.size(); i++) {
                                    autos.remove(i);
                                }

                                break;
                            }
                        }
                    }
                    break;
                }
                case 3: {
                    while (opcion != 0) {
                        System.out.println("**Modificar Automovil");
                        System.out.println("1.Modificar de Combustion");
                        System.out.println("2.Modificar un Hibrido");
                        System.out.println("3.Modificar un Enchufable");
                        System.out.println("4.Modificar un electrico");
                        System.out.println("0.Salir");
                        opcion = leer.nextInt();
                        switch (opcion) {
                            case 1: {
                                System.out.println("Ingrese el VIN del auto que desea modificar: ");
                                String vin = leer.next();
                                for (int i = 0; i < combus.size(); i++) {
                                    if (vin.equals(combus.get(i).getVin())) {
                                        System.out.println("Ingrese el consumo de combustible: ");
                                        int consumo = leer.nextInt();
                                        System.out.println("Ingrese la duracion del aceite: ");
                                        int aceite = leer.nextInt();
                                        System.out.println("Ingrese la velocidad Maxima: ");
                                        int velocidad = leer.nextInt();
                                        System.out.println("Ingrese si es manual o automatico: M o A");
                                        String cambio = "";
                                        if (cambio.equals("M")) {
                                            cambio = "cambio";
                                        } else if (cambio.equals("A")) {
                                            cambio = "Automatico";
                                        }
                                        System.out.println("Ingrese el modelo :");
                                        String modelo = leer.next();
                                        System.out.println("Ingrese el VIN");
                                        vin = leer.next();
                                        System.out.println("Ingrese la carroceria: ");
                                        String carroceria = leer.next();
                                        System.out.println("Ingrese la cantidad de pasajeros: ");
                                        int pasajeros = leer.nextInt();
                                        System.out.println("Ingrese la capacidad del maletero: ");
                                        int maletero = leer.nextInt();

                                        combus.get(i).setConsumoCombustible(consumo);
                                        combus.get(i).setAceite(aceite);
                                        combus.get(i).setVelocidadMax(velocidad);
                                        combus.get(i).setCambios(cambio);
                                        combus.get(i).setModelo(modelo);
                                        combus.get(i).setCarroceria(carroceria);
                                        combus.get(i).setPasajeros(pasajeros);
                                        combus.get(i).setMaletero(maletero);
                                    }
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("Ingrese el VIN del auto que desea modificar: ");
                                String vin = leer.next();
                                for (int i = 0; i < hibrido.size(); i++) {
                                    if (vin.equals(hibrido.get(i).getVin())) {
                                        System.out.println("Ingrese la capacidad de la bateria: ");
                                        int bateria = leer.nextInt();
                                        System.out.println("Ingrese la capacidad del motor electrico");
                                        int capacidad = leer.nextInt();
                                        System.out.println("Ingrese el modelo :");
                                        String modelo = leer.next();
                                        System.out.println("Ingrese el VIN");
                                        vin = leer.next();
                                        System.out.println("Ingrese la carroceria: ");
                                        String carroceria = leer.next();
                                        System.out.println("Ingrese la cantidad de pasajeros: ");
                                        int pasajeros = leer.nextInt();
                                        System.out.println("Ingrese la capacidad del maletero: ");
                                        int maletero = leer.nextInt();

                                        hibrido.get(i).setBateria(bateria);
                                        hibrido.get(i).setCapacidad(capacidad);
                                        hibrido.get(i).setModelo(modelo);
                                        hibrido.get(i).setVin(vin);
                                        hibrido.get(i).setCarroceria(carroceria);
                                        hibrido.get(i).setPasajeros(pasajeros);
                                        hibrido.get(i).setMaletero(maletero);

                                    }
                                }

                                break;
                            }
                            case 3: {
                                System.out.println("Ingrese el VIN del auto que desea modificar: ");
                                String vin = leer.next();
                                for (int i = 0; i < enchufable.size(); i++) {
                                    if (vin.equals(enchufable.get(i).getVin())) {
                                        System.out.println("Ingrese la cantdad de KM en modo electrico: ");
                                        int kiloElectrico = leer.nextInt();
                                        System.out.println("Ingrese la cantidad de motores: ");
                                        int motores = leer.nextInt();
                                        System.out.println("Ingrese la capacidad de remolque: ");
                                        int remolque = leer.nextInt();
                                        System.out.println("Ingrese si es 4x4 o no: ");
                                        String x4 = leer.next();
                                        System.out.println("Ingrese el modelo :");
                                        String modelo = leer.next();
                                        System.out.println("Ingrese el VIN");
                                        vin = leer.next();
                                        System.out.println("Ingrese la carroceria: ");
                                        String carroceria = leer.next();
                                        System.out.println("Ingrese la cantidad de pasajeros: ");
                                        int pasajeros = leer.nextInt();
                                        System.out.println("Ingrese la capacidad del maletero: ");
                                        int maletero = leer.nextInt();

                                        enchufable.get(i).setKiloElectrico(kiloElectrico);
                                        enchufable.get(i).setMotores(motores);
                                        enchufable.get(i).setRemolque(remolque);
                                        enchufable.get(i).setX4(x4);
                                        enchufable.get(i).setModelo(modelo);
                                        enchufable.get(i).setCarroceria(carroceria);
                                        enchufable.get(i).setPasajeros(pasajeros);
                                        enchufable.get(i).setMaletero(maletero);

                                    }
                                }
                                break;
                            }
                            case 4: {
                                System.out.println("Ingrese el VIN del auto que desea modificar: ");
                                String vin = leer.next();
                                for (int i = 0; i < electrico.size(); i++) {
                                    if (vin.equals(electrico.get(i).getVin())) {
                                        System.out.println("Ingrese la cantidad la autonomia: ");
                                        int autonomia = leer.nextInt();
                                        System.out.println("Ingrese la cantidad de baterias que almacena: ");
                                        int baterias = leer.nextInt();
                                        System.out.println("Ingrese la aceleracion: ");
                                        int aceleracion = leer.nextInt();
                                        System.out.println("Ingrese el tiempo de carga: ");
                                        int carga = leer.nextInt();
                                        System.out.println("Ingrese el modelo :");
                                        String modelo = leer.next();
                                        System.out.println("Ingrese el VIN");
                                        vin = leer.next();
                                        System.out.println("Ingrese la carroceria: ");
                                        String carroceria = leer.next();
                                        System.out.println("Ingrese la cantidad de pasajeros: ");
                                        int pasajeros = leer.nextInt();
                                        System.out.println("Ingrese la capacidad del maletero: ");
                                        int maletero = leer.nextInt();

                                        electrico.get(i).setAutonomia(autonomia);
                                        electrico.get(i).setBaterias(baterias);
                                        electrico.get(i).setAceleracion(aceleracion);
                                        electrico.get(i).setCarga(carga);
                                        electrico.get(i).setModelo(modelo);
                                        electrico.get(i).setCarroceria(carroceria);
                                        electrico.get(i).setMaletero(maletero);
                                        electrico.get(i).setPasajeros(pasajeros);

                                    }

                                }

                                break;

                            }
                        }
                    }
                    break;
                }
                case 4: {
                    while (opcion != 0) {
                        System.out.println("**Listar Automovil");
                        System.out.println("1.Lista de Combustion");
                        System.out.println("2.Lista de Hibrido");
                        System.out.println("3.Lista de Enchufable");
                        System.out.println("4.Lista de electrico");
                        System.out.println("0.Salir");
                        opcion = leer.nextInt();
                        switch (opcion) {
                            case 1: {
                                for (int i = 0; i < combus.size(); i++) {
                                    System.out.println(combus.get(i));
                                }

                                break;
                            }
                            case 2: {
                                for (int i = 0; i < hibrido.size(); i++) {
                                    System.out.println(hibrido.get(i));
                                }

                                break;
                            }
                            case 3: {
                                for (int i = 0; i < enchufable.size(); i++) {
                                    System.out.println(enchufable.get(i));
                                }
                                break;
                            }
                            case 4: {
                                for (int i = 0; i < electrico.size(); i++) {
                                    System.out.println(electrico.get(i));
                                }
                            }

                        }
                    }

                    break;
                }
                case 5: {
                    while (opcion != 0) {
                        System.out.println("**Calculo Automovil");
                        System.out.println("1.Ver calculo de Combustion");
                        System.out.println("2.Ver calculo de Hibrido");
                        System.out.println("3.Ver calculo de Enchufable");
                        System.out.println("4.Ver calculo de Electrico");
                        System.out.println("0.Salir");
                        opcion = leer.nextInt();
                        switch (opcion) {
                            case 1: {
                                System.out.println("Ingrese el VIN del auto que desea modificar: ");
                                String vin = leer.next();
                                for (int i = 0; i < combus.size(); i++) {
                                    if (vin.equals(combus.get(i).getVin())) {
                                        System.out.println(combus.get(i).getFallo());
                                    }
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("Ingrese el VIN del auto que desea modificar: ");
                                String vin = leer.next();
                                for (int i = 0; i < hibrido.size(); i++) {
                                    if (vin.equals(hibrido.get(i).getVin())) {
                                        System.out.println(hibrido.get(i).getFallo());
                                    }
                                }
                                break;
                            }
                            case 3: {
                                System.out.println("Ingrese el VIN del auto que desea modificar: ");
                                String vin = leer.next();
                                for (int i = 0; i < hibrido.size(); i++) {
                                    if (vin.equals(hibrido.get(i).getVin())) {
                                        System.out.println(hibrido.get(i).getFallo());
                                    }
                                }
                                break;
                            }

                        }
                    }

                }

            }
        }
    }
    
}
