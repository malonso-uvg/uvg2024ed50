import java.util.Scanner;

public class ProgramUI {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 2
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Paso 3
        int contador = 2;

        // Paso 4
        if (numero > 1) {
            // Paso 7
            while (contador < numero) {
                // Paso 4
                if (numero % contador == 0) {
                    // Paso 9
                    System.out.println("No es un número primo");
                    return;
                }

                // Paso 6
                contador++;
            }

            // Paso 8
            System.out.println("Es un número primo");
        } else {
            // Manejar el caso cuando el número es 1 o menor
            System.out.println("No es un número primo");
        }

        // Paso 10
        scanner.close();
    }
    
}
