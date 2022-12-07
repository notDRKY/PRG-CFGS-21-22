/* 15. (Redondear1) Math.round(x) redondea x de manera que este queda sin decimales. ( Math.round(35.5289)
da como resultado 35.0 ) 
Trata de escribir un programa en el que el usuario introduzca un número real y a continuación se
muestre redondeado a un decimal. Pista : combinar productos, divisiones y Math.round() */

public class Ejercicio15 {
    public static void main(String [] args) {
        String textoNum;
        double numInicial, resultado, aux;

        System.out.print("Introduce un numero entero: ");
        textoNum= System.console().readLine();
        numInicial= Double.parseDouble(textoNum);

        resultado= (numInicial * 10);
        aux= Math.round(resultado);
        resultado= (aux / 10);
        
        System.out.print("El numero, redondeado a un decimal es: " + resultado);

    }
}