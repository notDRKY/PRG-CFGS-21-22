/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utiles;

public class Utiles {
    
    public static void mostrarDiagonal(int[][] m) {
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < 1; c++) {
                System.out.println(m[f][c + f]);
            }
        }
    }
    
    public static int filaDelMayor(int[][] m) {
        int posMax = 0;
        int suma = 0;
        int mayor = 0;
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m[f].length; c++) {
                suma += m[f][c];
            }
            if (suma > mayor) {
                mayor = suma;
                posMax = f;
            }
        }
        return posMax;
    }
    
    public static void main(String[] args) {
        int[][] m = {
            {100, 25, 33},
            {28, 765, 65},
            {56, 333, 45},};
        
        mostrarDiagonal(m);
        System.out.println(filaDelMayor(m));

    }

}
