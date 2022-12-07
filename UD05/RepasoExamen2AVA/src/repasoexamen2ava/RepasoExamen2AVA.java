package repasoexamen2ava;

public class RepasoExamen2AVA {

    public static int[][] recortarM(int[][] m) {
        int menor = Math.min(m.length, m[0].length);
        
        int[][] copiaM = new int [menor][menor];
        
        for (int f = 0; f < copiaM.length; f++) {
            for (int c = 0; c < copiaM[f].length; c++) {
                copiaM[f][c] = m[f][c];
            }
        }
        
        return copiaM;
    }
    
    public static void imprimirM(int[][] m) {
        for (int f = 0; f < m.length; f++) {
            System.out.println("");
            for (int c = 0; c < m[f].length; c++) {
                System.out.print(m[f][c]);
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[][] m1 = {{4, 2, 5},
                      {5, 5, 5},
                      {6, 6, 1},
                      {2, 7, 8}};
    

        int[][] m2 = {{4, 2, 5, 7, 9},
                      {5, 5, 5, 3, 6}};
    
        imprimirM(m2);
        imprimirM(m1);
        System.out.println("_________________________________");
        m2 = recortarM(m2);
        m1 = recortarM(m1);
        System.out.println("_________________________________");
        imprimirM(m2);
        imprimirM(m1);
    }
}

