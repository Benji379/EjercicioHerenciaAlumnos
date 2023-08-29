package Modelo;

/**
 *
 * @author Benji
 */
public class Alumno {

    protected String nombre;
    protected String codigo;
    protected int edad;
    protected String tipo;

    public Alumno(String nombre, String codigo, int edad, String tipo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.edad = edad;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMostrarDatos() {
        return "Nombre: " + nombre
                + "\nCodigo: " + codigo
                + "\nEdad: " + edad;
    }

}
