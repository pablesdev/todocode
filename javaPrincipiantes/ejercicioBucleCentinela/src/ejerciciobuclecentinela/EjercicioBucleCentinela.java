
package ejerciciobuclecentinela;

import java.util.Scanner;

/*
Realizar un programa que muestre en pantalla palabras que sean ingresadas
por teclado hasta que se ingrese la palabra "salir".
*/
public class EjercicioBucleCentinela {

    public static void main(String[] args) {
        
        System.out.println("Ingrese una palabra: ");
        Scanner teclado = new Scanner (System.in);
        String palabra = teclado.next();
        
        while(!palabra.equals("salir")){
            System.out.println("La palabra es "+palabra);
            System.out.println("Ingrese otra palabra: ");
            palabra = teclado.next();
        }
            
    }
    
}
