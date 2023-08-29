package Vista;

import Modelo.Alumno;
import java.util.ArrayList;
import java.util.Scanner;
import Controlador.*;
import java.util.InputMismatchException;

/**
 *
 * @author Benji
 */
public class Main {

    private static Scanner teclado = new Scanner(System.in);
    private static ArrayList<Alumno> listaAlumnos = new ArrayList();

    public static void main(String[] args) {
        try {
            boolean salir = false;
            while (!salir) {
                System.out.println("\n          Universdad UTP\n");
                System.out.println(" [1] Nuevo");
                System.out.println(" [2] Editar");
                System.out.println(" [3] Eliminar");
                System.out.println(" [4] Listar");
                int op = teclado.nextInt();

                switch (op) {
                    case 1:
                        agregar();
                        break;
                    case 2://Editar
                        editar();
                        break;
                    case 3://Eliminar
                        eliminar();
                        break;
                    case 4://Listar (mostrar)
                        mostrar();
                        break;
                    default:
                        System.out.println("ERROR");
                        break;
                }
                System.out.println("¿Desea salir?");
                System.out.println(" Si _ No");
                String resp = teclado.next();
                salir = resp.equalsIgnoreCase("si");
            }
        } catch (InputMismatchException e) {
            System.out.println("ERROR: " + e.getMessage());
            teclado.nextLine();
        }
    }

    private static void agregar() {

        try {
            System.out.println("\n    REGISTRAR ALUMNO\n");
            System.out.println(" [1] Alumno PreGrado");
            System.out.println(" [2] AlumnoCGT");
            System.out.println(" [3] Alumno Egresado");
            int opc = teclado.nextInt();
            switch (opc) {
                case 1://Alumno PreGrado
                    listaAlumnos.add(ControladorMain.agregarAlumnoPregrado());
                    break;
                case 2://AlumnoCGT
                    listaAlumnos.add(ControladorMain.agregarAlumnoCGT());
                    break;
                case 3://Alummno Egresado
                    listaAlumnos.add(ControladorMain.agregarAlumnoEgresado());
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
            System.out.println("Registro Exitoso!!");

        } catch (InputMismatchException | IndexOutOfBoundsException e) {
            System.out.println("ERROR: " + e.getMessage());
            teclado.nextLine();
        }
    }

    private static void mostrar() {
        try {
            setMostrar();
            System.out.println("Seleccione una fila: ");
            int fila = teclado.nextInt();
            setMostrarDatosAlumno(getMostrar(fila));
        } catch (InputMismatchException | IndexOutOfBoundsException e) {
            System.out.println("ERROR: " + e.getMessage());
            teclado.nextLine();
        }
    }

    private static void editar() {
        try {
            setMostrar();
            System.out.print("Seleccione el alumno a editar: ");
            int opc = teclado.nextInt();
            setMostrarDatosAlumno(getMostrar(opc));
            System.out.println(" ::::::::::::::::::::::::");
            System.out.println(" [1] Alumno PreGrado");
            System.out.println(" [2] AlumnoCGT");
            System.out.println(" [3] Alumno Egresado");
            System.out.print(" Nuevo Tipo del Alumno: ");
            int tipo = teclado.nextInt();
            switch (tipo) {
                case 1://Alumno Pregrado
                    listaAlumnos.set(opc - 1, ControladorMain.agregarAlumnoPregrado());
                    break;
                case 2://Alumno CGT
                    listaAlumnos.set(opc - 1, ControladorMain.agregarAlumnoCGT());
                    break;
                case 3://Alumno Egresado
                    listaAlumnos.set(opc - 1, ControladorMain.agregarAlumnoEgresado());
                    break;
                default:
                    System.out.println("ERROR");
            }
            System.out.println("Datos editados exitosamente!!");

        } catch (InputMismatchException | IndexOutOfBoundsException e) {
            System.out.println("ERROR: " + e.getMessage());
            teclado.nextLine();
        }
    }

    private static void setMostrar() {
        System.out.println("Lista Alumnos");
        for (int i = 0; i < listaAlumnos.size(); i++) {
            System.out.println(" [" + (i + 1) + "] " + listaAlumnos.get(i));
        }
    }

    private static Alumno getMostrar(int item) {
        Alumno aux = listaAlumnos.get(item - 1);
        return aux;
    }

    private static void setMostrarDatosAlumno(Alumno alum) {
        System.out.println("\n    Datos Alumno\n");
        System.out.println("TipoAlumno: " + alum.getTipo());
        System.out.println(alum.getMostrarDatos());
    }

    private static void eliminar() {
        try {
            setMostrar();
            System.out.println("Seleccione el alumno a eliminar: ");
            int op = teclado.nextInt();
            setMostrarDatosAlumno(getMostrar(op));
            System.out.println("Confirmar la eliminación");
            System.out.println("   Si  _ No");
            String resp = teclado.next();

            if (resp.equalsIgnoreCase("si")) {
                listaAlumnos.remove(op - 1);
            }
            System.out.println("Datos eliminados exitosamente");
        } catch (InputMismatchException | IndexOutOfBoundsException e) {
            System.out.println("ERROR: " + e.getMessage());
            teclado.nextLine();
        }
    }

}
