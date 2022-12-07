/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.util.Scanner;

public class Persona {
    
    // ATRIBUTOS DE LA CLASE PERSONA
    private String nombre;
    private int edad;
    private String dni;
    //private char sexo;
    private double peso;
    private double altura;
    
    // METODOS CONSTRUCTORES DE LA CLASE PERSONA
    // CONSTRUCTOR POR DEFECTO
    Persona(){
        
    }
    
    // CONSTRUCTOR 2
    Persona(String nombre, int edad){
        
        this.nombre = nombre;
        this.edad = edad;
        //this.sexo = sexo;
        this.dni = "11111111H";
        this.peso = 70;
        this.altura = 1.7;
    }
    
    // CONSTRUCTOR 3
    Persona(String nombre, int edad, String dni, 
            double peso, double altura){
        
        this.nombre = nombre;
        this.edad = edad;
        //this.sexo = sexo;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }
    
    // METODOS DE LA CLASE PERSONA
    /*
    String calcularIMC(){
        double aux= getPeso() / getAltura();
        String aux2= (aux < 20)? ("bajoPeso"):(aux );
    }
    */
    boolean esMayorEdad(){
        return (edad > 18);
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    // METODOS SET

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    //public void setSexo(char sexo) {
    //    this.sexo = sexo;
    //}

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    // METODOS GET
    public String getNombre() {
        return nombre;
        
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    //public char getSexo() {
    //    return sexo;
    //}

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public static void main(String[] args) {
        String usrNombre, usrDni;
        double usrPeso, usrAltura;
        int usrEdad;
        Scanner teclado = new Scanner(System.in);
        
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Antonia", 15);
        
        // DATOS INTRODUCIDOS POR EL USUARIO (PERSONA 3)
        System.out.println("Introduce el nombre de persona 3: ");
        usrNombre = teclado.nextLine();
        System.out.println("Introduce la edad de la persona 3: ");
        usrEdad = teclado.nextInt();
        System.out.println("Introduce el DNI de la persona 3: ");
        usrDni = teclado.nextLine();
        //System.out.println("Introduce el sexo de la persona 3: ");
        
        System.out.println("Introduce el peso de la persona 3: ");
        usrPeso = teclado.nextDouble();
        System.out.println("Introduce la altura de persona 3: ");
        usrAltura = teclado.nextDouble();
        
        Persona persona3 = new Persona(usrNombre, usrEdad, usrDni, usrPeso, usrAltura);
        
        System.out.println("La persona 1 es mayor de edad? " + persona1.esMayorEdad());
        System.out.println("La persona 2 es mayor de edad? " + persona2.esMayorEdad());
        System.out.println("La persona 3 es mayor de edad? " + persona3.esMayorEdad());
        
        System.out.println("PERSONA 1: " + persona1.toString());
        System.out.println("PERSONA 2: " + persona2.toString());
        System.out.println("PERSONA 3: " + persona3.toString());
    }
    
}
