package rectangulo;

public class Rectangulo {

    // ATRIBUTOS DE LA CLASE
    private String nombre;
    // Esquina inferior izquierda
    private double x1;
    private double y1;

    // Esquina superior derecha
    private double x2;
    private double y2;

    // Atributos estaticos
    private static int numRectangulos;

    // Atributo estatico (static) y constante (final)
    private static final double PI = 3.1415;
    private static final String NOMBREFIGURA = "Rectágulo";

    // METODOS DE LA CLASE
    // Constructores
    public Rectangulo() {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 1;
        this.y2 = 1;
        numRectangulos++;
    }

    public Rectangulo(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        numRectangulos++;
    }

    public Rectangulo(double base, double altura) {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = base;
        this.y2 = altura;
        numRectangulos++;
    }

    public Rectangulo(Rectangulo r) {
        this.nombre = r.nombre;
        this.x1 = r.x1;
        this.y1 = r.y1;
        this.x2 = r.x2;
        this.y2 = r.y2;
        numRectangulos++;
    }

    // Getters & setters
    public String obtenerNombre() {
        return this.nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public double calcularSuperficie() {
        double base = this.x2 - this.x1;
        double altura = this.y2 - this.y1;

        return base * altura;
    }

    public double calcularPerimetro() {
        double base = this.x2 - this.x1;
        double altura = this.y2 - this.y1;

        return (2 * base) + (2 * altura);
    }

    public void desplazar(double x, double y) {
        this.x1 += x;
        this.x2 += x;
        this.y1 += y;
        this.y2 += y;
    }

    public static int obtenerNumRectangulos() {
        return numRectangulos;
    }

    public static void main(String[] args) {
        double area;
        double perimetro;
        Rectangulo r1;
        Rectangulo r2;
        Rectangulo r3;

        r1 = new Rectangulo();
        r1.x1 = 0;
        r1.y1 = 0;
        r1.x2 = 10;
        r1.y2 = 10;

        area = r1.calcularSuperficie();
        perimetro = r1.calcularPerimetro();

        System.out.println("Area de r1: \t\t" + area);
        System.out.println("Perimetro de r1: \t" + perimetro);

        r2 = new Rectangulo(3, 3, 7, 7);
        area = r2.calcularSuperficie();
        perimetro = r2.calcularPerimetro();

        System.out.println("\nArea de r2: \t\t" + area);
        System.out.println("Perimetro de r2: \t" + perimetro);

        r3 = new Rectangulo(r2);
        area = r3.calcularSuperficie();
        perimetro = r3.calcularPerimetro();

        System.out.println("\nArea de r3: \t\t" + area);
        System.out.println("Perimetro de r3: \t" + perimetro);
    }
}
