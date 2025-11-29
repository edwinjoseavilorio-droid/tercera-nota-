
    import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicios8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();
        
        // Lectura de datos
        System.out.println("Ingrese el nombre y edad de los alumnos.");
        System.out.println("Ingrese '*' como nombre para terminar.\n");
        
        while (true) {
            System.out.print("Nombre del alumno: ");
            String nombre = sc.nextLine();
            
            if (nombre.equals("*")) {
                break;
            }
            
            System.out.print("Edad del alumno: ");
            int edad = sc.nextInt();
            sc.nextLine(); // Limpiar buffer
            
            nombres.add(nombre);
            edades.add(edad);
        }
        
        if (nombres.isEmpty()) {
            System.out.println("No se ingresaron datos de alumnos.");
            sc.close();
            return;
        }
        
        // Mostrar alumnos mayores de edad (>= 18)
        System.out.println("\n--- Alumnos mayores de edad ---");
        boolean hayMayores = false;
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) >= 18) {
                System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
                hayMayores = true;
            }
        }
        if (!hayMayores) {
            System.out.println("No hay alumnos mayores de edad.");
        }
        
        // Encontrar la edad máxima
        int edadMaxima = edades.get(0);
        for (int edad : edades) {
            if (edad > edadMaxima) {
                edadMaxima = edad;
            }
        }
        
        // Mostrar los alumnos con mayor edad
        System.out.println("\n--- Alumnos con mayor edad (" + edadMaxima + " años) ---");
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) == edadMaxima) {
                System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
            }
        }
        
        sc.close();
    }
}

