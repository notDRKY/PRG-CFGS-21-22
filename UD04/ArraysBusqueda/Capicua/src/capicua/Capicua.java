/*
 * 5. (Capicúa) Escribir un método para determinar si un array de palabras ( String ) es capicúa,
 * esto es, si la primera y última palabra del array son la misma, la segunda y la penúltima
 * palabras también lo son, y así sucesivamente. Escribir el método main para probar el
 * método anterior.
 */
package capicua;

public class Capicua {
    // Mejorable
    public static boolean esCapicua(String[] v) {
        boolean capicua = true;
        // Se recorre el bucle hasta a la mitad (antes de la mitad se debería saber si es capicua).
        for (int i = 0; i <= (v.length) / 2; i++) {
            // If robado, se lo he robado a Carlos, pero no pasa nada.
            if (!v[i].equalsIgnoreCase(v[(v.length - 1) - i])) { // Se comprueban los string del array con equals y se recorre el array solo con un bucle.
                capicua = false;
            }
        }
        return capicua;
    }

    public static void imprimeArray(String[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        String[] palabras = {"java", "python", "go", "go", "python", "java"};
        String[] palabras2 = {"francesc", "carlos", "vicent", "francesc"};
        String[] palabras3 = {"A", "B", "B", "A", "E"};
        String[] palabras4 = {"uno", "dos", "tres", "dos", "uno"};

        imprimeArray(palabras);
        imprimeArray(palabras2);
        imprimeArray(palabras3);
        imprimeArray(palabras4);
        System.out.println(esCapicua(palabras));
        System.out.println(esCapicua(palabras2));
        System.out.println(esCapicua(palabras3));
        System.out.println(esCapicua(palabras4));
    }

}
