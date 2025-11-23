public class ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8, 10, 12};
        for (int numero : numeros) {
            if (numero == 8) {
                System.out.println("Número encontrado, saliendo del ciclo");
                break;
            }
            System.out.println(numero);
        }
    }
}