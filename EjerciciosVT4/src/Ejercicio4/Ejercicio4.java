package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primero número:");
        numero = teclado.nextInt();
        System.out.print("El número " + numero + " es: " + (numero % 2 == 0 ? "par" : "impar"));

    }
}
