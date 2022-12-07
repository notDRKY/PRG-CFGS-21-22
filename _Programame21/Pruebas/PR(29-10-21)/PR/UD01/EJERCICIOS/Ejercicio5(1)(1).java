public class Ejercicio5 {
    public static void main (String [] args) {
        String texto1, texto2;
        int v1, v2, almacen;

        System.out.print("Dime un numero para v1: ");
        texto1=System.console().readLine();
        v1=Integer.parseInt(texto1);
       
        System.out.print("Dime un numero para v2: ");
        texto2=System.console().readLine();
        v2=Integer.parseInt(texto2);
        
        System.out.println("Antes de intercambiar" + " v1: " + v1 + " y " + " v2: " + v2);
        almacen=v1;
        v1=v2;
        v2=almacen;

        System.out.print("Despues de intercambiar" + " v1: " + v1 + " y " + " v2: " + v2);
    }
}