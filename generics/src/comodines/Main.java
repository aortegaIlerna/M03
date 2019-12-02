package comodines;

public class Main {

    public static void main(String[] args){


        Ilerna ilerna = new Ilerna();
        Alumno a = new Alumno("Juan","Flores",3,"Ilerna","Mañana");
        Profesor p = new Profesor("Alvaro","Ortega",12,"Ilerna",2.3);
        ilerna.add(a);
        ilerna.add(p);
        ilerna.show();




    }
}
