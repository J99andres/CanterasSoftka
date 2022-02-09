package com.tallerSoftka2;

public class MannedSpacecraft extends Spaceship {
    
    /**
     * Sobreescritura del metodo abstracto de la superClase
     */
    @Override
    public void typesOfShips() {
        System.out.println("DragonV2\nApolo\nMercury\nSkylab\n");
    }
}
