/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_jorgezuniga;

import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class Maestro extends Personas{
    private int salario;
    private String clase;

    public Maestro() {
        super();
    }

    public Maestro(int salario, String nombre, String Apellido, int edad , String Genero,String clase) {
        super(nombre, Apellido, edad , Genero);
        this.salario = salario;
        this.clase = clase;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nombre="+super.getNombre() + " Apellido=" + super.getApellido() + " Edad="+super.getEdad()+" Genero="+super.getGenero()+" Salario=" + salario + ", Clases=" + clase;
    }
    
    
    
    
}
