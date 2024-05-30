
package estrepetitivasejercicios;

import java.util.Scanner;

public class EstrepetitivasEjercicios {

    public static void main(String[] args) {
        
        /*
        Realizar un programa que dado por teclado un límite numérico por teclado (por ejemplo 100) muestre en pantalla todos losn úmeros hasta el límite (empezando por 1).
        */
        
        System.out.println("Ingrese el límite hasta el que quiere contar: ");
        Scanner teclado = new Scanner (System.in);
        int limite = teclado.nextInt();
        int cont = 1;
        
        while(cont <= limite){
            System.out.println(cont);
            cont++;
        }
        
    }
    
}
