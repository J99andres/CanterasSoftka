
package com.tallersofkau1;

public class Person {
    /**
     * Definicion de los atributos
     */
    public String name; 
    public String lastName; 
    public String birthDate; 
    public float heigth; 

    /**
     * Devuelve el nombre de la persona 
     * @return nombre persona
     */
    public String getName() {
        return name; 
    }
    
    /**
     * Modifica el nombre de la persona 
     * @param name 
     */
    public void setName(String name) {
        this.name = name; 
    }  
}
