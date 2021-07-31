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
public class clasePrincipal {
    
    public static void main(String[] args)
    {
        Empleado employeer1 = new Empleado();
        Empleado employeer2 = new Empleado("Miguel", 5000, 40);
        
        employeer1.setNombre("Ana");
        //employeer1.pi = 5;
        
        
        System.out.println("Los Nombres son: "+employeer1.getNombre()+" y "+employeer2.getNombre());
    }
    
}
