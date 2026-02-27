package Week17;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JLabel;

public class Q2
{
    public static void main(String []args)
    {
        JFrame f = new JFrame("College Event");
        f.getContentPane().setBackground(Color.BLUE);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        JLabel label = new JLabel("Welcome To Orientation Day");
        f.setSize(400,300);
        f.add(label);
        f.setVisible(true);
        
        
        
    }
}