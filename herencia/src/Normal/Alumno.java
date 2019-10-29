package Normal;

public class Alumno extends Persona {
    private String centro;
    private String sexo;

    public Alumno(String centro, String sexo) {
        this.centro = centro;
        this.sexo = sexo;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
