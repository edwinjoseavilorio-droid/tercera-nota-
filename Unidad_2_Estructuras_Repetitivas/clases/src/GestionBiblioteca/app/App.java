package clases.src.GestionBiblioteca.app;

import java.util.Scanner;
import clases.src.GestionBiblioteca.services.GestionBiblioteca;

public class App {
    public static void main(String[] args) {
        GestionBiblioteca gestion = new GestionBiblioteca();
        Scanner sc = new Scanner(System.in);
        int opcion;

        // Agregar algunos libros y usuarios de prueba
        gestion.registrarLibro("El Quijote", "Cervantes", "001");
        gestion.registrarLibro("Cien años de soledad", "García Márquez", "002");
        gestion.registrarLibro("1984", "Orwell", "003");
        gestion.registrarUsuario("Juan", "U1");
        gestion.registrarUsuario("María", "U2");

        do {
            System.out.println("\n--- BIBLIOTECA ---");
            System.out.println("1. Ver libros");
            System.out.println("2. Ver libros disponibles");
            System.out.println("3. Ver usuarios");
            System.out.println("4. Prestar libro");
            System.out.println("5. Devolver libro");
            System.out.println("6. Ver libros de usuario");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    gestion.mostrarLibros();
                    break;
                case 2:
                    gestion.mostrarLibrosDisponibles();
                    break;
                case 3:
                    gestion.mostrarUsuarios();
                    break;
                case 4:
                    System.out.print("ID usuario: ");
                    String idU = sc.nextLine();
                    System.out.print("ISBN libro: ");
                    String isbnL = sc.nextLine();
                    gestion.prestar(idU, isbnL);
                    break;
                case 5:
                    System.out.print("ID usuario: ");
                    String idU2 = sc.nextLine();
                    System.out.print("ISBN libro: ");
                    String isbnL2 = sc.nextLine();
                    gestion.devolver(idU2, isbnL2);
                    break;
                case 6:
                    System.out.print("ID usuario: ");
                    String idU3 = sc.nextLine();
                    gestion.mostrarLibrosPrestados(idU3);
                    break;
                case 0:
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 0);

        sc.close();
    }
}
