import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Display extends JFrame {

    private JFrame frame;
    private DefaultTableModel tableModel;
    private JTable itemTable;
    private JLabel subtotalLabel;

    public Display() {
        //main window
        frame = new JFrame("Cash Register");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());

        //table setup
        String[] columns = {"UPC", "Name", "Price"};
        tableModel = new DefaultTableModel(columns, 0);
        itemTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(itemTable);

        //subtotal pane setup
        subtotalLabel = new JLabel("Subtotal: $0.00");
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bottomPanel.add(subtotalLabel);

        //add table and subtotal pane
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    //adds a row to the gui table, refreshing the window
    public void addItemToTable(Item item) {
        tableModel.addRow(new Object[]{item.getItemUPC(), item.getItemName(), item.getItemPrice()});
    }

    //update the subtotal at the bottom of the screen, formatted to keep proper money structure
    public void updateSubtotal(double subtotal) {
        subtotalLabel.setText(String.format("Subtotal: $%.2f", subtotal));
    }

    public JFrame getFrame() {
        return frame;
    }
}
