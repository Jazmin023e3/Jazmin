import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class OrdenarNumerosTreeSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Double> numerosOrdenados = new TreeSet<>();
        String entrada;

        System.out.println("Ingrese valores numéricos. Para detener, ingrese 'fin'.");

        while (true) {
            System.out.print("Ingrese un número o 'fin': ");
            entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }

            try {
                double numero = Double.parseDouble(entrada);
                numerosOrdenados.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número o 'fin'.");
            }
        }

        System.out.println("\n--- Números ingresados ordenados (TreeSet) ---");
        for (Double numero : numerosOrdenados) {
            System.out.println(numero);
        }

        scanner.close();
    }
}