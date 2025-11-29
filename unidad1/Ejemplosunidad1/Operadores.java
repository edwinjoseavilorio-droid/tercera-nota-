package Ejemplosunidad1;

public class Operadores {

    public static void main(String[] args) {
        // Operadores aritméticos
        int suma = 5 + 3; 
        int resta = 10 - 4; // resta es 6
        int multiplicacion = 6 * 7; // multiplicacion es 42
        int resultadoEntero = 9 / 2; // resultadoEntero es 4
        double resultadoDecimal = 9.0 / 2; // resultadoDecimal es 4.5
        int modulo = 10 % 3; // modulo es 1
        
        // Operadores de asignación compuesta
        int a = 5;
        a += 3; // a es ahora 8
        int b = 10;
        b -= 2; // b es ahora 8
        int d = 20;
        d /= 4; // d es ahora 5
        int e = 15;
        e %= 4; // e es ahora 3
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División entera: " + resultadoEntero);
        System.out.println("División decimal: " + resultadoDecimal);
        System.out.println("Módulo: " + modulo);

        System.out.println("a después de += : " + a);
        System.out.println("b después de -= : " + b);
        System.out.println("d después de /= : " + d);
        System.out.println("e después de %= : " + e);   
        
    }
}