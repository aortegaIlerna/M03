package normal;

import java.util.List;

public class Alumno extends Persona {

    private String instituto;
    private String[] listaModulos;

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public String[] getListaModulos() {
        return listaModulos;
    }

    public void setListaModulos(String[] listaModulos) {
        this.listaModulos = listaModulos;
    }

    @Override
    public void caminar(String nombre) {
        System.out.println("El alumno con nombre" + nombre + " está caminando");
    }
/*
    public void hablar() {
        System.out.println("El alumno está hablando");
    }

    public void explicar() {
        System.out.println("El alumno está explicando");
    }*/
}
