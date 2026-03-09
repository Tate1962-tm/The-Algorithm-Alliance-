//TATENDA MACHIRORI
//CS3354
package store;

public class Product {
    public String productName;
    public int productId;
    public double price;
    public int quantityInStock;

    public Product(String name, int id, double price, int qty) {
        this.productName = name;
        this.productId = id;
        this.price = price;
        this.quantityInStock = qty;
    }
}
