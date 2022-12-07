package telegrama;

import java.util.Scanner;

public class Telegrama {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int repeticiones = teclado.nextInt();
        teclado.nextLine();
        String cadena;
        String morse = "";
        char caracter;
        String aux = "";
        int puntos = 0;
        int longitud = 0;
        for (int i = 0; i < repeticiones; i++) {
            cadena = teclado.nextLine();
            for (int j = 0; j < cadena.length(); j++) {
                caracter = cadena.charAt(j);
                switch (caracter) {
                    case 'A':
                        morse += ".-";
                        break;
                    case 'B':
                        morse += "-...";
                        break;
                    case 'C':
                        morse += "-.-.";
                        break;
                    case 'D':
                        morse += "-..";
                        break;
                    case 'E':
                        morse += ".";
                        break;
                    case 'F':
                        morse += "..-.";
                        break;
                    case 'G':
                        morse += "--.";
                        break;
                    case 'H':
                        morse += "....";
                        break;
                    case 'I':
                        morse += "..";
                        break;
                    case 'J':
                        morse += ".---";
                        break;
                    case 'K':
                        morse += "-.-";
                        break;
                    case 'L':
                        morse += ".-..";
                        break;
                    case 'M':
                        morse += "--";
                        break;
                    case 'N':
                        morse += "-.";
                        break;
                    case 'O':
                        morse += "---";
                        break;
                    case 'P':
                        morse += ".--.";
                        break;
                    case 'Q':
                        morse += "--.-";
                        break;
                    case 'R':
                        morse += ".-.";
                        break;
                    case 'S':
                        morse += "...";
                        break;
                    case 'T':
                        morse += "-";
                        break;
                    case 'U':
                        morse += "..-";
                        break;
                    case 'V':
                        morse += "...-";
                        break;
                    case 'W':
                        morse += ".--";
                        break;
                    case 'X':
                        morse += "-..-";
                        break;
                    case 'Y':
                        morse += "-.--";
                        break;
                    case 'Z':
                        morse += "--..";
                        break;
                    case '!':
                        morse += "-.-.--";
                        break;
                    case '?':
                        morse += "..--..";
                        break;
                    case ' ':
                        morse += " ";
                        break;
                    default:
                        morse += "";
                        break;
                }
            }
            
            aux = cadena.replaceAll("\\s+", "");
            longitud = ((cadena.length() - 1) * 3);
            System.out.println(aux);
            System.out.println(morse);
            for (int pos = 0; pos < morse.length(); pos++) {
                if (morse.charAt(pos) == '-') {
                    puntos += 3;
                } else if (morse.charAt(pos) == ' ') {
                    puntos += 5;
                } else {
                    puntos++;
                }
            }
            puntos += 5;
            puntos += longitud;
            System.out.println(puntos);
        }
    }
}
