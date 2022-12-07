/*
 * 16. Suma 10 años, 4 meses y 5 días a la fecha actual.
 *     1 | Hoy es: dijous, 03 de març del 2022
 *     2 | Dentro de 10 años, 4 meses y 5 dias será: dijous, 08 de juliol del 2032
 */
package pkg2_16_fechas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Fechas_2_16 {

    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("eeee',' dd 'de' MMMM 'del' yyyy");
        System.out.println("Hoy es: " + fechaActual.format(formato));
        LocalDate fechaPedida = fechaActual.plus(Period.of(10, 4, 5));
        System.out.println("Dentro de 10 años, 4 meses y 5 dias será: "
                + fechaPedida.format(formato));   
    }
}
