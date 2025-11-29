
 import java.util.Scanner;

public class Ejercicios9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int dias = 5;
        double[] tempMinima = new double[dias];
        double[] tempMaxima = new double[dias];
        double[] tempMedia = new double[dias];
        
        // Lectura de temperaturas mínima y máxima para cada día
        System.out.println("Ingrese las temperaturas mínima y máxima para 5 días:\n");
        for (int i = 0; i < dias; i++) {
            System.out.println("Día " + (i + 1) + ":");
            System.out.print("  Temperatura mínima: ");
            tempMinima[i] = sc.nextDouble();
            System.out.print("  Temperatura máxima: ");
            tempMaxima[i] = sc.nextDouble();
            
            // Calcular temperatura media
            tempMedia[i] = (tempMinima[i] + tempMaxima[i]) / 2.0;
        }
        
        // Mostrar la temperatura media de cada día
        System.out.println("\n--- Temperatura media de cada día ---");
        for (int i = 0; i < dias; i++) {
            System.out.printf("Día %d: %.2f°C\n", (i + 1), tempMedia[i]);
        }
        
        // Encontrar la temperatura mínima más baja
        double minima = tempMinima[0];
        for (int i = 1; i < dias; i++) {
            if (tempMinima[i] < minima) {
                minima = tempMinima[i];
            }
        }
        
        // Mostrar los días con menor temperatura mínima
        System.out.println("\n--- Días con menor temperatura ---");
        System.out.println("Temperatura mínima más baja: " + minima + "°C");
        for (int i = 0; i < dias; i++) {
            if (tempMinima[i] == minima) {
                System.out.println("Día " + (i + 1));
            }
        }
        
        // Buscar días con temperatura máxima específica
        System.out.print("\nIngrese una temperatura para buscar días con esa temperatura máxima: ");
        double tempBuscar = sc.nextDouble();
        
        System.out.println("\n--- Días con temperatura máxima de " + tempBuscar + "°C ---");
        boolean encontrado = false;
        for (int i = 0; i < dias; i++) {
            if (tempMaxima[i] == tempBuscar) {
                System.out.println("Día " + (i + 1));
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("No existe ningún día con temperatura máxima de " + tempBuscar + "°C");
        }
        
        sc.close();
    }
}   

