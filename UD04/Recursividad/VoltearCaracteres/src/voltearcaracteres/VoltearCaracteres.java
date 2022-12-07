/*
 * 2. Implemente, tanto de forma recursiva como de forma iterativa, una función que le dé la
 * vuelta a una cadena de caracteres.
 * 
 * NOTA: Obviamente, si la cadena es un palíndromo, la cadena y su inversa
 * coincidirán
 */
package voltearcaracteres;

public class VoltearCaracteres {
    
    public static String iterativoVuelta(String cadena){
        String vuelta = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            vuelta += cadena.charAt(i);
        }
        return vuelta;
    }
    
    public static String recursivoVuelta(String cadena){
        String vuelta = "";
        if ((cadena.length() == 0) || (cadena.length() == 1)) {
            // CASO BASE
            vuelta = cadena;
        } else {
            // CASO RECURSIVO
            vuelta =cadena.charAt(cadena.length() - 1) + recursivoVuelta(cadena.substring(1, cadena.length() - 1)) + cadena.charAt(0);
        }
        return vuelta;
    }
    
    public static void main(String[] args) {
        String nombre = "Francesc";
        String prueba1 = "Ana";
        String prueba2 = "Calvo";
        
        System.out.println("MÉTODO ITERATIVO");
        System.out.println(iterativoVuelta(nombre));
        System.out.println(iterativoVuelta(prueba1));
        System.out.println(iterativoVuelta(prueba2));
        System.out.println("");
        System.out.println("MÉTODO RECURSIVO");
        System.out.println(recursivoVuelta(nombre));
        System.out.println(recursivoVuelta(prueba1));
        System.out.println(recursivoVuelta(prueba2));
    }
}
