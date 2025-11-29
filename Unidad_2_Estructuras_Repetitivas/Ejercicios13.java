
  import java.util.Scanner;

public class Ejercicios13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el número de conductores: ");
        int numConductores = sc.nextInt();
        sc.nextLine(); // Limpiar buffer
        
        String[] nombres = new String[numConductores];
        int[][] kms = new int[numConductores][7]; // 7 días de la semana
        int[] totalKms = new int[numConductores];
       
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        
        // Lectura de datos
        System.out.println("\nIngrese los datos de los conductores:\n");
        for (int i = 0; i < numConductores; i++) {
            System.out.print("Nombre del conductor " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
            
            System.out.println("Kilómetros para " + nombres[i] + ":");
            int sumaKms = 0;
            for (int j = 0; j < 7; j++) {
                System.out.print("  " + diasSemana[j] + ": ");
                kms[i][j] = sc.nextInt();
                sumaKms += kms[i][j];
            }
            sc.nextLine(); // Limpiar buffer
            totalKms[i] = sumaKms;
        }
        
        // Mostrar resultados

        System.out.println("\n--- Resumen de Kilómetros por Conductor ---\n");
        System.out.printf("%-20s %15s\n", "Conductor", "Total km");

        System.out.println(repeatChar('-', 35));
        
        
        for (int i = 0; i < numConductores; i++) {
            System.out.printf("%-20s %15d\n", nombres[i], totalKms[i]);
        }
        
        // Mostrar detalle de kilómetros por día
        System.out.println("\n--- Detalle de Kilómetros por Día ---\n");
        System.out.printf("%-20s", "Conductor");
        for (String dia : diasSemana) {
            System.out.printf("%10s", dia);
        }
        System.out.printf("%10s\n", "Total");
        System.out.println(repeatChar('-', 100));
        
        for (int i = 0; i < numConductores; i++) {
            System.out.printf("%-20s", nombres[i]);
            for (int j = 0; j < 7; j++) {
                System.out.printf("%10d", kms[i][j]);
            }
            System.out.printf("%10d\n", totalKms[i]);
        }
        
        sc.close();
    }  

    private static String repeatChar(char ch, int count) {
        if (count <= 0) return "";
        StringBuilder sb = new StringBuilder(count);
        for (int i = 0; i < count; i++) sb.append(ch);
        return sb.toString();
    }
}
