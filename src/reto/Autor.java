package reto;

public class Autor {
    // Atributos
    private String nombre;
    private String email;
    private char genero;

    // Constructor
    public Autor(String nombre, String email, char genero) {
        this.nombre = nombre;
        this.email = email;
        this.genero = genero;
    }

    // Métodos Getter y Setter para cada atributo
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    // Método toString para imprimir la información del autor
    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", genero=" + genero +
                '}';
    }
}
