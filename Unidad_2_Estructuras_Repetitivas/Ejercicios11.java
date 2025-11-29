
    public class Ejercicios11 {
    public static void main(String[] args) {
        int[][] diagonal = new int[5][5];
        
        // Cargar la matriz: diagonal = 1, resto = 0
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    diagonal[i][j] = 1;
                } else {
                    diagonal[i][j] = 0;
                }
            }
        }
        
        // Mostrar la matriz en pantalla
        System.out.println("--- Matriz Diagonal 5x5 ---\n");
        mostrarMatriz(diagonal);
    }
    
    // Método para mostrar la matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
