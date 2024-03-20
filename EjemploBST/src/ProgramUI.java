import java.util.ArrayList;
import java.util.Scanner;

public class ProgramUI {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree<String, Automovil> automoviles = new BinarySearchTree<String, Automovil>(new ComparadorPlacas<String>());

        System.out.println("Ingrese la información de los vehículos. Para salir, escriba 'Salir'.");

        while (true) {
            System.out.print("Marca: ");
            String marca = scanner.nextLine();

            if (marca.equalsIgnoreCase("Salir")) {
                break;
            }

            System.out.print("Modelo: ");
            int modelo = Integer.parseInt(scanner.nextLine());

            System.out.print("Linea: ");
            String linea = scanner.nextLine();

            System.out.print("Placa: ");
            String placa = scanner.nextLine();

            System.out.print("Precio: ");
            double precio = Double.parseDouble(scanner.nextLine());

            Automovil automovil = new Automovil(marca, modelo, linea, placa, precio);
            automoviles.insert(placa, automovil);

            System.out.println("Vehículo agregado.\n");
        }

        automoviles.InOrderWalk(new MostrarAutoEnConsolaWalk<Automovil>());
    }

}
