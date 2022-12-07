/*
 * 3. La clase ListaCorredores permite representar a un conjunto de corredores. En la lista,
 * como máximo habrá 200 corredores, aunque puede haber menos de ese número. Se
 * utilizará un array, llamado lista, de 200 elementos junto con una propiedad
 * numCorredores que permita saber cuentos corredores hay realmente. Métodos:
 * 
 * public ListaCorredores() . Construtor. Crea la lista de corredores,
 * incicialmente vacía.
 * 
 * public void añadir(Corredor c) throws ElementoDuplicadoException .
 * Añade un corredor al final de la lista de corredores, siempre y cuando el
 * corredor no esté ya en la lista, en cuyo caso se lanzará
 * ElementoDuplicadoException
 * 
 * public void insertarOrdenado(Corredor c) . Inserta un corredor en la
 * posición adecuada de la lista de manera que esta se mantenga ordenada
 * crecientemente por el tiempo de llegada. Para poder realizar la inserción debe
 * averiguarse la posición que debe ocupar el nuevo elemento y, antes de
 * añadirlo al array, desplazar el elemento que ocupa esa posición y todos los
 * posteriores, una posición a la derecha.
 * 
 * public Corredor quitar(int dorsal) throws
 * ElementoNoEncontradoException . Quita de la lista al corredor cuyo dorsal se
 * indica. El array debe mantenerse compacto, es decir, todos los elementos
 * posteriores al eliminado deben desplazarse una posición a la izquierda. El
 * método devuelve el Corredor quitado de la lista. Si no se encuentra se lanza
 * ElementoNoEncontradoException .
 * 
 * public String toString() Devuelve un String con la información de la lista
 * de corredores. Los minutos apareceran formateados con 2 decimales. Por
 * ejemplo:
 * 
 *  1| Posición: 0
 *  2| Dorsal: 234
 *  3| Nombre: Juan Ramirez
 *  4| Tiempo: 25.97 minutos
 *  5| 
 *  6| Posición: 1
 *  7| Dorsal: 26
 *  8| Nombre: José González
 *  9| Tiempo: 29.70 minutos
 */
package contrarreloj;

public class ListaCorredores {
    private final int MAX_CORREDORES = 200;
    private Corredor[] lista = new Corredor[MAX_CORREDORES];
    private int numCorredores;
    
    public ListaCorredores() {
        
    }
    
    public void añadir(Corredor c) throws ElementoDuplicadoException {
        int pos; // Declaro la variable pos fuera del for para poder utilizarla fuera de este.
        
        for (pos = 0; lista[pos] != null && pos < lista.length; pos++) {
            if (c.equals(lista[pos])) {
                throw new ElementoDuplicadoException();
            }
        }
        lista[pos] = c;
        numCorredores++;
    }

    private static class ElementoDuplicadoException extends Exception {

        public ElementoDuplicadoException() {
        }
    }
    /*
     * public void insertarOrdenado(Corredor c) . Inserta un corredor en la
     * posición adecuada de la lista de manera que esta se mantenga ordenada
     * crecientemente por el tiempo de llegada. Para poder realizar la inserción debe
     * averiguarse la posición que debe ocupar el nuevo elemento y, antes de
     * añadirlo al array, desplazar el elemento que ocupa esa posición y todos los
     * posteriores, una posición a la derecha.
     */
//    public void insertarOrdenado() {
//        int pos;
//        while() {
//            
//            pos++;
//        }
//    }
    
}
