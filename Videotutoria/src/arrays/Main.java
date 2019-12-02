package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        String texto;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una linea para pasar a Char");
        texto = teclado.nextLine();
        char[] caracteres = new char[texto.length()];
        for (int i = 0; i < texto.length(); i++) {
            caracteres[i] = texto.charAt(i);
//            System.out.println("Posición " + i+", tiene el caracter: " + caracteres[i]);
        }

        System.out.println("Que posición deseas mostrar");
        int pos = teclado.nextInt();
        System.out.println("La posición " + pos + " tiene el caracter " +caracteres[pos-1]);

        a.add(3,3);
        System.out.print(a);
        String numero =String.valueOf(23);
    }
}
