/*
 * 22. Crear una clase llamada "SencillosFor" y crear en él los mismos métodos que en el ejercicio anterior, pero
 * utilizando la sentencia for en lugar de while
 */
package sencillosfor;
import java.util.Scanner;

public class SencillosFor {
    
    // 1
    public static String imparesHastaN(int usrNum) {
        String cadena = "";
        
        for (int contador = 1; contador <= usrNum; contador = contador + 2) {
            cadena = cadena + contador + " ";
        }
        
        return cadena;
    }
    
    // 2
    public static String nImpares(int usrNum) {
        int impar = 1;
        String cadena = "";
       
        for (int contador = 1; contador <= 3; contador++) {
            cadena = cadena + impar + " ";
            impar = impar + 2;
        }
        return cadena;
    }
    
    // 3
    public static String cuentaAtras(int usrNum) {
        String cadena = "";
        
        for (int contador = usrNum; contador >= 0; contador--) {
            cadena = cadena + contador + " ";
        }
        
        return cadena;
    }
    
    // 4
    public static int sumaNPrimeros(int usrNum) {
        int suma = 0;
        
        for (int contador = 1; contador <= usrNum; contador++) {
            suma = suma + contador;
        }
        
        return suma;
    }
    
    // 5
    public static String mostrarDivisioresN(int usrNum) {
        String cadena = "";
        int division;
        
        for (int contador = 1; contador <= usrNum; contador++) {
            
            division = usrNum % contador;
            if (division == 0) {
                cadena = cadena + contador + " ";
            }
            
        }
        
        return cadena;
    }
    
    // 6
    public static int sumaDivisoresN(int usrNum) {
        int resto;
        int suma = 0;

        for (int contador = 1; contador < usrNum; contador++) {
            resto = usrNum % contador;
            if (resto == 0) {
                suma = suma + contador;
            }
        }

        return suma;
    }
    
    public static void main(String[] args) {
        
        System.out.println("Act 1 = " + imparesHastaN(10));
        System.out.println("Act 2 = " + nImpares(10)); 
        System.out.println("Act 3 = " + cuentaAtras(10));
        System.out.println("Act 4 = " + sumaNPrimeros(10));
        System.out.println("Act 5 = " + mostrarDivisioresN(10));
        System.out.println("Act 6 = " + sumaDivisoresN(10));
    }
    
}
