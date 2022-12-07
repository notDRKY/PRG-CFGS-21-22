/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author Soldi
 */
class Empleado extends Persona {

    private double salario;

    public Empleado(String n, int e, double s) {
        super(n, e);
        this.salario = s;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre()
                + "\nSalario: " + this.salario;
    }
}
