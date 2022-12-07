/*
 *   64. Repite el ejercicio anterior utilizando métodos y llamándolos desde el método main :
 *       1. Un método dividir que devuelva el cociente de dos números que recibe como parámetro
 *       2. Un método letraNombre que, dados un String nombre y un entero pos , devuelva el carácter del
 *       nombre que ocupa la posición indicada.
 *   Ejecuta los programas provocando errores (como en el ejercicio anterior) y observa los mensajes que se
 *   generan.
 */
package excepciones_64;

import java.util.Scanner;

public class Excepciones_64 {
    
    public static int divisionAb(int a, int b) {
        return (a / b);
    }
    
    public static char caracterNombre(String nombre, int posicion) {
        return nombre.charAt(posicion - 1);
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int usrNum;
        
        System.out.print("Que programa metodo quieres iniciar "
                + "[1]divisionAb, [2]caracterNombre: ");
        usrNum = teclado.nextInt();
        
        if (usrNum == 1) {
            int a = 0;
            int b = 0;
            
            System.out.print("INTRODUCE EL PRIMER NÚMERO (a) : ");
            a = teclado.nextInt();
            System.out.print("INTRODUCE EL SEGUNDO NÚMERO (b) : ");
            b = teclado.nextInt();
            
            System.out.println("La división entre " + a + " / " + b 
                    + " = " + divisionAb(a, b));
            
            /*
            1. El usuario introduce 0 como valor de b.
            Exception in thread "main" java.lang.ArithmeticException: / by zero
                at excepciones_64.Excepciones_64.divisionAb(Excepciones_64.java:16) <- Sale error en el método y no sólo en el main.
                at excepciones_64.Excepciones_64.main(Excepciones_64.java:41)
            
                java.lang.Object
                    java.lang.Throwable
                        java.lang.Exception
                            java.lang.RuntimeException
                                java.lang.ArithmeticException <- Nuestra excepción.
            
                (https://docs.oracle.com/javase/7/docs/api/java/lang/ArithmeticException.html)
            
            2. El usuario introduce letras cuando el programa espera números enteros.
            Exception in thread "main" java.util.InputMismatchException
                at java.base/java.util.Scanner.throwFor(Scanner.java:939)
                at java.base/java.util.Scanner.next(Scanner.java:1594)
                at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
                at java.base/java.util.Scanner.nextInt(Scanner.java:2212) <- Error en el obketo scanner y en el método main.
                at excepciones_64.Excepciones_64.main(Excepciones_64.java:38)
            
                java.lang.Object
                    java.lang.Throwable
                        java.lang.Exception
                            java.lang.RuntimeException
                                java.util.NoSuchElementException
                                    java.util.InputMismatchException <- Nuestra excepción.
                    
                (https://docs.oracle.com/javase/7/docs/api/java/util/InputMismatchException.html)
            
            3. El usuario introduce un número real cuando el programa espera un entero.
            Exception in thread "main" java.util.InputMismatchException
                at java.base/java.util.Scanner.throwFor(Scanner.java:939)
                at java.base/java.util.Scanner.next(Scanner.java:1594)
                at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
                at java.base/java.util.Scanner.nextInt(Scanner.java:2212) <- Error en el obketo scanner y en el método main.
                at excepciones_64.Excepciones_64.main(Excepciones_64.java:38)
            
            java.lang.Object
                java.lang.Throwable
                    java.lang.Exception
                        java.lang.RuntimeException
                            java.util.NoSuchElementException
                                java.util.InputMismatchException <- Nuestra excepción.

            (https://docs.oracle.com/javase/7/docs/api/java/util/InputMismatchException.html)
            
            */
            
        } else if (usrNum > 1) {
            String usrName = "";
            int position = 0;
            
            teclado.nextLine();
            
            System.out.print("INTRODUCE UN NOMBRE: ");
            usrName = teclado.nextLine();
            System.out.print("INTRODUCE UNA POSICIÓN: ");
            position = teclado.nextInt();
            
            System.out.println("EN LA POSICIÓN " + position + " DEL NOMBRE " 
                    + usrName + " SE ENCUENTRA EL CARÁCTER: [" 
                    + caracterNombre(usrName, position) + "]");
            
            /*
            1. El usuario introduce una posición inválida.
                ERROR EXCEPCIONES 64
                Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -91
                    at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
                    at java.base/java.lang.String.charAt(String.java:711)
                    at excepciones_64.Excepciones_64.caracterNombre(Excepciones_64.java:20) <- Sale error en el método y no sólo en el main.
                    at excepciones_64.Excepciones_64.main(Excepciones_64.java:67)
            
                java.lang.Object
                    java.lang.Throwable
                        java.lang.Exception
                            java.lang.RuntimeException
                                java.lang.IndexOutOfBoundsException <- Nuestra excepción.

                (https://docs.oracle.com/javase/7/docs/api/java/lang/IndexOutOfBoundsException.html)
            */
        }
    }
    
}
