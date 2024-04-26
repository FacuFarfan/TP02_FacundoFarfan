package ar.edu.unju.fi.ejercicio1.Main;
import java.util.ArrayList;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio1.Model.Producto;
import ar.edu.unju.fi.ejercicio1.Model.Producto.Category;
import ar.edu.unju.fi.ejercicio1.Model.Producto.Origin;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>();
        int op;
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1 - Crear Producto");
            System.out.println("2 - Mostrar productos");
            System.out.println("3 - Modificar producto");
            System.out.println("4 - Salir");
            System.out.println("Elija una opción:");
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    createProduct(productos, scanner);
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("Fin del Programa");
                    break;
                default:
                    System.out.println("Error. Ingrese de nuevo la opcion");
            }
        } while (op != 4);
        scanner.close(); // Cerrar Scanner al finalizar el programa
    }

    private static void createProduct(ArrayList<Producto> productos, Scanner scanner) {
    	scanner.nextLine();
        System.out.println("Ingrese el codigo del Producto:");
        String code = scanner.nextLine();
        System.out.println("Descripcion del Producto:");
        String description = scanner.nextLine();
        System.out.println("Ingrese el precio:");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("------ Origen de fabricación ------");
        for (Origin origin : Origin.values()) {
            System.out.println((origin.ordinal() + 1) + " - " + origin);
        }
        System.out.println("Elija una opción:");
        int opO = scanner.nextInt();
        Origin origin = Origin.values()[opO - 1];

        System.out.println("------ Categoría ------");
        for (Category category : Category.values()) {
            System.out.println((category.ordinal() + 1) + " - " + category);
        }
        System.out.println("Elija una opción:");
        int opcionCategoria = scanner.nextInt();
        Category category = Category.values()[opcionCategoria - 1];

        // Crear el nuevo producto y añadirlo a la lista
        Producto producto = new Producto(code, description, price, origin, category);
        productos.add(producto);
        System.out.println("Producto creado correctamente.");
    }

}