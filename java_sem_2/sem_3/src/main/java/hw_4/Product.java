package hw_4;

import lombok.Data;

import java.util.HashMap;

@Data
public class Product {
//    private static ArrayList<Product> products = new ArrayList<Product>();
    public static HashMap<String, Product> products_ = new HashMap<>();
    private String name;
    private int amount;

    public Product(String name, int amount) {
        this.name = name;
        this.amount = amount;
        try {
            isProductInProducts(name);
            products_.put(name, this);
        } catch (KeyProductCollectionException e) {
            System.out.println(e.getMessage());
        }
    }
//    static void addProduct(Product product) {
//        products.add(product);
//    }
    static String toStringProducts() {
        return products_.toString();
    }
    public static boolean isProductInProducts(String name) {

        if (products_.containsKey(name))
            throw new KeyProductCollectionException(name);
        return true;
    }
    public static boolean isProduct(String name) {
        if (!products_.containsKey(name))
            throw new KeyProductIsException(name);
        return true;
    }
    public static Product getProduct(String name) {
        return products_.get(name);
    }
}
