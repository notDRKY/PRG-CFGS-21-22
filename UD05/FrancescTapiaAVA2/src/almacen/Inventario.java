package almacen;

public class Inventario {

    // ATRIBUTOS DE LA CLASE INVENTARIO
    private Registro listaRegistros[];
    private int numRegistros;

    // MÉTODOS (CONSTRUCTORES) DE LA CLASE INVENTARIO
    public Inventario(int max) {
        listaRegistros = new Registro[max];
        numRegistros = 0;
    }

    // MÉTODOS (NO CONSTRUCTORES) DE LA CLASE INVENTARIO
    // TO STRING
    @Override
    public String toString() {
        if (numRegistros > 0) {
            return listaRegistros + "\n";
        } else {
            return "INVENTARIO VACÍO";
        }
    }

    // TOTAL COMPRAS
    /* 
    MEJORA DE DISEÑO:
    Se podría crear en la clase Inventario un get de numRegistros.
    
     */
    public int totalCompras(String codigo) throws ElementoNoEncontradoException {
        /* 
        En el método totalCompras primero declaro y inicializo todas las variables
        que voy a usar, para esto, con un while recorro el array listaRegistros
        y recorro todos los registros que hay en Inventario, si se encuentra
        algún código que se repite, sale del while y pasa a un for, dónde
        la condición del bucle es la misma (que los valores no sean nulos, que encontrado
        sea true (en el while es al revés) y que no se salga de la longitud del Inventario)
        y durante ese bucle se comprobará si el código que se nos ha pasado por parámetro
        coincide con algún codigo de los Registros de listaRegistros, si lo hace,
        en la variable compras se sumará (compras + get.Compras) de manera que sadrá
        la suma total de las compras de ese código. si no se encuentra ningún código
        se lanzará la excepcion elemento no encontrado (esto se realiza en la primera pasada,
        en el while).
         */
        boolean encontrado = false;
        int compras = 0;
        int pos = 0;

        while (listaRegistros != null && encontrado == false && pos < this.numRegistros) {
            if (codigo.equals(listaRegistros[pos].getCodigo())) {
                encontrado = true;
                pos++;
            } else {
                throw new ElementoNoEncontradoException();
            }
        }

        for (int pos2 = 0; listaRegistros != null && pos2 < this.numRegistros && encontrado; pos2++) {
            if (codigo.equals(listaRegistros[pos2].getCodigo())) {
                compras += listaRegistros[pos2].getCompras();
            }
        }
        return compras;
    }

    private static class ElementoNoEncontradoException extends Exception {

        public ElementoNoEncontradoException() {
        }
    }

    public boolean validarRegistro(Registro r) {
        /*
        En este método, me he copiado el while del método anterior (totalCompras).
        Con el while compruebo en que posición está el Registro con el código
        que coincida con el código de Registro r, una vez encontrado, me guardo
        la posición del encontrado y una vez localizada devuelvo el requisito a cumplir:
        listaRegistros[pos].getStock() + r.getCompras() - r.getVentas() == r.getStock()
        que se pide en el enunciado, si se cumple devolverá true, si no, false.
         */
        boolean encontrado = false;
        int pos = 0;

        while (listaRegistros != null && encontrado == false && pos < this.numRegistros) {
            if (r.getCodigo().equals(listaRegistros[pos].getCodigo())) {
                encontrado = true;
                pos++;
            }
        }
        return (listaRegistros[pos].getStock() + r.getCompras() - r.getVentas() == r.getStock());
    }

    public void anyadir(String codigo, int mes, int compras, int ventas, int stock) throws InventarioLlenoException {
        if (listaRegistros == null) {
            //listaRegistros[0] = new Registro r(codigo, mes, compras, ventas, stock);
        } else {
            if (numRegistros < listaRegistros.length) {
                int pos;
                for (pos = 0; listaRegistros != null && pos < listaRegistros.length; pos++) {

                }
            } else {
                throw new InventarioLlenoException();
            }
        }

    }

    private static class InventarioLlenoException extends Exception {

        public InventarioLlenoException() {
        }
    }

}
