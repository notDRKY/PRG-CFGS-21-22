/*
 * Crear un ArrayList de enteros llamado misNumeros.
 * Añadir los valores 1, 6, 3, 2, 0, 4, 5.
 * Mostrar los datos del ArrayList.
 * Mostrar el valor de la posición 5.
 * Añadir el valor 8 en la posición 4.
 * Cambiar el valor de la posición 1 por 9.
 * Eliminar el valor 5. ( misNumeros.remove(new Integer(5)) )
 * Eliminar el valor de la posición 3.
 * Recorrer el array con un bucle for.
 * Recorrer el array con un bucle Iterator .
 * Comprobar si existe el elemento 0.
 * Comprobar si existe el elemento 7.
 * Clonar el ArrayList misNumeros en otro llamado copiaArrayList .
 * Añadir el elemento 9.
 * Mostrar la posición de la primera ocurrencia del elemento 9.
 * Mostrar la posición de la última ocurrencia del elemento 9.
 * Borrar todos los elementos del ArrayList copiaArrayList .
 * Comprobar si el ArrayList copiaArrayList está vacio.
 * Convertir el ArrayList misNumeros en un Array y recorrerlo con un bucle mejorado.
 */
package actividad1;

import java.util.ArrayList;
import java.util.Iterator;

public class Actividad1 {

    public static void main(String[] args) {
        // Crear un ArrayList de enteros llamado misNumeros.
        ArrayList <Integer> misNumeros = new ArrayList<>();

        // Añadir los valores 1, 6, 3, 2, 0, 4, 5.
        misNumeros.add(1);
        misNumeros.add(6);
        misNumeros.add(3);
        misNumeros.add(2);
        misNumeros.add(0);
        misNumeros.add(4);
        misNumeros.add(5);

        // Mostrar los datos del ArrayList.
        System.out.println("Mostrar los datos del ArrayList");
        //for (int i = 0; i < misNumeros.size(); i++) {
        //    System.out.println(misNumeros.get(i));
        //}
        //System.out.println(misNumeros.toString());
        System.out.println(misNumeros);

        // Mostrar el valor de la posición 5.
        System.out.println("Mostrar el valor de la posición 5");
        System.out.println(misNumeros.get(5));

        // Añadir el valor 8 en la posición 4.
        misNumeros.add(4, 8);

        // Cambiar el valor de la posición 1 por 9.
        misNumeros.set(1, 9);

        // Eliminar el valor 5. ( misNumeros.remove(new Integer(5)) )
        System.out.println("Eliminar el valor 5. ( misNumeros.remove(new Integer(5)) )");
        misNumeros.remove(misNumeros.indexOf(5));

        // Eliminar el valor de la posición 3.
        misNumeros.remove(3);

        // Recorrer el array con un bucle for.
        System.out.println("Recorrer el array con un bucle for");
        for (int i = 0; i < misNumeros.size(); i++) {
            System.out.print(misNumeros.get(i));
        }
        System.out.println("");
        
        // Recorrer el array con un bucle Iterator.
        System.out.println("Recorrer el array con un bucle Iterator");
        Iterator <Integer> it = misNumeros.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }
        System.out.println("");
        
        // Comprobar si existe el elemento 0.
        System.out.println("Comprobar si existe el elemento 0");
        //System.out.println(misNumeros.contains(new Integer(0)));
        System.out.println(misNumeros.contains(0));

        // Comprobar si existe el elemento 7.
        System.out.println("Comprobar si existe el elemento 7");
        //System.out.println(misNumeros.contains(new Integer(7)));
        System.out.println(misNumeros.contains(7));

        // Clonar el ArrayList misNumeros en otro llamado copiaArrayList.
        //ArrayList copiaArrayList = new ArrayList(misNumeros);
        ArrayList <Integer> copiaArrayList = new ArrayList<>(misNumeros);
        //copiaArrayList = (ArrayList) misNumeros.clone();
        System.out.println(copiaArrayList);

        // Añadir el elemento 9.
        misNumeros.add(9);

        // Mostrar la posición de la primera ocurrencia del elemento 9.
        System.out.println("Mostrar la posición de la primera ocurrencia del elemento 9.");
        System.out.println(misNumeros.indexOf(9));

        // Mostrar la posición de la última ocurrencia del elemento 9.
        System.out.println("Mostrar la posición de la última ocurrencia del elemento 9.");
        System.out.println(misNumeros.lastIndexOf(9));

        // Borrar todos los elementos del ArrayList copiaArrayList.
        copiaArrayList.removeAll(copiaArrayList);
        System.out.println(copiaArrayList);
        
        // Comprobar si el ArrayList copiaArrayList está vacio.
        System.out.println("Comprobar si el ArrayList copiaArrayList está vacio.");
        System.out.println(copiaArrayList.isEmpty());

        // Convertir el ArrayList misNumeros en un Array y recorrerlo con un bucle mejorado.
        System.out.println("Convertir el ArrayList misNumeros en un Array y recorrerlo con un bucle mejorado.");
        Object[] misNumerosArray = misNumeros.toArray();
        
        for (Object numero : misNumerosArray) {
            System.out.print(numero);
        }
        System.out.println("");
    }
}
