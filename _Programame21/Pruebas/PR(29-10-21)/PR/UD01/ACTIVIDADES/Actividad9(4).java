/* 9. Realiza un programa en Java que genere el número premiado del Cupón de la ONCE. */
public class Actividad9 {
    public static void main (String [] args) {
        double numAleatorio;
        int numEntero;

        System.out.print("El numero premiado del Cupon de la ONCE es: ");

        //1
        numAleatorio=(Math.random()) * 9;
        numEntero=(int)numAleatorio;
        System.out.print(numEntero);

        //2
        numAleatorio=(Math.random()) * 9;
        numEntero=(int)numAleatorio;
        System.out.print(numEntero);

        //3
        numAleatorio=(Math.random()) * 9;
        numEntero=(int)numAleatorio;
        System.out.print(numEntero);

        //4
        numAleatorio=(Math.random()) * 9;
        numEntero=(int)numAleatorio;
        System.out.print(numEntero);

        //5
        numAleatorio=(Math.random()) * 9;
        numEntero=(int)numAleatorio;
        System.out.print(numEntero);
    }
}