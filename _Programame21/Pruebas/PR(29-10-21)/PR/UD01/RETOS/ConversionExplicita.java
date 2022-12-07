public class ConversionExplicita {
	public static void main (String [] args) {
		double realLlarg = 300.0;
		// Asignación incorrecta. ¿Un real tiene decimales, no?
		long enterLlarg = (long) realLlarg;
		// Asignación incorrecta. ¿Un entero largo tiene un rango mayor que un entero, no?
		int enter = (int) enterLlarg;
		System.out.println (enter);
	}
}