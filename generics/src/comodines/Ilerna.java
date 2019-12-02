package comodines;

import java.util.ArrayList;
import java.util.List;

public class Ilerna<T extends Persona> {

    List<T> list;

    public Ilerna() {
        list = new ArrayList<>();
    }

    public void add(T persona) {
        System.out.println(persona.toString());
        list.add(persona);

    }

    public void show() {
        for (Persona p : list) {
            System.out.println(p.toString());
        }
    }
}
