/* 2. Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere convertir debe ser
introducida por teclado. */

public class Actividad2 {
    public static void main (String [] args) {
        String textoPesetas;
        float numPesetas, euros=0.0060f, conversion;

        System.out.print("Dime una cantidad de pesetas: ");
        textoPesetas=System.console().readLine();
        numPesetas=Float.parseFloat(textoPesetas);
        conversion=(numPesetas*euros);

        System.out.println("Tus pesetas son " + conversion + " euros.");
    }
}