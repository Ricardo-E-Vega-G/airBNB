/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooairbnb.design.clases;

import pooairbnb.design.interfaces.IRentar;

/**
 *
 * @author julio.nava
 */
public class Habitacion extends Lugar implements IRentar {
    
    private int numeroCamas;
    
    @Override
    public void reservar(Reservacion reservacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the numeroCamas
     */
    public int getNumeroCamas() {
        return numeroCamas;
    }

    /**
     * @param numeroCamas the numeroCamas to set
     */
    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }
   
}
