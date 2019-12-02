package Ejercicio3;

public class Mats {

    public int suma(int n1, int n2) {
        return n1 + n2;
    }

    public int resta(int n1, int n2) {
        return n1 - n2;
    }

    public int multiplicacion(int n1, int n2) {
        return n1 * n2;
    }

    public int division(int n1, int n2) {
        if (n2 != 0)
            return n1 / n2;
        return 0;
    }
}
