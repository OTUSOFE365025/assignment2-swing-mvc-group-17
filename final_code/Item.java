public class Item {

    //base item class to hold multiple pieces of information to allow linked data in arraylists

    private final int itemUPC;
    private final String itemName;
    private final double itemPrice;

    public Item(int itemUPC, String itemName, double itemPrice) {
        this.itemUPC = itemUPC;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public int getItemUPC() {
        return itemUPC;
    }
    public String getItemName() {
        return itemName;
    }
    public double getItemPrice() {
        return itemPrice;
    }
}
