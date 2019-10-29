package Ejercicio3;

import java.util.Scanner;

public class Mats {

    public void suma(int n1, int n2) {
        System.out.printf("La suma de los numeros %d y %d es: %d\n", n1, n2, (n1 + n2));
    }

    public void resta(int n1, int n2) {
        System.out.printf("La resta de los numeros %d y %d es: %d\n", n1, n2, (n1 - n2));
    }

    public void multiplicacion(int n1, int n2) {
        System.out.printf("La multiplicación de los numeros %d y %d es: %d\n", n1, n2, (n1 * n2));
    }

    public void division(int n1, int n2) {
        if (n2 > 0)
            System.out.printf("La división de los numeros %d y %d es: %d\n", n1, n2, (n1 / n2));
        else {
            System.out.println("No se puede realizar la división, el divisor es " + n2);
        }
    }
}
