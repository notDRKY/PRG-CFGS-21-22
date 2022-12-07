public class Ejercicio8 {
    public static void main (String [] args) {
        /* 8.  (Medidas) Escribir un programa que convierta una medida dada en pies a sus equivalentes en yardas,
                pulgadas, centímetros y metros, sabiendo que:
                                                1 pie = 12 pulgadas, 
                                                1 yarda = 3 pies, 
                                                1 pulgada = 2.54 cm,
                                                1 m = 100 cm.*/

        String textoPies;
        double numPies, yardas, centimetros, metros;
        int pulgadas;

        System.out.print ("Dime el un numero en pies: ");
        textoPies=System.console().readLine();
        numPies=Double.parseDouble(textoPies);
        
        pulgadas=(int)numPies * 12;
        centimetros=pulgadas * 2.54;
        metros=centimetros / 100;
        yardas=numPies / 3;

        System.out.println (numPies + " pie(s) " + "es igual a: " + pulgadas + " pulgadas, " +
                centimetros + " centimetros, " + metros + " metros, " + yardas + " yardas. ");

    }
}