package clases.src.GestionRecreacional.domain;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    public String nombre;
    public String id;
    public List<String> reservas;

    public Estudiante(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.reservas = new ArrayList<>();
    }

    public void reservarEspacio(EspacioRecreacional espacio, String horario) {
        if (espacio.horariosDisponibles.contains(horario)) {
            espacio.reservar(horario);
            reservas.add(espacio.nombre + " a las " + horario);
        } else {
            System.out.println("No se pudo reservar");
        }
    }

    public void cancelarReserva(EspacioRecreacional espacio, String horario) {
        espacio.cancelarReserva(horario);
        String reserva = espacio.nombre + " a las " + horario;
        if (reservas.contains(reserva)) {
            reservas.remove(reserva);
        }
    }

    public void mostrarReservas() {
        System.out.println("\nReservas de " + nombre + ":");
        if (reservas.isEmpty()) {
            System.out.println("  Sin reservas");
        } else {
            for (String r : reservas) {
                System.out.println("  - " + r);
            }
        }
    }

    public String toString() {
        return nombre + " (" + id + ")";
    }
}
