/*
 * 3. La clase Carpeta , cada carpeta tiene un nombre y una lista de Mensajes. Para ello
 * usaremos un array con capacidad para 100 mensajes y un atributo que indique el
 * número de mensajes que contiene la carpeta. Además se implementarán los siguientes
 * métodos:
 *     public Carpeta(String nombre) : Constructor. Dado un nombre, crea la carpeta
 *     sin mensajes.
 * 
 *     public void añadir(Mensaje m) : Añade a la carpeta el mensaje indicado.
 * 
 *     public void borrar(Mensaje m) throws ElementoNoEncotradoException : Borra
 *     de la carpeta el mensaje indicado. Lanza la excepción si el mensaje no existe.
 *     
 *     public Mensaje buscar(int codigo) throws ElementoNoEncontradoException :
 *     Busca el mensaje cuyo código se indica. Si lo encuentra devuelve el mensaje,
 *     en caso contrario lanza la excepción.
 *     
 *     public String toString() que devuelva un String con el nombre de la
 *     carpeta y sus mensajes
 *     
 *     public static void moverMensaje(Carpeta origen, Carpeta destino, int
 *     codigo) throws ElementoNoEncontradoException : Método estático. Recibe dos
 *     Carpetas de correo y un código de mensaje y mueve el mensaje indicado de
 *     una carpeta a otra. Para ello buscará el mensaje en la carpeta origen. Si existe
 *     lo eliminará y lo añadirá a la carpeta de destino. Si el mensaje indicado no está
 *     en la carpeta de origen lanza ElementoNoEncontradoException.
 */
package gestorcorreoelectronico;

public class Carpeta {
    
    private final static int MAX_M = 100;
    private String nombre;
    private Mensaje[] listaMensajes;
    private int numMensajes;

    /*
     * public Carpeta(String nombre) : Constructor. Dado un nombre, crea la carpeta
     * sin mensajes.
     */
    public Carpeta(String nombre) {
        this.nombre = nombre;
        this.listaMensajes = new Mensaje[MAX_M];
        numMensajes = 0;
    }

    /*
     * public void añadir(Mensaje m) : Añade a la carpeta el mensaje indicado.
     * Si (ocupacion<MAX_DISPONIBLE)
     * inserto el elemento en lista[ocupacion+1] y ocupacion++
     */
    public void añadir(Mensaje m) {
        if (numMensajes < MAX_M) {
            this.listaMensajes[numMensajes++] = m;
        } else {
            System.out.println("¡LA LISTA ESTÁ LLENA!");
        }
    }

    /*
     * public void borrar(Mensaje m) throws ElementoNoEncotradoException : Borra
     * de la carpeta el mensaje indicado. Lanza la excepción si el mensaje no existe.
     */
    public void borrar(Mensaje m) throws ElementoNoEncontradoException {
        if (numMensajes > 0) {
            int pos;
            boolean encontrado = false;
            for (pos = 0; ((!encontrado) && (pos < numMensajes)); pos++) {
                /*
                 * Primer bucle para localizar la posición de elemento que queremos
                 * borrar, usamos un if dentro del bucle que recorremos, con la longitud
                 * de los mensajes que hay en nuestra Carpeta.
                 */
                if (this.listaMensajes[pos].equals(m)) {
                    encontrado = true;
                }
            }
            if (encontrado) {
                int i;
                // Le restamos 1 a pos debido a que el for anterior siempre sumará pos++
                // aunque encuentre el mensaje correcto.
                for (i = (pos - 1); i < numMensajes; i++) {
                    /*
                     * Segundo bucle que usaremos para mover todos los elementos a partir
                     * de la posición obtenida en el anterior bucle, para remplazar la
                     * posición anterior, usaremos esa misma posición más uno.
                     */
                    this.listaMensajes[i] = this.listaMensajes[i + 1];
                }
                /*
                 * IMPORTANTE: Borramos el elemento duplicado que quedará al final del array.
                 * Decrementar la variable numMensajes porque ya habremos eliminado el mensaje deseado.
                 */
                this.listaMensajes[i + 1] = null;
                numMensajes--;
            } else {
                throw new ElementoNoEncontradoException();
            }
        } else {
            throw new ElementoNoEncontradoException();
        }
    }

    /*
     * public Mensaje buscar(int codigo) throws ElementoNoEncontradoException :
     * Busca el mensaje cuyo código se indica. Si lo encuentra devuelve el mensaje,
     * en caso contrario lanza la excepción.
     */
    public Mensaje buscar(int codigo) throws ElementoNoEncontradoException {
        for (int pos = 0; pos < numMensajes; pos++) {
            if (this.listaMensajes[pos].getCodigo() == codigo) {
                return listaMensajes[pos];
            }
        }
        throw new ElementoNoEncontradoException();
    }
    
    static class ElementoNoEncontradoException extends Exception {
        
        public ElementoNoEncontradoException() {
        }
    }

    /*
     * public String toString() que devuelva un String con el nombre de la
     * carpeta y sus mensajes
     */
    @Override
    public String toString() {
        String cadena = "CARPETA | " + "Nombre: " + nombre;
        for (int pos = 0; pos < this.listaMensajes.length; pos++) {
            if (listaMensajes[pos] != null) {
                cadena += "\n" + listaMensajes[pos];
            }
        }
        return cadena;
    }

    /*
     * public static void moverMensaje(Carpeta origen, Carpeta destino, int
     * codigo) throws ElementoNoEncontradoException : Método estático. Recibe dos
     * Carpetas de correo y un código de mensaje y mueve el mensaje indicado de
     * una carpeta a otra. Para ello buscará el mensaje en la carpeta origen. Si existe
     * lo eliminará y lo añadirá a la carpeta de destino. Si el mensaje indicado no está
     * en la carpeta de origen lanza ElementoNoEncontradoException.
     */
    public static void moverMensaje(Carpeta origen, Carpeta destino, int codigo) throws ElementoNoEncontradoException {
        Mensaje m = origen.buscar(codigo);
        destino.añadir(m);
        origen.borrar(m);
    }
    
}
