/*
 * 1. Diseñar la clase Reserva , de manera que contemple la información descrita e
 * implementar:
 * 
 *     public Reserva(String nif, String nombre, String tel, int codigo, int
 *     ejemplares) . Constructor que recibe todos los datos de la reserva.
 * 
 *     public Reserva(String nif, String nombre, String tel, int codigo) .
 *     Constructor que recibe los datos del cliente y el código del libro. Establece el
 *     número de ejemplares a uno.
 * 
 *     Consultores de todos los atributos.
 * 
 *     public int setEjemplares(int ejemplares) . Modificador del número de
 *     ejemplares. Establece el número de ejemplares al valor indicado como
 *     parámetro.
 * 
 *     public String toString() que devuelva un String con los datos de la reserva
 * 
 *     public boolean equals(Object o) . Dos reservas son iguales si son del mismo
 *     cliente y reservan el mismo libro.
 * 
 *     public int compareTo(Object o) . Es menor la reserva cuyo código de libro es
 *     menor. El parámetro es de tipo Object así que revisa si debes hacer alguna
 *     "adaptación".
 * 
 */
package reservaslibreria;

class Reservas {
    
    String nif;         // Nif del cliente ( String )
    String nombre;      // Nombre del cliente ( String )
    String telefono;    // Teléfono del cliente ( String )
    int codigo;         // Código del libro reservado. ( entero )
    int ejemplares;     // Numero de ejemplares ( entero )

    public Reservas(String nif, String nombre, String telefono, int codigo, int ejemplares) {
        this.nif = nif;
        this.nombre = nombre;
        this.telefono = telefono;
        this.codigo = codigo;
        this.ejemplares = ejemplares;
    }
    
    public Reservas(String nif, String nombre, String telefono, int codigo) {
        this.nif = nif;
        this.nombre = nombre;
        this.telefono = telefono;
        this.codigo = codigo;
        this.ejemplares = 1;
    }
    
    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }
    
    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getNumero() {
        return ejemplares;
    }
    
}
