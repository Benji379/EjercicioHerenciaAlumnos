package Modelo;

/**
 *
 * @author Benji
 */
public class AlumnoPregrado extends Alumno {

    private int ciclo;
    
    public AlumnoPregrado(int ciclo, String nombre, String codigo, int edad) {
        super(nombre, codigo, edad,"Alumno Pregrado");
        this.ciclo = ciclo;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    @Override
    public String getMostrarDatos() {
        return "Nombre: " + nombre
                + "\nCodigo: " + codigo
                + "\nEdad: " + edad
                + "\nCiclo: " + ciclo;
    }
}
