
package numeroslimite;

import java.util.Scanner;

/*
Realizar un programa que dado por teclado un límite numérico
(por ejemplo 100) muestre en pantalla todos los números hasta ese límite
(empezando por 1).
*/
public class Numeroslimite {

    public static void main(String[] args) {
        
        System.out.println("Ingrese el límite hasta donde quiere contar: ");
        
        Scanner teclado = new Scanner (System.in);
        int limite = teclado.nextInt();
       
        int cont = 1;
        
        while(cont<=limite){
            System.out.println(cont);
            cont++;
        }
        
    }
    
}
