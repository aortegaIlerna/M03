package normal;

public class Main {

    public static void main(String[] args){
        /*Persona persona = new Persona();
        persona.setNombre("Alvaro");
        System.out.println(persona.getNombre());*/
        Profesor profesor = new Profesor();
        profesor.setNombre("Alvaro");
        System.out.println(profesor.getNombre());
        profesor.caminar(profesor.getNombre());
        Alumno alumno = new Alumno();
        alumno.setNombre("Pedro");
        System.out.println(alumno.getNombre());
        alumno.caminar(alumno.getNombre());

    }
}
