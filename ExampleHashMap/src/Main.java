import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Productos productos = new Productos();
        Scanner teclado = new Scanner(System.in);
        int opcionElegida = 0;
        String codigo;


        while (opcionElegida != 5) {
            System.out.println("Introduce el numero de la opción que quieras:");
            System.out.println("1.- Introducir producto");
            System.out.println("2.- Modificar precio");
            System.out.println("3.- Mostrar todos los productos");
            System.out.println("4.- Eliminar producto");
            System.out.println("5.- Salir");
            opcionElegida = teclado.nextInt();

            switch (opcionElegida) {
                case 1:
                    System.out.println("Introduce el códido del producto:");
                    codigo = teclado.next();
                    productos.save(codigo);
                    break;
                case 2:
                    System.out.println("Introduce el códido del producto del que quieres cambiar el precio:");
                    codigo = teclado.next();
                    productos.update(codigo);
                    break;
                case 3:
                    productos.list();
                    break;
                case 4:
                    System.out.println("Introduce el códido del producto que quieres eliminar:");
                    codigo = teclado.next();
                    productos.delete(codigo);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Tienes que introducir una opción valida");
            }

        }
    }

}
