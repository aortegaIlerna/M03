package main;

import entities.Perro;

public class Ejemplo {


    public static void main(String[] args){
        Perro chispa = new Perro();
        Perro leon = new Perro("Boyero","negro",6.767,5.34);
        Perro prueba = new Perro("Belga","negro",4,2);
        System.out.println(leon.getRaza());
        System.out.println(chispa.getRaza());

        System.out.println(chispa);
    }



}

