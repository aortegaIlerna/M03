package Interfaces;

public class Alumno implements Persona, Conductor {
    @Override
    public void comer() {
        System.out.println("Estoy comiendo");

    }

    @Override
    public void comer(String comida) {
        System.out.println("Estoy comiendo " + comida);

    }

    @Override
    public void dormir() {
        System.out.println("Zzz....");

    }

    @Override
    public void conducir() {
        System.out.println("Estoy conduciendo");
    }

    @Override
    public void aparcar() {
        System.out.println("Estoy aparcando");


    }
}
