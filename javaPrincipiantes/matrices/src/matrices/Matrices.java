
package matrices;

import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        
        //Declaración
        int matriz [] [] = new int [3] [3];
        
        Scanner teclado = new Scanner (System.in);
        //Asignación (por teclado)
        for(int f=0; f<3; f++){
            for(int c=0; c<3; c++){
                System.out.println("Ingrese el valor para la posición f: "+f+" c: "+c);
                matriz [f][c] = teclado.nextInt();
            }
        }
        
        //Recorrido
        for(int f=0; f<3; f++){
            for(int c=0; c<3; c++){
                System.out.println("El valor  de la posición f: "+f+" c: "+c);
                System.out.println("es de: "+matriz[f][c]);
            }
        }
        
    }
    
}
