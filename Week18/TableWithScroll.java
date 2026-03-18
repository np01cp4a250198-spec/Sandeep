package Week18;
import javax.swing.*;
import java.awt.*;
public class TableWithScroll
 {
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Student Records with Scroll");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        String[] columnNames = {"Name", "Age", "Phone", "Department"};

        Object[][] rowData =
        {
            {"Sandeep", 22, "9812345678", "Computer Science"},
            {"Anita", 20, "9809876543", "Economics"},
            {"Ramesh", 25, "9845671234", "Mechanical Engineering"},
            {"Kiran", 23, "9823456789", "Physics"},
            {"Maya", 21, "9834567890", "Chemistry"},
            {"Bishal", 24, "9845678901", "Biology"},
            {"Prakash", 26, "9856789012", "Civil Engineering"},
            {"Sita", 22, "9867890123", "Business Administration"},
            {"Hari", 27, "9878901234", "Mathematics"},
            {"Laxmi", 20, "9889012345", "Electrical Engineering"}
        };

        JTable table = new JTable(rowData, columnNames)
        {
            public boolean isCellEditable(int row, int column) 
            {
                return false;
            }
        };

        table.setRowHeight(25);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}