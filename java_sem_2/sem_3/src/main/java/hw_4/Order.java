package hw_4;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Order {
    private  static ArrayList<Order> orders = new ArrayList<Order>();
    private int amount;
    private Buyer buyer;
    private Product product;

    public Order(int amount, Buyer buyer, Product product) {
        this.amount = amount;
        this.buyer = buyer;
        this.product = product;
    }
    static void addOder(Order order) {
        orders.add(order);
    }
    static String toStringOrders() {
        return orders.toString();
    }
    static Order doPurchase(String product, String buyer, int count) {
        try {
            isBuyerInBuyers(buyer);
        } catch (CustomerException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        Buyer buyer_ = Buyer.getBayer(buyer);
        try {
            Product.isProduct(product);
        } catch (KeyProductIsException e) {
            System.out.println(e.getMessage());
        }
        Product product_ = new Product(product, count);
        try {
            isAmountEnough(count, product);
        } catch (AmountException e) {
            System.out.println(e.getMessage());
            Order order = new Order(1, buyer_, product_);
            orders.add(order);
            return order;
        }
        Order order = new Order(count, buyer_, product_);
        orders.add(order);
        return order;
    }
    private static boolean isBuyerInBuyers(String phone_numer) {
        if (!Buyer.isBuyer(phone_numer))
            throw new CustomerException(phone_numer);
        return true;
    }
    private static boolean isAmountEnough(int required, String product) {
        Product p = Product.getProduct(product);
        int a = p.getAmount();
        if (a < required)
            throw new AmountException(a, required, product);
        return true;
    }
    public static int getSizeOrders() {
        return orders.size();
    }
}

