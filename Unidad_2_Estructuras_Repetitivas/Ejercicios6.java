public class Ejercicios6 {


    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        int[] dias = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        System.out.print("Introduce un número de mes (1-12): ");
        int numeroMes = scanner.nextInt();

        if (numeroMes >= 1 && numeroMes <= 12) {
            String nombreMes = meses[numeroMes - 1];
            int numeroDias = dias[numeroMes - 1];
            System.out.println("El mes de " + nombreMes + " tiene " + numeroDias + " días.");
        } else {
            System.out.println("Número de mes inválido. Por favor, introduce un número entre 1 y 12.");
        }
        scanner.close();
    } 
       
}
