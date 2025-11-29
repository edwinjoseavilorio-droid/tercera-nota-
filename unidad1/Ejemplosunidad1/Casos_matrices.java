package Ejemplosunidad1;

import java.util.Scanner;

public class Casos_matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ DE EJERCICIOS CON MATRICES ===");
            System.out.println("1. Tablas y hojas de cálculo (precios)");
            System.out.println("2. Tablero de juegos (Tic-Tac-Toe)");
            System.out.println("3. Imagen en grises (invertir pixeles)");
            System.out.println("4. Sistemas de calificaciones (promedio)");
            System.out.println("5. Mapas o tablas de distancias");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    double[][] precios = {
                        {10.5, 12.0, 11.8},
                        {15.0, 13.5, 14.0},
                        {20.5, 19.0, 21.0},
                        {30.0, 29.5, 28.5}
                    };
                    for (int i = 0; i < precios.length; i++) {
                        double suma = 0;
                        for (int j = 0; j < precios[i].length; j++) {
                            suma += precios[i][j];
                        }
                        System.out.println("Promedio de precios del producto " + (i + 1) + ": " + (suma / precios[i].length));
                    }
                    break;

                case 2:
                    char[][] tablero = {
                        {'X', 'O', 'X'},
                        {'O', 'X', 'O'},
                        {' ', ' ', 'X'}
                    };
                    System.out.println("Estado del tablero:");
                    for (int i = 0; i < tablero.length; i++) {
                        for (int j = 0; j < tablero[i].length; j++) {
                            System.out.print(tablero[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    int[][] imagenGris = {
                        {255, 128, 0, 64},
                        {64, 255, 128, 0},
                        {0, 64, 255, 128},
                        {128, 0, 64, 255}
                    };
                    System.out.println("Imagen invertida:");
                    for (int i = 0; i < imagenGris.length; i++) {
                        for (int j = 0; j < imagenGris[i].length; j++) {
                            imagenGris[i][j] = 255 - imagenGris[i][j];
                            System.out.print(imagenGris[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    int[][] calificaciones = {
                        {85, 90, 78, 92},
                        {88, 76, 95, 89},
                        {90, 88, 82, 91}
                    };
                    for (int i = 0; i < calificaciones.length; i++) {
                        int suma = 0;
                        for (int j = 0; j < calificaciones[i].length; j++) {
                            suma += calificaciones[i][j];
                        }
                        System.out.println("Promedio del estudiante " + (i + 1) + ": " + (suma / calificaciones[i].length));
                    }
                    break;

                case 5:
                    int[][] distancias = {
                        {0, 10, 15, 20},
                        {10, 0, 35, 25},
                        {15, 35, 0, 30},
                        {20, 25, 30, 0}
                    };
                    System.out.println("La distancia entre Ciudad 1 y Ciudad 3 es: " + distancias[0][2]);
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
