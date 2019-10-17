package entities;

public class Perro {

    private String raza;
    private String color;
    private double tamanio;
    private double peso;

    /*Constructores*/
    public Perro() {
        this.raza ="Pastor";
        this.color = "marron";
        this.tamanio = 5.23;
        this.peso = 2.35;
    }

    public Perro(String raza, String color, double tamanio, double peso) {
        this.raza = raza;
        this.color = color;
        this.tamanio = tamanio;
        this.peso = peso;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String toString() {
        return "Raza: ".concat(this.raza).concat(", color: " + this.color + ", tamaño: " + this.tamanio + ", peso: " + this.peso);
    }


}