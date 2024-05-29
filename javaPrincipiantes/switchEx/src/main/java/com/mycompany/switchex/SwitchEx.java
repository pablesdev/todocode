/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchex;

/**
 *
 * @author pables
 */
public class SwitchEx {

    public static void main(String[] args) {
        int dia = 5;
        String nombreDia;
        
        switch(dia){
            
            case 1: nombreDia = "Lunes";
            break;
            case 2: nombreDia = "Martes";
            break;
            case 3: nombreDia = "Miercoles";
            break;
            case 4: nombreDia = "Jueves";
            break;
            case 5: nombreDia = "Viernes";
            break;
            case 6: nombreDia = "Sabado";
            break;
            case 7: nombreDia = "Domingo";
            break;
            default: nombreDia = "Número de día inválido";
            break;
        
        }
        
        System.out.println("El día de la semana seleccionado es: "+ nombreDia);
    }
}
