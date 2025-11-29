package Ejemplosunidad1;

public class Control {

public static void main(String[] args) {
    //ejemplo 1
    int numero1 = -5;
    if (numero1 > 0) {
        System.out.println("El número es positivo.");
    } else {
        System.out.println("El número es negativo o cero.");
    }

    //ejemplo 2
    int numero2 = 0;
    if (numero2 > 0) {
        System.out.println("El número es positivo.");
    } else if (numero2 < 0) {
        System.out.println("El número es negativo.");
    } else {
        System.out.println("El número es cero.");
    }


    //ejemplo 3 
    int dia = 3;
    switch (dia) {
        case 1:
            System.out.println("Lunes");
            break;
        case 2:
            System.out.println("Martes");
            break;
        case 3:
            System.out.println("Miércoles");
            break;
        default:
            System.out.println("Día no válido");
            break;
    }
}
}