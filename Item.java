public class Item {
    private double itemPrice;
    private String itemName;
    private String itemCode;
    private int itemQuantity;

    public Item(String code, String name, double price, int quantity) {
        this.itemCode = code;
        this.itemName = name;
        this.itemPrice = price;
        this.itemQuantity = quantity;
    }

    public double getPrice() {
        return this.itemPrice;
    }

    public String getCode() {
        return this.itemCode;
    }

    public String getName() {
        return this.itemName;
    }

    public int getQuantity() {
        return this.itemQuantity;
    }

    public double getSubtotal() {
        return this.itemPrice * this.itemQuantity;
    }
}
