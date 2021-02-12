/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkg1;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Danny
 */
public class Sistema {

    Contenedores biblioteca = new Contenedores();

    public boolean menu() {
        System.out.println("------------------------Bienvenido a BiblioUNA------------------------");
        System.out.println("Digite el numero de opcion que desea realizar");
        System.out.println("1). Ingresar un nuevo estudiante");
        System.out.println("2). Ingresar un nuevo profesor");
        System.out.println("3). Ingresar un nuevo libro");
        System.out.println("4). Reservar libro por parte de un estudiante");
        System.out.println("5). Reservar libro por parte de un profesor");
        System.out.println("6). Mostrar precio total de libros prestados");
        System.out.println("7). Mostrar libros prestados a un estudiante");
        System.out.println("8). Mostrar datos de estudiantes, profesores, libros y reservas");
        System.out.println("9). Mostrar libro que mas veces se ha prestado");
        System.out.println("10). Salir");
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Digite la opcion: ");

        int op = opcion();
        seleccion(op);

        if (op == 10) {
            return false;
        } else {
            return true;
        }
    }

    public int opcion() {
        int op = 0;
        Scanner entrada = new Scanner(System.in);
        try {
            op = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("debe digitar un numero");
            return -1;
        }
        return op;
    }

    public void seleccion(int op) {
        switch (op) {
            case 1:
                System.out.println("->Ingrese los datos del nuevo estudiante");
                op1();
                break;
            case 2:
                System.out.println("->Ingrese los datos del nuevo profesor");
                op2();
                break;
            case 3:
                System.out.println("->Ingrese los datos del nuevo libro");
                op3();
                break;
            case 4:
                System.out.println("->Ingrese los datos para reservar libro a estudiante");
                op4();
                break;
            case 5:
                System.out.println("->Ingrese los datos para reservar libro a profesor");
                op5();
                break;
            case 6:
                System.out.println("->Precio total de libros prestados");
                op6();
                break;
            case 7:
                System.out.println("->Ingrese datos de estudiante");
                op7();
                break;
            case 8:
                System.out.println("->Datos: ");
                op8();
                break;
            case 9:
                System.out.println("->El libro prestado mas veces es: ");
                break;
            case 10:
                System.out.println("->Saliendo del sistema...");
                break;

        }
    }

    private void op1() {
        Scanner entrada = new Scanner(System.in);
        String carn = " ";
        String carr = " ";
        String nombre = " ";
        String ced = " ";

        System.out.print("Inserte el nombre: ");
        try {
            nombre = entrada.nextLine();
        } catch (Exception e) {
            System.out.println("datos incorrectos");
        }

        System.out.print("Inserte la cedula: ");
        try {
            ced = entrada.nextLine();
        } catch (Exception e) {
            System.out.println("datos incorrectos");
        }

        System.out.print("Inserte el carnet: ");
        try {
            carn = entrada.nextLine();
        } catch (Exception e) {
            System.out.println("datos incorrectos");
        }

        System.out.print("Inserte la carrera: ");
        try {
            carr = entrada.nextLine();
        } catch (Exception e) {
            System.out.println("datos incorrectos");
        }

        System.out.print("\n");

        Estudiante e = new Estudiante(carn, carr, nombre, ced);
        biblioteca.anadirEstudiante(e);

    }

    private void op2() {
        Scanner entrada = new Scanner(System.in);
        Double salario = 0.0;
        String escuela = "";
        String nombre = "";
        String ced = "";

        System.out.print("Inserte el nombre: ");
        try {
            nombre = entrada.nextLine();
        } catch (Exception e) {
            System.out.println("datos incorrectos");
        }

        System.out.print("Inserte la cedula: ");
        try {
            ced = entrada.nextLine();
        } catch (Exception e) {
            System.out.println("datos incorrectos");
        }

        System.out.print("Inserte la escuela: ");
        try {
            escuela = entrada.nextLine();
        } catch (Exception e) {
            System.out.println("datos incorrectos");
        }

        System.out.print("Inserte el salario: ");
        try {
            salario = entrada.nextDouble();
        } catch (Exception e) {
            System.out.println("datos incorrectos");
        }

        System.out.print("\n");

        Profesor p = new Profesor(salario, escuela, nombre, ced);
        biblioteca.anadirProfesor(p);

    }

