import javax.swing.*;
import java.awt.*;

public class Content extends JFrame {
    String formno;
    JButton imageButton, blogButton, videoButton;
    JLabel image1;

    Content(String formno) {
        this.formno = formno;
        setLayout(null);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("bg1.jpeg"));
        Image i5 = i4.getImage().getScaledInstance(800, 480, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        image1 = new JLabel(i6);
        image1.setBounds(0, 0, 800, 480);
        add(image1);

        JLabel text = new JLabel("Welcome to STREAMLINED CMS");
        text.setFont(new Font("Osward", Font.BOLD, 30));
        text.setBounds(170, 40, 600, 40);
        image1.add(text);

        imageButton = new JButton("Images");
        imageButton.setBounds(300, 150, 200, 50);
        imageButton.addActionListener(e -> showImages());
        image1.add(imageButton);

        blogButton = new JButton("Blogs");
        blogButton.setBounds(300, 220, 200, 50);
        blogButton.addActionListener(e -> showBlogs());
        image1.add(blogButton);

        videoButton = new JButton("TO-DO");
        videoButton.setBounds(300, 290, 200, 50);
        videoButton.addActionListener(e -> showTODO());
        image1.add(videoButton);


        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
    }

    private void showImages() {
        new ImagesWindow(formno).setVisible(true);
        setVisible(false);
    }

    private void showBlogs() {
        // Code to show the blogs section
        new BlogsWindow(formno).setVisible(true);
        setVisible(false);
    }

    private void showTODO() {
        new TODOWindow(formno).setVisible(true);
        setVisible(false);
    }

    public static void main(String[] args) {
        new Content("");
    }
}
