package normal;

public abstract class Persona {

    private String nombre;
    private String nacionalidad;
    private int edad;
    private float peso;
    private boolean sexo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }


    public abstract void caminar(String persona);

    public void hablar() {
        System.out.println("La persona está hablando");


    }

    public void explicar() {
        System.out.println("La persona está explicando");


    }
}
