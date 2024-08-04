/*
Llevar a cabo un programa que incluya un vector que almacene los nombres: Alejandra,
Leonardo, Rosa, Guillemo, Gabriel, Daniel, Luisa y Ludmila. Realizar un recorrido
del vector para cargar los datos y otro recorrido para mostrar los mismos por pantalla.
*/
package ejerciciovectorstring;

public class EjercicioVectorString {

    public static void main(String[] args) {
        
        String nombres [] = new String [8];
        
        nombres[0] = "Alejandra";
        nombres[1] = "Leonardo";
        nombres[2] = "Rosa";
        nombres[3] = "Guillermo";
        nombres[4] = "Gabriel";
        nombres[5] = "Daniel";
        nombres[6] = "Luisa";
        nombres[7] = "Ludmila";
        
        for(int i=0; i<nombres.length; i++){
            System.out.println("El nombre en la posición "+i+" es: "+nombres[i]);
        }
        
    }
    
}
