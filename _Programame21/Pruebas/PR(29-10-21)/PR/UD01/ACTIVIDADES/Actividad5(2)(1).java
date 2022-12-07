/* 5. Escribe un programa que calcule el salario semanal de un empleado en base a las horas trabajadas, a
razón de 12 euros la hora. */
public class Actividad5 {
    public static void main (String [] args) {
        String textoHoras;
        int numHoras, salario;
        final int PRECIO_HORA=12;

        System.out.print("Numero de horas semanales: ");
        textoHoras=System.console().readLine();
        numHoras=Integer.parseInt(textoHoras);

        salario=(numHoras * PRECIO_HORA);

        System.out.print("El salario semanal es: " + salario + " euros. ");
    }
}