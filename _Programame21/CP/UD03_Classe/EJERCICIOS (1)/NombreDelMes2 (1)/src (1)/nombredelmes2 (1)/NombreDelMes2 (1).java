/*
 * 54. (NombreDelMes2)Escribir un programa que lea de teclado el número
 * de un mes (1 a 12) y visualice el nombre del més (enero, febrero, etc). 
 * Resolver utilizando la sentencias switch.
 */
package nombredelmes2;
import java.util.Scanner;

public class NombreDelMes2 {
    
    public static String nombreDelMes(int usrNum){
        String nombreDelMes = "";
        
        switch (usrNum){
            case 1:
                nombreDelMes = "Enero";
                break;
            case 2:
                nombreDelMes = "Febrero";
                break;
            case 3:
                nombreDelMes = "Marzo";
                break;
            case 4:
                nombreDelMes = "Abril";
                break;
            case 5:
                nombreDelMes = "Mayo";
                break;
            case 6:
                nombreDelMes = "Junio";
                break;
            case 7:
                nombreDelMes = "Julio";
                break;
            case 8:
                nombreDelMes = "Agosto";
                break;
            case 9:
                nombreDelMes = "Septiembre";
                break;
            case 10:
                nombreDelMes = "Octubre";
                break;
            case 11:
                nombreDelMes = "Noviembre";
                break;
            case 12:
                nombreDelMes = "Diciembre";
                break;
        }
        
        return nombreDelMes;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int usrNum;
        
        System.out.print("Dime el numero del mes para saber el nombre [NOMBRE DEL MES]: ");
        usrNum = teclado.nextInt();
        
        System.out.println("El mes numero " + usrNum + " es "
                + nombreDelMes(usrNum) + ".");
    }
    
}
