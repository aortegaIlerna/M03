package comodines;

public class Alumno extends Persona {
    private String instituto;
    private String horario;

    public Alumno(String nombre, String apellido, int edad, String instituto, String horario) {
        super(nombre, apellido, edad);
        this.instituto = instituto;
        this.horario = horario;

    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "horario='" + horario + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
