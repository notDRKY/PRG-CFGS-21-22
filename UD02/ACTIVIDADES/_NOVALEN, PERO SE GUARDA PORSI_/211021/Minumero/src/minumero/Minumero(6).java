/* 5. Realiza una clase minumero que proporcione el doble, triple y cuadruple de un numero proporcionado en
su constructor (realiza un metodo para doble , otro para triple y otro para cuedruple ). Haz que la clase
tenga un metodo main y comprueba los distintos metodos. */

package minumero;

// IMPORTAMOS LIBRERIA DE JAVA (PARA LEER EL TECLADO)
import java.util.Scanner;

// CLASE MINUMERO
public class Minumero {

    private double numeroOperado;

    // CONSTRUTOR POR DEFECTO
    Minumero() {
    
    }

    // CONSTRUCTOR 2
    Minumero(double auxUsuario){
        numeroOperado=auxUsuario;
    }
    
    // METODOS DE LA CLASE MINUMERO
    double porDos(double numero) {
        numero= (this.numeroOperado * 2);
        return numero;

    }

    double porTres(double numeroUno) {
        numeroUno= (this.numeroOperado * 3);
        return numeroUno;
    }

    double porCuatro(double numeroDos) {
        numeroDos= (this.numeroOperado * 4);
        return numeroDos;
    }

    // METODO MAIN DE LA CLASE MINUMERO
    public static void main(String[] args) {
        
        // CREACION DE OBJETOS
        Scanner teclado= new Scanner(System.in);
        
        // DECLARACION DE VARIABLES
        String textoUsuario;
        double numUsuario;
        
        // RECOGER NUMERO DE USUARIO PARA MULTIPLACARLO
        System.out.println("INDICA EL NUMERO QUE QUIERES MULTIPLICAR: ");
        textoUsuario= teclado.nextLine();
        numUsuario= Double.parseDouble(textoUsuario);
        
        // CREACION DE OBJETO NUMERO DE LA CLASE MINUMERO
        Minumero numero= new Minumero(numUsuario);
        
        // UTILIZAR LOS METODOS Y MOSTRAR A EL USUARIO EL RESULTADO DE LAS OPERACIONES HECHAS CON LOS METODOS
        System.out.println("ASIGNADO NUMERO " + numUsuario);
        System.out.println("EL DOBLE DE: " + numUsuario + " ES: " + numero.porDos(numUsuario));
        System.out.println("EL TRIPE DE: " + numUsuario + " ES: " + numero.porTres(numUsuario));
        System.out.println("EL CUADRUPLE DE: " + numUsuario + " ES: " + numero.porCuatro(numUsuario));
    }

}
