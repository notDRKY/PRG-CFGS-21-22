/*
3. La clase ListaCorredores permite representar a un conjunto de corredores. En la lista,
como máximo habrá 200 corredores, aunque puede haber menos de ese número. Se
utilizará un array, llamado lista, de 200 elementos junto con una propiedad
numCorredores que permita saber cuentos corredores hay realmente. Métodos:
 */
package UD05_03_contrarreloj;

/**
 *
 * @author Carlos
 */
public class ListaCorredores {

    //Atributos de la clase
    private static final int MAXIMOS_CORREDORES = 200;
    private Corredor[] lista;
    private int numCorredores;

    //Métodos de la clase
    //public ListaCorredores() . Constructor. Crea la lista de corredores,
    //inicialmente vacía.
    public ListaCorredores() {
        lista = new Corredor[MAXIMOS_CORREDORES];
        //inicialmente vacía
        numCorredores = 0;
    }

    //public void añadir(Corredor c) throws ElementoDuplicadoException .
    //Añade un corredor al final de la lista de corredores, siempre y cuando el
    //corredor no esté ya en la lista, en cuyo caso se lanzará
    //ElementoDuplicadoException
    public void añadir(Corredor c) throws ElementoDuplicadoException {
        //Declaramos fuera la variable entera posición , para pdoer sacarla luego del bucle
        int posicion;
        //Un bucle que recorrerá la longitud del array de forma ascendente
        //mientras que el valor del elemento posicion sea distinto a nulo Y el contador posicion
        //sea menor a la longitud de nuestro array
        for (posicion = 0; lista[posicion] != null && posicion < lista.length; posicion++) {
            //Compararemos si el objeto que nos llega por parámetro es igual al que tenemos 
            //en el elemento posicion de nuestro array, lanzamos la excepción:
            if (c.equals(lista[posicion])) {
                throw new ElementoDuplicadoException();
                //Sino si el elemento es nulo...
            }
        }
        //Estableceremos ese nuevo corredor en la primera posición vacía 
        lista[posicion] = c;
        //Incrementamos en uno el número de corredores, en este caso nos 
        //daría igual si fuera de la forma ++numCorredores, ya que el
        //incremento se encuentra sólo.
        //MUCHO CUIDADO!!! cuando hacemos el incremento dentro de un condicional
        //o al devolverlo con un return, ya que ahí si importa el orden..
        numCorredores++;
    }

    //Clase anidada de la excepción:
    static class ElementoDuplicadoException extends Exception {

