
package ejerciciocondicionales;
import java.util.Scanner;

/*
Una pequeña despensa desea calcular los sueldos de sus empleados.
Los puestos de los mismos pueden tener 3 categorias
1) repositor
2) cajero
3) supervisor

Los repositores cobran 15.890 + un bono del 10%
Los cajeros cobran 25.630,89
Los supervisores cobran 33.560,20 en bruto al cual se les descuenta 11% de jubilación.

Se necesita u nprograma que, dependiendo del tipo de empleado del que
trate, calcule y muestre en pantalla el correspondiente sueldo.
*/

public class Ejerciciocondicionales {
    
    public static void main(String[] args) {
        
        double sueldo=0;
        int categoria;
        
        System.out.println("Ingrese el tipo de categoria que desea calcular el sueldo: ");
        Scanner teclado = new Scanner (System.in);
        categoria = teclado.nextInt();
        
        if(categoria == 1){
            sueldo = 15890 * 1.10;
        }else if(categoria == 2){
            sueldo = 25630.89;
        }else if(categoria == 3){
            sueldo = 33560.20 * 0.89;
        }else{
            System.out.println("Debe ingresar un numero de categoría válido.");
        }
        
        if (categoria == 1 || categoria == 2 || categoria == 3){
            System.out.println("El total de sueldo para la categoría "+categoria+ " es igual a "+sueldo);
        }
                
        
    }
    
}
