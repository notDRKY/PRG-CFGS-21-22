/* Expresar las siguientes afirmaciones utilizando operadores lógicos y relacionales */

public class Expresiones_Logicas{
    public static void main(String[] args) {

        int m, j, p, v ;

        //1. Miguel es menor de edad.
        (m < 18);

        //2. Miguel es mayor que Julio
        (m > j);

        //3. Miguel es el más viejo.
        (m > j) && (m > p) && (m > v);

        //4. Miguel es el más joven.
        (m < j) && (m < p) && (m < v);

        //5. Miguel no es el más joven.
        (m < j) || (m < p) || (m < v);

        //6. Miguel no es el más viejo.
        (m > j) || (m > p) || (m > v);

        //7. Alguno de ellos es mayor de edad.
        (m < 18) || (j < 18) || (p < 18) || (v < 18);

        //8. Miguel y Julio son los más jóvenes.
        (m) && (j) < (p) && (v);

        //9. Entre todos tienen más de 100 años.
        (m + j + p +v) > 100;
        
        //10. Entre Miguel y Julio suman más edad que Pablo.
        (m + j) > p;

        //11. Entre Miguel y Julio suman más edad que Pablo y Vicente juntos.
        (m + j) > (p + v);

        //12. Si los ordenamos por edades de menor a mayor, Julio es el segundo.
        (m > j > p > v);

        //13. Si los ordenamos por edades de menor a mayor, Julio es el segundo y Pablo el tercero.


        //14. Al menos uno de ellos es menor de edad.
        (m < 18) || (j < 18) || (p < 18) || (v < 18);

        //15. Al menos dos de ellos son menores de edad.


        //16. Todos son menores de edad.
        (m < 18) && (j < 18) && (p < 18) && (v < 18);

        //17. Solo dos de ellos son menores de edad.


        //18. Al menos dos de ellos nacieron el mismo año.


        //19. Solo dos de ellos nacieron el mismo año.


        //20. Al menos uno de ellos es menor que Julio


        //21. Solo uno de ellos es menor que Julio


        //22. Miguel es mayor de edad y alguno de los otros es menor de edad.


    }
}