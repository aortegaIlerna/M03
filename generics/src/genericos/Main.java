package genericos;

public class Main {
    public static void main(String[] args) {
        // Instanciación de una caja con String
        Caja<String> strings = new Caja<>();
        strings.add("Hola");
        strings.add("Adios");
        strings.add("Juan");
        strings.list();
        System.out.println("------------");
        strings.remove("Juan");
        strings.list();
        System.out.println("--------------");

        // Instanciación de una caja con Integer
        Caja<Integer> ints = new Caja<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.list();
    }
}
