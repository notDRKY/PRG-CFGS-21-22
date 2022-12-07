/*
 * 6. Mostrar la fecha y hora de hoy con los siguientes formatos (para todos los ejemplos se
 * supone que hoy es 26 de agosto de 2021 a las 17 horas 16 minutos y 8 segundos, tu
 * deberas mostrar la fecha y hora de tu sistema en el momento de ejecuc):
 * 
 *      a) August 26, 2021, 5:16 pm
 *      b) 08.26.21
 *      c) 26, 8, 2021
 *      d) 20210826
 *      e) 05-16-08, 26-08-21
 *      f) Thu Aug 26 17:16:08
 *      g) 17:16:08
 */
package pkg2_6_fechas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fechas_2_6 {
    
    public static void main(String[] args) {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        
        // a) August 26, 2021, 5:16 pm
        String fechaFormato1 = fechaHoraActual.format(DateTimeFormatter.ofPattern("MMMM d',' u',' h':'m a"));
        System.out.println(fechaFormato1);
        
        // b) 08.26.21
        String fechaFormato2 = fechaHoraActual.format(DateTimeFormatter.ofPattern("MM'.'d'.'uu"));
        System.out.println(fechaFormato2);
        
        // c) 26, 8, 2021
        String fechaFormato3 = fechaHoraActual.format(DateTimeFormatter.ofPattern("d', 'M', 'u"));
        System.out.println(fechaFormato3);
        
        // d) 20210826
        String fechaFormato4 = fechaHoraActual.format(DateTimeFormatter.ofPattern("uMMd"));
        System.out.println(fechaFormato4);
        
        // e) 05-16-08, 26-08-21
        String fechaFormato5 = fechaHoraActual.format(DateTimeFormatter.ofPattern("h-m-s', 'd-MM-uu"));
        System.out.println(fechaFormato5);
        
        // f) Thu Aug 26 17:16:08
        String fechaFormato6 = fechaHoraActual.format(DateTimeFormatter.ofPattern("E MMM d k:m:s"));
        System.out.println(fechaFormato6);
        
        // g) 17:16:08
        String fechaFormato7 = fechaHoraActual.format(DateTimeFormatter.ofPattern("k:m:s"));
        System.out.println(fechaFormato7);
    }
}
