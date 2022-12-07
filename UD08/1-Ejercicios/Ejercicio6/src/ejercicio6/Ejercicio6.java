package ejercicio6;

public class Ejercicio6 {
    /*
     * RESPONDE a las siguientes cuestiones justificando las respuestas.
     * 1. ¿Es necesario el uso de this en el contructor de la clase Estudiante?
     *      No, porque se puede hacer referencia a credito directamente sin el this.
     * 
     * 2. ¿Es necesario el uso de super en el método toString de la clase Estudiante?
     *      Es necesario si queremos que se impriman los atributos de la clase Persona.
     *      Si, porque es necesario para usar el toString().
     * 3. Si quitásemos el constructor de la clase Estudiante ¿daría un error de
     * compilación?
     *      No.
     * 
     * 4. En el método toString de la clase Empleado ¿por qué es incorrecto el acceso
     * que se hace al atributo nombre ? ¿Cómo se tendría que definir nombre en la
     * clase Persona para evitar el error?
     *      Si, está mal implementado, podría llamarse al método this.getNombre() o al
     *      super.toString(), este último no imprimiría sólo el nombre.
     * 
     * 5. ¿Qué consecuencia tiene que algunos métodos de la clase Persona se hayan
     * definido final ?
     *      Que las clases que desciendan de Persona no podrán redefinir el método.
     *      
     * 6. Si el método toString no se hubiera definido en ninguna de las tres clases
     * ¿daría error el sout del método main ?
     *      No, imprime la zona de memoria dónde está guardado el objeto Estudiante.
     *      
     */

}
