package com.tallerSoftka2;

public class LaunchVehicle extends Spaceship {
    /**
     * Sobreescritura del metodo abstracto de la superClase
     */
    @Override
    public void typesOfShips() {
        System.out.println("Saturno V\nTrasbordador espacial\nAtlasV\n"
                + "DeltaIV\nFalconIX\n");
    }
}
