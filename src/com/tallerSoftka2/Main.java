package com.tallerSoftka2;

import java.util.Scanner;

/**
 * Clase Main donde se ejecutara el programa
 * @author Jairo Andres
 */
public class Main {

    public static void main(String[] args) {        
        /**
         * Diseño del menu para interactuar desde la consola
         */        
        LaunchVehicle vehicle = new LaunchVehicle();
        Satellite satellite = new Satellite();
        MannedSpacecraft spacecraft = new MannedSpacecraft();

        Scanner entrada = new Scanner(System.in);

        int opcion = 1;
        while (opcion != 0) {
            System.out.println("Seleccione el area de interes:");
            System.out.println("1. Vehiculos lanzaderas");
            System.out.println("2. Naves no tripuladas");
            System.out.println("3. Naves tripuladas");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");

            opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion) {
                case 1:
                    vehicle.typesOfShips();
                    break;
                case 2:
                    satellite.typesOfShips();
                    break;
                case 3:
                    spacecraft.typesOfShips();
                    break;
                case 0:
                    System.out.println("Ha salido de la app correctamente");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }
    }
}
