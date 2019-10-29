package main;

import entities.Perro;

import java.awt.event.KeyEvent;
import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

public class Ejemplo {


    public static void main(String[] args) throws IOException {
/*        Perro chispa = new Perro();
        Perro leon = new Perro("Boyero", "negro", 6.767, 5.34);
        Perro prueba = new Perro("Belga", "negro", 4, 2);
        System.out.println(leon.getRaza());
        System.out.println(chispa.getRaza());

        System.out.println(chispa);

        System.out.println("Introduce un caracter");
        int caracter = System.in.read();
        System.out.println("Caracter introducido: " + (char) caracter + ", ASCII: " + caracter);

        Console console = System.console();
        if (console == null) {
            System.out.println("NO tenemos una consola en nuestro programa");
            System.exit(0);
        }
        System.out.println("Introduce un caracter:");
        String texto = console.readLine();
        System.out.println(texto);*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Intorduce un texto:");
        String textoScanner = scanner.nextLine();
        System.out.println(textoScanner);*/

/**
 * Introducir por teclado dos numeros y realizar las operaciones matematicas basicas
 * Ejercicio 1
 */

/*        int numero1 = 0;
        int numero2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nº 1:");
        numero1 = scanner.nextInt();
        System.out.println("Introduce el nº 2:");
        numero2 = scanner.nextInt();
        System.out.println("SUMA:\t" + (numero1 + numero2));
        System.out.println("RESTA:\t" + (numero1 - numero2));
        System.out.println("MULTIPLICACION:\t" + (numero1 * numero2));
        System.out.println("DIVISION:\t" + (numero1 / numero2));*/

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce una frase para convertir en array de chars");
        String text = in.nextLine();
        char[] caracteres;
        if (text == null)
            System.out.println("Texto incorrecto");

        caracteres = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            caracteres[i] = text.charAt(i);
            System.out.println(caracteres);
        }
        System.out.println("Introduce la posición del caracter que deseas visualizar, para salir introzuca el numero la tecla: 0");
        int pos = in.nextInt();
        while (pos != 0) {
            if (pos <= text.length() && pos > 0)
                System.out.println("El caracter es: '" + caracteres[pos - 1] + "'");
            else
                System.out.println("Posición incorrecta");
            System.out.println("Introduce una nueva posición");
            pos = in.nextInt();
        }
        System.out.println("Fin del programa");
    }


}

