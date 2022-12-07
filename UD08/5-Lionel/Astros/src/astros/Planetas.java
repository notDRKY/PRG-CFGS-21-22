package astros;

import java.util.ArrayList;

public class Planetas extends Astros{
    protected double distanciaSol;
    protected boolean orbitaSol;
    protected boolean tieneSatelites;
    protected ArrayList <Satelites> listaSatelites;

    public Planetas(double distanciaSol, boolean orbitaSol, boolean tieneSatelites, ArrayList<Satelites> listaSatelites, String nombre, double radioEcuatorial, double rotacionEje, double masa, double temperaturaMedia, double gravedad) {
        super(nombre, radioEcuatorial, rotacionEje, masa, temperaturaMedia, gravedad);
        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
        this.tieneSatelites = tieneSatelites;
        this.listaSatelites = listaSatelites;
    }

    @Override
    public String muestra() {
        return super.muestra() + "\nDISTANCIA SOL: " + distanciaSol + "\nORBITA AL SOL: " 
                + orbitaSol + "\nTIENE SATÉLITES: " + tieneSatelites 
                + "\nLISTA SATÉLITES" + listaSatelites.toString();
    }

    
    
}
