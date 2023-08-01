package hw_4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Выполнено заказов: " + Order.getSizeOrders());

        Buyer buyer1 = new Buyer("Петров П.П." , 60, "890963456327");
        Buyer buyer2 = new Buyer("Иванов В.А.", 26, "89219096768");
        Buyer buyer3 = new Buyer("Иванов В.А.", 26, "89219096768");

        Product sand = new Product("Песок сеянный",2000);
        Product crashed_stone = new Product("Щебень",2500);
        Product cement = new Product("Цемент",50);
        Product reinforcement = new Product("арматура",6000);
        Product wood = new Product("доска",4000);

        System.out.println("Выполнено заказов: " + Order.getSizeOrders());

        System.out.println(Product.toStringProducts());
        System.out.println(Buyer.toStringBuyers());

        Order.doPurchase("Щебень", "890963456327", 100);
        Order.doPurchase("Цемент", "890963456327", 100);
//        Order.doPurchase("Цемент", "89096346327", 100);
        Order.doPurchase("Гравий", "890963456327", 100);

        System.out.println("Выполнено заказов: " + Order.getSizeOrders());
    }
}
