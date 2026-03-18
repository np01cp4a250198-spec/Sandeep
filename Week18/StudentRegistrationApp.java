package Week18;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class Student
 {
    private int id;
    private String name;
    private String gender;
    private String skill;
    private String course;

    public Student(int id, String name, String gender, String skill, String course) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.skill = skill;
        this.course = course;
    }

    public int getId() 
    {
        return id; 
    }
    public String getName()
    {
        return name; 
    }
    public String getGender() 
    { 
        return gender;
    }
    public String getSkill() 
    {
        return skill; 
    }
    public String getCourse() 
    { 
        return course; 
    }
}

public class StudentRegistrationApp 
{
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static DefaultTableModel tableModel;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Student Registration System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 400);
        frame.setLayout(new BorderLayout());

        JPanel formPanel = new JPanel(new GridLayout(0, 2, 10, 10));

        JTextField idField = new JTextField();
        JTextField nameField = new JTextField();

        String[] courses = {"BSc", "BBA", "BIT"};
        JComboBox<String> courseBox = new JComboBox<>(courses);

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("Other");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male); genderGroup.add(female); genderGroup.add(other);

        JCheckBox javaSkill = new JCheckBox("Java");
        JCheckBox pythonSkill = new JCheckBox("Python");
        JCheckBox cppSkill = new JCheckBox("C++");

        formPanel.add(new JLabel("Student ID:")); formPanel.add(idField);
        formPanel.add(new JLabel("Name:")); formPanel.add(nameField);
        formPanel.add(new JLabel("Course:")); formPanel.add(courseBox);

        formPanel.add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel();
        genderPanel.add(male); genderPanel.add(female); genderPanel.add(other);
        formPanel.add(genderPanel);

        formPanel.add(new JLabel("Skills:"));
        JPanel skillPanel = new JPanel();
        skillPanel.add(javaSkill); skillPanel.add(pythonSkill); skillPanel.add(cppSkill);
        formPanel.add(skillPanel);

        frame.add(formPanel, BorderLayout.NORTH);
        String[] columnNames = {"ID", "Name", "Course", "Gender", "Skills"};
        tableModel = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(tableModel) {
            public boolean isCellEditable(int row, int column) 
            { 
                return false; 
            }
        };
        table.setRowHeight(25);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();

        JButton addButton = new JButton("Add");
        JButton resetButton = new JButton("Reset");
        JButton searchButton = new JButton("Search");
        JButton deleteButton = new JButton("Delete");

        buttonPanel.add(addButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(searchButton);
        buttonPanel.add(deleteButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);

        addButton.addActionListener(e -> 
        {
            try 
            {
                int id = Integer.parseInt(idField.getText().trim());
                String name = nameField.getText().trim();
                String course = courseBox.getSelectedItem().toString();
                String gender = male.isSelected() ? "Male" :
                                female.isSelected() ? "Female" : "Other";

                String skills = "";
                if (javaSkill.isSelected()) skills += "Java ";
                if (pythonSkill.isSelected()) skills += "Python ";
                if (cppSkill.isSelected()) skills += "C++ ";

                for (Student s : studentList) 
                {
                    if (s.getId() == id) 
                    {
                        JOptionPane.showMessageDialog(frame, "ID already exists!");
                        return;
                    }
                }

                Student student = new Student(id, name, gender, skills.trim(), course);
                studentList.add(student);

                tableModel.addRow(new Object[]{id, name, course, gender, skills.trim()});
                JOptionPane.showMessageDialog(frame, "Student added successfully!");
            } catch (NumberFormatException ex) 
            {
                JOptionPane.showMessageDialog(frame, "Invalid ID format!");
            }
        });

        resetButton.addActionListener(e -> 
        {
            idField.setText("");
            nameField.setText("");
            courseBox.setSelectedIndex(0);
            genderGroup.clearSelection();
            javaSkill.setSelected(false);
            pythonSkill.setSelected(false);
            cppSkill.setSelected(false);
        });

        searchButton.addActionListener(e -> 
        {
            String input = JOptionPane.showInputDialog(frame, "Enter Student ID to search:");
            try 
            {
                int id = Integer.parseInt(input);
                for (Student s : studentList) 
                {
                    if (s.getId() == id) 
                    {
                        JOptionPane.showMessageDialog(frame,
                            "Found: " + s.getName() + " (" + s.getCourse() + ")");
                        return;
                    }
                }
                JOptionPane.showMessageDialog(frame, "Student not found!");
            } catch (NumberFormatException ex) 
            {
                JOptionPane.showMessageDialog(frame, "Invalid ID format!");
            }
        });

        deleteButton.addActionListener(e -> 
        {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) 
            {
                int id = (int) tableModel.getValueAt(selectedRow, 0);
                studentList.removeIf(s -> s.getId() == id);
                tableModel.removeRow(selectedRow);
                JOptionPane.showMessageDialog(frame, "Student deleted!");
            } else 
            {
                JOptionPane.showMessageDialog(frame, "Select a row to delete!");
            }
        });

        frame.setVisible(true);
    }
}
