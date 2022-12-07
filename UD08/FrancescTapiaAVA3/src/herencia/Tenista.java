/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

public class Tenista extends Deportista implements Sancionable {

    public Tenista(String n) {
        super(n);
        System.out.println("Se crea el tenista " + nombre);
    }

    public void jugar(String tipo) {
        System.out.println("El tenista juega un " + tipo);
    }

    @Override
    public void sancionar(int t) {
        System.out.println("Tenista sancionado " + t + " dias");
    }

    @Override
    public void retirar() {
        System.out.println("Se retira el tenista " + nombre);
    }
}
