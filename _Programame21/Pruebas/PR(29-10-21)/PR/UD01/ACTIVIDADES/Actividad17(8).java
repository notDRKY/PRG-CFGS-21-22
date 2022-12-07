/* 17. Realiza un programa en Java que tenga las variables edad, nivel de estudios e ingresos y almacene en una
variable llamada jasp el valor verdadero si la edad es menor o igual a 28 y el nivel de estudios es mayor a
3, o bien la edad es menor de 30 y los ingresos superiores a 28000. En caso contrario almacenar el valor
falso. 

true= edad <= 28, nvlEstudios > 3 | edad < 30, ingresos > 28000 

*/

public class Actividad17{
    public static void main (String [] args) {
        String textoEdad, textoEstudios, textoIngresos;
        int edad, nvlEstudios, ingresos ;
        boolean jasp;

        System.out.print("Introduce la edad: ");
        textoEdad= System.console().readLine();
        edad= Integer.parseInt(textoEdad);

        System.out.print("Introduce el nivel de estudios: ");
        textoEstudios= System.console().readLine();
        nvlEstudios= Integer.parseInt(textoEstudios);

        System.out.print("Introduce el numero de ingresos anuales: ");
        textoIngresos= System.console().readLine();
        ingresos= Integer.parseInt(textoIngresos);

        jasp= (edad <= 28 && nvlEstudios > 3 || edad < 30 && ingresos > 28000)? true:false;

        System.out.print(jasp);

    }
}