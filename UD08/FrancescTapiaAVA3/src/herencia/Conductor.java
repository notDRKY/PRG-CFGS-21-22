package herencia;

public class Conductor implements Sancionable {

    public void sancionar(int t) {
        System.out.println("Conductor sancionado " + t + " meses");
    }
}
