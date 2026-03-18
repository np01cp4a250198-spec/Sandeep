package Week19;
import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;


public class StudentForm extends JFrame
{
   public StudentForm()
   {
       setTitle("Student Registration");
       setSize(500, 350);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
       setLayout(new BorderLayout());
       // titel pannel 
       JPanel titlePanel = new JPanel();
       JLabel title = new JLabel("Student Registraton Form");
       title.setFont(new Font("Arial", Font.BOLD, 18));
       titlePanel.add(title);
       // sidebar
       JPanel sidebar = new JPanel();
       sidebar.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
       sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
       String[] btnTxts = {"Add", "Edit", "Delete", "Update"};
       sidebar.add(Box.createVerticalGlue());
       for (String text : btnTxts)
       {
           JButton btn = new JButton(text);
           btn.setMaximumSize(new Dimension(75, 40));
           sidebar.add(btn);
           sidebar.add(Box.createVerticalStrut(10));
           
       }
       sidebar.add(Box.createVerticalGlue());
       // form panel
       JPanel formPanel = new JPanel();
       formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));
       sidebar.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
       // name pannel
       JPanel row1 = new JPanel();
       row1.setLayout(new BoxLayout(row1, BoxLayout.X_AXIS));
       row1.setAlignmentX(Component.LEFT_ALIGNMENT);
       JLabel lblName  = new JLabel("Name:");
       lblName.setPreferredSize(new Dimension(75, 25)); // minimum size
       JTextField textName = new JTextField(15);
       textName.setMaximumSize(new Dimension(220, 25)); // set Maximum Size
       row1.add(lblName);
       row1.add(Box.createHorizontalStrut(10));
       row1.add(textName);
       // gender panel 
    
       JPanel row2 = new JPanel();
       row2.setLayout(new BoxLayout(row2, BoxLayout.X_AXIS));
       row2.setAlignmentX(Component.LEFT_ALIGNMENT);
       JLabel lblGender  = new JLabel("Gender:");
       lblGender.setPreferredSize(new Dimension(75, 25));
       ButtonGroup gender = new ButtonGroup();
       JRadioButton male  = new JRadioButton("Male");
       JRadioButton female  = new JRadioButton("Female");
       JRadioButton other = new JRadioButton("Other");
       gender.add(male);
       gender.add(female);
       gender.add(other);
       row2.add(lblGender);
       row2.add(Box.createHorizontalStrut(10));
       row2.add(male);
       row2.add(Box.createHorizontalStrut(10));
       row2.add(female);
       row2.add(Box.createHorizontalStrut(10));
       row2.add(other);
       
       // course panel
       JPanel row3 = new JPanel();
       row3.setLayout(new BoxLayout(row3, BoxLayout.X_AXIS));
       row3.setAlignmentX(Component.LEFT_ALIGNMENT);
       JLabel lblCourse  = new JLabel("Course:");
       lblCourse.setPreferredSize(new Dimension(75, 25));
       String[] courseList = {"Computer Science", "Networking", "AI"};
       JComboBox<String> courseCombo = new JComboBox(courseList);
       courseCombo.setMaximumSize(new Dimension(220, 25));
       row3.add(lblCourse);
       row3.add(Box.createHorizontalStrut(10));
       row3.add(courseCombo);
       
       // hobbies panel
       JPanel row4 = new JPanel();
       row4.setLayout(new BoxLayout(row4, BoxLayout.X_AXIS));
       row4.setAlignmentX(Component.LEFT_ALIGNMENT);
       JLabel lblHobbies  = new JLabel("Hobbies:");
       lblHobbies.setPreferredSize(new Dimension(75, 25));
       JCheckBox reading  = new JCheckBox("Reading");
       JCheckBox sports  = new JCheckBox("Sports");
       JCheckBox music = new JCheckBox("Music");
       row4.add(lblHobbies);
       row4.add(Box.createHorizontalStrut(10));
       row4.add(reading);
       row4.add(Box.createHorizontalStrut(10));
       row4.add(sports);
       row4.add(Box.createHorizontalStrut(10));
       row4.add(music);
       // button panel
       JPanel row5 = new JPanel();
       row5.setLayout(new BoxLayout(row5, BoxLayout.X_AXIS));
       row5.setAlignmentX(Component.LEFT_ALIGNMENT);
       JButton lblButton  = new JButton("Submit:");
       row5.add(Box.createHorizontalGlue());
       lblHobbies.setPreferredSize(new Dimension(75, 25));
       row5.add(lblButton);
       lblButton.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent e)
           {
                String nameVal = textName.getText();
                String genderVal = male.isSelected()
                ? "Male" : female.isSelected() 
                ? "Female" : "Other";
                String courseVal = (String)courseCombo.getSelectedItem();
                List<String> hobbiesList = new ArrayList<>();
                if (reading.isSelected()) hobbiesList.add(reading.getText());
                if (sports.isSelected()) hobbiesList.add(sports.getText());
                if (music.isSelected()) hobbiesList.add(music.getText());
                String hobbiesVal = String.join(" | ", hobbiesList);
                JOptionPane.showMessageDialog(StudentForm.this,
                String.format(
                   "Name: %s\nGender: %s\nCourse: %s\nHobbies: %s",
                   nameVal,
                   genderVal,
                   courseVal,
                   hobbiesVal
                
                )
                );
                
               
           }
       });
       
       formPanel.add(row1);
       formPanel.add(Box.createVerticalStrut(10));
       formPanel.add(row2);
       formPanel.add(Box.createVerticalStrut(10));
       formPanel.add(row3);
       formPanel.add(Box.createVerticalStrut(10));
       formPanel.add(row4);
       formPanel.add(Box.createVerticalStrut(10));
       formPanel.add(row5);
       
       add(titlePanel, BorderLayout.NORTH);
       add(sidebar, BorderLayout.WEST);
       add(formPanel, BorderLayout.CENTER);
       setVisible(true);
   }
   public static void main(String[] args)
   {
       SwingUtilities.invokeLater( () -> 
       {
           new StudentForm();
       });
   }
}