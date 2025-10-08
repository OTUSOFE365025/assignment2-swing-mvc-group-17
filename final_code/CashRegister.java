import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CashRegister {

    private ArrayList<Item> itemCatalogue = new ArrayList<>();
    private ArrayList<Item> scannedItems = new ArrayList<>();
    private double subtotal = 0;

    public CashRegister(String filePath) {

        //file input within the constructor as an argument
        File file = new File(filePath);
        try (java.util.Scanner myReader = new java.util.Scanner(file)) {

            //skip the headers of the text file
            if (myReader.hasNextLine()) myReader.nextLine();


            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                if (line.isBlank()) continue;

                //splits the next line at a tab input, which is how the input file is formatted
                String[] parts = line.split("\t");
                int upc = Integer.parseInt(parts[0]);
                String name = parts[1];
                double price = Double.parseDouble(parts[2]);
                itemCatalogue.add(new Item(upc, name, price));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public ArrayList<Item> getItemCatalogue() {
        return itemCatalogue;
    }

    public void addScannedItem(Item item) {
        scannedItems.add(item);
        subtotal += item.getItemPrice();
    }

    //this is never used as the list of scanned items are displayed within the GUI
    //however it was a listed requirement
    public ArrayList<Item> getScannedItems() {
        return scannedItems;
    }

    public double getSubtotal() {
        return subtotal;
    }
}
