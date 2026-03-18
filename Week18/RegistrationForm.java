package Week18;
import javax.swing.*;
import java.awt.*;

public class RegistrationForm 
{
    public static void main(String[] args)
    {

        JFrame frame = new JFrame("Student Registration Form");
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(6, 2, 10, 10));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new JLabel("Name:"));
        JTextField nameField = new JTextField();
        frame.add(nameField);

        frame.add(new JLabel("Age:"));
        JTextField ageField = new JTextField();
        frame.add(ageField);

        frame.add(new JLabel("Phone:"));
        JTextField phoneField = new JTextField();
        frame.add(phoneField);

        frame.add(new JLabel("Department:"));
        String[] departments = {
            "CS", "IT", "SE", "BBA", "MBA",
            "ECE", "Civil", "Mechanical"
            
        };
        JComboBox<String> deptBox = new JComboBox<>(departments);
        frame.add(deptBox);

        frame.add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel();

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Other");

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        bg.add(other);

        genderPanel.add(male);
        genderPanel.add(female);
        genderPanel.add(other);

        frame.add(genderPanel);

 
        frame.add(new JLabel("Hobbies:"));
        JPanel hobbyPanel = new JPanel();

        JCheckBox reading = new JCheckBox("Reading");
        JCheckBox sports = new JCheckBox("Sports");
        JCheckBox music = new JCheckBox("Music");

        hobbyPanel.add(reading);
        hobbyPanel.add(sports);
        hobbyPanel.add(music);

        frame.add(hobbyPanel);


        JButton submit = new JButton("Submit");
        frame.add(submit);

        frame.add(new JLabel(""));


        frame.setVisible(true);
    }
}