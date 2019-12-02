package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primero número:");
        numero1 = teclado.nextInt();
        System.out.println("Introduce el segundo número:");
        numero2 = teclado.nextInt();

        Mats mats = new Mats();

        System.out.println(mats.suma(numero1, numero2));
        System.out.println(mats.resta(numero1, numero2));
        System.out.println(mats.multiplicacion(numero1, numero2));
        System.out.println(mats.division(numero1, numero2));
    }
}
