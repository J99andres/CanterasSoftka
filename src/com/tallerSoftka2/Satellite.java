package com.tallerSoftka2;

public class Satellite extends Spaceship {
    /**
     * Sobreescritura del metodo abstracto de la superClase
     */
    @Override
    public void typesOfShips() {
        System.out.println("Explorer\nSoho\nSurveyor\nMarinerV\n"
                + "PioneroX\nVikingoI\n");
    }
}
