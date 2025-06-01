import java.util.ArrayList;
import java.util.Scanner;

public class CalculoNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();
        double suma = 0;
        int cantidadPositivos = 0;
        String respuesta;

        System.out.println("Ingrese valores numéricos. Para detener, ingrese 'fin'.");

        while (true) {
            System.out.print("Ingrese un número o 'fin': ");
            respuesta = scanner.nextLine().toLowerCase();

            if (respuesta.equals("fin")) {
                break; // Salir del bucle si el usuario ingresa "fin"
            }

            try {
                double numero = Double.parseDouble(respuesta);
                numeros.add(numero);
                suma += numero;
                if (numero > 0) {
                    cantidadPositivos++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número o 'fin'.");
            }
        }

        if (numeros.isEmpty()) {
            System.out.println("No se ingresaron números.");
        } else {
            double promedio = suma / numeros.size();
            System.out.println("\n--- Resultados ---");
            System.out.println("Números ingresados: " + numeros);
            System.out.println("Cantidad de números ingresados: " + numeros.size());
            System.out.println("Promedio de los números: " + promedio);
            System.out.println("Cantidad de números positivos: " + cantidadPositivos);
        }

        scanner.close();
    }
}