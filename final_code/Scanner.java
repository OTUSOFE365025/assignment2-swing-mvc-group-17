import javax.swing.*;
import java.awt.*;

public class Scanner extends JPanel {

    public Scanner(CashRegisterController controller) {

        //scan button positioning
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 0));

        JButton scanButton = new JButton("Scan");
        add(scanButton);

        scanButton.addActionListener(e -> controller.scanItem());
    }
}
