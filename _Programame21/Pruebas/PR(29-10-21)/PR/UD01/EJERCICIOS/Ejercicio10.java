/* 10. (Fuerza) La fuerza de atracción entre dos masas m1 y m2 separadas por una distancia d, está dada por la
fórmula: */
public class Ejercicio10 {
    // public static double g=6.693 * (10^-11) ; <----- MAL
    public static void main (String [] args) {
        String textoM1, textoM2, textoD;
        int m1, m2;
        double d, fuerza;
        
        final double g=6.693E-11 ;

        System.out.print("Introduce valor para m1: ");
        textoM1=System.console().readLine();
        m1=Integer.parseInt(textoM1);

        System.out.print("Introduce valor para m2: ");
        textoM2=System.console().readLine();
        m2=Integer.parseInt(textoM2);

        System.out.print("Introduce valor para distancia: ");
        textoD=System.console().readLine();
        d=Double.parseDouble(textoD);

        // Formula
        fuerza=(g * m1 * m2) / (d)*(d);

        System.out.print("La F es: " + fuerza);
    }
}