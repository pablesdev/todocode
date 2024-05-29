

package com.mycompany.operadorternario;
import  java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {
        
        double promedio;
        String condicionFinal;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el promedio general del alumno en TodoCode");
        promedio = teclado.nextDouble();
        
        /* OPERADOR TERNARIO:
        -primero se pone la condición que se debe cumplir.
        - Luego un ?
        - Seguido se pone la condición verdadera, luego : y la condición falsa
        */
        condicionFinal = promedio >=6 ? "Aprobado" : "Desaprobado";
        System.out.println("La condicion final del alumno es: "+condicionFinal);
    }
}
