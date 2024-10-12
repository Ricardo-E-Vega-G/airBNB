/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooairbnb.design.clases;

import java.util.Date;

/**
 *
 * @author julio.nava
 */
public class Reservacion {
    
    private Date fechaInicio;
    private Date fechaFin;
    private int totalNoches;
    private double precioTotal;
    private boolean pagada;
    private boolean confirmada;
    
    private Lugar lugar;
    private Usuario arrendatario;

    /**
     * @return the fechaInicio
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFin
     */
    public Date getFechaFin() {
        return fechaFin;
    }

    /**
     * @param fechaFin the fechaFin to set
     */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * @return the totalNoches
     */
    public int getTotalNoches() {
        return totalNoches;
    }

    /**
     * @param totalNoches the totalNoches to set
     */
    public void setTotalNoches(int totalNoches) {
        this.totalNoches = totalNoches;
    }

    /**
     * @return the precioTotal
     */
    public double getPrecioTotal() {
        return precioTotal;
    }

    /**
     * @param precioTotal the precioTotal to set
     */
    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    /**
     * @return the pagada
     */
    public boolean isPagada() {
        return pagada;
    }

    /**
     * @param pagada the pagada to set
     */
    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    /**
     * @return the confirmada
     */
    public boolean isConfirmada() {
        return confirmada;
    }

    /**
     * @param confirmada the confirmada to set
     */
    public void setConfirmada(boolean confirmada) {
        this.confirmada = confirmada;
    }

    /**
     * @return the lugar
     */
    public Lugar getLugar() {
        return lugar;
    }

    /**
     * @param lugar the lugar to set
     */
    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    /**
     * @return the arrendatario
     */
    public Usuario getArrendatario() {
        return arrendatario;
    }

    /**
     * @param arrendatario the arrendatario to set
     */
    public void setArrendatario(Usuario arrendatario) {
        this.arrendatario = arrendatario;
    }
    
    
    
}
