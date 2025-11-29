package clases.src.GestionRecreacional.services;

import java.util.ArrayList;
import java.util.List;
import clases.src.GestionRecreacional.domain.EspacioRecreacional;
import clases.src.GestionRecreacional.domain.Estudiante;

public class GestionRecreacional {
    public List<EspacioRecreacional> espacios;
    public List<Estudiante> estudiantes;

    public GestionRecreacional() {
        this.espacios = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }

    public void registrarEspacio(String nombre, String tipo, int capacidad) {
        espacios.add(new EspacioRecreacional(nombre, tipo, capacidad));
        System.out.println("Espacio registrado: " + nombre);
    }

    public void registrarEstudiante(String nombre, String id) {
        estudiantes.add(new Estudiante(nombre, id));
        System.out.println("Estudiante registrado: " + nombre);
    }

    public EspacioRecreacional buscarEspacio(String nombre) {
        for (EspacioRecreacional e : espacios) {
            if (e.nombre.equals(nombre)) {
                return e;
            }
        }
        return null;
    }

    public Estudiante buscarEstudiante(String id) {
        for (Estudiante e : estudiantes) {
            if (e.id.equals(id)) {
                return e;
            }
        }
        return null;
    }

    public void reservar(String idEstudiante, String nombreEspacio, String horario) {
        Estudiante est = buscarEstudiante(idEstudiante);
        EspacioRecreacional esp = buscarEspacio(nombreEspacio);

        if (est == null) {
            System.out.println("Estudiante no encontrado");
            return;
        }
        if (esp == null) {
            System.out.println("Espacio no encontrado");
            return;
        }

        est.reservarEspacio(esp, horario);
    }

    public void cancelar(String idEstudiante, String nombreEspacio, String horario) {
        Estudiante est = buscarEstudiante(idEstudiante);
        EspacioRecreacional esp = buscarEspacio(nombreEspacio);

        if (est == null) {
            System.out.println("Estudiante no encontrado");
            return;
        }
        if (esp == null) {
            System.out.println("Espacio no encontrado");
            return;
        }

        est.cancelarReserva(esp, horario);
    }

    public void mostrarEspacios() {
        System.out.println("\n--- Espacios Recreacionales ---");
        for (EspacioRecreacional e : espacios) {
            System.out.println(e);
        }
    }

    public void mostrarDisponibilidad(String nombreEspacio) {
        EspacioRecreacional e = buscarEspacio(nombreEspacio);
        if (e != null) {
            e.mostrarDisponibilidad();
        } else {
            System.out.println("Espacio no encontrado");
        }
    }

    public void mostrarEstudiantes() {
        System.out.println("\n--- Estudiantes ---");
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }
    }

    public void mostrarReservasEstudiante(String id) {
        Estudiante e = buscarEstudiante(id);
        if (e != null) {
            e.mostrarReservas();
        } else {
            System.out.println("Estudiante no encontrado");
        }
    }
}
