/*
 * Dada la siguiente jerarquía de clases:
 * 
 * public interface Montador {
 *      void montar(String x);
 *      void desmontar(String x);
 * }
 *
 * public class Obrero {
 *      public Obrero(){System.out.println("Se crea Obrero");}
 *      public void saludar(){System.out.println("Hola, soy Obrero");}
 *      ...
 * }
 *
 * public class Carpintero extends Obrero implements Montador {
 *      public Carpintero() {
 *          System.out.println("Se crea Carpintero");
 *      }
 *
 *      public void montar(String x) {
 *          System.out.println("Montando " + x);
 *      }
 *
 *      public void desmontar(String x) {
 *          System.out.println("Desmontando " + x);
 *      }
 *
 *      public void clavar() {
 *      ...
 *      }
 * }
 *
 * public class Albañil extends Obrero {
 *      public Albañil() {
 *          super();
 *          System.out.println("Se crea Albañil");
 *      }
 *
 *      public void levantarMuro(){
 *          System.out.println("Levantando muro …");
 *      }
 * }
 * ______________________________________________________________________________
 * Indicar qué líneas del siguiente fragmento de programa producirán errores de
 * compilación:
 * 
 * public static void main(String[] args){
 *      Montador m1 = new Carpintero();     <- Se puede crear el objeto Obrero a partir de la superclase Montador.
 *      Montador m2 = new Albañil();        <- Albañil no implementa la Interfaz Montador, error de compilación.
 *      Obrero o1 = new Carpintero();       <- Está bien, superclase Obrero toma referencia de objeto de subclase Carpintero.
 *      Obrero o2 = new Albañil();          <- Está bien, superclase Obrero toma referencia de objeto de subclase Albañil.
 *      o1.montar("Mesa");                  <- El objeto Obrero o1 no puede llamar a los métodos de la subclase Carpintero.
 *                                            Necesita un casting explicito para llamar a los métodos de Carpintero.
 *      o2.levantarMuro();                  <- El objeto Obrero o2 no puede llamar a los métodos de la subclase Albañil.
 *                                            Necesita un casting explicito para llamar a los métodos de Albañil.
 *      m1.saludar();                       <- El objeto de tipo Montador m1 no puede llamar a los métodos de la clase Obrero.
 *                                            Necesita un casting explicito de Carpintero para llamar a los métodos de Obrero.
 *      m1.montar("Silla");                 <- m1 es un objeto de tipo Montador cómo superclase y subclase Carpintero,
 *                                            puede utuilizar el método montar que será el suyo propio.
 *      ((Albañil)o2).levantarMuro();       <- Conversión explicita de Albañil a Albañil (para ejecutar el método)
 *      ((Albañil)o1).levantarMuro();       <- Conversión explicita de Carpintero a Albañil (para ejecutar el método)
 *                                          yo creo que se puede hacer ya que las dos clases (Albañil y Carpintero)
 *                                          descienden de Obrero.
 * }
 * 
 * Una vez eliminadas las líneas con error, indicar cuál sería la salida por pantalla del
 * programa.
 * ______________________________________________________________________________
 * ¿Sería correcta la instrucción siguiente?
 * 
 * Albañil a = new Albañil();           <- Correcto
 * System.out.println(a.toString());    <- Correcto, quizá imprime el toString de Object
 */
package polimorfismo1;

public class Polimorfismo1 {

    public static void main(String[] args) {
        Montador m1 = new Carpintero();
        System.out.println("");
        //Montador m2 = new Albañil();
        Obrero o1 = new Carpintero();
        Obrero o2 = new Albanil();
        //o1.montar("Mesa");
        //o2.levantarMuro();
        //m1.saludar();
        m1.montar("Silla");
        ((Albanil) o2).levantarMuro();
        //((Albanil) o1).levantarMuro();
    }
}
