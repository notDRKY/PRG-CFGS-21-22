/* 11. Modificar el siguiente programa para que compile y funcione: */

public class Actividad11 {
    public static void main(String[] args) { 
        int numero = 2, cuad; //Variable cuad no esta inicialitzada.
        cuad = numero * numero; //Java detecta l'accent com a altre nom de variable, el mateix per a NUMERO. 
        System.out.println("EL CUADRADO DE " + numero + " ES: " + cuad);
    }
}