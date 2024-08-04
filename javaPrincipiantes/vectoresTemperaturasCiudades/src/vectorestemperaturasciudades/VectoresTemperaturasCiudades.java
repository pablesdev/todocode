
package vectorestemperaturasciudades;

import java.util.Scanner;

public class VectoresTemperaturasCiudades {

    public static void main(String[] args) {
        
        int cantCiudades = 2;
        
        String ciudades[] = new String[cantCiudades];
        double minimas[] = new double[cantCiudades];
        double maximas[] = new double[cantCiudades];
        
        double minima = 0;
        int minIndice=0;
        double maxima = 0;
        int maxIndice=0;
        
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        
        for(int i=0; i<cantCiudades; i++){
            System.out.println("Ingrese la ciudad: ");
            ciudades[i]=teclado.next();
            System.out.println("Ingrese la temperatura mínima: ");
            minimas[i]=teclado2.nextDouble();
            System.out.println("Ingrese la temperatura máxima: ");
            maximas[i]=teclado2.nextDouble();
            if(i==0){
                minima = minimas[i];
                minIndice=i;
                maxima = maximas[i];
                maxIndice=i;
            } else if(minima>minimas[i]){
                minima=minimas[i];
                minIndice=i;
            } else if(maxima<maximas[i]){
                maxima=maximas[i];
                maxIndice=i;
            }
        }
        System.out.println("------------------------");
        System.out.println("La ciudad con la temperatura mínima es "+ciudades[minIndice]);
        System.out.println("La temperatura mínima es: "+minima);
        System.out.println("La ciudad con la temperatura máxima es "+ciudades[maxIndice]);
        System.out.println("La temperatura mínima es: "+maxima);
        System.out.println("------------------------");
        
    }
    
}
