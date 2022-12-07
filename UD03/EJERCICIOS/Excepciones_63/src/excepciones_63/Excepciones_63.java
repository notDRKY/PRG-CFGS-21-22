/*
 * 63. Escribe programas que se indican a continuación. Ejecuta cada programa haciendo que la entrada del
 * usuario provoque una excepción. Anota el nombre de la excepción que se produce y cuál es la jerarquía
 * de objetos de la que desciende:
 * 
 *      1. Programa que solicita dos números enteros (a y b) y muestra el resultado de su división (a/b).
 *          1. El usuario introduce 0 como valor de b.
 *          2. El usuario introduce letras cuando el programa espera números enteros.
 *          3. El usuario introduce un número real cuando el programa espera un entero.
 * 
 *      2. Programa que solicita al usuario su nombre y una posición dentro del nombre. Se muestra al usuario
 *      la letra del nombre cuya posición se ha indicado. Por ejemplo:
 *                                      1 | Introduce nombre: Javi
 *                                      2 | Introduce posición: 2
 *                                      3 | En la posición 2 de Javi está la letra a
 *          1. El usuario introduce una posición inválida.
 * 
 */
package excepciones_63;

import java.util.Scanner;

public class Excepciones_63 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int usrNum = 0;
        
        System.out.print("(By Carlos) Que programa desea iniciar [1-2?]: ");
        usrNum = teclado.nextInt();
        
        if (usrNum == 1) { // --------------------PRIMER PROGRAMA--------------------
            
            int a = 0;
            int b = 0;
            
            System.out.print("PRIMER NÚMERO: ");
            a = teclado.nextInt();
            System.out.print("SEGUNDO NÚMERO: ");
            b = teclado.nextInt();
            
            System.out.println("\t" + a + " ENTRE " + b + " = " + (a / b));
            
            /*
                1. El usuario introduce 0 como valor de b.
            
                    Exception in thread "main" java.lang.ArithmeticException: / by zero
                        at excepciones_63.Excepciones_63.main(Excepciones_63.java:42)
                    
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
                        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
                        at excepciones_63.Excepciones_63.main(Excepciones_63.java:38)
                    
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
                        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
                        at excepciones_63.Excepciones_63.main(Excepciones_63.java:38)

                            java.lang.Object
                                java.lang.Throwable
                                    java.lang.Exception
                                        java.lang.RuntimeException
                                            java.util.NoSuchElementException
                                                java.util.InputMismatchException <- Nuestra excepción.

                            (https://docs.oracle.com/javase/7/docs/api/java/util/InputMismatchException.html)
                    
            */
            
        } else if (usrNum == 2) { // --------------------SEGUNDO PROGRAMA--------------------
            
            String usrName = "";
            int position = 0;
            teclado.nextLine();
            
            System.out.print("Introduce nombre: ");
            usrName = teclado.nextLine();
            System.out.print("Introduce posición: ");
            position = teclado.nextInt();
            System.out.println("En la posición " + position + " de " + usrName
                    + " está la letra " + usrName.charAt(position - 1) + ".");
            /*
            1. El usuario introduce una posición inválida.
            
                Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -91
                    at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
                    at java.base/java.lang.String.charAt(String.java:711)
                    at excepciones_63.Excepciones_63.main(Excepciones_63.java:96)

                CLASS IndexOutOfBoundsException
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
