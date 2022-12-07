public class Ejercicio7 {
    public static void main (String [] args) {
        String textoLong, textoAnch;
        double numLong, numAnch;

        System.out.print ("Dime la longitud: ");
        textoLong=System.console().readLine();
        numLong=Double.parseDouble(textoLong);

        System.out.print ("Dime la anchura: ");
        textoAnch=System.console().readLine();
        numAnch=Double.parseDouble(textoAnch);

        System.out.print ("La habitacion tiene una superficie de: " + numLong + " x " + numAnch + " = " + (numLong * numAnch));
    }
}