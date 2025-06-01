import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class GestionLibros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Libro> libros = new LinkedHashSet<>();
        String respuesta;

        System.out.println("Ingrese la información de los libros. Para detener, ingrese 'fin' en el ID.");

        while (true) {
            System.out.print("Ingrese el ID del libro (o 'fin'): ");
            respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("fin")) {
                break;
            }

            try {
                int id = Integer.parseInt(respuesta);
                System.out.print("Ingrese el Título del libro: ");
                String titulo = scanner.nextLine();
                System.out.print("Ingrese la Edición del libro: ");
                String edicion = scanner.nextLine();
                System.out.print("Ingrese el Autor del libro: ");
                String autor = scanner.nextLine();

                Libro nuevoLibro = new Libro(id, titulo, edicion, autor);
                libros.add(nuevoLibro);

            } catch (NumberFormatException e) {
                System.out.println("ID inválido. Por favor, ingrese un número o 'fin'.");
            }
            System.out.println(); // Línea en blanco para separar las entradas
        }

        System.out.println("\n--- Listado de Libros Ingresados (LinkedHashSet) ---");
        for (Libro libro : libros) {
            System.out.println(libro);
        }

        scanner.close();
    }
}
