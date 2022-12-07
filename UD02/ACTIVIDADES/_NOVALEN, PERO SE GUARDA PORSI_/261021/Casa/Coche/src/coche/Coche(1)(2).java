/*
 *9. Crea la clase Coche con dos constructores. Uno no toma parámetros y el otro sí. Los dos
 *constructores inicializarán los atributos marca y modelo de la clase. Crea dos objetos (cada
 *objeto llama a un constructor distinto) y verifica que todo funciona correctamente.
 */
package coche;

import java.util.Scanner;

public class Coche {

    private String marca;
    private String modelo;

    Coche() {
        this.marca = "Mercedes";
        this.modelo = "CLA";
    }

    Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public static void main(String[] args) {

        // CREACION DE OBJETOS (TECLADO & COCHE1)
        Scanner teclado = new Scanner(System.in);
        Coche coche1 = new Coche();

        // COCHE 1
        System.out.println("Objeto coche creado, datos del vehiculo: " + coche1.marca + " " + coche1.modelo);

        // RECOGIDA DE DATOS DEL USUARIO
        System.out.println("Introduce la marca de tu vehiculo: ");
        String textoUsuario = teclado.nextLine();
        System.out.println("Introduce el modelo de tu vehiculo: ");
        String textoUsuarioAlt = teclado.nextLine();

        // CREACION DE OBJETO (COCHE2) Y COCHE 2 
        Coche coche2 = new Coche(textoUsuario, textoUsuarioAlt);
        System.out.println("Tu marca y modelo de coche es: " + coche2.marca + " " + coche2.modelo);
    }

}
