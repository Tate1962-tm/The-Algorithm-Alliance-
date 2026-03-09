// TATENDA MACHIRORI
// CS3354 
import store.*;
import customer.*;

public class Main {
    public static void main(String[] args) {
        // Create objects
        Product p1 = new Product("Laptop", 101, 999.99, 5);
        Product p2 = new Product("Mouse", 102, 25.50, 50);
        Customer c1 = new Customer("Alice Smith", 1, "123 Java Lane");
        InventoryManager im = new InventoryManager();

        // Demonstrate operations
        im.addProduct(p1);
        im.addProduct(p2);
        
        System.out.println("Customer: " + c1.customerName);
        System.out.println("Inventory List:");
        im.listProducts();

        im.removeProduct(101);
        System.out.println("\nAfter removing Laptop:");
        im.listProducts();
    }
}
