public class PruebaExamen {
    public static void main (String[] args){
        int a = 2, b = 3, c = 4;
        
        a= --b + c++; // a = 6
        b+=a; // b = 8
        System.out.print("a= " + a + " b= " + b + " c= " + c);
        // El valor a será 6, el valor b será 8 y el valor de c será 5
    }
}