package Week18;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationValidation 
{
    public static void main(String[] args)
{

    JFrame frame = new JFrame("Validation Form");
    frame.setSize(400, 300);
    frame.setLayout(new GridLayout(5, 2, 10, 10));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JTextField nameField = new JTextField();
    JTextField ageField = new JTextField();
    JTextField phoneField = new JTextField();

    frame.add(new JLabel("Name:"));
    frame.add(nameField);

    frame.add(new JLabel("Age:"));
    frame.add(ageField);

    frame.add(new JLabel("Phone:"));
    frame.add(phoneField);

    JButton submit = new JButton("Submit");
    frame.add(submit);

    frame.add(new JLabel(""));
    submit.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

            String name = nameField.getText().trim();
            String ageText = ageField.getText().trim();
            String phone = phoneField.getText().trim();

      
            if (name.isEmpty() || ageText.isEmpty() || phone.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "All fields are required!");
                return;
            }

    
            if (!ageText.matches("\\d+")) {
                JOptionPane.showMessageDialog(frame, "Age must be numeric!");
                return;
            }

            int age = Integer.parseInt(ageText);

            
            if (age < 1 || age > 120) {
                JOptionPane.showMessageDialog(frame, "Age must be between 1 and 120!");
                return;
            }

            if (!phone.matches("\\d{10}")) {
                JOptionPane.showMessageDialog(frame, "Phone must be exactly 10 digits!");
                return;
            }

            JOptionPane.showMessageDialog(frame, "Form Submitted Successfully!");
        }
    });

    frame.setVisible(true);
}
}