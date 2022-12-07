package perimetro;

import java.util.Scanner;

public class Perimetro {
    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int numA;
        int numB;
        
        while(((numA = tec.nextInt()) > 0) && ((numB = tec.nextInt()) > 0)) {
            System.out.println((numA + numB) * 2);
        }
    }
}
