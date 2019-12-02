package comodines;

public class Profesor extends Persona{
    String centro;
    Double salario;

    public Profesor(String nombre, String apellido, int edad, String centro, Double salario) {
        super(nombre, apellido, edad);
        this.centro = centro;
        this.salario = salario;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "centro='" + centro + '\'' +
                ", salario=" + salario +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
