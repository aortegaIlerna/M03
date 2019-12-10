import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        MyBD bd = new MyBD();
        bd.connectDB();
        bd.createDB("M03");
        bd.createTable("CREATE TABLE Alumnos(alumno_id INT AUTO_INCREMENT PRIMARY KEY, nombre varchar(50) NOT NULL);");
        bd.addAlumno("Alvaro");
        bd.addAlumno("Pedro");
        bd.addAlumno("Jose");
        bd.close();
    }
}
