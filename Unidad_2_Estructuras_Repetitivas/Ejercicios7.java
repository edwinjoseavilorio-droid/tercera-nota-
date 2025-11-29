public class Ejercicios7 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        System.out.println("Introduce 5 enteros para el vector1:");
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = scanner.nextInt();
        }

        System.out.println("Introduce 5 enteros para el vector2:");
        for (int i = 0; i < vector2.length; i++) {
            vector2[i] = scanner.nextInt();
        }

        // Calcular vector3 = vector1 + vector2
        for (int i = 0; i < vector3.length; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }

        System.out.println("El resultado de vector3 (vector1 + vector2) es:");
        for (int i = 0; i < vector3.length; i++) {
            System.out.print(vector3[i] + " ");
        }
        scanner.close();
    } 
}
