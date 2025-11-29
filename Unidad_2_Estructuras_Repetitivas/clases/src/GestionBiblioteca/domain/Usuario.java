package clases.src.GestionBiblioteca.domain;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    public String nombre;
    public String id;
    public List<Libro> libros;

    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.libros = new ArrayList<>();
    }

    public void prestarLibro(Libro libro) {
        if (libros.size() >= 3) {
            System.out.println("No puedes tomar más de 3 libros");
            return;
        }
        if (!libro.disponible) {
            System.out.println("Este libro no está disponible");
            return;
        }
        libro.prestar();
        libros.add(libro);
        System.out.println("Libro prestado a " + nombre);
    }

    public void devolverLibro(Libro libro) {
        if (libros.contains(libro)) {
            libro.devolver();
            libros.remove(libro);
            System.out.println("Libro devuelto por " + nombre);
        } else {
            System.out.println("Este usuario no tiene ese libro");
        }
    }

    public String toString() {
        return nombre + " (" + id + ") - Libros: " + libros.size();
    }
}
