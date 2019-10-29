package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primero número:");
        numero1 = teclado.nextInt();
        System.out.println("Introduce el segundo número:");
        numero2 = teclado.nextInt();

        if (numero1>=numero2){
            if (numero1==numero2){
//                System.out.println("El numero 1 es igual al numero2");
                System.out.printf("El numero %d y el numero %d son iguales\n",numero1,numero2);
            }
            else{
                System.out.println("El numero " + numero1 + " es mas grande que " + numero2);
            }
        }
        else{
            System.out.println("El número " + numero2 + " es más grande que " + numero1);
        }


        System.out.println(numero1 >= numero2 ?
                numero1 > numero2 ? "El numero " + numero1 + " es mas grande que " + numero2
                        : "Los numeros " + numero1 + " y " + numero2 + " son iguales"
                : "El número " + numero2 + " es más grande que " + numero1);
    }
}
