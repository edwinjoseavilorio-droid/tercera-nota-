public class Ejercicios3 {
  
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        double[] notas = new double[5];
        double suma = 0;
        double notaMaxima = Double.NEGATIVE_INFINITY;
        double notaMinima = Double.POSITIVE_INFINITY;
        
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + " (entre 0 y 10): ");
            notas[i] = scanner.nextDouble();
            suma += notas[i];
            
            if (notas[i] > notaMaxima) {
                notaMaxima = notas[i];
            }
            if (notas[i] < notaMinima) {
                notaMinima = notas[i];
            }
        }
        
        double notaMedia = suma / notas.length;
        
        System.out.println("Las notas ingresadas son:");
        for (double nota : notas) {
            System.out.println(nota);
        }
        
        System.out.println("La nota media es: " + notaMedia);
        System.out.println("La nota más alta es: " + notaMaxima);
        System.out.println("La nota más baja es: " + notaMinima);
        
        scanner.close();
    }
}
