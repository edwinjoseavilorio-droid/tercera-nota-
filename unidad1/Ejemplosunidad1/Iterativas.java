package Ejemplosunidad1;

public class    Iterativas {

    public static void main(String[] args) {
        System.out.println("Ejemplo con while:");
        int i = 0;
        while (i < 5) {
            System.out.println("i es " + i);
            i++;
        }

        System.out.println("\nEjemplo con do-while:");
        i = 0;
        do {
            System.out.println("i es " + i);
            i++;
        } while (i < 5);

        System.out.println("\nEjemplo con for:");
        for (int j = 0; j < 5; j++) {
            System.out.println("j es " + j);
        }
    }
}
