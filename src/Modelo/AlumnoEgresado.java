package Modelo;

/**
 *
 * @author Benji
 */
public class AlumnoEgresado extends Alumno {

    private int ordenMerito;

    public AlumnoEgresado(int ordenMerito, String nombre, String codigo, int edad) {
        super(nombre, codigo, edad, "Alumno Egresado");
        this.ordenMerito = ordenMerito;
    }

    public int getOrdenMerito() {
        return ordenMerito;
    }

    public void setOrdenMerito(int ordenMerito) {
        this.ordenMerito = ordenMerito;
    }

    @Override
    public String getMostrarDatos() {
        return "Nombre: " + nombre
                + "\nCodigo: " + codigo
                + "\nEdad: " + edad
                + "\nOrden de Merito:" + ordenMerito;
    }

}
