package com.tallersofkau1;

public class BankAccount {
    /**
     * Definicion de los atributos
     */
    private int accountNumber; 
    protected boolean activated; 
    
    /**
     * Devuelve true o false 
     * @return un boleano 
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     * Modifica la actividad de la cuenta
     * @param activated 
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
