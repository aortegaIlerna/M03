package main;

import entities.Perro;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

public class Ejemplo {


    public static void main(String[] args) throws IOException {
        Perro chispa = new Perro();
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
        System.out.println(texto);

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Intorduce un texto:");
        String textoScanner = scanner.nextLine();
        System.out.println(textoScanner);*/

/**
 * Introducir por teclado dos numeros y realizar las operaciones matematicas basicas
 * Ejercicio 1
 */

        int numero1 = 0;
        int numero2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nº 1:");
        numero1 = scanner.nextInt();
        System.out.println("Introduce el nº 2:");
        numero2 = scanner.nextInt();
        System.out.println("SUMA:\t" + (numero1 + numero2));
        System.out.println("RESTA:\t" + (numero1 - numero2));
        System.out.println("MULTIPLICACION:\t" + (numero1 * numero2));
        System.out.println("DIVISION:\t" + (numero1 / numero2));

    }


}

