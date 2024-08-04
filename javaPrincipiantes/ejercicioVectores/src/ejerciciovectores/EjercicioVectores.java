/*
Realizar un programa que permita cargar 15 números en un vector.Una vez cargados,
se necesita que el programa cuente e informe por pantalla cuántas veces se cargó
el número 3.
*/
package ejerciciovectores;

import java.util.Scanner;

public class EjercicioVectores {

    public static void main(String[] args) {
        
        int vector[] = new int [15];
        int contador=0;
        
        Scanner teclado = new Scanner (System.in);
        for(int i=0; i<vector.length; i++){
            System.out.println("Ingrese el valor del vector en la posición "+i+": ");
            vector[i]=teclado.nextInt();
            if(vector[i]==3){
                contador++;
            }
        }
        
        System.out.println("Se ingresaron "+contador+" números 3.");
        
    }
    
}
