/*
 * 59. En una tienda, por liquidación, se aplican distintos descuentos en función del total de las compras
 * realizadas:
 *     Si total < 500 €, no se aplica descuento.
 *     Si 500 € <= total <= 2000 €, se aplica un descuento del 30 %.
 *     Si total > 2000e, entonces se aplica un descuento del 50 %
 * ¿Cual de los siguientes fragmentos de programa asigna a la variable desc el descuento correcto? Indica
 * "Si" o "NO" al lado de cada fragmento
 */
package papel59;

public class Papel59 {

    public static void main(String[] args) {
        double total = 0;
        
        // A -------------------------------------
        // TA MAL
        double desc = 0.0;
        if (total <= 500) {
            if (total >= 2000) { // CALCULA MAL LOS PORCENTAJES
                desc = 30.0;
            } else {
                desc = 50.0;
            }
        }
        total = total * desc / 100.0;

        // B -------------------------------------
        // TA BIEN
//        double desc = 0.0;
//        if (total >= 500) {
//            if (total <= 2000) {
//                desc = 30.0;
//            } else {
//                desc = 50.0;
//            }
//        }
//        total = total * desc / 100.0;
        
        // C -------------------------------------
        // TA BIEN
//        double desc = 0.0;
//        if (total <= 2000) {
//            if (total >= 500) {
//                desc = 30.0;
//            }
//        } else {
//            desc = 50.0;
//        }
//        total = total * desc / 100.0;
        
        // D -------------------------------------
        // TA MAL
//        double desc = 0.0;
//        if (total > 500) {
//            if (total < 2000) {
//                desc = 30.0;
//            } else {
//                desc = 50.0;
//            }
//        }
//        total = total * desc / 100.0;
    }

}
