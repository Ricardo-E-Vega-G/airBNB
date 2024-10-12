/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooairbnb.design.clases;

import java.util.List;

/**
 *
 * @author julio.nava
 */
public class Lugar {
    
    private String titulo;
    private String descripcion;
    private int metrosCuadrados;
    private boolean aireAcondicionado;
    private boolean calefaccion;
    
    private String direccion;
    private String codigoPostal;
    private String ciudad;
    
    private double latitud;
    private double longitud;
    
    private int numMaxPersonas;
    
    private List<Tarifa> tarifas;
    
    private List<String> imagenes;
    
    
    
    public List<Lugar> consultarPorCiudad(String ciudad) {
        return null;
    }
    
    public List<Lugar> consultarPorCodigoPostal(String codigoPostal){
        return null;
    }
    
    public List<Lugar> consultarPorUbicacion(double latitud, double longitud) {
        return null;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the metrosCuadrados
     */
    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    /**
     * @param metrosCuadrados the metrosCuadrados to set
     */
    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    /**
     * @return the aireAcondicionado
     */
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    /**
     * @param aireAcondicionado the aireAcondicionado to set
     */
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    /**
     * @return the calefaccion
     */
    public boolean isCalefaccion() {
        return calefaccion;
    }

    /**
     * @param calefaccion the calefaccion to set
     */
    public void setCalefaccion(boolean calefaccion) {
        this.calefaccion = calefaccion;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the codigoPostal
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * @param codigoPostal the codigoPostal to set
     */
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the latitud
     */
    public double getLatitud() {
        return latitud;
    }

    /**
     * @param latitud the latitud to set
     */
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    /**
     * @return the longitud
     */
    public double getLongitud() {
        return longitud;
    }

    /**
     * @param longitud the longitud to set
     */
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    /**
     * @return the numMaxPersonas
     */
    public int getNumMaxPersonas() {
        return numMaxPersonas;
    }

    /**
     * @param numMaxPersonas the numMaxPersonas to set
     */
    public void setNumMaxPersonas(int numMaxPersonas) {
        this.numMaxPersonas = numMaxPersonas;
    }

    /**
     * @return the tarifas
     */
    public List<Tarifa> getTarifas() {
        return tarifas;
    }

    /**
     * @param tarifas the tarifas to set
     */
    public void setTarifas(List<Tarifa> tarifas) {
        this.tarifas = tarifas;
    }

    /**
     * @return the imagenes
     */
    public List<String> getImagenes() {
        return imagenes;
    }

    /**
     * @param imagenes the imagenes to set
     */
    public void setImagenes(List<String> imagenes) {
        this.imagenes = imagenes;
    }
    
    
    
}
