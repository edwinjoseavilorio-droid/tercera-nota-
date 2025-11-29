package clases.src.GestionRecreacional.domain;

import java.util.ArrayList;
import java.util.List;

public class EspacioRecreacional {
    public String nombre;
    public String tipo;
    public int capacidad;
    public List<String> horariosDisponibles;
    public List<String> horariosReservados;

    public EspacioRecreacional(String nombre, String tipo, int capacidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.horariosDisponibles = new ArrayList<>();
        this.horariosReservados = new ArrayList<>();
        
        // Agregar horarios disponibles por defecto (8 a 17 horas)
        for (int i = 8; i < 18; i++) {
            horariosDisponibles.add(i + ":00");
        }
    }

    public void reservar(String horario) {
        if (horariosDisponibles.contains(horario)) {
            horariosDisponibles.remove(horario);
            horariosReservados.add(horario);
            System.out.println("Espacio " + nombre + " reservado a las " + horario);
        } else {
            System.out.println("Horario " + horario + " no disponible");
        }
    }

    public void cancelarReserva(String horario) {
        if (horariosReservados.contains(horario)) {
            horariosReservados.remove(horario);
            horariosDisponibles.add(horario);
            System.out.println("Reserva cancelada");
        } else {
            System.out.println("No hay reserva en ese horario");
        }
    }

    public void mostrarDisponibilidad() {
        System.out.println("\n" + nombre + " - Disponibles: " + horariosDisponibles);
    }

    public String toString() {
        return nombre + " (" + tipo + ") - Capacidad: " + capacidad;
    }
}
