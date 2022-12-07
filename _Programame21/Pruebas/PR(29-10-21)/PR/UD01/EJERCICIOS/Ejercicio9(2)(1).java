public class Ejercicio9 {
    public static void main (String [] args) {
        /* 9. (Segundos) Escribir un programa que, dada una cantidad de segundos, introducida por teclado, la
                desglose en días, horas, minutos y segundos. */
        String textoSegs;
        int numSegs, divSegs, minutos, horas, dias, aux;
        System.out.print ("Introduce cantidad de segundos: ");
        textoSegs=System.console().readLine();
        numSegs=Integer.parseInt(textoSegs);

        dias=numSegs / (24 * 60 * 60);
        aux=numSegs % (24 * 60 * 60);
        horas=aux / (60 * 60);
        aux=aux % (60 * 60);
        minutos= aux / (60);
        aux=aux / (60);
        divSegs=aux;
        
        System.out.println(numSegs + " segundos son:");
        System.out.println(dias + " dias");
        System.out.println(horas + " horas");
        System.out.println(minutos + " minutos");
        System.out.println(divSegs + " segundos");
    }
}