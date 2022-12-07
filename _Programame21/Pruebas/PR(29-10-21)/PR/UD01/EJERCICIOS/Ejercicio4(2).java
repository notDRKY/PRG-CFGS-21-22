public class Ejercicio4 {
    public static void main (String [] args){
        String textoNumero;
        int numOperable;
        
        System.out.print ("Escribe un numero: ");
        textoNumero=System.console().readLine();
        numOperable=Integer.parseInt(textoNumero);

        System.out.print ("El doble de " + numOperable + " es " + (numOperable*2));
    }
}