
    import java.util.Scanner;

public class Ejercicios10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] matriz = new int[5][5];
        
        // Cargar la matriz con valores numéricos
        System.out.println("Ingrese los valores numéricos para la matriz 5x5:\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("matriz[" + i + "][" + j + "] = ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        // Mostrar la matriz
        System.out.println("\n--- Matriz ingresada ---");
        mostrarMatriz(matriz);
        
        // Calcular y mostrar suma de filas
        System.out.println("\n--- Suma de cada fila ---");
        for (int i = 0; i < 5; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Fila " + (i + 1) + ": " + sumaFila);
        }
        
        // Calcular y mostrar suma de columnas
        System.out.println("\n--- Suma de cada columna ---");
        for (int j = 0; j < 5; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 5; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Columna " + (j + 1) + ": " + sumaColumna);
        }
        
        sc.close();
    }
    
    // Método para mostrar la matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
