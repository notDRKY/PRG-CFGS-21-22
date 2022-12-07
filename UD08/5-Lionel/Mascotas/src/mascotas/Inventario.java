/*
 * Implementa una clase llamada Inventario que utilizaremos para almacenar referencias a
 * todos los animales existentes en una tienda de mascotas.
 *
 * Esta clase debe cumplir con los siguientes requisitos:
 *
 *      En la tienda existirán 4 tipos de animales: perros, gatos, loros y canarios.
 *
 *      Los animales deben almacenarse en un ArrayList privado dentro de la clase
 *      Inventario.
 *
 *      La clase debe permitir realizar las siguientes acciones:
 *
 *          Mostrar la lista de animales (solo tipo y nombre, 1 línea por animal).
 *          Mostrar todos los datos de un animal concreto.
 *          Mostrar todos los datos de todos los animales.
 *          Insertar animales en el inventario.
 *          Eliminar animales del inventario.
 *          Vaciar el inventario.
 *          Implementa las demás clases necesarias para la clase Inventario.
 *
 */
package mascotas;

import java.util.ArrayList;

public class Inventario {

    private static ArrayList<Mascotas> listaAnimales;

    public static void main(String[] args) {
        listaAnimales = new ArrayList<>();

        // Insertar animales en el inventario.
        listaAnimales.add(new Mascotas("David Pera", 1, "Fallecido", "2022/05/23"));
        listaAnimales.add(new Mascotas("John China", 112, "Desaparecido", "1910/10/01"));
        listaAnimales.add(new Perro("Pug", "69", "Joe", 4, "Bien", "2018/09/07"));
        listaAnimales.add(new Perro("Chihuahua", "33", "B.I.G P", 3, "Vivo", "2019/01/01"));
        listaAnimales.add(new Gato("Negro", true, "Coocker", 1, "Bien", "2021/02/02"));
        listaAnimales.add(new Gato("Blanco", false, "Xi Jinping", 45, "Bien", "1953/06/15"));
        listaAnimales.add(new Loro("Corea del Norte", false, "No", false, "Kim Jong-un", 2, "Bien", "2020/02/20"));
        listaAnimales.add(new Loro("Cancún", true, "No", true, "María Elena", 4, "Bien", "2018/09/12"));
        listaAnimales.add(new Canario("Azul", true, "Si", true, "Muhammadu Buhari", 79, "Desaparecido", "1942/12/17"));
        listaAnimales.add(new Canario("Rojo", false, "Si", true, "Rojuu", 3, "Mal", "2019/02/02"));

        // Mostrar todos los datos de todos los animales.
        System.out.println("*-- MOSTRAR TODOS LOS DATOS DE TODOS LOS ANIMALES.");
        for (Mascotas m : listaAnimales) {
            System.out.println(m.muestra());
        }
        System.out.println("____________________________________________________________________________");

        // Mostrar la lista de animales (solo tipo y nombre, 1 línea por animal).
        System.out.println("*-- MOSTRAR LA,LISTA DE ANIMALES (SOLO TIPO Y NOMBRE, 1  LÍNEA POR ANIMAL).");
        for (Mascotas m : listaAnimales) {
            System.out.println("| CLASE:\t" + m.getClass() + "\t| NOMBRE: " +  m.getNombre());
        }
        System.out.println("____________________________________________________________________________");
        
        // Mostrar todos los datos de un animal concreto.
        listaAnimales.get(4).muestra();
        
        // Eliminar animales del inventario.
        System.out.println("*-- ELIMINAR ANIMALES DEL INVENTARIO");
        System.out.println("Tamaño inventario | " + listaAnimales.size());
        listaAnimales.remove(0);
        listaAnimales.remove(1);
        System.out.println("Tamaño inventario | " + listaAnimales.size());
        System.out.println("____________________________________________________________________________");
        
        // Vaciar el inventario.
        System.out.println("*-- VACIAR EL INVENTARIO");
        listaAnimales.clear();
        System.out.println("¿Está vacío el inventario? | " + listaAnimales.isEmpty());
        System.out.println("____________________________________________________________________________");
    }
}
