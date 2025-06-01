import java.util.Scanner;

public class CapitalizarCadena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto:");
        String cadenaOriginal = scanner.nextLine();

        if (cadenaOriginal.isEmpty()) {
            System.out.println("La cadena ingresada está vacía.");
        } else {
            StringBuilder resultado = new StringBuilder();
            boolean siguienteMayuscula = true;

            for (int i = 0; i < cadenaOriginal.length(); i++) {
                char caracter = cadenaOriginal.charAt(i);

                if (Character.isLetter(caracter)) {
                    if (siguienteMayuscula) {
                        resultado.append(Character.toUpperCase(caracter));
                        siguienteMayuscula = false;
                    } else {
                        resultado.append(caracter);
                    }
                } else if (Character.isWhitespace(caracter)) {
                    resultado.append(caracter);
                    siguienteMayuscula = true;
                } else {
                    resultado.append(caracter); // Mantener otros caracteres como están
                }
            }
            System.out.println("Cadena capitalizada: " + resultado.toString());
        }
        scanner.close();
    }
}