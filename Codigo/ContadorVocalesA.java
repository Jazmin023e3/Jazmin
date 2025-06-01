import java.util.Scanner;

public class ContadorVocalesA {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String frase = scanner.nextLine();

        int contadorA = 0;

        // Convertir la frase a minúsculas para contar tanto 'a' como 'A'
        String fraseEnMinusculas = frase.toLowerCase();

        // Recorrer cada carácter de la frase
        for (int i = 0; i < fraseEnMinusculas.length(); i++) {
            char caracter = fraseEnMinusculas.charAt(i);
            // Verificar si el carácter es la vocal 'a'
            if (caracter == 'a') {
                contadorA++;
            }
        }

        System.out.println("La vocal 'a' aparece " + contadorA + " veces en la frase.");

        scanner.close();
    }
}

