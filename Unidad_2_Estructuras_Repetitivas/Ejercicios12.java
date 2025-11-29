public class Ejercicios12 {
  
    public static void main(String[] args) {
        int[][] marco = new int[5][15];
        
        // Cargar la matriz: 1 en los bordes, 0 en el interior
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                // Primera fila, última fila, primera columna o última columna
                if (i == 0 || i == 4 || j == 0 || j == 14) {
                    marco[i][j] = 1;
                } else {
                    marco[i][j] = 0;
                }
            }
        }
        
        // Mostrar la matriz en pantalla
        System.out.println("--- Matriz Marco 5x15 ---\n");
        mostrarMatriz(marco);
    }
    
    // Método para mostrar la matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    } 
}
