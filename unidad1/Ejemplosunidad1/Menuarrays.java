package Ejemplosunidad1;

import java.util.Arrays;
import java.util.Scanner;

public class Menuarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ DE CASOS DE USO DE ARRAYS ===");
            System.out.println("1. Almacenar y procesar lista de elementos (promedio)");
            System.out.println("2. Búsqueda secuencial en un array");
            System.out.println("3. Ordenar elementos");
            System.out.println("4. Invertir elementos de un array");
            System.out.println("5. Filtrar datos (números pares)");
            System.out.println("6. Contar ocurrencias de un valor");
            System.out.println("7. Arrays multidimensionales (tablero)");
            System.out.println("8. Búsqueda binaria en un array");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    int[] calificaciones = {85, 90, 78, 92, 88};
                    int suma = 0;
                    for (int calificacion : calificaciones) {
                        suma += calificacion;
                    }
                    double promedio = suma / (double) calificaciones.length;
                    System.out.println("El promedio de las calificaciones es: " + promedio);
                    break;

                case 2:
                    int[] numeros1 = {3, 7, 9, 15, 20};
                    int buscado1 = 9;
                    boolean encontrado = false;
                    for (int numero : numeros1) {
                        if (numero == buscado1) {
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado) {
                        System.out.println("El número " + buscado1 + " se encontró en el array.");
                    } else {
                        System.out.println("El número " + buscado1 + " no está en el array.");
                    }
                    break;

                case 3:
                    int[] numeros2 = {5, 3, 8, 1, 9};
                    Arrays.sort(numeros2);
                    System.out.println("Array ordenado: " + Arrays.toString(numeros2));
                    break;

                case 4:
                    int[] numeros3 = {10, 20, 30, 40, 50};
                    for (int i = 0; i < numeros3.length / 2; i++) {
                        int temp = numeros3[i];
                        numeros3[i] = numeros3[numeros3.length - 1 - i];
                        numeros3[numeros3.length - 1 - i] = temp;
                    }
                    System.out.println("Array invertido: " + Arrays.toString(numeros3));
                    break;

                case 5:
                    int[] numeros4 = {5, 8, 13, 22, 35, 42};
                    System.out.println("Números pares:");
                    for (int numero : numeros4) {
                        if (numero % 2 == 0) {
                            System.out.println(numero);
                        }
                    }
                    break;

                case 6:
                    int[] numeros5 = {3, 7, 3, 9, 3, 1, 3};
                    int contador = 0;
                    for (int numero : numeros5) {
                        if (numero == 3) {
                            contador++;
                        }
                    }
                    System.out.println("El número 3 aparece " + contador + " veces.");
                    break;

                case 7:
                    int[][] tablero = {
                        {1, 0, 1},
                        {0, 1, 0},
                        {1, 0, 1}
                    };
                    System.out.println("Tablero:");
                    for (int i = 0; i < tablero.length; i++) {
                        for (int j = 0; j < tablero[i].length; j++) {
                            System.out.print(tablero[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 8:
                    int[] numeros6 = {1, 3, 5, 7, 9, 11};
                    int buscado2 = 7;
                    int posicion = Arrays.binarySearch(numeros6, buscado2);
                    if (posicion >= 0) {
                        System.out.println("Número " + buscado2 + " encontrado en la posición: " + posicion);
                    } else {
                        System.out.println("Número no encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
