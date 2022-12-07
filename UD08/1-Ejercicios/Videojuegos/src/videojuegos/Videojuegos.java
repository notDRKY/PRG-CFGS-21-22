/*
 * 2. Un salón de VideoJuegos dispone de ordenadores en las que los clientes pueden jugar.
 * Además de jugar en el establecimiento, la empresa alquila y vende juegos.
 *      1. Diseñar la clase Juego siguiendo las siguientes especificaciones:
 *          
 *          Atributos protected: titulo (String), fabricante (String), año (int).
 *          
 *          Constructor public Juego(String t, String f, int a)
 *          
 *          Consultores de todos los atributos
 *          
 *          public String toString() , que devuelve un String con los datos del
 *          Juego
 *          
 *          public boolean equals(Object o) : Dos juegos son iguales si tienen el
 *          mismo título, fabricante y año.
 *          
 *          public int compareTo(Object o) : Un juego es menor que otro si su
 *          título es menor. A igual título, si su fabricante es menor. A igual título
 *          y fabricante, si su año es menor.
 *      
 *      2. Diseñar las clases JuegoEnAlquiler y JuegoEnVenta (y otras si se considera
 *      oportuno), sabiendo que, además de los atributos descritos anteriormente,
 *      tienen.
 * 
 *          precio
 * 
 *          nº de copias disponibles
 * 
 *          JuegoEnAlquiler (CLASS)
 * 
 *              tiene un atributo que indica el número de días que se
 *              alquila. (Por el precio indicado, hay juegos que se alquilan
 *              por un dia, otros por 2, etc...)
 * 
 *              Constructor que recibe todos sus datos
 * 
 *              tiene un método alquilar que decrementa el número de
 *              copias disponibles.
 * 
 *              tiene un método devolver que incrementa el número de
 *              copias disponibles.
 * 
 *              toString() devuelve todos los datos del JuegoEnAlquiler
 * 
 *          JuegoEnVenta (CLASS)
 * 
 *              Constructor que recibe todos sus datos
 * 
 *              tiene un método vender , que decrementa el número de
 *              copias disponibles.
 * 
 *              toString() devuelve todos los datos del JuegoEnVenta
 */
package videojuegos;

public class Videojuegos {
    
    public static void main(String[] args) {
        JuegoEnVenta j1 = new JuegoEnVenta("Super Mario Galaxy", "Nintendo", 2008, 3);
        JuegoEnVenta j2 = new JuegoEnVenta("Hades", "Supergiant Games", 2020, 8);
        JuegoEnAlquiler j3 = new JuegoEnAlquiler(5, "The Witcher 3: Wild Hunt", "CD Projekt Red", 2015, 12);
        JuegoEnAlquiler j4 = new JuegoEnAlquiler(5, "Grand Theft Auto V", "Rockstar North", 2013, 9);
        
        System.out.println("_______________________________________________________________________________________");
        System.out.println("[TO STRINGS JUEGOS]");
        System.out.println(j1);
        System.out.println(j2);
        System.out.println(j3);
        System.out.println(j4);
        System.out.println("_______________________________________________________________________________________");
        System.out.println("[EQUALS]");
        System.out.println("j1.equals(j4)");
        System.out.println(j1.equals(j4));
        System.out.println("j3.equals(j3)");
        System.out.println(j3.equals(j3));
        System.out.println("_______________________________________________________________________________________");
        System.out.println("[VENDER J1 (JuegoEnVenta)]");
        j1.vender();
        j1.vender();
        System.out.println(j1);
        System.out.println("_______________________________________________________________________________________");
        System.out.println("[DEVOLVER J4 (JuegoEnAlquiler)]");
        j4.devolver();
        j4.devolver();
        System.out.println(j4);
        System.out.println("_______________________________________________________________________________________");
        System.out.println("[COMPARE TO]");
        System.out.println("j1.compareTo(j4)");
        System.out.println(j1.compareTo(j4));
        System.out.println("j3.compareTo(j3)");
        System.out.println(j3.compareTo(j3));
    }
}
