import java.util.Scanner;
import java.util.StringTokenizer;

public class ContadorPalabras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String frase = scanner.nextLine();

        // Utilizando StringTokenizer para dividir la frase en palabras
        StringTokenizer tokenizer = new StringTokenizer(frase);
        int cantidadPalabras = tokenizer.countTokens();

        System.out.println("La frase contiene " + cantidadPalabras + " palabras.");

        scanner.close();
    }
}