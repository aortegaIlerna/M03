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
        mats.suma(numero1, numero2);
        mats.resta(numero1, numero2);
        mats.multiplicacion(numero1, numero2);
        mats.division(numero1, numero2);
    }
}
