/*
42. (CombinarLetras3) Repite el ejercicio anterior mostrando palabras de tres letras
            aaa
            aab
            ...
            ddc
            ddd
 */
package combinarletras3;

public class CombinarLetras3 {

    public static void main(String[] args) {            
        // BUCLE LINEA IZQUIERDA
        for (int i = 1; i <= 4; i++) {
            char car1 = 'a';
            char car2 = 'a';
            char car3 = 'a';
            
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
            // BUCLE LINEA CENTRAL
            for (int j = 1; j <= 4; j++) {
                switch (j) {
                    case 2 -> {
                        car2 = 'b';
                    }
                    case 3 -> {
                        car2 = 'c';
                    }
                    case 4 -> {
                        car2 = 'd';
                    }
                }
                // BUCLE LINEA DERECHA
                for (int b = 1; b <= 4; b++) {
                    switch (b) {
                        case 1 -> {
                            System.out.println(car1 + "" + car2 + "" + car3);
                        }
                        case 2 -> {
                            car3 = 'b';
                            System.out.println(car1 + "" + car2 + "" + car3);
                        }
                        case 3 -> {
                            car3 = 'c';
                            System.out.println(car1 + "" + car2 + "" + car3);
                        }
                        case 4 -> {
                            car3 = 'd';
                            System.out.println(car1 + "" + car2 + "" + car3);
                        }
                    }
                }
            }
        }
    }

}
