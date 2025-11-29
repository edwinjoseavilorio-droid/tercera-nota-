package clases.src.GestionRecreacional.app;

import java.util.Scanner;
import clases.src.GestionRecreacional.services.GestionRecreacional;

public class App {
    public static void main(String[] args) {
        GestionRecreacional gestion = new GestionRecreacional();
        Scanner sc = new Scanner(System.in);
        int opcion;

        // Datos de prueba
        gestion.registrarEspacio("Cancha 1", "Tenis", 2);
        gestion.registrarEspacio("Cancha 2", "Fútbol", 10);
        gestion.registrarEspacio("Sala de Juegos", "Juegos", 5);
        gestion.registrarEstudiante("Juan", "E1");
        gestion.registrarEstudiante("María", "E2");

        do {
            System.out.println("\n--- SISTEMA RECREACIONAL ---");
            System.out.println("1. Ver espacios");
            System.out.println("2. Ver disponibilidad");
            System.out.println("3. Ver estudiantes");
            System.out.println("4. Hacer reserva");
            System.out.println("5. Cancelar reserva");
            System.out.println("6. Ver mis reservas");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    gestion.mostrarEspacios();
                    break;
                case 2:
                    System.out.print("Nombre del espacio: ");
                    String espacio = sc.nextLine();
                    gestion.mostrarDisponibilidad(espacio);
                    break;
                case 3:
                    gestion.mostrarEstudiantes();
                    break;
                case 4:
                    System.out.print("ID estudiante: ");
                    String id = sc.nextLine();
                    System.out.print("Espacio: ");
                    String esp = sc.nextLine();
                    System.out.print("Horario (ej: 10:00): ");
                    String hora = sc.nextLine();
                    gestion.reservar(id, esp, hora);
                    break;
                case 5:
                    System.out.print("ID estudiante: ");
                    String id2 = sc.nextLine();
                    System.out.print("Espacio: ");
                    String esp2 = sc.nextLine();
                    System.out.print("Horario: ");
                    String hora2 = sc.nextLine();
                    gestion.cancelar(id2, esp2, hora2);
                    break;
                case 6:
                    System.out.print("ID estudiante: ");
                    String id3 = sc.nextLine();
                    gestion.mostrarReservasEstudiante(id3);
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
