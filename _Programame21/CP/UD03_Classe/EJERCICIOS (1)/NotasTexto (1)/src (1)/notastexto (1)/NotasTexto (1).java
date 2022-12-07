/*
 * 4. (NotasTexto) Escribir un programa que acepte del usuario la nota de un examen (valor numérico entre 1 y
 * 10) y muestre el literal correspondiente a dicha nota según (insuficiente, suficiente, bien, notable,
 * sobresaliente).
 */
package notastexto;
import java.util.Scanner;

public class NotasTexto {
    
    public static String calculaExamen(double nota) {
        String calificacion = "";
        if (nota < 5) {
            calificacion = "INSUFICIENTE";
        } else if ((nota >= 5) && (nota < 6)){
            calificacion = "SUFICIENTE";
        } else if ((nota >= 6) && (nota < 7)) {
            calificacion = "BIEN";
        } else if ((nota >= 7) && (nota < 9)) {
            calificacion = "NOTABLE";
        } else if ((nota >= 9) && (nota < 10)) {
            calificacion = "SOBRESALIENTE";
        } else {
            calificacion = "MATRICULA DE HONOR";
        }
        
        return calificacion;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numUsuario;
        
        System.out.println("Dime la nota de tu examen: ");
        numUsuario = teclado.nextDouble();
        System.out.println("Tu nota es un: " + numUsuario 
                + " | " + calculaExamen(numUsuario));
    }
    
}
