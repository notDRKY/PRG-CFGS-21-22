/* 10. Modificar el siguiente programa para que compile y funcione: */

public class Actividad10 {
    public static void main(String[] args) {
        int n1 = 50, n2 = 30;   // <-- Falta un ";"
        int suma = 0; // <-- el boolean equivocado, declarar variable con int y funciona
        suma = n1 + n2; 
        System.out.println("LA SUMA ES: " + suma);
    }
}
