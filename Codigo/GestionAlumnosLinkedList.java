import java.util.LinkedList;
import java.util.List;

class Alumno {
    private int codigo;
    private String nombre;
    private String carnet;

    public Alumno() {
    }

    public Alumno(int codigo, String nombre, String carnet) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carnet = carnet;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", Carnet: " + carnet;
    }
}

public class GestionAlumnosLinkedList {
    public static void main(String[] args) {
        // Crear una lista genérica de tipo LinkedList para almacenar objetos Alumno
        List<Alumno> listaAlumnos = new LinkedList<>();

        // Crear instancias de la clase Alumno
        Alumno alumno1 = new Alumno(1, "Ana Pérez", "AP2023101");
        Alumno alumno2 = new Alumno(2, "Carlos López", "CL2022205");
        Alumno alumno3 = new Alumno(3, "Sofía Gómez", "SG2024030");

        // Insertar los objetos Alumno en la lista
        listaAlumnos.add(alumno1); // Agregar al final de la lista
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);

        // También puedes insertar en otras posiciones si lo deseas:
        Alumno alumno4 = new Alumno(4, "Pedro Gómez", "PG2024111");
        ((LinkedList<Alumno>) listaAlumnos).addFirst(alumno4); // Agregar al principio (necesita casting)
        ((LinkedList<Alumno>) listaAlumnos).add(2, new Alumno(5, "Laura Vargas", "LV2023077")); // Insertar en un índice específico (desplaza los demás)

        // Mostrar los elementos de la lista en pantalla
        System.out.println("--- Listado de Alumnos (LinkedList) ---");
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno); // Se utiliza el método toString de la clase Alumno
        }
    }
}