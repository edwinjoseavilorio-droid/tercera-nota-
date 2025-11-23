package ejercicios_practicos;

public class ejercicio1 {

    public static void main(String[] args) {
        int valor = 10;
        cambiarValor(valor);
        System.out.println("Valor después de cambiarValor: " + valor);  // Debería imprimir 10
    }

    public static void cambiarValor(int valor) {
        valor = 20;
    }
}

