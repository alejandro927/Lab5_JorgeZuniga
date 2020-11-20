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
public class Alumnos extends Personas{
    private double NumeroCuenta;
    private String Carrera;
    
    public Alumnos() {
        super();
    }

    public Alumnos(double NumeroCuenta, String Carrera, String nombre, String Apellido, int edad, String Genero) {
        super(nombre, Apellido, edad, Genero);
        this.NumeroCuenta = NumeroCuenta;
        this.Carrera = Carrera;
    }

    public double getNumeroCuenta() {
        return NumeroCuenta;
    }
    
    public void setNumeroCuenta(double NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    @Override
    public String toString() {
        return "NumeroCuenta=" + NumeroCuenta + ", Carrera=" + Carrera + " Nombre="+super.getNombre() + " Apellido="+super.getApellido()+" Genero="+super.getGenero() + " Edad="+super.getEdad();
    }


    
    
    
    
    
}
