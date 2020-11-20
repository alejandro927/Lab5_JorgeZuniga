/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_jorgezuniga;

/**
 *
 * @author Alejandro
 */
public class Carrera {
    private String nombre;
    private String facultad;
    private int costoMensual;
    private String JefeDeCarrera;

    public Carrera() {
    }

    public Carrera(String nombre, String facultad, int costoMensual, String JefeDeCarrera) {
        this.nombre = nombre;
        this.facultad = facultad;
        this.costoMensual = costoMensual;
        this.JefeDeCarrera = JefeDeCarrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public int getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(int costoMensual) {
        this.costoMensual = costoMensual;
    }

    public String getJefeDeCarrera() {
        return JefeDeCarrera;
    }

    public void setJefeDeCarrera(String JefeDeCarrera) {
        this.JefeDeCarrera = JefeDeCarrera;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre;
    }
    
    
    
    
}
