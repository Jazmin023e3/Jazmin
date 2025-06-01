import java.util.Scanner;

public class QuitarEspacios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto:");
        String cadenaConEspacios = scanner.nextLine();

        // Utilizando el método replaceAll() para quitar todos los espacios en blanco
        String cadenaSinEspacios = cadenaConEspacios.replaceAll("\\s+", "");

        System.out.println("Cadena original: \"" + cadenaConEspacios + "\"");
        System.out.println("Cadena sin espacios: \"" + cadenaSinEspacios + "\"");

        scanner.close();
    }
}