public class Ejercicios4 {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int[] vector = new int[10];
        int count = 0;

        System.out.println("Introduce números enteros para rellenar el vector (introduce un número negativo para terminar):");

        while (count < vector.length) {
            int numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            vector[count] = numero;
            count++;
        }

        System.out.println("Elementos introducidos en el vector:");
        for (int i = 0; i < count; i++) {
            System.out.print(vector[i] + " ");
        }
        scanner.close();
    }
}
