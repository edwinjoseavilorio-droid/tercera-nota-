public class Acumulando_Valores {
    public static void main(String[] args) {
    int[] calificaciones = {80, 90, 70, 85, 95};
int sumaCalificaciones = 0;  // Inicializamos el acumulador

for (int calificacion : calificaciones) {
    sumaCalificaciones += calificacion;  // Acumulamos las calificaciones
}

double promedio = (double) sumaCalificaciones / calificaciones.length;
System.out.println("El promedio de calificaciones es: " + promedio);

    
}
}