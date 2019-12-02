package genericos;

import java.util.ArrayList;
// Definimos la caja de tipo T, ya que no sabemos que tipo va a recibir.
//Puede ser de cualquier tipo.
public class Caja<E> {

    //ArrayLisE de tipo T, será del tipo que se cree la clase.
    //Aunque a su vez ArrayLisE es generica, esto nos permite añadirle una restricción.
    ArrayList<E> caja;

    public Caja() {
        //Operador diamond, establece el mismo tipo que declarado en la creación de la variable.
        this.caja = new ArrayList<>();
    }

    //Obtenemos un tipo E que añadimos al ArrayList
    public void add(E element) {
        caja.add(element);
    }

    //Obtenemos un tipo E que eliminaremos de la lista
    public void remove(E element) {
        caja.remove(element);
    }

    //Recorremos la lista mediante un foreach que pintaremos por pantalla.
    public void list() {
        for (E t : caja) {
            System.out.println(t);
        }
    }
}
