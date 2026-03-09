//TATENDA MACHIRORI
//CS3354
package store;
import java.util.ArrayList;

public class InventoryManager {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public void removeProduct(int id) {
        products.removeIf(p -> p.productId == id);
    }

    public void listProducts() {
        for (Product p : products) {
            System.out.println(p.productName + " - Price: $" + p.price + " | Stock: " + p.quantityInStock);
        }
    }
}
