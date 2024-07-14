import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class StudentTable extends JFrame 
{
    private JTable table;
    public StudentTable() 
    {
        String[] columnNames = {"Roll Number", "Name", "Percentage"};
        Object[][] data = {
                {1, "John", 85.6},
                {2, "Jane", 76.8},
                {3, "Bob", 92.3},
                {4, "Mary", 78.9},
                {5, "Alice", 81.5}
        };
        table = new JTable(data, columnNames);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(table), BorderLayout.CENTER);

        setTitle("Student Table");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(panel);
    }
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() -> 
        {
            StudentTable st = new StudentTable();
            st.setVisible(true);
        });
    }
}
