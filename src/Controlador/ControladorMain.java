package Controlador;

import Modelo.Alumno;
import Modelo.AlumnoCGT;
import Modelo.AlumnoEgresado;
import Modelo.AlumnoPregrado;
import java.util.Scanner;

/**
 *
 * @author Benji
 */
public class ControladorMain {

    static Scanner teclado = new Scanner(System.in);

    public static Alumno agregarAlumnoPregrado() {

        int ciclo;
        String nombre;
        String codigo;
        int edad;
        System.out.println("\n     Alumno Pregrado\n");
        System.out.print("Ciclo: ");
        ciclo = teclado.nextInt();
        System.out.print("Nombre: ");
        nombre = teclado.next();
        System.out.print("Codigo: ");
        codigo = teclado.next();
        System.out.print("Edad: ");
        edad = teclado.nextInt();

        return new AlumnoPregrado(ciclo, nombre, codigo, edad);
    }

    public static Alumno agregarAlumnoCGT() {
        int ciclo;
        String nombre;
        String codigo;
        int edad;
        String trabajo;
        System.out.println("\n     Alumno Pregrado\n");
        System.out.print("Ciclo: ");
        ciclo = teclado.nextInt();
        System.out.print("Nombre: ");
        nombre = teclado.next();
        System.out.print("Codigo: ");
        codigo = teclado.next();
        System.out.print("Edad: ");
        edad = teclado.nextInt();
        System.out.print("Trabajo: ");
        trabajo = teclado.next();

        return new AlumnoCGT(ciclo, trabajo, nombre, codigo, edad);
    }

    public static Alumno agregarAlumnoEgresado() {

        String nombre;
        String codigo;
        int edad;
        int ordenMerito;
        System.out.println("\n     Alumno Pregrado\n");
        System.out.print("Nombre: ");
        nombre = teclado.next();
        System.out.print("Codigo: ");
        codigo = teclado.next();
        System.out.print("Edad: ");
        edad = teclado.nextInt();
        System.out.print("Orden de merito: ");
        ordenMerito = teclado.nextInt();

        return new AlumnoEgresado(ordenMerito, nombre, codigo, edad);

    }
    
}
