import java.util.Scanner;

public class Palindromo {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra:");
        String palabra = scanner.nextLine();

        // Convertir la palabra a minúsculas para una comparación sin distinción de mayúsculas y minúsculas
        String palabraEnMinusculas = palabra.toLowerCase();

        // Invertir la palabra
        String palabraInvertida = new StringBuilder(palabraEnMinusculas).reverse().toString();

        // Comparar la palabra original (en minúsculas) con su versión invertida
        if (palabraEnMinusculas.equals(palabraInvertida)) {
            System.out.println("La palabra \"" + palabra + "\" es palíndroma.");
        } else {
            System.out.println("La palabra \"" + palabra + "\" no es palíndroma.");
        }

        scanner.close();
    }
}

