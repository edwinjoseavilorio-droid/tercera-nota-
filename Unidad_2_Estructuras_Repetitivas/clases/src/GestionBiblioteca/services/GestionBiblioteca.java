package clases.src.GestionBiblioteca.services;

import java.util.ArrayList;
import java.util.List;
import clases.src.GestionBiblioteca.domain.Libro;
import clases.src.GestionBiblioteca.domain.Usuario;

public class GestionBiblioteca {
    public List<Libro> libros;
    public List<Usuario> usuarios;

    public GestionBiblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void registrarLibro(String titulo, String autor, String isbn) {
        libros.add(new Libro(titulo, autor, isbn));
        System.out.println("Libro registrado: " + titulo);
    }

    public void registrarUsuario(String nombre, String id) {
        usuarios.add(new Usuario(nombre, id));
        System.out.println("Usuario registrado: " + nombre);
    }

    public Libro buscarLibro(String isbn) {
        for (Libro l : libros) {
            if (l.isbn.equals(isbn)) {
                return l;
            }
        }
        return null;
    }

    public Usuario buscarUsuario(String id) {
        for (Usuario u : usuarios) {
            if (u.id.equals(id)) {
                return u;
            }
        }
        return null;
    }

    public void prestar(String idUsuario, String isbnLibro) {
        Usuario u = buscarUsuario(idUsuario);
        Libro l = buscarLibro(isbnLibro);

        if (u == null) {
            System.out.println("Usuario no encontrado");
            return;
        }
        if (l == null) {
            System.out.println("Libro no encontrado");
            return;
        }

        u.prestarLibro(l);
    }

    public void devolver(String idUsuario, String isbnLibro) {
        Usuario u = buscarUsuario(idUsuario);
        Libro l = buscarLibro(isbnLibro);

        if (u == null) {
            System.out.println("Usuario no encontrado");
            return;
        }
        if (l == null) {
            System.out.println("Libro no encontrado");
            return;
        }

        u.devolverLibro(l);
    }

    public void mostrarLibros() {
        System.out.println("\n--- Libros en la Biblioteca ---");
        for (Libro l : libros) {
            System.out.println(l);
        }
    }

    public void mostrarUsuarios() {
        System.out.println("\n--- Usuarios ---");
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }

    public void mostrarLibrosDisponibles() {
        System.out.println("\n--- Libros Disponibles ---");
        for (Libro l : libros) {
            if (l.disponible) {
                System.out.println(l);
            }
        }
    }

    public void mostrarLibrosPrestados(String idUsuario) {
        Usuario u = buscarUsuario(idUsuario);
        if (u == null) {
            System.out.println("Usuario no encontrado");
            return;
        }
        System.out.println("\nLibros de " + u.nombre + ":");
        for (Libro l : u.libros) {
            System.out.println("  - " + l.titulo);
        }
    }
}
