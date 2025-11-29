public class Ejercicios2 {
    
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        String[] original = new String[5];
        String[] inverso = new String[5];
        
        
        for (int i = 0; i < original.length; i++) {
            System.out.print("Ingrese una cadena de caracteres para la posición " + (i + 1) + ": ");
            original[i] = scanner.nextLine();
        }
        

        for (int i = 0; i < original.length; i++) {
            inverso[i] = original[original.length - 1 - i];
        }
        
     
        System.out.println("El vector en orden inverso es:");
        for (String cadena : inverso) {
            System.out.println(cadena);
        }
        
        scanner.close();
    }
}
