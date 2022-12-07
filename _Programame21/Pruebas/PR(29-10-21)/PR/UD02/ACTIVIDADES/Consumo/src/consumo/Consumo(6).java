/*
*10. Implementa una clase Consumo , la cual forma parte del "ordenador de a bordo" de un coche
*y tiene las siguientes características:
*
*Atributos:
*kilometros.
*litros. Litros de combustible consumido.
*vmed. Velocidad media.
*pgas. Precio de la gasolina.
*
*Métodos:
*getTiempo . Indicará el tiempo empleado en realizar el viaje.
*consumoMedio . Consumo medio del vehículo (en litros cada 100 kilómetros).
*consumoEuros . Consumo medio del vehículo (en euros cada 100 kilómetros).
*
*No olvides crear un constructor para la clase que establezca el valor de los atributos. Elige el
*tipo de datos más apropiado para cada atributo.
*
*____________________________________________________________________________________________________________________________
*
*11. Para la clase anterior implementa los siguientes métodos, los cuales podrán modificar los
*valores de los atributos de la clase:
*setKms
*setLitros
*setVmed
*setPgas
*/

package consumo;

// CLASE CONSUMO
public class Consumo {
    
    // ATRIBUTOS DE LA CLASE CONSUMO
    private double kilometros;
    private double litros;  // LITROS DE COMBUSTIBLE CONSUMIDO
    private int vmed;    // VELOCIDAD MEDIA
    private double pgas;    // PRECIO DE LA GASOLINA
    
    // METODOS DE LA CLASE CONSUMO
    double consumoMedio(){
        return ((litros * 100) / kilometros);
    }
    
    double consumoEuros(){
        return (consumoMedio() * pgas);
    }
    
    double getTiempo () {
        return (kilometros / vmed);
    }
    // SETTERS DE LA CLASE CONSUMO
    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public void setVmed(int vmed) {
        this.vmed = vmed;
    }

    public void setPgas(double pgas) {
        this.pgas = pgas;
    }
    
    // CONSTRUCTORES DE LA CLASE CONSUMO
    Consumo(){
        kilometros = 100;
        litros = 50;
        vmed = 100;
        pgas = 1.54;
    }
    
    public static void main(String[] args) {
        // PRUEBA 10
        Consumo consumoFran = new Consumo();
        System.out.println("El consumo medio de combustible cada 100 km es: " + consumoFran.consumoMedio());
        System.out.println("El consumo medio en Euros es: " + consumoFran.consumoEuros() + " euros");
        System.out.println("El tiempo que has tardado en realizar el trayecto es: " + consumoFran.getTiempo() + " hora(s) \n");
        
        // PRUEBA 11
        consumoFran.setKilometros(200.4);
        System.out.println("El nuevo valor de kilometros es: 200.4");
        consumoFran.setLitros(76.8);
        System.out.println("El nuevo valor de litros es: 76.8");
        consumoFran.setPgas(2.43);
        System.out.println("El nuevo valor de la gasolina es: 2.43");
        consumoFran.setVmed(80);
        System.out.println("El nuevo valor de velocidad media es: 80 \n");
        
        System.out.println("El consumo medio de combustible cada 100 km es: " + consumoFran.consumoMedio());
        System.out.println("El consumo medio en Euros es: " + consumoFran.consumoEuros() + " euros");
        System.out.println("El tiempo que has tardado en realizar el trayecto es: " + consumoFran.getTiempo() + " hora(s)");
    }
    
}
