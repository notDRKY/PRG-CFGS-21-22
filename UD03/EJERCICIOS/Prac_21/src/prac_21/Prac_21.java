/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prac_21;

/**
 *
 * @author Soldi
 */
public class Prac_21 {

    private Prac_21() {
    }
    
    // Point existe
    
    public static void myFirstMethod(double x, double y, Point p) {
        p.setX(y);
        p.setY(x);
    }

    public static void mySecondMethod(double x, double y, Point p) {
        double aux = x;
        x = y;
        y = aux;
        p.setX(x);
        p.setY(y);
    }
    
    public static void main(String[] args) {
        Point p = new Point(3.0, -1.0);
        double x = p.getX();
        double y = p.getY();
        System.out.print("Inicialmente: ");
        System.out.println("x = " + x + ", y = " + y + ", p = " + p.toString());
        myFirstMethod(x, y, p);
        System.out.print("Tras llamar a myFirstMethod: ");
        System.out.println("x = " + x + ", y = " + y + ", p = " + p.toString());
        double a = p.getY();
        double b = p.getX();
        mySecondMethod(a, b, p);
        System.out.print("Tras a llamar a mySecondMethod: ");
        System.out.println("x = " + x + ", y = " + y + ", p = " + p.toString());
    }


}
