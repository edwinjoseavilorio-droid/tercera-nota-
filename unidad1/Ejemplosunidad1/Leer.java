package Ejemplosunidad1;

import java.util.Scanner;

public class Leer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        System.out.println("Número entero leído: " + numero);

        //decimal
        
        System.out.print("Ingresa un número decimal: ");
        double decimal = scanner.nextDouble();

        System.out.println("Número entero leído: " + decimal);
        
        //linea completa
        System.out.print("Ingresa una línea de texto: ");
        String linea = scanner.nextLine();
        System.out.println("Línea de texto leída: " + linea);

        //palabra
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.next();

        System.out.println("Palabra leída: " + palabra);

        scanner.close();
    }
}