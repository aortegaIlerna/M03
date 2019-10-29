package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int numero1, numero2;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primero número:");
        numero1 = teclado.nextInt();
        System.out.println("Introduce el segundo número:");
        numero2 = teclado.nextInt();
        System.out.printf("La suma de los numeros %d y %d es: %d\n",
                numero1, numero2, (numero1 + numero2));
        System.out.printf("La resta de los numeros %d y %d es: %d\n",
                numero1, numero2, (numero1 - numero2));
        System.out.printf("La multiplicación de los numeros %d y %d es: %d\n",
                numero1, numero2, (numero1 * numero2));
        if (numero2 > 0)
            System.out.printf("La división de los numeros %d y %d es: %d\n",
                    numero1, numero2, (numero1 / numero2));
        else {
            System.out.println("No se puede realizar la división, el divisor es " + numero2);
        }
    }
}
