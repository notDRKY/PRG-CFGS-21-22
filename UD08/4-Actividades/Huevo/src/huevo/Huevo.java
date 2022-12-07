/*
 * 4. Realiza una clase Huevo con un atributo tamaño ( S , M , L , XL ) con el método toString .
 * La clase Huevo está compuesta por dos clases internas, una Clara y otra Yema . Ambas
 * clases tiene un atributo color y el método toString . Realiza un método main en el que
 * se cree un objeto de tipo Huevo , Clara y Yema . Se le asigne valor a sus atributos y se
 * muestren dichos valores.
 */
package huevo;

import huevo.Huevo.Clara;

public class Huevo {
    
    private String tamano;

    public Huevo(String tamano) {
        this.tamano = tamano;
    }
    
    @Override
    public String toString() {
        return "Huevo:\n" + "\tTamaño | " + tamano;
    }
    
    class Clara {
        private String color;

        public Clara(String color) {
            this.color = color;
        }
        
        @Override
        public String toString() {
            return "Clara:\n" + "\tColor | " + color;
        }
    }
    
    class Yema {
        private String color;

        public Yema(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Yema:\n" + "\tColor | " + color;
        }
    }
    
    public static void main(String[] args) {
        Huevo huevo1 = new Huevo("X");
        System.out.println(huevo1);
        Huevo.Clara clara1 = huevo1.new Clara("Blanco");
        System.out.println(clara1);
        Huevo.Yema yema1 = huevo1.new Yema("Rojo");
        System.out.println(yema1);
    }
}
