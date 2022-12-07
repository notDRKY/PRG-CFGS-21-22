/* 20. Realizar un programa que dado un importe en euros nos indique el mínimo número de billetes y la
cantidad sobrante de euros. Deberas usar el operador condicional ?: */

public class Actividad20 {
    public static void main (String [] args) {
        String textoEuros, prova;
        int numEuros, aux, billetes500, billetes200, billetes100, billetes50, billetes20, billetes10, billetes5, monedas;

        System.out.print("¿Cuantos euros tienes?: ");
        textoEuros=System.console().readLine();
        numEuros=Integer.parseInt(textoEuros);
        
        
        billetes500= (numEuros / 500);
        aux= (numEuros % 500);
        prova=(billetes500<= 0)?"":("\t" + billetes500 + " billete(s) de 500 euro(s) ");

        billetes200= (aux / 200);
        aux= (aux % 200);
        prova=(billetes200= 0)?"":("\t" + billetes200 + " billete(s) de 200 euro(s) ");

        billetes100= (aux / 100);
        aux= (aux % 100);
        prova=(billetes100= 0)?"":("\t" + billetes100 + " billete(s) de 100 euro(s) ");

        billetes50= (aux / 50);
        aux= (aux % 50);
        prova=(billetes50= 0)?"":("\t" + billetes50 + " billete(s) de 50 euro(s) ");

        billetes20= (aux / 20);
        aux= (aux % 20);
        prova=(billetes20= 0)?"":("\t" + billetes20 + " billete(s) de 20 euro(s) ");

        billetes10= (aux / 10);
        aux= (aux % 10);
        prova=(billetes10= 0)?"":("\t" + billetes10 + " billete(s) de 10 euro(s) ");

        billetes5= (aux / 5);
        aux= (aux % 5);
        prova=(billetes5= 0)?"":("\t" + billetes5 + " billete(s) de 5 euro(s) ");

        monedas= (aux);
        prova=(monedas= 0)?"":("\t" + "Sobran: " + monedas + " euro(s) ");

    }
}