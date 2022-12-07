/*
 * 23. Renombrando directorios y ficheros
 *
 * Implementa un programa que haga lo siguiente:
 *
 * (1) Cambiar el nombre de la carpeta Documentos a DOCS , (2) el de la carpeta Fotografias a
 * FOTOS y el de la carpeta Libros a LECTURAS
 *
 * (3) Cambiar el nombre de todos los archivos de las carpetas FOTOS y LECTURAS quitándole
 * la extensión. Por ejemplo, astronauta.jpg pasará a llamarse astronauta .
 */
package renombrardirfic;

import java.io.File;

public class RenombrarDirFic {

    public static void main(String[] args) {
        // 1
        // Declaración de objetos tipo File para la rutas de origen y las rutas
        // de destino.
        File rutaDocs;
        File rutaDocsDest;
        
        // Se inicializa el objeto tipo File con la ruta del sistema origen y 
        // otro archivo File con la ruta de sistema 
        rutaDocs = new File("src/Documentos");
        rutaDocsDest = new File("src/DOCS");
        rutaDocs.renameTo(rutaDocsDest);

        // 2 
        // Declaración de objetos tipo File para la rutas de origen y las rutas
        // de destino.
        File rutaFotos;
        File rutaFotosDest;
        File rutaLibros;
        File rutaLibrosDest;
        
        // 
        // 
        rutaFotos = new File("src/DOCS/Fotografias");
        rutaFotosDest = new File("src/DOCS/FOTOS");
        rutaFotos.renameTo(rutaFotosDest);

        // 
        // 
        rutaLibros = new File("src/DOCS/Libros");
        rutaLibrosDest = new File("src/DOCS/LECTURAS");
        rutaLibros.renameTo(rutaLibrosDest);

        // 3
        // Listando las carpetas/ficheros de FOTOS sin la extensión
        File[] contenidoFotos = rutaFotos.listFiles();
        for (File archivo : contenidoFotos) {
            if (archivo.getName().contentEquals(".")) {
                String nombreSinExt = archivo.getName().substring(archivo.getName().indexOf("."));
                File nuevoNombre = new File(rutaFotosDest + "/" + nombreSinExt);
            }
        }

        // Listando las carpetas/ficheros de LECTURAS sin la extensión
        File[] contenidoLecturas = rutaLibros.listFiles();
        for (File archivo : contenidoLecturas) {
            if (archivo.getName().contentEquals(".")) {
                
            }
        }
    }
}