        public ElementoDuplicadoException() {
        }
    }

//public void insertarOrdenado(Corredor c) . Inserta un corredor en la posición
//adecuada de la lista de manera que esta se mantenga ordenada
//crecientemente por el tiempo de llegada. Para poder realizar la inserción debe
//averiguarse la posición que debe ocupar el nuevo elemento y, antes de
//añadirlo al array, desplazar el elemento que ocupa esa posición y todos los
//posteriores, una posición a la derecha.
    //**Habrá que tener en cuenta tres casos diferentes: **
    //1º Que nuestro array se encuentre lleno,
    //2º Que nuestro array, por el contrario, no tenga ni un corredor
    //3º O que contenga algún corredor, y también elementos nulos. Nuestro caso por defecto.
    public void insertarOrdenado(Corredor c) {
        switch (numCorredores) {

            //1º Que nuestro array se encuentre lleno
            case MAXIMOS_CORREDORES:
                //Imprimiremos por pantalla un error, porque el array se encuentra lleno
                System.out.println("ERROR: Es imposible insertar un nuevo corredor,"
                        + " ya que nuestra lista está llena.");
                break;

            //2º Que nuestro array, por el contrario, no tenga ni un corredor
            case 0:
                //El primer elemento tendrá el valor ahora de nuestro objeto c
                lista[0] = c;
                //Incrementamos nuestra variable numCorredores en 1
                numCorredores++;
                break;

            //3º O que contenga algún corredor, y también elementos nulos. Nuestro caso por defecto.
            default:
                //Declaramos e inicializamos una variable cerradura en false
                boolean encontrado = false;
                //Supongo que el elemento que presenta mayor tiempo que mi objeto c,
                //se encuentra en la posición 0
                int elementoMayorTiempo = 0;
                //Haremos un bucle que recorrerá el array de manera ascendente
                for (int i = 0; i < lista.length && !encontrado; i++) {
                    //Si el tiempo de nuestro objeto por parámetro es menor que el
                    //tiempo de nuestro elemento posicion del array
                    if ((lista[i] != null) && (c.getTiempo() < lista[i].getTiempo())) {
                        //Nos guardamos la posición donde el elemento presenta el mayor tiempo
                        elementoMayorTiempo = i;
                        //Y nuestra variable cerradura encontrado ahora es true, para salir del bucle
                        encontrado = true;
                    }
                }
                //Si hemos encontrado ese elemento mayor que el nuestro...
                if (encontrado) {
                    //Deberemos desplazar desde esa posición, todos los elementos a la derecha en 1.
                    //Para ello, partiremos inicialmente del último elemento de nuestro array
                    //y recorreremos el bucle de manera DESCENDENTE hasta el elemento encontrado
                    //en el bucle anterior
                    for (int j = lista.length - 1; j > elementoMayorTiempo; j--) {
                        //Nuestro elemento j será igual al elemento anterior
                        lista[j] = lista[j - 1];
                    }
                    //Nos queda meter ese corredor en la posición adecuada, después 
                    //de haberlo ordenado, por lo que:
                    lista[elementoMayorTiempo] = c;
                    numCorredores++;
                }
        }

    }

//public Corredor quitar(int dorsal) throws ElementoNoEncontradoException .
//Quita de la lista al corredor cuyo dorsal se indica. El array debe mantenerse
//compacto, es decir, todos los elementos posteriores al eliminado deben
//desplazarse una posición a la izquierda. El método devuelve el Corredor quitado 
//de la lista. Si no se encuentra se lanza ElementoNoEncontradoException .
    public Corredor quitar(int dorsal) throws ElementoNoEncontradoException {
        //Creamos un corredor de tipo Corredor, para poder devolverlo en el método
        Corredor corredor = null;
        //Variable cerradura tal y cual...
        boolean encontrado = false;
        //Declaramos la variable posicion fuera de nuestro primer bucle, para poder usarlo en el resto del método
        int posicion;
        //bucle que recorre ascendentemente...con el fin de buscar el corredor con el dorsal
        for (posicion = 0; posicion < lista.length && !encontrado; posicion++) {
            //Si el dorsal de nuestro elemento posicion es igual al que nos pasan por parámetro
            if (lista[posicion].getDorsal() == dorsal) {
                //nuestra variable cerradura, ahora es true, y saldremos del primer bucle
                encontrado = true;
                corredor = lista[posicion];
            }
        }
        //si lo hemos encontrado lo quitamos de la lista 
        if (encontrado) {
            //Comenzará desde el elemento posicion encontrado menos 1 
            //(ya que en la última reiteración del bucle anterior le suma 1 a 
            //la variable posicion). Recorrería todo el bucle hasta la longitud
            // del array -1, ya que no debemos al último elemento igualarle el valor 
            //del siguiente, ya que se saldría del index
            for (int j = posicion-1; j < lista.length - 1; j++) {
                //y deberemos desplazar cada posición a la izquierda DESDE el encontrado
                lista[j] = lista[j + 1];
            }
            //Una vez reajustado el array hacia la izquierda, deberemos darle
            //el valor de null al ultimo elemento de nuestra lista
            lista[MAXIMOS_CORREDORES - 1] = null;
            //Reducimos en 1 nuestra variable numCorredores
            numCorredores--;
        } else {
            throw new ElementoNoEncontradoException();
        }
        //Haremos un segundo bucle que seguirá recorriendo las posiciones restantes
        //su situación de partida será el elemento encontrado posicion

        return corredor;
    }

    //Clase anidada....
    static class ElementoNoEncontradoException extends Exception {

        public ElementoNoEncontradoException() {
        }
    }

//public String toString() Devuelve un String con la información de la lista
//de corredores. Los minutos apareceran formateados con 2 decimales. Por ejemplo:
    //1 Posición: 0
    //2 Dorsal: 234
    //3 Nombre: Juan Ramirez
    //4 Tiempo: 25.97 minutos
    //5 
    //6 Posición: 1
    //7 Dorsal: 26
    //8 Nombre: José González
    //9 Tiempo: 29.70 minutos
    @Override
    public String toString() {
        String informacionLista = "";
        for (int i = 0; lista[i] != null && i < lista.length; i++) {
            informacionLista += "\nPosición: " + i + "\nDorsal: " + lista[i].getDorsal()
                    + "\nNombre: " + lista[i].getNombre() + "\nTiempo: "
                    + String.format("%.2f", lista[i].getTiempo() / 60) + " minuto(s)\n\n";
        }
        return informacionLista;
    }

}
