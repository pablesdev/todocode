/*
En la Ciudad de Oberá, Misiones, se realiza año a año la "Maratón del
Inmigrante" en el marco de la Fiesta naiconal del Inmigrante. El evento
cuenta con un día de inscripciones, el día anterior a la carrera, por
lo que se desconoce la cantidad exacta de inscriptos que puede llegar
a haber. Desde la Federación de Colectividades (Organismo que organiza),
manifestaron que se solicitan los siguientes datos para la inscripción de
cada participante: dni, nombre y edad.
En cuanto a las categorías posibles para una inscripción, se manejan las siguientes:

Menores A (de 6 a 10 años)
Menores B (de 11 a 17 años)
Juveniles (de 18 a 30 años)
Adultos (de 31 a 50 años)
Adultos mayores (mayores de 50 años)

Se necesita un programa que, a partir del ingreso de los datos y edad
de cada participante, se muestre por pantalla a qué categoría debe ser
inscirpto. Cabe destacar que, al finalizar el día, para dar fin a las 
inscripciones, se debe ingresar un DNI con el valor 0, y un nombre con la palabra fin.
*/
package ejerciciomaraton;

import java.util.Scanner;

public class EjercicioMaraton {

    public static void main(String[] args) {
        
        System.out.println("Ingrese el nombre: ");
        Scanner teclado = new Scanner(System.in);
        String nombre = teclado.nextLine();
        
        System.out.println("Ingrese DNI: ");
        String dni = teclado.nextLine();
        
        System.out.println("Ingrese la edad: ");
        Scanner teclado2 = new Scanner(System.in);
        int edad = teclado2.nextInt();
        
        while((!dni.equals("0")) && (!nombre.equalsIgnoreCase("fin"))){
            
            if(edad>=6 && edad<=10){
                System.out.println("Corresponde categoría Menores A");
            }else if(edad>=11 && edad<=17){
                System.out.println("Corresponde categoría Menores B");
            }else if(edad>=18 && edad<=30){
                System.out.println("Corresponde categoría Juveniles");
            }else if(edad>=31 && edad<=50){
                System.out.println("Corresponde categoría Adultos");
            }else if(edad>=51){
                System.out.println("Corresponde categoría Adultos Mayores");
            } else{
                System.out.println("La persona no cuenta con la edad para participar.");
            }
            
            System.out.println("Ingrese el nombre: ");
            nombre = teclado.nextLine();
        
            System.out.println("Ingrese DNI: ");
            dni = teclado.nextLine();
        
            System.out.println("Ingrese la edad: ");
            edad = teclado2.nextInt();
            
        }
        
    }
    
}
