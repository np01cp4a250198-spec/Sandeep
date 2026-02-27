package Week17;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.*;

public class Q5
{
    public static void main(String []args)
    {
        JFrame f = new JFrame("Simple Login Screen");
        f.setLayout(null);
        f.setSize(400,300);
        JLabel label = new JLabel("Enter Your Name: ");
        label.setBounds(50, 50, 120, 30);
        JTextField textField = new JTextField();
        textField.setBounds(180,50,120,30);
        JButton button = new JButton("Login");
        button.setBounds(150,150,100,45);
        button.setBackground(Color.GREEN);
        f.add(label);
        f.add(textField);
        f.add(button);
        f.setVisible(true);
    }
}