package astros;

public class Satelites extends Astros {
    protected double distanciaPlaneta;
    protected double orbitaPlanetaria;
    protected Planetas planetaAlQuePertence;

    public Satelites(double distanciaPlaneta, double orbitaPlanetaria, Planetas planetaAlQuePertence, String nombre, double radioEcuatorial, double rotacionEje, double masa, double temperaturaMedia, double gravedad) {
        super(nombre, radioEcuatorial, rotacionEje, masa, temperaturaMedia, gravedad);
        this.distanciaPlaneta = distanciaPlaneta;
        this.orbitaPlanetaria = orbitaPlanetaria;
        this.planetaAlQuePertence = planetaAlQuePertence;
    }

    @Override
    public String muestra() {
        return super.muestra() + "\nDISTANCIA PLANETA: " + distanciaPlaneta 
                + "\nORBITA PLANETARIA: " + orbitaPlanetaria 
                + "\nPLANETA AL QUE PERTENECE: " + planetaAlQuePertence;
    }
    
    
}
