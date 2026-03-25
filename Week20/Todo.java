package Week20;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Todo extends JFrame
{

    JTextField taskField;
    JComboBox<String> priority;
    JPanel taskPanel;

    // Store all checkboxes
    ArrayList<JCheckBox> checkBoxes = new ArrayList<>();

    public Todo()
    {

        setTitle("My ToDo Manager");
        setSize(1000,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // ================= HEADER =================
        JPanel header = new JPanel();
        header.setBackground(new Color(200,220,255));

        JLabel title = new JLabel("My ToDo Manager");
        title.setFont(new Font("Arial", Font.BOLD, 24));

        header.add(title);
        add(header, BorderLayout.NORTH);

        // ================= SIDEBAR =================
        JPanel sidebar = new JPanel();
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setPreferredSize(new Dimension(150,0));
        sidebar.setBackground(new Color(240,240,240));

        sidebar.add(new JButton("All Tasks"));
        sidebar.add(Box.createVerticalStrut(10));
        sidebar.add(new JButton("Completed"));
        sidebar.add(Box.createVerticalStrut(10));
        sidebar.add(new JButton("Pending"));
        sidebar.add(Box.createVerticalStrut(10));
        sidebar.add(new JButton("Important"));

        add(sidebar, BorderLayout.WEST);
        
        // =================== EAST =================
         JPanel sidebarPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 20));
        sidebarPanel.setPreferredSize(new Dimension(180, 0));
        sidebarPanel.setBackground(new Color(220, 220, 220));

        Dimension btnSize = new Dimension(150, 30);

        JButton doneBtn = new JButton("Done");
        doneBtn.setPreferredSize(btnSize);
        doneBtn.setBackground(Color.RED);

        JButton clearBtn = new JButton("Clear All");
        clearBtn.setPreferredSize(btnSize);
        clearBtn.setBackground(Color.GREEN);

        sidebarPanel.add(doneBtn);
        sidebarPanel.add(clearBtn);
        
        add(sidebarPanel, BorderLayout.EAST);

        // ================= CENTER =================
        JPanel centerPanel = new JPanel(new BorderLayout());

        JPanel inputPanel = new JPanel(new FlowLayout());

        JLabel taskLabel = new JLabel("Task:");
        taskField = new JTextField(20);

        priority = new JComboBox<>();
        priority.addItem("High");
        priority.addItem("Medium");
        priority.addItem("Low");

        JButton addBtn = new JButton("Add Task");
        addBtn.setBackground(Color.GREEN);

        inputPanel.add(taskLabel);
        inputPanel.add(taskField);
        inputPanel.add(priority);
        inputPanel.add(addBtn);

        centerPanel.add(inputPanel, BorderLayout.NORTH);

        taskPanel = new JPanel();
        taskPanel.setLayout(new BoxLayout(taskPanel, BoxLayout.Y_AXIS));

        JScrollPane scroll = new JScrollPane(taskPanel);
        centerPanel.add(scroll, BorderLayout.CENTER);

        add(centerPanel, BorderLayout.CENTER);

        addBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String taskText = taskField .getText();
                if (taskText.isEmpty()){
                    JOptionPane.showMessageDialog(
                    Todo.this, "Enter a Task");
                    return;
                }
                addTask(taskText);
            }
        });
        setVisible(true);
    }

    private void addTask(String taskText) {
        JPanel row = new JPanel();
        row.setLayout(new FlowLayout(FlowLayout.LEFT));
        JCheckBox taskCheckBox = new JCheckBox(taskText);
        checkBoxes.add(taskCheckBox);
        JButton deleteBtn = new JButton("Delete");
        row.add(taskCheckBox);
        row.add(deleteBtn);
        taskPanel.add(row);
        taskPanel.revalidate();
        taskPanel.repaint();
    }
    
    public static void main(String[] args) {
        new Todo();
    }
}
