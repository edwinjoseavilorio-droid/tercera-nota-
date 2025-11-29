package clases.src.GestionComedor.app;

import java.util.Scanner;
import clases.src.GestionComedor.services.GestionComedor;

public class App {
    public static void main(String[] args) {
        GestionComedor gestion = new GestionComedor();
        Scanner sc = new Scanner(System.in);
        int opcion;

        // Datos de prueba
        gestion.registrarComida("Arroz con pollo", "Estándar", 50);
        gestion.registrarComida("Ensalada", "Vegetariana", 30);
        gestion.registrarComida("Pasta", "Vegana", 20);
        gestion.registrarComida("Jugo Natural", "Bebida", 100);
        gestion.registrarEstudiante("Juan", "E1");
        gestion.registrarEstudiante("María", "E2");
        gestion.registrarEstudiante("Carlos", "E3");

        do {
            System.out.println("\n--- SISTEMA COMEDOR ---");
            System.out.println("1. Ver comidas disponibles");
            System.out.println("2. Ver estudiantes");
            System.out.println("3. Seleccionar comida");
            System.out.println("4. Reponer comida");
            System.out.println("5. Ver historial estudiante");
            System.out.println("6. Ver estadísticas");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    gestion.mostrarComidas();
                    break;
                case 2:
                    gestion.mostrarEstudiantes();
                    break;
                case 3:
                    System.out.print("ID estudiante: ");
                    String id = sc.nextLine();
                    System.out.print("Nombre comida: ");
                    String comida = sc.nextLine();
                    gestion.seleccionar(id, comida);
                    break;
                case 4:
                    System.out.print("Nombre comida: ");
                    String com = sc.nextLine();
                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();
                    gestion.reponerComida(com, cantidad);
                    break;
                case 5:
                    System.out.print("ID estudiante: ");
                    String id2 = sc.nextLine();
                    gestion.mostrarHistorial(id2);
                    break;
                case 6:
                    gestion.mostrarEstadisticas();
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
