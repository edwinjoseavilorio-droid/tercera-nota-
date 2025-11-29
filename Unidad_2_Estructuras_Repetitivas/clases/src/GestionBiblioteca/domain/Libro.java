package clases.src.GestionBiblioteca.domain;

public class Libro {
    public String titulo;
    public String autor;
    public String isbn;
    public boolean disponible;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }

    public void prestar() {
        disponible = false;
    }

    public void devolver() {
        disponible = true;
    }

    public String toString() {
        String estado = disponible ? "Disponible" : "Prestado";
        return titulo + " - " + autor + " (" + estado + ")";
    }
}
