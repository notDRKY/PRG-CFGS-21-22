public class ejemploSaludoNombre {
	public static void main (String [] args) {
		String texto, texto2;
		int edad;
		System.out.print("Dime tu nombre: ");
		texto=System.console().readLine();
		System.out.println("Hola " + texto);
		System.out.print("Dime tu edad: ");
		texto2=System.console().readLine();
		edad=Integer.parseInt(texto2);
		System.out.println("Tú edad es: " + edad);
		System.out.println("Eres " + ((edad>20)? "mayor" : "joven"));
	}
}