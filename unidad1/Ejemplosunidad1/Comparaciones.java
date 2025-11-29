package Ejemplosunidad1;

public class Comparaciones {
    public static void main(String[] args) {
        // Comparación de caracteres
        char a = 'A';
        char b = 'B';
        boolean isEqual = (a == b);
        System.out.println("a == b: " + isEqual); 

        // Comparación de strings
        String str1 = "Java";
        String str2 = "Java";
        boolean isEqualString = str1.equals(str2);  
        System.out.println("str1.equals(str2): " + isEqualString);
    }
}
