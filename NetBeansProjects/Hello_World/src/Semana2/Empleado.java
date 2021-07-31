/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana2;

/**
 *
 * @author miguelangelperezvillamizar
 */
public class Empleado {
    
    private static String Nombre;
    private double salario;
    private int edad;
    
    public final double pi = 3.1416;

    public Empleado() {
    }

    public Empleado(String Nombre, double salario, int edad) {
        this.Nombre = Nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    // Métodos Manuales
    
    
    
    
    
}
