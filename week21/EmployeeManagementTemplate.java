package week21;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class EmployeeManagementTemplate extends JFrame
 {

    // UI Components
    private JLabel headerLabel;
    private JTextField empIdField, nameField, salaryField;
    private JRadioButton fullTime, partTime, contract;
    private JCheckBox healthInsurance, dentalInsurance, retirementPlan;
    private JComboBox<String> departmentBox;
    private JTextArea displayArea;
    private JLabel charCountLabel, mousePositionLabel;
    private JLabel statusLabel;
    private ArrayList<Employee>employees = new ArrayList<>();

    public EmployeeManagementTemplate() 
    {
      setTitle("Employee Management System");
      setLayout(new BorderLayout());
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(1200, 700);

      // ===== Header =====
      JPanel header = new JPanel(new FlowLayout(FlowLayout.LEFT));
      header.addMouseListener(new MouseAdapter()
      {
          @Override
          public void mouseEntered(MouseEvent e)
      {
              headerLabel.setText("<html><h1>Employee Management System</h1></html>");
              header.setBackground(new Color(70, 130, 200));
          
     }
     @Override
     public void mouseExited(MouseEvent e) 
      {
        headerLabel.setText("<html><h1>Employee Record View</h1></html>");
        header.setBackground(Color.ORANGE); 
      }
    });
    headerLabel = new JLabel("<html><h1>Employee Management System</h1></html>");
    header.add(headerLabel);
    header.setBackground(new Color(70, 130, 200));
    headerLabel.setForeground(Color.WHITE);
    add(header, BorderLayout.NORTH);
      

      // TODO 1: Add MouseListener to header for hover effects
      // When mouse enters: change header text to "Employee Records View" and background color to an orange color
      // When mouse exits: revert to original text and color

      // ===== Sidebar =====
      JPanel sidebar = new JPanel();
      sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
      sidebar.setPreferredSize(new Dimension(200, 0));
      sidebar.setBackground(new Color(240, 240, 240));
      sidebar.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));

      JButton addBtn = new JButton("Add Employee");

      JButton viewBtn = new JButton("View Employees");
      JButton updateBtn = new JButton("Update Employee");
      JButton deleteBtn = new JButton("Delete Employee");
      JButton searchBtn = new JButton("Search Employee");

      sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
      sidebar.add(addBtn);
      sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
      sidebar.add(viewBtn);
      sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
      sidebar.add(updateBtn);
      sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
      sidebar.add(deleteBtn);
      sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
      sidebar.add(searchBtn);
      sidebar.add(Box.createVerticalGlue());

      add(sidebar, BorderLayout.WEST);
      
      addHover(addBtn);
      addHover(viewBtn);
      addHover(updateBtn);
      addHover(deleteBtn);
      addHover(searchBtn);
      

      // ===== Form Panel =====
      JPanel form = new JPanel();
      form.setLayout(new BoxLayout(form, BoxLayout.Y_AXIS));
      form.addMouseMotionListener(new MouseMotionAdapter()
      {
      @Override
      public void mouseMoved(MouseEvent e) 
      {
        super.mouseMoved(e);
        mousePositionLabel.setText("<html><h1>Mouse: (" + e.getX() + ", " + e.getY() + ")</h1></html>");
      }
      @Override
      public void mouseDragged(MouseEvent e) 
      {
        super.mouseDragged(e);
        mousePositionLabel.setText("<html><h1>Mouse: (" + e.getX() + ", " + e.getY() + ")</h1></html>");
      }
    });
      form.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
      form.setBackground(Color.WHITE);

      // TODO 2: Add MouseMotionListener to form panel
      // When mouse moves, update mousePositionLabel with coordinates

      // Name Field
      nameField = new JTextField(20);
      JPanel namePanel = createFieldPanel("Full Name:", nameField);
      form.add(namePanel);
      
    nameField.addKeyListener(new KeyAdapter() {
      @Override
      public void keyReleased(KeyEvent e) {

        int count = nameField.getText().length();
        charCountLabel.setText("<html><h1>Characters: " +count+"</h1></html>");
        if (count < 10) {
            charCountLabel.setForeground(Color.GREEN);
        }
        else if (count <= 15) {
            charCountLabel.setForeground(Color.YELLOW);
        }
        else {
            charCountLabel.setForeground(Color.RED);
        }
      }
      
    });
  
      nameField.addFocusListener(new FocusAdapter()
      {
      @Override
      public void focusGained(FocusEvent e) 
      {
        if (nameField.getText().equals("Enter the name")) 
        {
            nameField.setText("");
            nameField.setForeground(Color.BLACK);
        }
      }
      @Override
      public void focusLost(FocusEvent e) 
      {
        if (nameField.getText().equals("")) 
        {
            nameField.setText("Enter the name");
            nameField.setForeground(Color.LIGHT_GRAY);
        }
      }
    });
      form.add(Box.createRigidArea(new Dimension(0, 10)));
      // TODO 3: Add FocusListener to name field
      // When focused gained, if text is "Enter full name", clear it and set text color to black
      // When focus lost, if text is empty, set it to "Enter full name" and text color to gray

      // Salary Field
      salaryField = new JTextField(20);
      JPanel salaryPanel = createFieldPanel("Salary", salaryField);
      form.add(salaryPanel);
      
      salaryField.addKeyListener(new KeyAdapter() {
    @Override
    public void keyTyped(KeyEvent e) {
        char ch = e.getKeyChar();
        if (!Character.isDigit(ch) && ch != '.' && ch != '\b') {
            e.consume(); 
        }

        if (ch == '.' && salaryField.getText().contains(".")) {
            e.consume();
        }
    }
});
      form.add(Box.createRigidArea(new Dimension(0, 10)));

      // Employment Type
      JPanel employmentPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
      employmentPanel.add(new JLabel("Employment Type:"));
      fullTime = new JRadioButton("Full-Time");
      partTime = new JRadioButton("Part-Time");
      contract = new JRadioButton("Contract");
      ButtonGroup empGroup = new ButtonGroup();
      empGroup.add(fullTime);
      empGroup.add(partTime);
      empGroup.add(contract);
      employmentPanel.add(fullTime);
      employmentPanel.add(partTime);
      employmentPanel.add(contract);
      form.add(employmentPanel);
      form.add(Box.createRigidArea(new Dimension(0, 10)));

      // Benefits
      JPanel benefitsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
      benefitsPanel.add(new JLabel("Benefits:"));
      healthInsurance = new JCheckBox("Health Insurance");
      dentalInsurance = new JCheckBox("Dental Insurance");
      retirementPlan = new JCheckBox("Retirement Plan");
      benefitsPanel.add(healthInsurance);
      benefitsPanel.add(dentalInsurance);
      benefitsPanel.add(retirementPlan);
      form.add(benefitsPanel);
      form.add(Box.createRigidArea(new Dimension(0, 10)));

      // Department
      JPanel deptPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
      deptPanel.add(new JLabel("Department:"));
      String[] departments = {"IT", "HR", "Finance", "Marketing", "Operations"};
      departmentBox = new JComboBox<>(departments);
      deptPanel.add(departmentBox);
      form.add(deptPanel);
      form.add(Box.createRigidArea(new Dimension(0, 10)));

      // Action Buttons
      JButton registerBtn = new JButton("Register Employee");
      JButton clearFormBtn = new JButton("Clear Form");
      JButton clearAllBtn = new JButton("Clear All Records");
      addHover(registerBtn);
      addHover(clearFormBtn);
      addHover(clearAllBtn);

      JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
      btnPanel.add(registerBtn);
      btnPanel.add(clearFormBtn);
      btnPanel.add(clearAllBtn);
      form.add(btnPanel);

      add(form, BorderLayout.CENTER);

      registerBtn.addActionListener(e -> {
    try {
        String name = nameField.getText().trim();
        if (name.isEmpty() || name.equals("Enter the name")) {
            throw new Exception("Name cannot be Null!");
        }

        double salary = Double.parseDouble(salaryField.getText());

        if (salary > 100000) {
            throw new IllegalSalaryException("Salary cannot be greater than 1 lakh.");
        }

        registerEmployee();

    } catch (IllegalSalaryException ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
    });

      clearFormBtn.addActionListener(e -> {
          nameField.setText("");
          salaryField.setText("");
          fullTime.setSelected(false);
          partTime.setSelected(false);
          contract.setSelected(false);
          healthInsurance.setSelected(false);
          dentalInsurance.setSelected(false);
          retirementPlan.setSelected(false);
          departmentBox.setSelectedIndex(0);
    });

    clearAllBtn.addActionListener(e -> {
      displayArea.setText("");
      employees.clear();
    });

      // ===== Display Area =====
      JPanel rightPanel = new JPanel(new BorderLayout());
      rightPanel.setPreferredSize(new Dimension(400, 0));

      displayArea = new JTextArea(20, 30);
      displayArea.setEditable(false);
      displayArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
      displayArea.setBackground(new Color(252, 252, 252));
      rightPanel.add(new JScrollPane(displayArea), BorderLayout.CENTER);
      add(rightPanel, BorderLayout.EAST);

      // ===== Footer =====
      JPanel footer = new JPanel(new GridLayout(1, 2));
      footer.setBackground(new Color(60, 60, 60));
      footer.setPreferredSize(new Dimension(0, 60));

      charCountLabel = new JLabel("<html><h3>Characters: 0</h3></html>");
      mousePositionLabel = new JLabel("<html><h3>Mouse Position: (0, 0)</h3></html>");
      statusLabel = new JLabel("<html><h3>Status: Ready</h3></html>");

      charCountLabel.setForeground(Color.WHITE);
      mousePositionLabel.setForeground(Color.WHITE);
      statusLabel.setForeground(Color.WHITE);

      JPanel leftFooter = new JPanel(new FlowLayout(FlowLayout.LEFT));
      leftFooter.setBackground(new Color(60, 60, 60));
      leftFooter.add(charCountLabel);
      leftFooter.add(mousePositionLabel);

      JPanel rightFooter = new JPanel(new FlowLayout(FlowLayout.RIGHT));
      rightFooter.setBackground(new Color(60, 60, 60));
      rightFooter.add(statusLabel);

      footer.add(leftFooter);
      footer.add(rightFooter);
      add(footer, BorderLayout.SOUTH);

      setVisible(true);
    }
    
    private void addHover(JButton btn) {
        btn.addMouseListener(new MouseAdapter()
      {
          Color originalBgColor = btn.getBackground();
          @Override
          public void mouseEntered(MouseEvent e)
      {
                btn.setBackground(Color.GREEN);
                
          
     }
     public void mouseExited(MouseEvent e) {
                btn.setBackground(originalBgColor);
                
            }
        });
    }

    private JPanel createFieldPanel(String label, JTextField field) {
      JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
      JLabel jlabel = new JLabel(label);
      jlabel.setPreferredSize(new Dimension(120, 25));
      panel.add(jlabel);
      field.setPreferredSize(new Dimension(300, 30));
      panel.add(field);
      panel.setBackground(Color.WHITE);
      return panel;
    }

    // Register Employee Method
    private void registerEmployee() {
        String empId = "EMP" + (employees.size() + 1);
        String name = nameField.getText().trim();
        String salary = salaryField.getText().trim();
        String employmentType = fullTime.isSelected() ? "Full-Time" :
                                partTime.isSelected() ? "Part-Time" : "Contract";
        String benefits = "";
        if (healthInsurance.isSelected()) benefits += "Health Insurance, ";
        if (dentalInsurance.isSelected()) benefits += "Dental Insurance, ";
        if (retirementPlan.isSelected()) benefits += "Retirement Plan, ";
        if (!benefits.isEmpty()) benefits = benefits.substring(0, benefits.length() - 2); // remove last comma
        String department = (String) departmentBox.getSelectedItem();
    
        Employee emp = new Employee(empId, name, salary, employmentType, benefits, department);
        employees.add(emp);
        displayArea.append(String.join(", ", emp.getEmployeeData()) + "\n");
        statusLabel.setText("<html><h3>Status: Employee Registered</h3></html>");
    }
    

    public static void main(String[] args) {
      SwingUtilities.invokeLater(() -> new EmployeeManagementTemplate());
    }
}

