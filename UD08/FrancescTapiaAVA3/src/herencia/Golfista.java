/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

public class Golfista extends Deportista {

    public Golfista(String n) {
        nombre = n;
        System.out.println("Se crea el golfista " + nombre);
    }

    public void jugar(int num) {
        System.out.println("El golfista juega " + num + " hoyos");
    }
}
