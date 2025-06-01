import java.util.Scanner;

public class EliminarUltimaPalabra {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String fraseOriginal = scanner.nextLine();

        if (fraseOriginal.trim().isEmpty()) {
            System.out.println("La frase está vacía.");
        } else {
            // Encontrar el índice del último espacio
            int ultimoEspacio = fraseOriginal.lastIndexOf(' ');

            if (ultimoEspacio == -1) {
                // Si no hay espacios, la frase tiene una sola palabra
                System.out.println("La frase solo tiene una palabra: \"" + fraseOriginal + "\".");
            } else {
                // Extraer la parte de la frase antes del último espacio
                String fraseSinUltimaPalabra = fraseOriginal.substring(0, ultimoEspacio).trim();
                System.out.println("Frase original: \"" + fraseOriginal + "\"");
                System.out.println("Frase sin la última palabra: \"" + fraseSinUltimaPalabra + "\"");
            }
        }
        scanner.close();
    }
}

