package Ejemplosunidad1;
    
public class Inmutabilidad {
    public static void main(String[] args) {
        char letter = 'A';
        letter = 'B';  
        System.out.println("Letter: " + letter);
    

        String greeting = "Hello";
        greeting = greeting + " World"; 
        System.out.println("greeting: " + greeting); 
    }
}