
package com.tallersofkau1;

import java.util.ArrayList;

public class Skills {
    /**
     * Definicion de los atributos
     */
    public ArrayList<String> programmingLenguages;
    
    /**
     * Muestra una lista con las habilidades 
     * @return una lista 
     */
    public ArrayList<String> getProgrammingLenguages() {
        return programmingLenguages;
    }

    /**
     * Modifica las habilidades 
     * @param programmingLenguages 
     */
    public void setProgrammingLenguages(ArrayList<String> programmingLenguages) {
        this.programmingLenguages = programmingLenguages;
    }
}
