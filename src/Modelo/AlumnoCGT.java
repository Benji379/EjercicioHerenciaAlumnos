package Modelo;

/**
 *
 * @author Benji
 */
public class AlumnoCGT extends Alumno {

    private int ciclo;
    private String trabajo;

    public AlumnoCGT(int ciclo, String trabajo, String nombre, String codigo, int edad) {
        super(nombre, codigo, edad, "Alumno CGT");
        this.ciclo = ciclo;
        this.trabajo = trabajo;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    @Override
    public String getMostrarDatos() {
        return "Nombre: " + nombre
                + "\nCodigo: " + codigo
                + "\nEdad: " + edad
                + "\nCiclo: " + ciclo
                + "\nTrabajo: " + trabajo;
    }

}
