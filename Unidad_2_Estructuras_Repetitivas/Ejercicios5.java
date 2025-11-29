public class Ejercicios5 {
 
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        int[] vector = new int[10];

        // Inicializar el vector con valores aleatorios
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100); // Números aleatorios entre 0 y 99
        }

        System.out.println("Vector original:");
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Ordenar el vector de menor a mayor (usando el método de burbuja)
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - 1 - i; j++) {
                if (vector[j] > vector[j + 1]) {
                    // Intercambiar
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }

        System.out.println("Vector ordenado de menor a mayor:");
        for (int num : vector) {
            System.out.print(num + " ");
        }
    }
}
