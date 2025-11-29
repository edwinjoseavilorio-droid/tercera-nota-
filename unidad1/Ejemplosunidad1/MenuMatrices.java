package Ejemplosunidad1;

import java.util.Scanner;
import java.util.Arrays;

public class MenuMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ DE EJERCICIOS CON MATRICES ===");
            System.out.println("1. Definición e inicialización de matriz");
            System.out.println("2. Acceso a elementos de una matriz");
            System.out.println("3. Recorrer una matriz");
            System.out.println("4. Representar tabla de datos (ventas)");
            System.out.println("5. Tablero de juego (tres en raya)");
            System.out.println("6. Matriz irregular (Jagged Array)");
            System.out.println("7. Sumar todos los elementos de una matriz");
            System.out.println("8. Multiplicación de matrices");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    int[][] matriz1 = {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12}
                    };
                    System.out.println("Matriz inicializada:");
                    for (int[] fila : matriz1) {
                        System.out.println(Arrays.toString(fila));
                    }
                    break;

                case 2:
                    int[][] matriz2 = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                    };
                    int valor = matriz2[1][2];
                    System.out.println("Valor en fila 1, columna 2: " + valor);
                    break;

                case 3:
                    int[][] matriz3 = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                    };
                    System.out.println("Recorrido de la matriz:");
                    for (int i = 0; i < matriz3.length; i++) {
                        for (int j = 0; j < matriz3[i].length; j++) {
                            System.out.print(matriz3[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    int[][] ventas = {
                        {100, 150, 130},
                        {90, 120, 110},
                        {200, 180, 160}
                    };
                    System.out.println("Ventas de febrero para producto 2: " + ventas[1][1]);
                    break;

                case 5:
                    char[][] tablero = {
                        {'X', 'O', 'X'},
                        {'O', 'X', ' '},
                        {' ', 'O', ' '}
                    };
                    System.out.println("Tablero de tres en raya:");
                    for (int i = 0; i < tablero.length; i++) {
                        for (int j = 0; j < tablero[i].length; j++) {
                            System.out.print(tablero[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 6:
                    int[][] matrizIrregular = {
                        {1, 2, 3},
                        {4, 5},
                        {6, 7, 8, 9}
                    };
                    System.out.println("Matriz irregular:");
                    for (int i = 0; i < matrizIrregular.length; i++) {
                        for (int j = 0; j < matrizIrregular[i].length; j++) {
                            System.out.print(matrizIrregular[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 7:
                    int[][] matriz4 = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                    };
                    int suma = 0;
                    for (int i = 0; i < matriz4.length; i++) {
                        for (int j = 0; j < matriz4[i].length; j++) {
                            suma += matriz4[i][j];
                        }
                    }
                    System.out.println("Suma de todos los elementos: " + suma);
                    break;

                case 8:
                    int[][] A = {
                        {1, 2, 3},
                        {4, 5, 6}
                    };
                    int[][] B = {
                        {7, 8},
                        {9, 10},
                        {11, 12}
                    };
                    int filasA = A.length;
                    int columnasA = A[0].length;
                    int columnasB = B[0].length;
                    int[][] resultado = new int[filasA][columnasB];

                    for (int i = 0; i < filasA; i++) {
                        for (int j = 0; j < columnasB; j++) {
                            for (int k = 0; k < columnasA; k++) {
                                resultado[i][j] += A[i][k] * B[k][j];
                            }
                        }
                    }

                    System.out.println("Resultado de la multiplicación de matrices:");
                    for (int[] fila : resultado) {
                        System.out.println(Arrays.toString(fila));
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
