package com.tallersofkau1;

/**
 *
 * @author Jairo Andres
 */
public class User {
    /**
     * Definicion de los atributos
     */
    protected String user;
    private int password; 
    
    /**
     * Muestra el nombre de usuario  
     * @return el nombre del usuario 
     */
    public String getUser() {
        return user; 
    }
    
    /**
     * Modifica el nombre de usuario
     * @param user 
     */
    public void getUser(String user){
        this.user = user; 
    }
}
