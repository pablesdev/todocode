
package vectores;

import java.util.Scanner;

public class Vectores {

    public static void main(String[] args) {
        
        
        //Declaración
        int vector [] = new int [4];
        
        //Asignación (por teclado)
        Scanner teclado = new Scanner (System.in);
        for(int i=0; i<vector.length;i++){
            System.out.println("Ingrese el valor para el índice "+ i);
            vector[i] = teclado.nextInt();
        }
        
        //Recorrido
        for(int i=0; i<vector.length;i++){
            System.out.println("Estoy en el índice: "+ i);
            System.out.println("Tengo guardado un "+ vector[i]);
            System.out.println("-------------------------------");
        }
        
    }
    
}
