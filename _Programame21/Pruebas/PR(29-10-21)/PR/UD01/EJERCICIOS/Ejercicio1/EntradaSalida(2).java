
public class EntradaSalida {
	public static void main (String arg[]) {
		Scanner tec = new Scanner(System.in);
		int a, b; //Si le introducimos un numero real o un caracter alfabetico, da error porque no es la entrada esperada por el programa.
		System.out.println("Introduce un número entero");
		a = tec.nextInt();
		System.out.println("Introduce otro número entero");
		b = tec.nextInt();
		System.out.println("Los números introducidos son " + a + " y " + b);
		//Cada vez que se use un scanner la linea java import debe de estar, si  no, no compilara.
	}
}