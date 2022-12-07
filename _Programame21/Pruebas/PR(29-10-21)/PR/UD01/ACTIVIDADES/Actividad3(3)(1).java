/* Escribe un programa que calcule el área de un rectángulo. ( area = base * altura ) */
public class Actividad3 {
    public static void main (String [] args) {
        String textoBase, textoAltura;
        int numBase, numAltura, area;

        //Base
        System.out.print("Dime la base del rectangulo: ");
        textoBase=System.console().readLine();
        numBase=Integer.parseInt(textoBase);

        //Altura
        System.out.print("Dime la altura del rectangulo: ");
        textoAltura=System.console().readLine();
        numAltura=Integer.parseInt(textoAltura);

        //Area
        area=(numBase*numAltura);
        System.out.print("El area de tu rectangulo es: " + area);
    }
}