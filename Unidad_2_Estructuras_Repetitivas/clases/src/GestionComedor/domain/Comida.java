package clases.src.GestionComedor.domain;

public class Comida {
    public String nombre;
    public String tipo;
    public int disponibilidad;

    public Comida(String nombre, String tipo, int disponibilidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.disponibilidad = disponibilidad;
    }

    public void servir() {
        if (disponibilidad > 0) {
            disponibilidad--;
            System.out.println(nombre + " servido. Quedan: " + disponibilidad);
        } else {
            System.out.println("No hay " + nombre + " disponible");
        }
    }

    public void reponer(int cantidad) {
        disponibilidad += cantidad;
        System.out.println(nombre + " reponido. Disponibles: " + disponibilidad);
    }

    public String toString() {
        return nombre + " (" + tipo + ") - Disponibles: " + disponibilidad;
    }
}
