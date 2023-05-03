import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ShowAllBlogs extends JFrame {
    private final JLabel titleLabel, contentLabel;
    private final JPanel blogsPanel;

    public ShowAllBlogs(String formno) {
        setTitle("All Blogs");
        setLayout(null);

        // Set the background image
        ImageIcon backgroundIcon = new ImageIcon(ClassLoader.getSystemResource("bg1.jpeg"));
        Image backgroundImage = backgroundIcon.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(backgroundImage);
        JLabel background = new JLabel(imageIcon);
        background.setBounds(0, 0, 500, 500);
        add(background);

        // Create the title label and text field
        titleLabel = new JLabel("Title");
        titleLabel.setBounds(50, 50, 100, 30);
        titleLabel.setForeground(Color.BLACK);
        background.add(titleLabel);

        // Create the content label and text area
        contentLabel = new JLabel("Content");
        contentLabel.setBounds(250, 50, 100, 30);
        contentLabel.setForeground(Color.BLACK);
        background.add(contentLabel);

        // Create the blogs panel to hold all the blogs
        blogsPanel = new JPanel();
        blogsPanel.setBounds(50, 100, 400, 350);
        blogsPanel.setLayout(new BoxLayout(blogsPanel, BoxLayout.Y_AXIS));
        background.add(blogsPanel);

        // Retrieve all the blogs of the user from the database
        try {
            Connection conn = new Database().c;
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM blogs WHERE id = ?");
            stmt.setString(1, formno);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String title = rs.getString("title");
                String content = rs.getString("content");
                JLabel titleLabel = new JLabel(title);
                JLabel contentLabel = new JLabel(content);
                blogsPanel.add(titleLabel);
                blogsPanel.add(contentLabel);
                blogsPanel.add(Box.createRigidArea(new Dimension(0, 10)));
            }
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        setSize(500, 500);
        setVisible(true);
        setLocation(500, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ShowAllBlogs("");
    }
}
