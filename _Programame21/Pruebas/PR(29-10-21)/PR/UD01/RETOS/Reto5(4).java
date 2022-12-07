public class Reto5 {
    public static void main (String[] args) { //El programa sí que compila, y muestra por pantalla el número 300 y no muestra los decimales
		double realLlarg = 30000000000000.0;
		// Asignación incorrecta. ¿Un real tiene decimales, no?
		long enterLlarg = (long) realLlarg;
		// Asignación incorrecta. ¿Un entero largo tiene un rango mayor que un entero, no?
		int enter = (int) enterLlarg; /* Para que pueda mostrar el valor inicial correctamente int deberia tener mas precision que double o long
		para representar el valor al no ser así da numero negativo por la conversion de bits, ya que no caben en int */
		System.out.println (enter) ; 
		//El programa funciona, pero al convertir el numero a entero (int) se pierden todos los decimales, porque representa un numero entero.
    }
}