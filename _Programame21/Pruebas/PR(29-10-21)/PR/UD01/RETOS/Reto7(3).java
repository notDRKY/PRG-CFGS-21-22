public class Reto7 {
	public static void main (String [] args) {
		String primeraOpcion, segundaOpcion, terceraOpcion; //Creacion de variables de texto
		double primerNumero, segundoNumero, tercerNumero; //Creacion variables numericas double
		System.out.print ("Dime un numero: "); //Pido un numero
		primeraOpcion=System.console().readLine(); //Guardo el numero en la variable de texto
		primerNumero=Double.parseDouble(primeraOpcion); //Convierto el numero de la variable de texto en un numero y lo guardo en la variable double
		System.out.print ("Dime otro numero: ");
		segundaOpcion=System.console().readLine();
		segundoNumero=Double.parseDouble(segundaOpcion);
		System.out.print ("Dime el ultimo numero: ");
		terceraOpcion=System.console().readLine();
		tercerNumero=Double.parseDouble(terceraOpcion);
		System.out.print (primerNumero*segundoNumero*tercerNumero);
	}
}