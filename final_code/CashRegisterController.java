import java.util.ArrayList;
import java.util.Random;

public class CashRegisterController {

    //the mvc pieces come together, labelled as model and view for ease of grading
    private CashRegister model;
    private Display view;
    private Random rand = new Random();

    public CashRegisterController(CashRegister model, Display view) {
        this.model = model;
        this.view = view;
    }

    public void scanItem() {
        ArrayList<Item> catalogue = model.getItemCatalogue();
        if (catalogue.isEmpty()) return;
        Item item = catalogue.get(rand.nextInt(catalogue.size()));
        model.addScannedItem(item);
        view.addItemToTable(item);
        view.updateSubtotal(model.getSubtotal());
    }
}
