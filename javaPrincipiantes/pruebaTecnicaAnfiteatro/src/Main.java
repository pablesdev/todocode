/*
1era Parte
Suponer un sustema de reserva de asientos para un afiteatro. El teatro
cuenta con 10 filas de 10 asientos cada una. Se necesita desarrollar un
sistema (sin uso de bases de datos, únicamente manejo de datos de forma
lógica) que permita llevar a cabo lo siguiente:
1) Cargar el "mapa" de filas y asientos. Indicando con una X los
asientos ocupados y con una "L" los asientos libres. Al iniciar el
programa, todos los asientos deben estar libres.
2) Manejar la reserva de asientos contemplando que un asiento SOLO
PUEDE SER RESERVADO si se encuentra en estado "L", en caso de que
esté en estado "X", se deberá permitir al comprador elegir otro asiento.
Si se encuentra en estado "L" deberá pasar automáticamente al estado "X".
3) Para finalizar el programa se deberá ingresar un valor en
particular. Contemplar quen o existe una cantidad exacta de veces que
el programa se pueda ejecutar.
4) Contemplar que SOLO EXISTEN 10 FILAS Y 10 ASIENTOS. No se pueden
vender asientos fuera de esas numeraciones. No se permite "sobreventa".
Consideraciones: No es necesaria implementación ni de IGU ni de BD. Se
evaluará 100% el manejo dlógico del desarrollo de la aplicación.
Extra: En caso de que un cliente solicite visualizar cuáles son los
asientos libres, el sistema debe permitir mostrar de forma gráfica el
mapa de asientos. NO UTILIZAR IGU, para este caso. Utilizar
ÚNICAMENTE lógica y la salida pos consola.
*/

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char asientos [][] = new char [10][10];
        boolean bandera = false;
        int fila=0, asiento=0;
        String respuesta;
        String verMapa;
        Scanner teclado = new Scanner(System.in);

        //cargamos la matriz de asientos
        for(int f=0;f<10;f++){
            for(int c=0;c<10;c++){
                asientos[f][c]='L';
            }
        }
        //empieza el programa con bienvenida
        System.out.println("-------------BIENVENIDO AL SISTEMA DE RESERVAS-------------");
        while(bandera!=true){
            //se consulta si quiere ver el mapa de asientos disponibles
            System.out.println("Quiere ver los asientos disponibles? S: Si. Cualquier otra letra: No. ");
            verMapa = teclado.next();

            //visualización del mapa
            if(verMapa.equalsIgnoreCase("S")){
                for(int f=0;f<10;f++){
                    if(f==0){
                        for(int i=0; i<10; i++){
                            if(i==0){
                                System.out.print("   "+i+" ");
                            } else{
                                System.out.print(" "+i+" ");
                            }
                        }
                        System.out.println();
                    }

                    System.out.print(f+" ");
                    for(int c=0;c<10;c++){
                        System.out.print("["+asientos[f][c]+"]");
                    }
                    System.out.println();
                }
            }

            //reserva
            boolean estaOk=false;
            while(estaOk!=true){
                System.out.println("\nIngrese fila y asiento a reservar: ");
                System.out.print("Fila(entre 0 y 9): ");
                fila = teclado.nextInt();
                System.out.print("Asiento(entre 0 y 9): ");
                asiento = teclado.nextInt();

                if(fila<=9 && fila>=0){
                    if(asiento<=9 && asiento>=0){
                        estaOk=true;
                    } else{
                        System.out.println("El número de asiento no es válido.");
                    }
                } else{
                    System.out.println("El número de fila no es válido.");
                }
            }


            if (asientos[fila][asiento] == 'L') {
                asientos[fila][asiento]='X';
                System.out.println("El asiento fue reservado con éxito.");
            } else{
                System.out.println("El asiento está ocupado. Por favor elija otro.");
            }
            System.out.println("Desea Finaliar la reserva? S: Si. Cualquier otra letra: No.");
            respuesta = teclado.next();

            if(respuesta.equalsIgnoreCase("S")){
                bandera=true;
            }
        }
    }
}
