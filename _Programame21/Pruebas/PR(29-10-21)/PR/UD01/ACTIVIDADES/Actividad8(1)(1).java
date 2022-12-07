/* 8. Realiza un programa en Java que genere letras de forma aleatoria. */
public class Actividad8 {
    public static void main (String [] args) {

        double numero;
        char letra;

        numero=(int)(Math.random() * 25) + 65;

        letra=(char)numero;
        
        System.out.print("La letra aleatoria es: " + letra);

    }
}