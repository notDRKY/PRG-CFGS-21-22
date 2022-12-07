package almacen;

// Clase estandar, no publica.
class Registro {
    // ATRIBUTOS DE LA CLASE REGISTRO
    private String codigo;
    private int mes;
    private int compras;
    private int ventas;
    private int stock;
    
    // MÉTODOS (CONSTRUCTORES) DE LA CLASE REGISTRO

    public Registro(String codigo, int mes, int compras, int ventas, int stock) {
        this.codigo = codigo;
        this.mes = mes;
        this.compras = compras;
        this.ventas = ventas;
        this.stock = stock;
    }
    
    // MÉTODOS (NO CONSTRUCTORES) DE LA CLASE REGISTRO
    // TO STRING
    @Override
    public String toString() {
        return "Código: " + codigo + " - Mes: " +  mes + " - Compras: " + compras 
                + " - Ventas: " + ventas + " - Stock: " + stock;
    }
    
    // GETTERS DE LA CLASE
    public String getCodigo() {
        return codigo;
    }

    public int getMes() {
        return mes;
    }

    public int getCompras() {
        return compras;
    }

    public int getVentas() {
        return ventas;
    }

    public int getStock() {
        return stock;
    }
}
