
package matrices;

import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        
        //declaración
        int matriz [][] = new int [3][3];
        
        //asignación manual
        Scanner teclado = new Scanner (System.in);
        for(int f=0; f<3;f++){
            for(int c=0; c<3; c++){
                System.out.println("Ingrese el valor de la posición fila "+f+" columna "+c+": ");
                matriz[f][c] = teclado.nextInt();
            }
        }
        
        //recorrido e impresión
        for(int f=0; f<3;f++){
            for(int c=0; c<3; c++){
                System.out.println("El número en la fila "+f+" columna "+c+" es: "+matriz[f][c]);
            }
        }
        
    }
    
}
