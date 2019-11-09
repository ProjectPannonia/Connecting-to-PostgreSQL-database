import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
    private final String url = "jdbc:postgresql://localhost/LD";
    private final String userName = "postgres";
    private final String password = "Zetka67";

    public Connection connect(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url,userName,password);
            System.out.println("Connected to the databese!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
