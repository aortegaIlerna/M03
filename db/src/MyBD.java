
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyBD {

    private final String BBDD ="jdbc:mysql://localhost:3306";
    private final String USER = "root";
    private final String PASS = "secret";

    private Statement sentencia;
    private Connection connect;


    public void connectDB() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connect = DriverManager.getConnection(BBDD, USER, PASS);
        sentencia = connect.createStatement();
    }
    public void createDB(String db) throws SQLException {
        sentencia.executeUpdate("CREATE DATABASE "+db+";");
        sentencia.executeUpdate("USE "+db+";");    }

    public void createTable(String table) throws SQLException {
        sentencia.executeUpdate(table);
    }
    public void addAlumno(String nombre) throws SQLException {
        String insert = "INSERT INTO Alumnos(nombre) VALUES(\""+nombre+"\");";
    sentencia.executeUpdate(insert);
    }

    public void close() throws SQLException {
        sentencia.close();
        connect.close();
    }
}
