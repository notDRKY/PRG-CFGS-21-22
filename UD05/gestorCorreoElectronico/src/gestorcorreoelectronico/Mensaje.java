/*
 * Queremos realizar la parte de un programa de correo electrónico que gestiona la
 * organización de los mensajes en distintas carpetas. Para ello desarrollaremos:
 * 
 * 1. La clase Mensaje . De un mensaje conocemos:
 *     Codigo (int) Número que permite identificar a los mensajes.
 *     Emisor (String) : email del emisor.
 *     Destinatario (String) : email del destinatario.
 *     Asunto (String)
 *     Texto (String)
 * 
 * Desarrollar los siguientes métodos:
 *     Constructor que reciba todos los datos, excepto el código, que se generará
 *     automáticamente (nº consecutivo. Ayuda: utiliza una variable de clase ( static ))
 *     
 *     Consultores de todos los atributos.
 *     
 *     public boolean equals(Object o) . Dos mensajes son iguales si tienen el
 *     mismo código.
 *     
 *     public static boolean validarEMail(String email) : Método estático que
 *     devuelve true o false indicando si la dirección de correo indicada es válida o no.
 *     Una dirección es válida si tiene la forma direccion@subdominio.dominio
 *     
 *     public String toString()
 */
package gestorcorreoelectronico;

public class Mensaje {

    private int codigo;
    private String emisor;
    private String destinatario;
    private String asunto;
    private String texto;
    private static int sigCodigo = 1;
    
    public Mensaje(String emisor, String destinatario, String asunto, String texto) {
        this.emisor = emisor;
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.texto = texto;
        this.codigo = sigCodigo++;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mensaje other = (Mensaje) obj;
        return (this.codigo != other.codigo);
    }

    public static boolean validarEmail(String email) {
        if (email.isBlank() || email.isEmpty()) {
            // si el string está vacío...
            return false;
        } else if (!email.contains("@") || !email.contains(".")) {
            // si el string no contiene "@" o "." ...
            return false;
        } else if (email.startsWith("@") || email.startsWith(".")) {
            // si el string empieza por "@" o "." ...
            return false;
        } else if (email.endsWith("@") || email.endsWith(".")) {
            // si el string termina por "@" o "." ...
            return false;
        } else if (email.indexOf(".", email.indexOf("@")) <= (email.indexOf("@") + 1)) {
            // si se encuentra un punto justo después de "@" o
            // si no se encuentra ningún punto después de "@"...
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Mensaje " + "C = " + codigo
                + ", Emisor = " + emisor
                + ", Destinatario = " + destinatario
                + ", Asunto = " + asunto
                + ", Texto = " + texto;
    }
    
    /*
    * Necesario para el método buscar de carpetas
    */
    public int getCodigo() {
        return codigo;
    }
    
}
