
 import java.util.Scanner;


public class Ejercicios15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numPartidos = 15;
        
        String[][] equipos = new String[numPartidos][2];
        int[][] resultados = new int[numPartidos][2];
        
        // Lectura de datos de los partidos
        System.out.println("Gestión de Resultados de Quiniela de Fútbol");
        System.out.println("==========================================\n");
        System.out.println("Ingrese los datos de los 15 partidos:\n");
        
        for (int i = 0; i < numPartidos; i++) {
            System.out.println("Partido " + (i + 1) + ":");
            
            System.out.print("  Nombre del equipo 1: ");
            equipos[i][0] = sc.nextLine();
            
            System.out.print("  Nombre del equipo 2: ");
            equipos[i][1] = sc.nextLine();
            
            System.out.print("  Goles de " + equipos[i][0] + ": ");
            resultados[i][0] = sc.nextInt();
            
            System.out.print("  Goles de " + equipos[i][1] + ": ");
            resultados[i][1] = sc.nextInt();
            sc.nextLine(); // Limpiar buffer
            
            System.out.println();
        }
        
        // Mostrar resultados
        System.out.println("\n" + repeatChar('=', 70));
        System.out.println("RESULTADOS DE LA QUINIELA");
        System.out.println(repeatChar('=', 70) + "\n");
        
        System.out.printf("%-5s %-20s %-5s %-20s %-5s %-10s\n", 
            "Partido", "Equipo 1", "Goles", "Equipo 2", "Goles", "Resultado");
        System.out.println(repeatChar('-', 70));
        
        for (int i = 0; i < numPartidos; i++) {
            String resultado;
            if (resultados[i][0] > resultados[i][1]) {
                resultado = "Gana " + equipos[i][0];
            } else if (resultados[i][1] > resultados[i][0]) {
                resultado = "Gana " + equipos[i][1];
            } else {
                resultado = "Empate";
            }
            
            System.out.printf("%-5d %-20s %-5d %-20s %-5d %-10s\n",
                (i + 1),
                equipos[i][0],
                resultados[i][0],
                equipos[i][1],
                resultados[i][1],
                resultado);
        }
        
        System.out.println(repeatChar('=', 70));
        
        // Estadísticas adicionales
        System.out.println("\n--- ESTADÍSTICAS ---\n");
        
        // Contar victorias por equipo (considerando todos los partidos)
        System.out.println("Equipos y sus resultados:");
        for (int i = 0; i < numPartidos; i++) {
            String resultado;
            if (resultados[i][0] > resultados[i][1]) {
                resultado = "Victoria";
            } else if (resultados[i][1] > resultados[i][0]) {
                resultado = "Derrota";
            } else {
                resultado = "Empate";
            }
            
            System.out.printf("Partido %2d: %s %d - %d %s (%s)\n",
                (i + 1),
                equipos[i][0],
                resultados[i][0],
                resultados[i][1],
                equipos[i][1],
                resultado);
        }
        
        // Total de goles
        System.out.println("\n--- TOTAL DE GOLES ---");
        int totalGolesTodosPartidos = 0;
        for (int i = 0; i < numPartidos; i++) {
            totalGolesTodosPartidos += resultados[i][0] + resultados[i][1];
        }
        System.out.println("Total de goles en todos los partidos: " + totalGolesTodosPartidos);
        
        // Promedio de goles por partido
        double promedioGoles = (double) totalGolesTodosPartidos / numPartidos;
        System.out.printf("Promedio de goles por partido: %.2f\n", promedioGoles);
        
        sc.close();
    }

    private static String repeatChar(char ch, int count) {
        if (count <= 0) return "";
        StringBuilder sb = new StringBuilder(count);
        for (int i = 0; i < count; i++) sb.append(ch);
        return sb.toString();
    }
}