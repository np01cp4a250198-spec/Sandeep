package FinalMilestone;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.io.*;

public class SubscriptionGUI {

    private ArrayList<AIModel> plans = new ArrayList<>();

    private JTextField modelNameField = new JTextField();
    private JTextField priceField = new JTextField();
    private JTextField parameterField = new JTextField();
    private JTextField contextField = new JTextField();
    private JTextField promptQuotaField = new JTextField();
    private JTextField teamSlotsField = new JTextField();
    private JTextField promptTextField = new JTextField();
    private JTextField responseLengthField = new JTextField();
    private JTextField teamMemberField = new JTextField();
    private JTextField indexField = new JTextField();

    private JTextArea displayArea = new JTextArea();

    public SubscriptionGUI() {

        JFrame frame = new JFrame("AI Subscription System");
        frame.setSize(1000, 750);
        frame.setLayout(null);

        JPanel inputPanel = new JPanel(new GridLayout(10, 2));
        inputPanel.setBounds(0, 40, 495, 350);

        inputPanel.add(new JLabel("Model Name:"));
        inputPanel.add(modelNameField);

        inputPanel.add(new JLabel("Price:"));
        inputPanel.add(priceField);

        inputPanel.add(new JLabel("Parameter Count:"));
        inputPanel.add(parameterField);

        inputPanel.add(new JLabel("Context Window:"));
        inputPanel.add(contextField);

        inputPanel.add(new JLabel("Available Tokens (Personal):"));
        inputPanel.add(promptQuotaField);

        inputPanel.add(new JLabel("Team Slots (Pro):"));
        inputPanel.add(teamSlotsField);

        inputPanel.add(new JLabel("Prompt Text:"));
        inputPanel.add(promptTextField);

        inputPanel.add(new JLabel("Response Length:"));
        inputPanel.add(responseLengthField);

        inputPanel.add(new JLabel("Team Member Name:"));
        inputPanel.add(teamMemberField);

        inputPanel.add(new JLabel("Index:"));
        inputPanel.add(indexField);

        JPanel buttonPanel = new JPanel(new GridLayout(3, 3));
        buttonPanel.setBounds(0, 390, 495, 265);

        JButton addPersonalBtn = new JButton("Add Personal Plan");
        JButton addProBtn = new JButton("Add Pro Plan");
        JButton displayBtn = new JButton("Display All");
        JButton clearBtn = new JButton("Clear");
        JButton promptBtn = new JButton("Give Prompt");
        JButton teamBtn = new JButton("Add Team Member");
        JButton typeBtn = new JButton("Check Plan Type");
        JButton exportBtn = new JButton("Export");
        JButton loadBtn = new JButton("Load");

        buttonPanel.add(addPersonalBtn);
        buttonPanel.add(addProBtn);
        buttonPanel.add(displayBtn);
        buttonPanel.add(clearBtn);
        buttonPanel.add(promptBtn);
        buttonPanel.add(teamBtn);
        buttonPanel.add(typeBtn);
        buttonPanel.add(exportBtn);
        buttonPanel.add(loadBtn);

        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        scrollPane.setBounds(495, 40, 490, 350);

        frame.add(inputPanel);
        frame.add(buttonPanel);
        frame.add(scrollPane);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        addPersonalBtn.addActionListener(e -> {
            try {
                String modelName = modelNameField.getText();
                double price = Double.parseDouble(priceField.getText());
                int parameterCount = Integer.parseInt(parameterField.getText());
                int contextWindow = Integer.parseInt(contextField.getText());
                int availableTokens = Integer.parseInt(promptQuotaField.getText());

                if (modelName.equals("")) {
                    JOptionPane.showMessageDialog(null, "Model name cannot be empty.");
                    return;
                }

                if (price < 0 || parameterCount < 0 || availableTokens < 0) {
                    JOptionPane.showMessageDialog(null, "Numbers cannot be negative.");
                    return;
                }

                PersonalPlan personalPlan = new PersonalPlan(
                    modelName, price, parameterCount, contextWindow, availableTokens
                );

                plans.add(personalPlan);
                displayArea.setText("Personal Plan added successfully.");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter valid numbers for price, parameter count, and prompt quota.");
            }
        });

        addProBtn.addActionListener(e -> {
            try {
                String modelName = modelNameField.getText();
                double price = Double.parseDouble(priceField.getText());
                int parameterCount = Integer.parseInt(parameterField.getText());
                int contextWindow = Integer.parseInt(contextField.getText());
                int teamSlots = Integer.parseInt(teamSlotsField.getText());

                if (modelName.equals("")) {
                    JOptionPane.showMessageDialog(null, "Model name and context window cannot be empty.");
                    return;
                }

                if (price < 0 || parameterCount < 0 || teamSlots < 0) {
                    JOptionPane.showMessageDialog(null, "Numbers cannot be negative.");
                    return;
                }

                ProPlan proPlan = new ProPlan(
                    modelName, price, parameterCount, contextWindow, teamSlots
                );

                plans.add(proPlan);
                displayArea.setText("Pro Plan added successfully.");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter valid numbers for price, parameter count, and team slots.");
            }
        });

        displayBtn.addActionListener(e -> {
            displayArea.setText("");

            if (plans.size() == 0) {
                displayArea.setText("No plans available.");
                return;
            }

            for (int i = 0; i < plans.size(); i++) {
                displayArea.append("Index: " + i + "\n");
                displayArea.append(plans.get(i).display());
                displayArea.append("\n---------------------------\n");
            }
        });

        clearBtn.addActionListener(e -> {
            modelNameField.setText("");
            priceField.setText("");
            parameterField.setText("");
            contextField.setText("");
            promptQuotaField.setText("");
            teamSlotsField.setText("");
            promptTextField.setText("");
            responseLengthField.setText("");
            teamMemberField.setText("");
            indexField.setText("");
            displayArea.setText("");
        });

        promptBtn.addActionListener(e -> {
            try {
                int index = getValidIndex();

                if (index != -1) {
                    AIModel model = plans.get(index);

                    if (model instanceof PersonalPlan) {
                        PersonalPlan personalPlan = (PersonalPlan) model;

                        String promptText = promptTextField.getText();
                        int responseLength = Integer.parseInt(responseLengthField.getText());

                        if (promptText.equals("")) {
                            JOptionPane.showMessageDialog(null, "Prompt text cannot be empty.");
                            return;
                        }

                        if (responseLength < 0) {
                            JOptionPane.showMessageDialog(null, "Response length cannot be negative.");
                            return;
                        }

                        String result = personalPlan.enterPrompt(promptText, responseLength);
                        displayArea.setText(result);

                    } else {
                        JOptionPane.showMessageDialog(null, "This operation is only available for Personal Plan.");
                    }
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid response length.");
            }
        });

        teamBtn.addActionListener(e -> {
            int index = getValidIndex();

            if (index != -1) {
                AIModel model = plans.get(index);

                if (model instanceof ProPlan) {
                    ProPlan proPlan = (ProPlan) model;

                    String memberName = teamMemberField.getText();

                    if (memberName.equals("")) {
                        JOptionPane.showMessageDialog(null, "Team member name cannot be empty.");
                        return;
                    }

                    String result = proPlan.addTeamMember(memberName);
                    displayArea.setText(result);

                } else {
                    JOptionPane.showMessageDialog(null, "Team collaboration is only available for Pro Plan.");
                }
            }
        });

        typeBtn.addActionListener(e -> {
            int index = getValidIndex();

            if (index != -1) {
                checkPlanType(index);
            }
        });

        exportBtn.addActionListener(e -> {
            try {
                FileWriter writer = new FileWriter("plans.txt");

                for (AIModel plan : plans) {
                    writer.write(plan.display());
                    writer.write("\n---------------------------\n");
                }

                writer.close();
                JOptionPane.showMessageDialog(null, "Data exported successfully to plans.txt.");

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error exporting data to file.");
            }
        });

        loadBtn.addActionListener(e -> {
            try {
                BufferedReader reader = new BufferedReader(new FileReader("plans.txt"));
                String line;
                displayArea.setText("");

                while ((line = reader.readLine()) != null) {
                    displayArea.append(line + "\n");
                }

                reader.close();

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error loading file. File may not exist.");
            }
        });
    }

    private int getValidIndex() {
        int displayNumber = -1;

        try {
            displayNumber = Integer.parseInt(indexField.getText());

            if (displayNumber < 0 || displayNumber >= plans.size()) {
                JOptionPane.showMessageDialog(null, "Index is outside the valid range.");
                return -1;
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Index must be an integer number.");
            return -1;
        }

        return displayNumber;
    }

    private void checkPlanType(int index) {
        AIModel model = plans.get(index);

        if (model instanceof PersonalPlan) {
            displayArea.setText("Personal Plan");
        } else if (model instanceof ProPlan) {
            displayArea.setText("Pro Plan");
        } else {
            displayArea.setText("Unknown plan type.");
        }
    }

    public static void main(String[] args) {
        new SubscriptionGUI();
    }
}