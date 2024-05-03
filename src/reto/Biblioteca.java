package reto;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    // Lista para almacenar los libros
    private List<Libro> libros;
    private int numeroLibros;

    // Constructor
    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.numeroLibros = 0;
    }

    // Método para agregar un libro a la biblioteca
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Método para buscar un libro por título
    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null; // Si no se encuentra el libro
    }

    // Método para listar todos los libros de la biblioteca
    public void listarLibros() {
        System.out.println("Lista de libros en la biblioteca:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}