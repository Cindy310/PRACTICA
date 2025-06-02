import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String continuar;

        do {
            System.out.print("Ingrese ID del producto: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            System.out.print("Ingrese nombre del producto: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese marca del producto: ");
            String marca = scanner.nextLine();

            System.out.print("Ingrese precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); // limpiar buffer

            productos.add(new Producto(id, nombre, marca, precio));

            System.out.print("¿Desea ingresar otro producto? (si/no): ");
            continuar = scanner.nextLine().trim().toLowerCase();

        } while (continuar.equals("si"));

        // Mostrar productos con Iterator
        System.out.println("\nProductos registrados:");
        Iterator<Producto> iterador = productos.iterator();
        while (iterador.hasNext()) {
            Producto p = iterador.next();
            System.out.println("ID: " + p.getId() + ", Nombre: " + p.getNombre() +
                    ", Marca: " + p.getMarca() + ", Precio: $" + p.getPrecio());
        }

        scanner.close();
    }
}