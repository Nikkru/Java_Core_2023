package hw_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Buyer {

//    private static ArrayList<Buyer> buyers = new ArrayList<Buyer>();
//    private static HashSet<Buyer> buyers_ = new HashSet<Buyer>();
    private static HashMap<String, Buyer> _buyers = new HashMap<>();
    private String name;
    private int age;
    private String phone_number;
    public Buyer(String name, int age, String phone_number) {
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
        try {
            isPhoneInBuyers(phone_number);
            _buyers.put(phone_number, this);
        } catch (KeyBuyerCollectionException e) {
            System.out.println(e.getMessage());
        }
    }
//    static void addBuyer(Buyer buyer) {
//        buyers_.add(buyer);
//    }
    @Override
    public String toString() {
        return "Buyer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }

    static String toStringBuyers() {
        return _buyers.toString();
    }
//    static void addToBauersMap(Buyer buyer) {
//        _buyers.put(buyer.phone_number, buyer);
//    }
    public static boolean isPhoneInBuyers(String phone_number) {

      if (_buyers.containsKey(phone_number))
          throw new KeyBuyerCollectionException(phone_number);
      return true;
    }
    static Buyer getBayer(String phone_number) {
       return _buyers.get(phone_number);
    }
    static boolean isBuyer(String phone_number) {
        return _buyers.containsKey(phone_number);
    }
}
