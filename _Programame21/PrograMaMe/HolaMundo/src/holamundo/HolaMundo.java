package holamundo;

import java.util.Scanner;

public class HolaMundo {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int usrNum = 0;
        
        usrNum = teclado.nextInt();
        
        for (int i = 0; i < usrNum; i++) {
            System.out.println("Hola mundo.");
        }
        
    }
    
}
