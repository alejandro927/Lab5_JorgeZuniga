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
    private ArrayList clases = new ArrayList();

    public Maestro() {
        super();
    }

    public Maestro(int salario, String nombre, String Apellido, int edad , String Genero) {
        super(nombre, Apellido, edad , Genero);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public ArrayList getClases() {
        return clases;
    }

    public void setClases(ArrayList clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return "Nombre="+super.getNombre() + " Apellido=" + super.getApellido() + " Edad="+super.getEdad()+" Genero="+super.getGenero()+" Salario=" + salario + ", Clases=" + clases + '}';
    }
    
    
    
    
}