    private void op3() {
        Scanner entrada = new Scanner(System.in);
        String codigo = "";
        String nombre = "";
        String autor = "";
        int anno = 0;
        double precio = 0.0;

        System.out.print("Inserte el nombre: ");
        try {
            nombre = entrada.nextLine();
        } catch (Exception e) {
            System.out.println("datos incorrectos");
        }

        System.out.print("Inserte el codigo: ");
        try {
            codigo = entrada.nextLine();
        } catch (Exception e) {
            System.out.println("datos incorrectos");
        }

        System.out.print("Inserte el autor: ");
        try {
            autor = entrada.nextLine();
        } catch (Exception e) {
            System.out.println("datos incorrectos");
        }

        System.out.print("Inserte el precio: ");
        try {
            precio = entrada.nextDouble();
        } catch (Exception e) {
            System.out.println("datos incorrectos");
        }

        System.out.print("Inserte el anno: ");
        try {
            anno = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("datos incorrectos");
        }

        System.out.print("\n");

        Libro l = new Libro(codigo, nombre, autor, anno, precio);
        biblioteca.anadirLibro(l);
    }

    private void op4() {
        /*pide cedula a estudiante y codigo a libro*/
        Scanner entrada = new Scanner(System.in);
        String codigo = "";
        String cedula = "";
        int diasPrestamo = 0;

        System.out.print("Inserte la cedula del estudiante: ");
        try {
            cedula = entrada.nextLine();
        } catch (Exception e) {
            System.out.println("datos incorrectos");
        }

        System.out.print("Inserte el codigo del libro: ");
        try {
            codigo = entrada.nextLine();
        } catch (Exception e) {
            System.out.println("datos incorrectos");
        }

        System.out.print("Inserte dias de prestamo: ");
        try {
            diasPrestamo = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("datos incorrectos");
        }

        System.out.print("\n");

        if (biblioteca.buscaEstudiante(cedula) && biblioteca.buscaLibro(codigo)) {
            ReservacionEstudiantes nuevaReserva
                    = new ReservacionEstudiantes(biblioteca.obtieneEstudiante(cedula), diasPrestamo, new Date(), biblioteca.obtieneLibro(codigo));
            biblioteca.anadirReservacionEst(nuevaReserva);
        } else {
            System.out.println("Cedula o Codigo no coinciden");
        }
    }

    private void op5() {
        /*pide cedula a estudiante y codigo a libro*/
        Scanner entrada = new Scanner(System.in);
        String codigo = "";
        String cedula = "";
        int diasPrestamo = 0;

        System.out.print("Inserte la cedula del profesor: ");
        try {
            cedula = entrada.nextLine();
        } catch (Exception e) {
            System.out.println("datos incorrectos");
        }

        System.out.print("Inserte el codigo del libro: ");
        try {
            codigo = entrada.nextLine();
        } catch (Exception e) {
            System.out.println("datos incorrectos");
        }

        System.out.print("Inserte dias de prestamo: ");
        try {
            diasPrestamo = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("datos incorrectos");
        }

        if (biblioteca.buscaProfesor(cedula) && biblioteca.buscaLibro(codigo)) {
            ReservaProfesores nuevaReserva
                    = new ReservaProfesores(biblioteca.obtieneProfesor(cedula), diasPrestamo, new Date(), biblioteca.obtieneLibro(codigo));
            biblioteca.anadirReservacionProf(nuevaReserva);
        } else {
            System.out.println("Cedula o Codigo no coinciden");
        }

        System.out.print("\n");
    }

    private void op6() {
        System.out.println("suma de precios de libros prestados: " + biblioteca.sumaPreciosLibros());
        System.out.print("\n");
    }

    private void op7() {
        /*pide cedula a estudiante y codigo a libro*/
        Scanner entrada = new Scanner(System.in);

        String cedula = "";

        System.out.print("Inserte la cedula del estudiante: ");
        try {
            cedula = entrada.nextLine();
        } catch (Exception e) {
            System.out.println("datos incorrectos");
        }

        if (biblioteca.buscaEstudiante(cedula)) {
            System.out.println("libro prestado: " + biblioteca.obtieneLibrosReservadosEst(cedula).getNombre());
        } else {
            System.out.println("cedula no coincide con ningun estudiante");
        }
        System.out.println("\n");
    }

    private void op8(){
        System.out.println("------------------------Datos Estudiantes-----------------------------");
        System.out.println(biblioteca.imprimeListaEstudiantes());
        
        System.out.println("------------------------Datos Profesores------------------------------");
        System.out.println(biblioteca.imprimeListaProfesores());
        
        System.out.println("------------------------Datos Libros----------------------------------");
        System.out.println(biblioteca.imprimeListaLibros());
        
        System.out.println("------------------------Datos Reservaciones Estudiantes---------------");
        System.out.println(biblioteca.imprimeListaReservacionesEst());
        
        System.out.println("------------------------Datos Reservaciones Profesores----------------");
        System.out.println(biblioteca.imprimeListaReservacionesProf());
    }
}
