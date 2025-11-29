package clases.src.GestionComedor.domain;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    public String nombre;
    public String id;
    public List<String> comidasConsumidas;

    public Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.comidasConsumidas = new ArrayList<>();
    }

    public void seleccionarComida(Comida comida) {
        if (comida.disponibilidad > 0) {
            comida.servir();
            comidasConsumidas.add(comida.nombre);
            System.out.println(nombre + " tomó " + comida.nombre);
        } else {
            System.out.println("Comida no disponible");
        }
    }

    public void mostrarHistorial() {
        System.out.println("\nHistorial de " + nombre + ":");
        if (comidasConsumidas.isEmpty()) {
            System.out.println("  Sin consumo");
        } else {
            for (String c : comidasConsumidas) {
                System.out.println("  - " + c);
            }
        }
    }

    public String toString() {
        return nombre + " (" + id + ")";
    }
}
