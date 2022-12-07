package pulga;

import java.util.Scanner;

public class Pulga {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int casos = 0;
        int numerosPasos = 0;
        int factorMultiplicado = 0;
        int tiempo = 0;
        
        casos = teclado.nextInt();
        for (int i = 0; i < casos; i++) {
            numerosPasos = teclado.nextInt();
            factorMultiplicado = teclado.nextInt();
            tiempo = teclado.nextInt();
            
            System.out.println((tiempo % (numerosPasos + 1)) * factorMultiplicado);
        }
    }
}
