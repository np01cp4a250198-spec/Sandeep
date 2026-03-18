package Week19;
import javax.swing.*;
import java.awt.*;
public class StudentDashboardUI extends JFrame
{
    public StudentDashboardUI()
    {
        setTitle("Admin DashBoard");
        setSize(900,600);
        setLayout(new BorderLayout());
        JPanel header = new JPanel();
        add(header,BorderLayout.NORTH);
        header.setLayout(new FlowLayout(FlowLayout.LEFT));
        ImageIcon icon = new ImageIcon();
        JLabel lblheader = new JLabel("<html><h1>Student Admin Panel</h1> </html>");
        header.setBackground(Color.LIGHT_GRAY);
        JPanel footer = new JPanel();
        add(footer,BorderLayout.SOUTH);
        JPanel sidebar = new JPanel();
        add(sidebar,BorderLayout.WEST);
        JPanel stdregistration = new JPanel();
        add(stdregistration,BorderLayout.CENTER);
        setVisible(true);
        
    }
    public static void main(String[] args)
   {
       SwingUtilities.invokeLater( () -> 
       {
           new StudentDashboardUI();
       });
   }
    
    
}