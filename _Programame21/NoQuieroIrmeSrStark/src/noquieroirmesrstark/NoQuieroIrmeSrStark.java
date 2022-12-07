package noquieroirmesrstark;

import java.util.Scanner;

public class NoQuieroIrmeSrStark {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numCasos = teclado.nextInt(); //  indica cuantos casos deber´an ser procesados.
        
        for (int i = 0; i < numCasos; i++) {
            // El primero, 2 ≤ n ≤ 1.000 indica el tamano de la poblacion que sera reducida a la mitad.
            int tamanoCirculo = teclado.nextInt();
            // Los dos siguientes, 1 ≤ s, p ≤ n indican las posiciones en el circulo de Iron Man
            int posIronMan = teclado.nextInt();
            // y de Spiderman (Peter Parker) respectivamente.
            int posSpidey = teclado.nextInt();
            // indica el numero de personas que Thanos salta cada vez en su recorrido antes de eliminar al siguiente.
            int salto = teclado.nextInt();
            
            boolean muertoSpidey = false;
            boolean muertoIron = false;
            int pos = 1;
            
            for (int j = (int) Math.round(tamanoCirculo / 2); j > 0; j++) {
                pos = ((pos + salto) % tamanoCirculo + 1);
                if (pos == posIronMan) {
                    muertoIron = true;
                } else if (pos == posSpidey){
                    muertoSpidey = true;
                }
            }
            if (muertoIron && muertoSpidey || (!muertoIron && !muertoSpidey)) {
                System.out.println("No hay abrazo");
            } else if (muertoSpidey) {
                System.out.println("No quiero irme, Sr. Stark!");
            } else if (muertoIron) {
                System.out.println("No quiero irme, Peter!");
            }
        }
    }
}
