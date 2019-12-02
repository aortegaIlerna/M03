import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Productos {
    private HashMap<String, Producto> listaProductos;

    public Productos() {
        listaProductos = new HashMap<>();
    }

    public void save(String codigo) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre del producto");
        String nombre = teclado.next();
        System.out.println("Introduce el precio del producto:");
        float precio = teclado.nextFloat();
        Producto producto = new Producto(nombre, precio);
        listaProductos.put(codigo, producto);
    }

    public void update(String codigo) {

        Scanner sc = new Scanner(System.in);
        if (listaProductos.containsKey(codigo)) {
            System.out.println("Introduce el precio del producto:");
            float precio = sc.nextFloat();
            Producto p = listaProductos.get(codigo);
            p.setPrecio(precio);
            listaProductos.put(codigo, p);
        } else {
            System.out.println("No hay ningun producto con ese código.");
        }
    }

    public void list() {
        String clave;
        Iterator<String> productos = listaProductos.keySet().iterator();
        System.out.println("Hay los siguientes productos:");
        while (productos.hasNext()) {
            clave = productos.next();
            System.out.println(clave + " - " + listaProductos.get(clave).toString());
        }
    }

    public void delete(String codigo) {
        if (listaProductos.containsKey(codigo)) {
            listaProductos.remove(codigo);
        } else {
            System.out.println("No hay ningun producto con ese código.");
        }
    }
}
