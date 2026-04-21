package week23;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PersonGUI extends JFrame
{
    private JTextField txtName, txtAge, txtExtra;
    private JComboBox<String> typeBox;
    private JTextArea outputArea;
    
    private ArrayList<Person> personList = new ArrayList<>();

    public PersonGUI()
    {
        setTitle("Person Management System");
        setSize(500,450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10,10));

        JPanel formPanel = new JPanel(new GridLayout(4,2,8,8));
        formPanel.setBorder(BorderFactory.createTitledBorder("Enter Details"));

        formPanel.add(new JLabel("Name:"));
        txtName = new JTextField();
        formPanel.add(txtName);

        formPanel.add(new JLabel("Age:"));
        txtAge = new JTextField();
        formPanel.add(txtAge);

        formPanel.add(new JLabel("Type:"));
        typeBox = new JComboBox<>(new String[]{"Student","Teacher"});
        formPanel.add(typeBox);

        formPanel.add(new JLabel("Course / Subject:"));
        txtExtra = new JTextField();
        formPanel.add(txtExtra);

        add(formPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();

        JButton btnCreate = new JButton("Create Object");
        JButton btnRole = new JButton("Show Roles");
        JButton btnLecture = new JButton("Take Lecture");

        buttonPanel.add(btnCreate);
        buttonPanel.add(btnRole);
        buttonPanel.add(btnLecture);

        add(buttonPanel, BorderLayout.CENTER);


        outputArea = new JTextArea(10,30);
        outputArea.setEditable(false);

        add(new JScrollPane(outputArea), BorderLayout.SOUTH);


        btnCreate.addActionListener(e -> createPerson());
        btnRole.addActionListener(e -> performRole());
        btnLecture.addActionListener(e -> takeLectures());

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void createPerson()
    {
        String name = txtName.getText();
        int age = Integer.parseInt(txtAge.getText());
        Person p = null;
        if(typeBox.getSelectedItem().equals("Student"))
        {
            String course = txtExtra.getText();
            p = new Student(name,age,course);
            
        }
        else
        {
            String subject = txtExtra.getText();
            p = new Teacher (name,age,subject);
        }
        personList.add(p);
        outputArea.append("object created is " + name + "\n");
        clearFields();
    
    }

    private void performRole()
    {
        outputArea.setText("");
        for(Person person:personList)
        {
            outputArea.append("role is " + person.performRole()+"\n");
        }
     
    }

    private void takeLectures()
    {
       outputArea.setText(""); 
       for(Person x:personList)
       {
           if (x instanceof Teacher)
           {
               Teacher t = (Teacher)x;
               outputArea.append("lecture taken by " + t.takeLecture());
           }
       }
        
    }

    private void clearFields()
    {
        txtName.setText("");
        txtAge.setText("");
        txtExtra.setText("");
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(()->
        {
            new PersonGUI().setVisible(true);
        });
    }
}
