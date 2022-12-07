/*
7. (Raiz) Se desea calcular la raíz cuadrada real de un número real cualquiera pedido inicialmente al usuario.
 * Como dicha operación no está definida para los números negativos es necesario tratar, de algún modo,
 * dicho posible error sin que el programa detenga su ejecución.
 */
package raiz;
import java.util.Scanner;
    
public class Raiz {
    
    public static String raizN(int usrNum) {
        String resultado = "";
        
        if (usrNum < 0){
            resultado = "No se puede realizar la raiz cuadrada de"
                    + " un número negativo";
        } else { 
            resultado = "La raiz cuadrada de " + usrNum + " es "
                    + Math.sqrt(usrNum) + "\n";
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int usrNum;
        
        System.out.print("Introduzca el numero del que desee saber la"
                + " raiz cuadrada: ");
        usrNum = teclado.nextInt();
        System.out.print("[RAIZ CUADRADA]\n" + raizN(usrNum));
    }
    
}
