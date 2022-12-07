/*
 * 21. Crear una clase llamada SencillosWhile y crear en él métodos que realicen las siguientes tareas.
 *      1. (imparesHastaN) Dado un nº entero n introducido por el usuario, mostrar los números impares que
 *      hay entre 1 y n . Por ejemplo, si n es 8 mostrará 1 3 5 7
 *      2. (nImpares) Dado un nº entero n introducido por el usuario, mostrar los n primeros números
 *      impares. Por ejemplo, si n es 3 mostrará 1 3 5 (3 primeros impares)
 *      3. (cuentaAtras) Dado un entero n introducido por el usuario, mostrar una cuenta atrás partiendo de
 *      n : n , n-1 , …. 5, 4, 3, 2, 1, 0
 *      4. (sumaNPrimeros) Dado un entero n introducido por el usuario, mostrar la suma de los números
 *      entre 1 y n .
 *      5. (MostrarDivisoresN) Dado un entero n introducido por el usuario, mostrar todos sus divisores,
 *      incluidos el 1 y el mismo n . Por ejemplo, si n es 12 mostraría 1, 2, 3, 4, 6 y 12
 *      6. (sumaDivisoresN) Dado un entero n introducido por el usuario, mostrar la suma de todos sus
 *      divisores, sin incluir al propio n . Por ejemplo, si n es 12 sumará 1, 2, 3, 4 y 6 = 16
 */
package sencilloswhile;
import java.util.Scanner;
    
public class SencillosWhile {
    
    // 1
    public static String imparesHastaN(int usrNum) {
        int contador = 1;
        String cadena = "";
        
        while (contador <= usrNum) {
            cadena = cadena + contador + " ";
            contador = contador + 2;
        }
        
        return cadena;
    }
    
    // 2
    public static String nImpares(int usrNum) {
        int contador = 1, impar = 1;
        String cadena = "";
        
        while (contador <= 3) {
            cadena = cadena + impar + " ";
            impar = impar + 2;
            contador++;
        }
        
        return cadena;
    }
    
    // 3
    public static String cuentaAtras(int usrNum) {
        int contador = usrNum;
        String cadena = "";
        
        while (contador >= 0) {
            cadena = cadena + contador + " ";
            contador--;
        }
        
        return cadena;
    }
    
    // 4
    public static int sumaNPrimeros(int usrNum) {
        int contador = 1, suma = 0;
        
        while (contador <= usrNum) {
            suma = suma + contador;
            contador++;
        }
        
        return suma;
    }
    
    // 5
    public static String mostrarDivisioresN(int usrNum) {
        String cadena = "";
        int contador = 1, division;
        
        while (contador <= usrNum) {
            division = usrNum % contador;
            
            if (division == 0) {
                cadena = cadena + contador + " ";
            }
            
            contador++;
        }
        
        return cadena;
    }
    
    // 6
    public static int sumaDivisoresN(int usrNum) {
        int contador = 1;
        int resto;
        int suma = 0;
        
        while (contador < usrNum) {
            resto = usrNum % contador;
            if (resto == 0) {
                suma = suma + contador;
            }
            contador++;
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
