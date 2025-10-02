import java.awt.BorderLayout;

public class Main {
    public static void main(String[] args) {
        
        //client to put all the pieces together
        CashRegister model = new CashRegister("C:\\Users\\kyles\\Documents\\UPC_List.txt");
        Display view = new Display();
        CashRegisterController controller = new CashRegisterController(model, view);
        Scanner scanPanel = new Scanner(controller);
        view.getFrame().add(scanPanel, BorderLayout.NORTH);
    }
}
