/*
 * 2. (Tocayos) Disponemos de los nombres de dos grupos de personas (dos arrays de String ).
 * Dentro de cada grupo todas las personas tienen nombres distintos, pero queremos saber
 * cuántas personas del primer grupo tienen algún tocayo en el segundo grupo, es decir, el
 * mismo nombre que alguna persona del segundo grupo. Escribir un programa que resuelva
 * el problema (inicializa los dos arrays con los valores que quieras y diseña los métodos que
 * consideres necesarios).
 * 
 * Por ejemplo, si los nombres son {"miguel","josé","ana","maría"} y {"ana", "luján", "juan",
 * "josé", "pepa", "ángela", "sofía", "andrés", "bartolo"} , el programa mostraría:
 * 
 *      1| josé tiene tocayo en el segundo grupo.
 *      2| ana tiene tocayo en el segundo grupo.
 *      3| TOTAL: 2 personas del primer grupo tienen tocayo.
 * 
 * Optimiza el algoritmo para que no tenga en cuenta si se escribe el nombre en mayúsculas,
 * minúsculas o cualquier combinación.
 */
package tocayos;

public class Tocayos {

    public static void tieneRepe(String[] a, String[] b) { // a primer grupo, b segundo grupo, no se especifica nada más.
        // Realizo un bucle anidado para comparar cada caso con todos los casos del segundo array.
        String nombre = ""; // Inicializo la variable fuera, para que no se esté reseteando en cada pasada.
        int totalTocayos = 0;
        boolean repetido; // Declaro la variable repetido para saber si un nombre está repetido o no.
        
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i].toLowerCase();
            nombre = a[i]; // Se guarda el nombre para compararlo con los del segundo array.
            repetido = false; // Reinicio la variable para que no se repitan los nombres que ya están.
            for (int j = 0; j < b.length; j++) {
                b[j] = b[j].toLowerCase();
                if (nombre.equals(b[j]) && (repetido == false)) { // Si es true hace la condición.
                    System.out.println(nombre + " tiene tocayo en el segundo grupo.");
                    repetido = true; 
                    totalTocayos++; // Se suma para saber el total
                }
            }
        }
        // if innecesario para que quede bonito el método.
        if (totalTocayos != 0) {
            System.out.println("TOTAL: " + totalTocayos + " personas del primer grupo tienen tocayo.");
        } else {
            System.out.println("Sin tocayos :c ");
        }
    }
    
    public static void imprimeArray(String[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        String[] a = {"miguel", "josé", "ana", "maría"};
        String[] b = {"ana", "luján", "juan", "josé", "josé", "josé", "sofía", "andrés", "bartolo"};
        
        imprimeArray(a);
        imprimeArray(b);
        System.out.println(""); // Para meter un enter todo pocho.
        tieneRepe(a, b);
    }
}