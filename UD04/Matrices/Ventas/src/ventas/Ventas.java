/*
 * 2. (Ventas). Una empresa comercializa 10 productos para lo cual tiene 5 distribuidores.
 * Los datos de ventas los tenemos almacenados en una matriz de 5 filas x 10 columnas,
 * ventas , con el número de unidades de cada producto que ha vendido cada distribuidor.
 * Cada fila corresponde a las ventas de un distribuidor (la primera fila, del primer distribuidor,
 * etc.), mientras que cada columna corresponde a un producto:
 * 
 * | 100 | 25  | 33 | 89 | 23  | 90 | 87 | 6  | 5 | 233 |
 * | 28  | 765 | 65 | 77 | 987 | 55 | 4  | 66 | 4 | 8   |
 * 
 * El array precio , de 10 elementos, contiene el precio en € de cada uno de los 10 productos.
 * 
 * | 125.2 | 234.4 | 453.9 | ... |
 * 
 * Escribe el programa y los métodos necesarios para averiguar:
 * 1. Distribuidor que más artículos ha vendido.
 * 2. El artículo que más se vende.
 * 3. Sabiendo que los distribuidores que realizan ventas superiores a 30.000€ cobran una
 * comisión del 5% de las ventas y los que superan los 70.000€ una comisión del 8%, emite
 * un informe de los distribuidores que cobran comisión, indicando nº de distribuidor,
 * importe de las ventas, porcentaje de comisión e importe de la comisión en €.
 */
package ventas;

public class Ventas {

    public static int distribuidorConMasVentas(double[][] ventas) {
        int totalProductos = 0;
        int mayorVentas = 0;
        int posMayor = 0;
        for (int f = 0; f < ventas.length; f++) {
            for (int c = 0; c < ventas[f].length; c++) {
                totalProductos += ventas[f][c];
            }
            if (totalProductos > mayorVentas) {
                mayorVentas = totalProductos;
                posMayor = f;
            }
        }
        return posMayor;
    }

    public static int articuloMasVendido(double[][] ventas) {
        int totalProductos = 0;
        int productoMasVendido = 0;
        int posMayor = 0;
        for (int c = 0; c < ventas.length; c++) {
            for (int f = 0; f < ventas[c].length; f++) {
                totalProductos += ventas[c][f];
            }
            if (totalProductos > productoMasVendido) {
                productoMasVendido = totalProductos;
                posMayor = c;
            }
        }
        return posMayor;
    }
    
    public static void comisiones(double[][] ventas, double[] precio){
        for (int f = 0; f < ventas.length; f++) {
            for (int c = 0; c < ventas[f].length; c++) {
                
            }
        }
    }
    

    public static void main(String[] args) {

        /*
        Cada fila corresponde a las ventas de un distribuidor 
        (la primera fila, del primer distribuidor,
        etc.), mientras que cada columna corresponde a un producto :
         */
        double[][] ventas = {
            {100, 25, 33, 89, 23, 90, 87, 6, 5, 233},
            {28, 765, 65, 77, 987, 55, 4, 66, 4, 8},
            {56, 333, 45, 65, 67, 12, 47, 789, 4, 990},
            {101, 54, 37, 84, 32, 9, 78, 23, 59, 29},
            {82, 34, 67, 27, 73, 146, 753, 942, 12, 45},};

        /*
        contiene el precio en € de cada uno de los 10 productos
         */
        double[] precio = {125.2, 234.4, 453.9, 231.1, 754.6, 932.1, 342.3, 553.7, 656.9, 112.6};

    }
}
