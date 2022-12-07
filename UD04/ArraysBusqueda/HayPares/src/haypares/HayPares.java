/*
 * 4. (HayPares) Para determinar si existe algún valor par en un array se proponen varias
 * soluciones. Indica cual/cuales son válidas para resolver el problema.
 */
package haypares;

public class HayPares {
    // TA MAL (por usar while)
    public static boolean haypares1(int v[]) {
        int i = 0; // Se inicia el contador a 0.
        while (i < v.length && v[i] % 2 != 0) { //CONDICIÓN: Mientras i sea menor que la longitud del array 
                                                //y el contenido del array no es divisible entre dos, se hace 
                                                //lo siguiente:
            i++;                // Se incrementa el contador
        }
        if (v[i] % 2 == 0) {    // IF: Si el contenido del array es divisible entre 2:
            return true;        // Devuelve true
        } else {                // Si no
            return false;       // Devuelve false
        }                       // WHILE, tocando los *****, hay un caso (en el caso de que en el array no haya pares)
                                // dónde el se intenta leer la lonitud del array + 1 (v.length + 1) y sale un error en la ejecución.
    }
    // TA BIEN
    public static boolean haypares2(int v[]) {
        int i = 0; // Se inicia el contador a 0.
        while (i < v.length && v[i] % 2 != 0) { //CONDICIÓN: Mientras i sea menor que la longitud del array 
                                                //y el contenido del array no es divisible entre dos, se hace 
                                                //lo siguiente:
            i++;                // Se incrementa el contador
        }
        if (i < v.length) { // IF: Si i es menor que la longitud del array:
            return true;    // devuelve true
        } else {            // Si no
            return false;   // devuelve false
        }
    }
    // TA MAL (por usar while)
    public static boolean haypares3(int v[]) {
        int i = 0;  // Se inicia el contador a 0.
        while (v[i] % 2 != 0 && i < v.length) { //CONDICIÓN: Mientras el contenido del array no sea divisible entre 2 &&
                                                // i sea menor que la longitud del array.
            i++;                // Se incrementa el contador
        }
        if (i < v.length) { // IF: Si i es menor que la longitud del array:
            return true;    // devuelve true
        } else {            // Si no
            return false;   // devuelve false
        }                   // WHILE, tocando los *****, hay un caso (en el caso de que en el array no haya pares)
                            // dónde el se intenta leer la lonitud del array + 1 (v.length + 1) y sale un error en la ejecución.
    }
    // TA MAL
    public static boolean haypares4(int v[]) {
        int i = 0;
        boolean encontrado = false;
        // Fallo aqui
        while (i <= v.length && !encontrado) {
            if (v[i] % 2 == 0) {
                encontrado = true;
            } else {
                i++;
            }
        }
        return encontrado;
    }
    // TA BIEN 
    public static boolean haypares5(int v[]) {
        int i = 0;  // Se inicia la variable i (contador) a 0
        boolean encontrado = false;
        while (i < v.length && !encontrado) {
            if (v[i] % 2 == 0) {
                encontrado = true;
            }
            i++;
        }
        return encontrado;
    }
// TA MAL (el contador no se incrementa)
//    public static boolean haypares6(int v[]) {
//        int i = 0;  // Se inicializa el contador a 0
//        while (i < v.length) {  //CONDICIÓN: Si i es menor que la longitud del array:
//            if (v[i] % 2 == 0) {    //IF: Si el conenido del array es divisible entre 2:
//                return true;        // devuelve true
//            } else {                // Si no se cumple el if:
//                return false;       // devuelve false
//            }
//        }
//        // Hay fallo, la i no se incrementa, esto provoca un mal funcionamiento del método.
//    }
// TA BIEN
    public static boolean haypares7(int v[]) {
        int i = 0;  //Se inicializa i (contador) a 0
        while (i < v.length) {  //CONDICIÓN: Mientras i sea menor que v.length:
            if (v[i] % 2 == 0) {    //IF: Si el contenido del array es divisible entre 2
                return true;        // Devuelve true 
            }
            i++;                    // Incrementa el contador (Siempre se incrementa)
        }
        return false;               // (SI NO ENTRA EN EL IF) Devuelve false
    }
    
    public static void main(String[] args) {
        int[] prueba = {1, 3, 5, 7, 9, 11, 10};

//        System.out.println(haypares1(prueba));
//        System.out.println(haypares2(prueba));
//        System.out.println(haypares3(prueba));
        System.out.println(haypares4(prueba));
//        System.out.println(haypares5(prueba));
//        System.out.println(haypares6(prueba));
        System.out.println(haypares7(prueba));
    }
}
