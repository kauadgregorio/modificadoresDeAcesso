public class Product {
    String name;
    private double price;
    private int quantity;

    // Construtores

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Encapsulamento
    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

    // Métodos
    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("The quantity to add cannot be negative.");
        }
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        if (quantity < 0 || quantity > this.quantity) {
            throw new IllegalArgumentException("The quantity to remove must be between 0 and the current stock.");
        }
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format(java.util.Locale.US, "%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format(java.util.Locale.US, "%.2f", totalValueInStock());
    }
}