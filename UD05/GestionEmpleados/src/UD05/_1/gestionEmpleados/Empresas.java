/*
 */
package UD05._1.gestionEmpleados;

class Empresas {

    private static final int MAX_EMPLEADOS = 10;
    private String nombre;
    private Empleados[] plantilla;
    private int numEmpleados;

    public void contratar(Empleados e) throws PlantillaCompletaException {
        if (numEmpleados < MAX_EMPLEADOS) {
            this.plantilla[numEmpleados++] = e;
        } else {
            throw new PlantillaCompletaException();
        }
    }

    public void despedir(Empleados e) throws ElementoNoEncontradoException {
        int posicionEncontrado = 0;
        boolean encontrado = false;
        for (int posicion = 0; plantilla[posicion] != null && posicion < plantilla.length && !encontrado; posicion++) {
            if (plantilla[posicion].equals(e)) {
                encontrado = true;
                posicionEncontrado = posicion;
            }
        }
        if (encontrado) {
            for (int contador = posicionEncontrado; contador < plantilla.length - 1; contador++) {
                plantilla[contador] = plantilla[contador + 1];
            }
            plantilla[MAX_EMPLEADOS - 1] = null;
            this.numEmpleados--;
        } else {
            throw new ElementoNoEncontradoException();
        }
    }

    public void subirTrienio(double porcentaje) {
        for (int posicion = 0; posicion < this.plantilla.length; posicion++) {
            if (plantilla[posicion] != null && plantilla[posicion].antiguedad() % 3 == 0) {
                plantilla[posicion].incrementarSueldo(porcentaje);
            }
        }
    }

    @Override
    public String toString() {
        String resultado = nombre + "\nEmpleados: ";
        for (Empleados plantilla1 : plantilla) {
            if (plantilla1 != null) {
                resultado += plantilla1.toString() + "\n";
            }
        }
        return resultado;
    }

    // CONSTRUCTORES
    public Empresas(String nombre) {
        this.nombre = nombre;
        this.numEmpleados = 0;
        this.plantilla = new Empleados[MAX_EMPLEADOS];
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public Empleados[] getPlantilla() {
        return plantilla;
    }

    public int getNumEmpleados() {
        return numEmpleados;
    }

    // SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPlantilla(Empleados[] plantilla) {
        this.plantilla = plantilla;
    }

    public void setNumEmpleados(int numEmpleados) {
        this.numEmpleados = numEmpleados;
    }

    static class PlantillaCompletaException extends Exception {

        public PlantillaCompletaException() {
        }
    }

    static class ElementoNoEncontradoException extends Exception {

        public ElementoNoEncontradoException() {
        }
    }
}
