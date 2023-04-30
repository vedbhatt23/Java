import java.sql.Connection;
import java.sql.*;

public class Functions extends Database{
    public Functions() throws SQLException {
    }

    void add(int id, String name, double marks) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement("INSERT INTO mark (id, name, marks) VALUES (?, ?, ?)");
        stmt.setInt(1, id);
        stmt.setString(2, name);
        stmt.setDouble(3, marks);
        stmt.executeUpdate();
    }

    void show() throws SQLException {
        PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM mark");
        ResultSet rs = pstmt.executeQuery();
        while(rs.next())
        {
            System.out.println("ID : "+rs.getInt("id"));
            System.out.println("Name : "+rs.getString("name"));
            System.out.println("Marks : "+rs.getDouble("marks"));
        }
    }

    void delete(int id) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement("DELETE FROM mark WHERE id = ?");
        stmt.setInt(1, id);
        stmt.executeUpdate();
    }
}
