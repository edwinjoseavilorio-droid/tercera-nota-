public class ejercicios1 {
    
     
    public static void main(String[] args) {
        int[] vector_numeros = new int[10];

        // Inicializar el vector con valores aleatorios del 1 al 10
        for (int i = 0; i < vector_numeros.length; i++) {
            vector_numeros[i] = (int) (Math.random() * 10) + 1;
        }

        // Mostrar cada elemento junto con su cuadrado y su cubo
        System.out.println("Número\tCuadrado\tCubo");
        for (int numero : vector_numeros) {
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;
            System.out.println(numero + "\t" + cuadrado + "\t\t" + cubo);
        }
    }
}
