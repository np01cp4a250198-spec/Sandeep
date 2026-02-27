package Week17;
import javax.swing.SwingUtilities;

public class MainLauncher
 {
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() ->
        {
            Student s1 = new Student("1", "Sandeep", "Computer Science");
            Student s2 = new Student("2", "Bob", "programming");
            new IDCardWindow(s1).setVisible(true);
            new IDCardWindow(s2).setVisible(true);
        });
    }
}