/* 18. Indica cuales serán los valores de las variables después de ejecutar cada uno de los
siguientes fragmentos de código. Resuelve el ejercicio sin escribir los programas
correspondientes y probarlos. */

public class Ejercicio18 {
    public static void main(String[] args) {

        // 1
        int a= 3, b= 2;
        a = b + b;
        b = a + a;
        System.out.print("a= " + a + "b= " + b);
        // El valor a será 4 y el valor b será 8
        
        // 2
        int a= 3, b= 0;
        a = b - 1;
        b = a + b;
        System.out.print("a= " + a + "b= " + b);
        // El valor a será -1 y el valor b será -1

        // 3
        int a, b= 5;
        b++;
        ++b;
        a= b + 1;
        System.out.print("a= " + a + "b= " + b);
        // El valor a será 8 y el valor b será 7

        // 4
        int a= 5, b;
        b = a ++;
        System.out.print("a= " + a + "b= " + b);
        // El valor a será 5 y el valor b será 6

        // 5
        int a= 5, b;
        b = ++a;
        System.out.print("a= " + a + "b= " + b);
        // El valor a será 6 y el valor b será 6

        // 6
        int a= 2, b= 3;
        b+= a;
        System.out.print("a= " + a + "b= " + b);
        // El valor a será 2 y el valor b será 5

        // 7
        int a= 2, b= 3;
        b-= a;
        a=- b
        System.out.print("a= " + a + "b= " + b);
        // El valor a será 2 y el valor b será 1

        // 8
        int a= 2, b= 3;
        b%= a;
        System.out.print("a= " + a + "b= " + b);
        // El valor a será 2 y el valor b será 1

        // 9
        int a= 2, b= 3, c= 4;
        a= --b + c++;
        b+=a;
        System.out.print("a= " + a + "b= " + b + "c= " + c);
        // El valor a será 8, el valor b será 6 y el valor de c será 5
    }
}