/*
 * Define una jerarquía de clases que permita almacenar datos sobre los planetas y satélites
 * (lunas) que forman parte del sistema solar.
 * 
 * Algunos atributos que necesitaremos almacenar son:
 *      Masa del cuerpo.
 *      Diámetro medio.
 *      Período de rotación sobre su propio eje.
 *      Período de traslación alrededor del cuerpo que orbitan.
 *      Distancia media a ese cuerpo.
 *      etc.
 * 
 * Define las clases necesarias conteniendo:
 *      Constructores.
 *      Métodos para recuperar y almacenas atributos.
 *      Método para mostrar la información del objeto.
 *
 * Define un método, que dado un objeto del sistema solar (planeta o satélite), imprima toda la
 * información que se dispone sobre el mismo (además de su lista de satélites si los tuviera).
 * 
 * Una posible solución sería crear una lista de objetos, insertar los planetas y satélites
 * (directamente mediante código o solicitándolos por pantalla) y luego mostrar un pequeño menú
 * que permita al usuario imprimir la información del astro que elija.
 */
package astros;

import java.util.ArrayList;

public abstract class Astros {
    protected String nombre;
    protected double radioEcuatorial;
    protected double rotacionEje;
    protected double masa;
    protected double temperaturaMedia;
    protected double gravedad;

    public Astros(String nombre, double radioEcuatorial, double rotacionEje, double masa, double temperaturaMedia, double gravedad) {
        this.nombre = nombre;
        this.radioEcuatorial = radioEcuatorial;
        this.rotacionEje = rotacionEje;
        this.masa = masa;
        this.temperaturaMedia = temperaturaMedia;
        this.gravedad = gravedad;
    }
    
    public String muestra() {
        return "NOMBRE: " + nombre + "\nRADIO EQUATORIAL: " + radioEcuatorial 
                + "\nROTACIÓN EJE: " + rotacionEje + "\nMASA: " + masa 
                + "\nTEMPERATURA MEDIA: " + temperaturaMedia + "\nGRAVEDAD: " + gravedad;
    }
    
    public static void main(String[] args) {
        
    }
}
