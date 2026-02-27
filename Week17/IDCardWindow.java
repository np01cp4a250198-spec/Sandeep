package Week17;
import javax.swing.*;
public class IDCardWindow extends JFrame
 {
    public IDCardWindow(Student student) 
    {
        JLabel label = new JLabel(student.toHtml(), JLabel.CENTER);
        add(label);
        setSize(450, 300);
    }
}