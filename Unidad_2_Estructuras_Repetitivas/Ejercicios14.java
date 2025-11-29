
    import java.util.Scanner;

public class Ejercicios14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numArticulos = 5;
        int numSucursales = 4;
        
        double[] precios = new double[numArticulos];
        int[][] cantidades = new int[numArticulos][numSucursales];
        
        // Lectura de precios
        System.out.println("Ingrese los precios de los 5 artículos:\n");
        for (int i = 0; i < numArticulos; i++) {
            System.out.print("Precio del artículo " + (i + 1) + ": $");
            precios[i] = sc.nextDouble();
        }
        
        // Lectura de cantidades vendidas por artículo y sucursal
        System.out.println("\nIngrese las cantidades vendidas por artículo en cada sucursal:\n");
        for (int i = 0; i < numArticulos; i++) {
            System.out.println("Artículo " + (i + 1) + " (Precio: $" + precios[i] + "):");
            for (int j = 0; j < numSucursales; j++) {
                System.out.print("  Sucursal " + (j + 1) + ": ");
                cantidades[i][j] = sc.nextInt();
            }
        }
        
        // 1. Cantidades totales de cada artículo
        System.out.println("\n--- Cantidades Totales de cada Artículo ---");
        int[] totalArticulos = new int[numArticulos];
        for (int i = 0; i < numArticulos; i++) {
            for (int j = 0; j < numSucursales; j++) {
                totalArticulos[i] += cantidades[i][j];
            }
            System.out.println("Artículo " + (i + 1) + ": " + totalArticulos[i] + " unidades");
        }
        
        // 2. Cantidad total de artículos en la sucursal 2
        System.out.println("\n--- Cantidad Total en Sucursal 2 ---");
        int totalSucursal2 = 0;
        for (int i = 0; i < numArticulos; i++) {
            totalSucursal2 += cantidades[i][1]; // Índice 1 = Sucursal 2
        }
        System.out.println("Total de unidades en Sucursal 2: " + totalSucursal2);
        
        // 3. Cantidad del artículo 3 en la sucursal 1
        System.out.println("\n--- Artículo 3 en Sucursal 1 ---");
        System.out.println("Cantidad: " + cantidades[2][0] + " unidades"); // Índice 2 = Artículo 3, Índice 0 = Sucursal 1
        
        // 4 y 5. Recaudación total por sucursal y recaudación total de la empresa
        System.out.println("\n--- Recaudación por Sucursal ---");
        double[] recaudacionSucursales = new double[numSucursales];
        double recaudacionTotal = 0;
        
        for (int j = 0; j < numSucursales; j++) {
            double recaudacion = 0;
            for (int i = 0; i < numArticulos; i++) {
                recaudacion += cantidades[i][j] * precios[i];
            }
            recaudacionSucursales[j] = recaudacion;
            recaudacionTotal += recaudacion;
            System.out.printf("Sucursal %d: $%.2f\n", (j + 1), recaudacion);
        }
        
        System.out.printf("\nRecaudación Total de la Empresa: $%.2f\n", recaudacionTotal);
        
        // 6. Sucursal de mayor recaudación
        System.out.println("\n--- Sucursal de Mayor Recaudación ---");
        int sucursalMaxima = 0;
        double recaudacionMaxima = recaudacionSucursales[0];
        
        for (int j = 1; j < numSucursales; j++) {
            if (recaudacionSucursales[j] > recaudacionMaxima) {
                recaudacionMaxima = recaudacionSucursales[j];
                sucursalMaxima = j;
            }
        }
        
        System.out.printf("Sucursal %d con $%.2f\n", (sucursalMaxima + 1), recaudacionMaxima);
        
        sc.close();
    }
}
