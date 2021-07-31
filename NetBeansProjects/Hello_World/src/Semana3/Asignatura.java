/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana3;

import java.util.ArrayList;

/**
 *
 * @author miguelangelperezvillamizar
 */
public class Asignatura {

    private ArrayList<estudiante> est = new ArrayList<>();

    public Asignatura(ArrayList<estudiante> est) {
        this.est = new ArrayList<estudiante>();
    }

    public Asignatura() {
    }

    // Método para agregar objetos tipo estudiante al ArrayList
    public void registrarEstudiantes(estudiante e) {
        est.add(e);
    }

    //Método para obtener el total de estudiantes registrados
    public int getTotalEstudiantes() {
        return est.size();
    }

    //Método que me muestra el nombre de todos los estudiantes
    public void datosEstudiantes() {

        for (estudiante e : est) {
            e.calcularDefinitiva();
            System.out.println("Estudiante " + e.getNombre() + " obtuvo una definitiva de " + e.getDefinitiva() + " y su estado es: " + e.mensaje());
        }

        //System.out.println(est.get(0).getNombre());
    }

}
