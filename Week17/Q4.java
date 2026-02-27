package Week17;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Q4
{
    public static void main(String []args)
    {
        JFrame f = new JFrame("StudentID");
        f.setSize(400, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("<html><h1>Name:Sandeep Bhasma</h1><h2>Module: Programming</h2><h3>college</h3></html>", JLabel.CENTER);
        f.add(label);
        f.setVisible(true);
    }
}