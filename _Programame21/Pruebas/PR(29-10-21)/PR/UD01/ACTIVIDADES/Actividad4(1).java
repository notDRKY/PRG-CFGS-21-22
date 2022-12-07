/* 4. Escribe un programa que calcule el área de un triángulo. ( area = (base * altura) / 2 ) */
public class Actividad4 {
    public static void main (String [] args) {
        String textoBase, textoAltura;
        int numBase, numAltura, area;

        //Base
        System.out.print("Dime la base del triangulo: ");
        textoBase=System.console().readLine();
        numBase=Integer.parseInt(textoBase);

        //Altura
        System.out.print("Dime la altura del triangulo: ");
        textoAltura=System.console().readLine();
        numAltura=Integer.parseInt(textoAltura);

        //Area
        area= (numBase * numAltura) / 2;
        System.out.print("El area del triangulo es: " + area);
    }
}