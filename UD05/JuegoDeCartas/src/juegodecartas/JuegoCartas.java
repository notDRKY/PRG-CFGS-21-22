/*
 * Se está desarrollando una aplicación que usa una baraja de cartas. Para ello, se
 * implementarán en Java las clases necesarias.
 * 
 * 2. Implementar una clase JuegoCartas con los métodos siguientes:
 *     Un método de clase (estático) public static int ganadora( Carta c1, Carta
 *     c2, int triunfo) que dados dos objetos Carta y un número entero
 *     representando el palo de triunfo (o palo ganador), determine cuál es la carta
 *     ganadora. El método debe devolver 0 si las dos cartas son iguales. En caso
 *     contrario, devolverá -1 cuando la primera carta es la ganadora y 1 si la segunda
 *     carta es la ganadora.
 * 
 *     Para determinar la carta ganadora se aplicarán las siguientes reglas:
 *         Si las dos cartas son del mismo palo, la carta ganadora es el as (valor
 *         1) y, en el resto de casos, la carta ganadora es la de valor más alto
 *         (por ejemplo, "1 de oros" gana a "7 de oros", "5 de copas" gana a "2
 *         de copas", "11 de bastos" gana a "7 de bastos").
 * 
 *         Si las dos cartas son de palos diferentes:
 * 
 *             Si el palo de alguna carta es el palo de triunfo, dicha carta es
 *             la ganadora.
 * 
 *             En otro caso, la primera carta siempre gana a la segunda.
 * 
 *     Un método main en el que se debe:
 *         Crear una Carta aleatoriamente y mostrar sus datos por pantalla.
 * 
 *         Generar aleatoriamente un entero en el rango [0..3] representando el
 *         palo de triunfo, y mostrar por pantalla a qué palo corresponde.
 * 
 *         Crear una Carta a partir de un palo y un valor dados (solicitados al
 *         usuario desde teclado), y mostrar sus datos por pantalla.
 * 
 *         Mostrar por pantalla la carta ganadora (invocando al método del
 *         apartado anterior con el objeto Carta del usuario.
 */
package juegodecartas;

import java.util.Scanner;

class JuegoCartas {
    
/*
 *     Un método de clase (estático) public static int ganadora( Carta c1, Carta
 *     c2, int triunfo) que dados dos objetos Carta y un número entero
 *     representando el palo de triunfo (o palo ganador), determine cuál es la carta
 *     ganadora. El método debe devolver 0 si las dos cartas son iguales. En caso
 *     contrario, devolverá -1 cuando la primera carta es la ganadora y 1 si la segunda
 *     carta es la ganadora.
 * 
 *     Para determinar la carta ganadora se aplicarán las siguientes reglas:
 *         Si las dos cartas son del mismo palo, la carta ganadora es el as (valor
 *         1) y, en el resto de casos, la carta ganadora es la de valor más alto
 *         (por ejemplo, "1 de oros" gana a "7 de oros", "5 de copas" gana a "2
 *         de copas", "11 de bastos" gana a "7 de bastos").
 * 
 *         Si las dos cartas son de palos diferentes:
 * 
 *             Si el palo de alguna carta es el palo de triunfo, dicha carta es
 *             la ganadora.
 * 
 *             En otro caso, la primera carta siempre gana a la segunda.
 */
    
    public static int ganadora(Carta c1, Carta c2, int triunfo) {
        if (c1.getPalo() != c2.getPalo()) {
            // DISTINTOS PALOS
            if (c2.getPalo() == triunfo) {
                return 1;
            }
            return - 1;
        } else {
            // PALOS IGUALES
            // IFs anidados(?)
            if (c1.getValor() == c2.getValor()) {
                // SI SON IGUALES...
                return 0;
            } else if (c1.getValor() == 1 && c2.getValor() != 1) {                
                // SI LA C1 TIENE EL AS Y C2 NO...
                return -1;
            } else if (c2.getValor() == 1 && c1.getValor() != 1) {
                // SI LA C2 TIENE EL AS Y C1 NO...
                return 1;
            } else if ((c1.getValor() - c2.getValor()) > 0) {
                // SI LA RESTA ES POSITIVA C1 SERÁ MAYOR
                return -1;
            } else {
                // SI LA RESTA NO ES POSTIVA C2 SERÁ MAYOR
                return 1;
            }
        }
    }
    
    public static void main(String[] args) {
    /*     Un método main en el que se debe:
     *         Crear una Carta aleatoriamente y mostrar sus datos por pantalla.
     * 
     *         Generar aleatoriamente un entero en el rango [0..3] representando el
     *         palo de triunfo, y mostrar por pantalla a qué palo corresponde.
     * 
     *         Crear una Carta a partir de un palo y un valor dados (solicitados al
     *         usuario desde teclado), y mostrar sus datos por pantalla.
     * 
     *         Mostrar por pantalla la carta ganadora (invocando al método del
     *         apartado anterior con el objeto Carta del usuario.
     */
        Scanner teclado = new Scanner(System.in);
        int triunfo;
        int usrPalo;
        int usrValor;
        // CARTA ALEATORIA DEL SISTEMA
        Carta cartaSistema = new Carta();
        System.out.println("LA CARTA DEL SISTEMA ES: [" + cartaSistema.toString() + "]"); // decorar
        
        // GENERACIÓN DEL TRIUNFO
        triunfo = (int) (Math.random() * 4); // DEL 0 AL 3
        switch (triunfo) {
            case 0: 
                System.out.println("EL TRIUNFO CORRESPONDE A EL PALO [OROS]!");
                break;
            case 1:
                System.out.println("EL TRIUNFO CORRESPONDE A EL PALO [COPAS]!");
                break;
            case 2:
                System.out.println("EL TRIUNFO CORRESPONDE A EL PALO [ESPADAS]!");
                break;
            case 3:
                System.out.println("EL TRIUNFO CORRESPONDE A EL PALO [BASTOS]!");
                break;
            default:
                System.out.println("Se ha producido un ERROR! Triunfo no válido.");
                break;
        }
        
        // CREACIÓN DE CARTA DEL USUARIO
        System.out.println("CREANDO CARTA DEL USUARIO...");
        Carta cartaUsuario;
        System.out.print("INTRODUCE EL PALO DE LA CARTA... \n\tOROS = 0\tCOPAS = 1\tESPADAS = 2\tBASTOS = 3 : ");
        //* OROS     = 0;
        //* COPAS    = 1;
        //* ESPADAS  = 2;
        //* BASTOS   = 3;
        usrPalo = teclado.nextInt();
        
        System.out.print("INTRODUCE EL VALOR DE LA CARTA (1-12): ");
        usrValor = teclado.nextInt();
        
        cartaUsuario = new Carta(usrPalo, usrValor); // INICIALIZACIÓN DE LA CARTA DEL USUARIO
        
        System.out.println("LA CARTA DEL USUARIO ES: [" + cartaUsuario.toString() + "]");
        
        // RESULTADO
        int resultadoGanadora = ganadora(cartaSistema, cartaUsuario, triunfo);
        switch (resultadoGanadora) {
            case -1:
                System.out.println("GANA LA CARTA DEL SISTEMA [" + resultadoGanadora + "]");
                break;
            case 0:
                System.out.println("¡EMPATE! [" + resultadoGanadora + "]");
                break;
            case 1:
                System.out.println("GANA LA CARTA DEL USUARIO [" + resultadoGanadora + "]");
                break;
            default:
                System.out.println("¡ERROR! Ronda no válida. [" + resultadoGanadora + "]");
                break;
        }
    }
}
