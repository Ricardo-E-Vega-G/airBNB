/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooairbnb.design.clases;

import java.util.List;
import pooairbnb.design.interfaces.IRentar;

/**
 *
 * @author julio.nava
 */
public class Departamento extends Lugar implements IRentar {
    
    private ETipoRenta tipoRenta;
    private ETipoDepartamento tipoDepartamento;
    
    private int numeroHabitaciones;
    private List<Habitacion> habitaciones;
    
    
    @Override
    public void reservar(Reservacion reservacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the tipoRenta
     */
    public ETipoRenta getTipoRenta() {
        return tipoRenta;
    }

    /**
     * @param tipoRenta the tipoRenta to set
     */
    public void setTipoRenta(ETipoRenta tipoRenta) {
        this.tipoRenta = tipoRenta;
    }

    /**
     * @return the tipoDepartamento
     */
    public ETipoDepartamento getTipoDepartamento() {
        return tipoDepartamento;
    }

    /**
     * @param tipoDepartamento the tipoDepartamento to set
     */
    public void setTipoDepartamento(ETipoDepartamento tipoDepartamento) {
        this.tipoDepartamento = tipoDepartamento;
    }

    /**
     * @return the numeroHabitaciones
     */
    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    /**
     * @param numeroHabitaciones the numeroHabitaciones to set
     */
    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    /**
     * @return the habitaciones
     */
    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    /**
     * @param habitaciones the habitaciones to set
     */
    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
    
    
    
}
