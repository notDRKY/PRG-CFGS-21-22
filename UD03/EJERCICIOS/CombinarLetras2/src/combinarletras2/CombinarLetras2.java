/*
41. (CombinarLetras2) Escribir un programa que muestre todas las palabras de dos letras que se
pueden formar con los cuatro primeros caracteres del alfabeto en minúsculas ('a', 'b', 'c', 'd'):
            aa
            ab
            ac
            ad
            ba
            bb
            bc
            bd
            ...
            da
            db
            dc
            dd
 */
package combinarletras2;

public class CombinarLetras2 {

    public static void main(String[] args) {
        // BUCLE LETRAS IZQUIERDA
        for (int i = 1; i <= 4; i++) {
            char car1 = 'a';
            char car2 = 'a';
            
            System.out.println("_______________________________");
            switch (i) {
                case 2 -> {
                    car1 = 'b';
                }
                case 3 -> {
                    car1 = 'c';
                }
                case 4 -> {
                    car1 = 'd';
                }
            }
            // BUCLE LETRAS DERECHA
            for (int j = 1; j <= 4; j++) {
                switch (j) {
                    case 1 -> {
                        System.out.println(car1 + "" + car2);
                    }
                    case 2 -> {
                        car2 = 'b';
                        System.out.println(car1 + "" + car2);
                    }
                    case 3 -> {
                        car2 = 'c';
                        System.out.println(car1 + "" + car2);
                    }
                    case 4 -> {
                        car2 = 'd';
                        System.out.println(car1 + "" + car2);
                    }
                }
            }
        }
    }
}
