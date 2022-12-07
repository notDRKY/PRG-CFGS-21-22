/* 1. Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere convertir debe ser
introducida por teclado. */
public class Actividad1 {
    public static void main (String [] args) {
        String textoEuro;
        float numEuros, pesetas=166.38f, conversion;

        System.out.print("Dime una cantidad de Euros: ");
        textoEuro=System.console().readLine();
        numEuros=Float.parseFloat(textoEuro);
        conversion=(numEuros*pesetas);

        System.out.println("Tus euros son " + conversion + " pesetas.");
    }
}