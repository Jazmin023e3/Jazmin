public class Libro {
    private int id;
    private String titulo;
    private String edicion;
    private String autor;

    public Libro(int id, String titulo, String edicion, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.edicion = edicion;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEdicion() {
        return edicion;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Título: " + titulo + ", Edición: " + edicion + ", Autor: " + autor;
    }

    // Importante: Para usar LinkedHashSet correctamente con objetos personalizados,
    // debemos sobrescribir los métodos equals() y hashCode().
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Libro libro = (Libro) obj;
        return id == libro.id; // Consideramos que dos libros son iguales si tienen el mismo ID
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}