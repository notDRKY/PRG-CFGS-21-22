package expendedora;

public class Expendedora {
    
    private double credito;
    private int stock;
    private double precio;
    private double cambio;
    private double recaudacion;
    
    public Expendedora(double cambio, int stock, double precio) {
        this.credito = 0;
        this.stock = stock;
        this.precio = precio;
        this.cambio = cambio;
        this.recaudacion = 0;
    }

    public double getCredito() {
        return credito;
    }

    public double getCambio() {
        return cambio;
    }

    public double getRecaudacion() {
        return recaudacion;
    }
    
    // En el futuro se cambiarán.
    public int getStock(int producto) {
        return stock;
    }

    public double getPrecio(int producto) {
        return precio;
    }
    
    public String toString() {
        return "Credito: " + this.credito + " euros\n" 
                + "Cambio: " + this.cambio + " euros\n"
                + "Stock: " + this.stock + " unidades\n"
                + "Recaudación: " + this.recaudacion + "euros";
    }
    
    public void introducirDinero(double importe) {
        this.credito = importe;
    }
    
    public double solicitarDevolucion() {
        double aux = this.credito;
        this.credito = 0;
        return aux;
    }
    
    /*
     * public double comprarProducto(int producto) throws
     * NoHayCambioException, NoHayProductoException,
     * CreditoInsuficienteException . Representa la operación mediante la
     * cual el cliente selecciona un producto para su compra. El método
     * devuelve la cantidad de dinero que se devuelve al cliente.
     * Si no se produce ninguna situación inesperada, se reduce el stock del
     * producto, se devuelve el cambio, se pone el crédito a cero y se
     * incrementa la recaudación.
     * Si la venta no es posible se lanzará la excepción correspondiente a la
     * situación que impide completar la venta.
     */
    
    public double comprarProducto(int producto) throws NoHayCambioException, 
            NoHayProductoException, CreditoInsuficienteException {
        double cambio;
        if (getStock(producto) > 0) {
            if (getCambio() < (getCredito() - getPrecio(producto))) {
                if (getCredito() < getPrecio(producto)) {
                    this.stock--;
                    cambio = getCredito() - getPrecio(producto);
                    credito = 0;
                } else {
                    throw new CreditoInsuficienteException();
                }
            } else {
                throw new NoHayCambioException();
            }
        } else {
            throw new NoHayProductoException();
        }
        return 0;
    }

    private static class NoHayCambioException extends Exception {

        public NoHayCambioException() {
        }
    }

    private static class CreditoInsuficienteException extends Exception {

        public CreditoInsuficienteException() {
        }
    }

    private static class NoHayProductoException extends Exception {

        public NoHayProductoException() {
        }
    }
    
}
