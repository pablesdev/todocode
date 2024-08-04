/* 
En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundaria.
Cada fila corresponde a las notas y al promedio de cada alumno. Se necesita de un
programa que permita a un profesor cargar, en las 3 posiciones (columnas) de cada fila,
las notas del alumno y que en la última columna se calculen los promedios. Una vez
realizados los cálculos, se desea mostrar las 3 notas de cada alumno y el promedio
correspondiente recorriendo la matriz.
*/
package ejerciciomatrices;

import java.util.Scanner;

public class EjercicioMatrices {

    public static void main(String[] args) {
        
        int alumnos = 1;
        int notas = 4;
        double calificaciones[][] = new double [alumnos][notas];
        
        Scanner teclado = new Scanner(System.in);
        
        for(int a=0; a<alumnos; a++){
            for(int n=0; n<notas-1; n++){
                System.out.println("Ingrese la nota "+(n+1)+" del alumno "+(a+1)+":");
                calificaciones[a][n] = teclado.nextDouble();
                calificaciones[a][notas-1]=calificaciones[a][notas-1]+calificaciones[a][n];
            }
            calificaciones[a][notas-1]=calificaciones[a][notas-1]/(notas-1);
        }
        
        for(int a=0; a<alumnos; a++){
            System.out.println("Las notas del alumno "+(a+1)+" son:");
            for(int n=0; n<notas-1; n++){
                System.out.println("Nota "+(n+1)+" es: "+calificaciones[a][n]);
            }
            System.out.println("El promedio de las notas es: "+calificaciones[a][notas-1]);
            System.out.println("----------------------");
        }
        
    }
    
}
