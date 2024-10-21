import java.util.ArrayList;
import java.util.Iterator;

public class Cashier {
    private ArrayList<Item> item = new ArrayList<>();

    public void addItem(double price, String code, String name, int quantity) {
        this.item.add(new Item(code, name, price, quantity));
        System.out.println("Barang ditambahkan.");
    }

    public void removeItem(String code) {
        Iterator<Item> iterator = this.item.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getCode().equals(code)) {
                iterator.remove();
                System.out.println("Barang dihapus.");
                return;
            }
        }
        System.out.println("Barang tidak ditemukan.");
    }

    public void viewItems() {
        System.out.println("Daftar Barang:");
        System.out.printf("%-10s %-20s %-10s %-10s %-10s%n", "Kode", "Nama", "Harga", "Jumlah", "Subtotal");
        for (Item item : item) {
            System.out.printf("%-10s %-20s %-10.2f %-10d %-10.2f%n",
                    item.getCode(), item.getName(), item.getPrice(), item.getQuantity(), item.getSubtotal());
        }
    }

    public double displayTotal() {
        double total = 0.0;
        for (Item item : this.item) {
            total += item.getSubtotal();
        }
        System.out.println("Total belanja: " + total);
        return total;
    }

    public void processPayment(double payment) {
        double total = displayTotal();
        if (payment >= total) {
            double change = payment - total;
            System.out.println("Dibayar: " + payment);
            System.out.println("Kembali: " + change);
        } else {
            System.out.println("Uang tidak cukup.");
        }
    }
}
