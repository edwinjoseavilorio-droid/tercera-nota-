package clases.src.GestionComedor.services;

import java.util.ArrayList;
import java.util.List;
import clases.src.GestionComedor.domain.Comida;
import clases.src.GestionComedor.domain.Estudiante;

public class GestionComedor {
    public List<Comida> comidas;
    public List<Estudiante> estudiantes;

    public GestionComedor() {
        this.comidas = new ArrayList<>();
        this.estudiantes = new ArrayList<>();
    }

    public void registrarComida(String nombre, String tipo, int cantidad) {
        comidas.add(new Comida(nombre, tipo, cantidad));
        System.out.println("Comida registrada: " + nombre);
    }

    public void registrarEstudiante(String nombre, String id) {
        estudiantes.add(new Estudiante(nombre, id));
        System.out.println("Estudiante registrado: " + nombre);
    }

    public Comida buscarComida(String nombre) {
        for (Comida c : comidas) {
            if (c.nombre.equals(nombre)) {
                return c;
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

    public void seleccionar(String idEstudiante, String nombreComida) {
        Estudiante est = buscarEstudiante(idEstudiante);
        Comida com = buscarComida(nombreComida);

        if (est == null) {
            System.out.println("Estudiante no encontrado");
            return;
        }
        if (com == null) {
            System.out.println("Comida no encontrada");
            return;
        }

        est.seleccionarComida(com);
    }

    public void reponerComida(String nombre, int cantidad) {
        Comida c = buscarComida(nombre);
        if (c != null) {
            c.reponer(cantidad);
        } else {
            System.out.println("Comida no encontrada");
        }
    }

    public void mostrarComidas() {
        System.out.println("\n--- Comidas Disponibles ---");
        for (Comida c : comidas) {
            System.out.println(c);
        }
    }

    public void mostrarEstudiantes() {
        System.out.println("\n--- Estudiantes ---");
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }
    }

    public void mostrarHistorial(String id) {
        Estudiante e = buscarEstudiante(id);
        if (e != null) {
            e.mostrarHistorial();
        } else {
            System.out.println("Estudiante no encontrado");
        }
    }

    public void mostrarEstadisticas() {
        System.out.println("\n--- Estadísticas ---");
        System.out.println("Total de comidas: " + comidas.size());
        System.out.println("Total de estudiantes: " + estudiantes.size());
        int totalConsumido = 0;
        for (Estudiante e : estudiantes) {
            totalConsumido += e.comidasConsumidas.size();
        }
        System.out.println("Total consumido: " + totalConsumido);
    }
}
