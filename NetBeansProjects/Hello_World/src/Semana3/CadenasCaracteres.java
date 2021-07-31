/*
CADENAS EN JAVA:

En java las cadenas de caracteres son Objetos tipo String.  por ende cuando se crea una variable tipo String, se crea un objeto el cual contiene métodos que
me permiten realizar operaciones con la cadena:
 */
package Semana3;

/**
 *
 * @author miguelangelperezvillamizar
 */
public class CadenasCaracteres {
    public static void main(String[] args)
    {
        String cadena = "Bienvenidos al Ciclo 4 de Misión TIC 2022!";
        
        //cadena.
        
        System.out.println(cadena.charAt(15));
        System.out.println(cadena.length());
        System.out.println(cadena.substring(15));
        System.out.println(cadena.substring(15, 20));
        System.out.println(cadena.indexOf("TIC"));
        
        int pos = cadena.indexOf("Ciclo");
        pos += 6;
        System.out.println("Estamos en el Nivel "+cadena.charAt(pos));
    }
}
