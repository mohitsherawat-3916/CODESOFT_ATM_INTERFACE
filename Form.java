import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;

public class Form extends JFrame{

    public Form(){
        setSize(new Dimension(800,600));
        setTitle("Hello mohit");
        JLabel label = new JLabel();
        label.setText("I am Chutiya ");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setFont(new Font("MV Boli",Font.BOLD,25));
        label.setForeground(Color.red);
        add(label);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Form();
    }
}
