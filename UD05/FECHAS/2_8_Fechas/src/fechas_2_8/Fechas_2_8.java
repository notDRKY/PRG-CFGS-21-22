/*
 * 8. Introducir dos fechas e indicar los días transcurridos entre las dos fechas.
 * 
 *     1 | Introduce la fecha inicial con formato dd/mm/yyyy: 01/02/2021
 *     2 | Introduce la fecha final con formato dd/mm/yyyy: 15/03/2022
 *     3 | La fecha inicial es: 1/2/2021
 *     4 | La fecha final es: 15/3/2022
 *     5 | Entre la fecha inicial y la final hay un periodo de: P1Y1M14D
 *     6 | dias: 14
 *     7 | meses: 1
 *     8 | años: 1
 */
package fechas_2_8;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Fechas_2_8 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadenaFechaInicial;
        String cadenaFechaFinal;
        
        // FORMATO DE LAS FECHAS (dd/mm/yyyy)
        // Creo un formato con el valor deseado.
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("d/MM/u");
        
        // CREACIÓN FECHA INICIAL
        System.out.print("Introduce la fecha inicial con formato dd/mm/yyyy: ");
        // Recojo una cadena que contiene la fecha con el formato indicado.
        cadenaFechaInicial = teclado.nextLine();
        // Creo un objeto tipo LocalDate con la cadena que contiene la fecha
        // conviertiendolo con el parse y el formato.
        LocalDate fechaInicial = LocalDate.parse(cadenaFechaInicial, formato);
        
        // CREACIÓN FECHA FINAL
        System.out.print("Introduce la fecha final con formato dd/mm/yyyy: ");
        // Recojo una cadena que contiene la fecha con el formato indicado.
        cadenaFechaFinal = teclado.nextLine();
        // Creo un objeto tipo LocalDate con la cadena que contiene la fecha
        // conviertiendolo con el parse y el formato.
        LocalDate fechaFinal = LocalDate.parse(cadenaFechaFinal, formato);
        
        System.out.println("La fecha inicial es: \t" + fechaInicial.format(formato)); // SOUT FECHA INICIAL
        System.out.println("La fecha final es: \t" + fechaFinal.format(formato)); // SOUT FECHA FINAL
        
        // Creo un Period (periodo1) con el periodo que ha transcurrido entre 
        // FechaInicial y FechaFinal.
        Period periodo1 = Period.between(fechaInicial, fechaFinal);
        System.out.println("Entre la fecha inicial y la final hay un periodo de: "
                + periodo1);
        // Utilizo el método getDays de periodo1 para recoger los dias.
        System.out.println("dias: \t" + periodo1.getDays());
        // Utilizo el método getMonths de periodo1 para recoger los meses.
        System.out.println("meses: \t" + periodo1.getMonths());
        // Utilizo el método getYears de periodo1 para recoger los años.
        System.out.println("años: \t" + periodo1.getYears());
    }
}
