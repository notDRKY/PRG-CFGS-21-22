package hotel;

import static hotel.Hotel.precioMinimoDeHoteles;
import java.util.ArrayList;

public class HotelTest {

    public static void main(String[] args) {
        // Main copiado del enunciado del ejercicio
        ArrayList<Hotel> c = new ArrayList<>();
        c.add(new Hotel("Sol", 30.1));
        c.add(new Hotel("Trip", 31.5));
        c.add(new Hotel("Sol", 40.5));
        c.add(new Hotel("Trip", 33.8));
        c.add(new Hotel("Sol", 25.3));
        c.add(new Hotel("Excelsior", 183.5));
        c.add(new Hotel("Sol", 30));
        c.add(new Hotel("Excelsior", 30));
        c.add(new Hotel("Melia", 29.3));
        c.add(new Hotel("California", 182));
        precioMinimoDeHoteles(c);

    }
}
