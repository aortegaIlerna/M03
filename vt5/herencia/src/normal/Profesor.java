package normal;

public class Profesor extends Persona {
    private float salario;
    private int horasTrabajadas;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public void caminar(String nombre) {
        System.out.println("El profesor con nombre " + nombre + " está caminando");
    }
/*
    public void hablar() {
        System.out.println("El profesor está hablando");
    }

    public void explicar() {
        System.out.println("El profesor está explicando");
    }*/


}
