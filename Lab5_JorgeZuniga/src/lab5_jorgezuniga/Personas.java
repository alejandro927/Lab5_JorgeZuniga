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
public class Personas {
    private String nombre;
    private String Apellido;
    private String Genero;
    private int edad;

    public Personas() {
    }

    public Personas(String nombre, String Apellido, int edad,String Genero) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.edad = edad;
        this.Genero = Genero;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre;
    }
    
}
