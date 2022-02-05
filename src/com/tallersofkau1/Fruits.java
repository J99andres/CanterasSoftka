package com.tallersofkau1;

import java.util.ArrayList;

public class Fruits {
    /**
     * Definimos los atributos
     */
    public String name; 
    private float averageWeigth;
    public ArrayList<String> colors; 

    /**
     * Muestra una lista con los colores
     * @return una lista 
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Modifica la lista de colores
     * @param colors 
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    } 
}
