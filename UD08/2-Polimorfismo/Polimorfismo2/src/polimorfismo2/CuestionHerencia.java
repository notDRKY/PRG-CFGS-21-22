/*
 * public static void main (String a[]){
 * String tmp;
 * Derivada derivada;
 * Derivada2 derivada2;
 * Base base;
 * derivada2 = new Derivada2(); 
 * base = derivada2;
 * tmp = derivada2.metodo1();           derivada2 llama a metodo1() de Derivada
 * System.out.println("1.-"+tmp);
 * tmp = derivada2.metodoIn2("EDA!!");  derivada2 llama a metodoIn2() de Derivada
 * System.out.println("2.-"+tmp);
 * tmp = base.metodo1();                base(base = derivada2) llama al metodo1() de Derivada
 * System.out.println("3.-"+tmp);
 * tmp = base.metodo2("EDA!!");         base(base = derivada2) llama al metodo2() de Derivada2
 * System.out.println("4.-"+tmp);
 * tmp = derivada2.metodoIn3();         derivada2 llama a metodoIn3 de Derivada
 * System.out.println("5.-"+tmp);
 * tmp = derivada2.metodo4();           derivada2 llama a su propio método metodo4()
 * System.out.println("6.-"+tmp);
 * tmp = base.metodo3();                metodo3() no existe, error de compilación
 * System.out.println("7.-"+tmp);
 * derivada = new Derivada();           reset derivada = new Derivada();
 * derivada2 = new Derivada2();         reset derivada2 = new Derivada2();
 * base = new Base();                   reset base = new Base();
 * Distinta ref = new Distinta();       la clase Distitna no existe
 * 
 * tmp = ref.prueba(derivada2); System.out.println("8.-"+tmp);      la clase Distitna no existe
 * tmp = ref.prueba(derivada); System.out.println("9.-"+tmp);       la clase Distitna no existe
 * tmp = ref.prueba(base); System.out.println("10.-"+tmp);          la clase Distitna no existe
 * }
 *
 * Señalar los errores existentes.
 *
 * Una vez corregido el programa, escribir la salida por pantalla resultado de su
 * ejecución.
 *
 */
package polimorfismo2;

public class CuestionHerencia {

    public static void main(String[] args) {
//        String tmp;
//        Derivada derivada;
//        Derivada2 derivada2;
//        Base base;
//        derivada2 = new Derivada2();
//        base = derivada2;
//        tmp = derivada2.metodo1();
//        System.out.println("1.-" + tmp);
//        tmp = derivada2.metodoIn2("EDA!!");
//        System.out.println("2.-" + tmp);
//        tmp = base.metodo1();
//        System.out.println("3.-" + tmp);
//        tmp = base.metodo2("EDA!!");
//        System.out.println("4.-" + tmp);
//        tmp = derivada2.metodoIn3();
//        System.out.println("5.-" + tmp);
//        tmp = derivada2.metodo4();
//        System.out.println("6.-" + tmp);
//        tmp = base.metodo3();
//        System.out.println("7.-" + tmp);
//        derivada = new Derivada();
//        derivada2 = new Derivada2();
//        base = new Base();
//        Distinta ref = new Distinta();
//        tmp = ref.prueba(derivada2);
//        System.out.println("8.-" + tmp);
//        tmp = ref.prueba(derivada);
//        System.out.println("9.-" + tmp);
//        tmp = ref.prueba(base);
//        System.out.println("10.-" + tmp);
    }
}
