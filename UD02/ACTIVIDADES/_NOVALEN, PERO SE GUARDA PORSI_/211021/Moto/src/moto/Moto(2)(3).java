package moto;

// IMPORTAMOS LIBRERIA DE JAVA (PARA LEER EL TECLAD0)
import java.util.Scanner;

public class Moto {

    private int velocidad;

    // CONSTRUCTOR POR DEFECTO
    Moto() {
        velocidad = 0;
    }

    // METODO VELOCIDAD
    int getVelocidad() {

        return this.velocidad;

    }

    // METODO ACELERAR
    void acelera(int mas) {
        velocidad = velocidad + mas;
    }

    // METODO FRENAR
    void menos(int menos) {
        velocidad = velocidad - menos;
    }

    // METODO MAIN
    public static void main(String[] args) {
        String textoUsuario;
        int numUsuario;

        // CREACION OBJETOS
        Scanner teclado = new Scanner(System.in);
        Moto moto1 = new Moto();

        // ACELERAR
        System.out.println("Tienes una moto.");
        System.out.println("Selecciona la velocidad de la moto: ");
        textoUsuario = teclado.nextLine();
        numUsuario = Integer.parseInt(textoUsuario);
        moto1.acelera(numUsuario); //AQUI SE ACELERA    
        System.out.println("Que bien, vas  a: " + moto1.getVelocidad() + " km/h.");

        // FRENADA 
        System.out.println("Es hora de frenar compi, cuanto quieres frenar?");
        textoUsuario = teclado.nextLine();
        numUsuario = Integer.parseInt(textoUsuario);
        moto1.menos(numUsuario); //AQUI SE FRENA
        System.out.println("Que buena frenada pa', ahora vas a " + moto1.getVelocidad() + " km/h.");

    }

}
