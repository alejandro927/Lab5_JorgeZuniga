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
public class Clases {
    private String nombre;
    private String seccion;
    private int edificio;
    private int salon;
    private String Aire;

    public Clases() {
    }

    
    public Clases(String nombre, String seccion, int edificio, int salon, String Aire) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.edificio = edificio;
        this.salon = salon;
        this.Aire = Aire;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getEdificio() {
        return edificio;
    }

    public void setEdificio(int edificio) {
        this.edificio = edificio;
    }

    public int getSalon() {
        return salon;
    }

    public void setSalon(int salon) {
        this.salon = salon;
    }

    public String getAire() {
        return Aire;
    }

    public void setAire(String Aire) {
        this.Aire = Aire;
    }

    @Override
    public String toString() {
        return nombre ;
    }
}
