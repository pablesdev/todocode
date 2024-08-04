
//   *
//  ***
// *****
//*******
//  |||

package arbolitoascii;

public class Arbolitoascii {

    public static void main(String[] args) {
        
        //declarar la altura
        int altura = 4;
        
        //bucle para recorrer todas las filas (altura)
        for (int fila=0; fila<altura; fila++){
            
            //bucle para los espacios
            for(int espacio=0; espacio<(altura-fila-1);espacio++){
                System.out.print(" ");
            }
            
            //bucle para los asteriscos
            for(int asterisco=0; asterisco<(fila*2)+1; asterisco++){
                System.out.print("*");
            }
            
            //OJO, ver que anteriormente usé una impresión pero no de línea
            
            System.out.println("");
            
        }
        
        //tronco
        int largoTronco=1;
        
        for(int base=0; base<largoTronco; base++){
            //espacios tronco
            for(int espacio=0; espacio<(altura-2);espacio++){
                System.out.print(" ");
            }
            
            //barritas tronco
            for(int barritas=0; barritas<3; barritas++){
                System.out.print("|");
            }
            System.out.println("");
            
        }
        
    }
    
}
