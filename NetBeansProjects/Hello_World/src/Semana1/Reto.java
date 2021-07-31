/*
Hacer un Algoritmo en Java (Utilizar esta clase) que almacene las calificaciones de los periodos Academicos de las asignaturas de 
un estudiante del colegio HighSchool.  Las asignaturas son:

1. Matemáticas
2. Ciencias
3. Inglés
4. Informática
5. Deportes

La escala de calificación es en porcentaje 0 a 100.

El programa permite realizar 4 opciones al usuario a través de un menú:

1. Cargar calificaciones Estudiante.
2. Imprimir Boletin (Todas las Asignaturas)
3. Imprimir Estado  Asignatura (Ver calificaciones de la Asignatura seleccionada)
4. Salir

 */
package Semana1;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author miguelangelperezvillamizar
 */
public class Reto {

    public static Scanner leer = new Scanner(System.in);
    public static int[][] estudiante = new int[5][4];

    public static Map<Integer, String> asignaturas = new TreeMap<Integer, String>();

    public static void main(String[] args) {
        // Declaración de variables
        int op = 1;

        asignaturas.put(0, "Matemáticas");
        asignaturas.put(1, "Ciencias");

        while (op != 4) {
            op = menu();

            switch (op) {
                case 1: {
                    cargarCal();
                    break;
                }
                case 2: {
                    boletin();
                }

            }
        }
    }

    public static int menu() {
        int opcion;
        System.out.println("*************************************");
        System.out.println("                MENU");
        System.out.println("*************************************");
        System.out.println(" 1. Cargar Calificación");
        System.out.println(" 2. Imprimir Boletín");

        System.out.println("Seleccione una opción: ");
        opcion = leer.nextInt();
        return opcion;

    }

    public static void cargarCal() {

        int asigSel = 0, periodo = 0, calificacion = 0;

        System.out.print("\n\n");

        System.out.println("*********************************");
        System.out.println("*      COLEGIO HIGHSCHOOL      *");
        System.out.println("*     Asignaturas  Grado 3     *");
        System.out.println("*********************************");

        Iterator<Integer> i = asignaturas.keySet().iterator(); // Imprimo las asignaturas

        while (i.hasNext()) { // Continuación impresión de asignaturas
            Integer clave = i.next();
            System.out.println(" - " + clave + ". " + asignaturas.get(clave));
        }
        System.out.println("*********************************");
        System.out.println("Seleccione una asignatura: ");
        asigSel = leer.nextInt();
        System.out.println("Indique el periodo Acádemico (1-4): ");
        periodo = leer.nextInt();
        periodo--;
        System.out.println("Calificación del estudiante: ");
        calificacion = leer.nextInt();
        estudiante[asigSel][periodo] = calificacion;

    }

    public static void boletin() {
        int i, j, periodo;
        for (i = 0; i < 5; i++) {
            System.out.println("\n\n" + asignaturas.get(i));
            for (j = 0; j < 4; j++) {
                periodo = j + 1;
                System.out.println("Periodo " + periodo + ": ");
            }
        }
    }

    // Definir Función Estado Asignatura
    // SE PUEDE HACER LO MISMO QUE CARGAR CALIFICACIÓN  (EL USUARIO DEBE ESCOGER LA ASIGNATURA Y SE  IMPRIME LAS NOTAS CARGADAS PARA
    // ESA ASIGNATURA
    
    //for(i)
    //System.out.println(estudiante[asigSel][i]);
    
    
}