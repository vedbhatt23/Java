import java.sql.*;

public class Database {
    
    public Database() throws SQLException {
    }

    String url = "jdbc:mysql://localhost:3306/mark";
    String username = "root";
    String password = "ved23";
    Connection conn = DriverManager.getConnection(url, username, password);

}
