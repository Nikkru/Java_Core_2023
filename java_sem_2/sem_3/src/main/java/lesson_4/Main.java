package lesson_4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat0 = new Cat(Male.MALE);
        Cat cat1 = new Cat(Male.MALE);
        Cat cat2 = new Cat(Male.FEMALE);
        Cat cat3 = new Cat(Male.MALE);
        Cat cat4 = new Cat(Male.FEMALE);

        Cat[] cats = {cat0, cat1, cat2, cat3, cat4};
        List<Cat> catList = Arrays.asList(cats);

        Iterator<Cat> iterator = catList.iterator();
        while (iterator.hasNext()) {
            Cat cat = iterator.next();
                if (cat.getMale() == Male.MALE)
                {
                    System.out.println("Кот - мальчик");
                } else if (
                        cat.getMale() == Male.FEMALE) {
                    System.out.println("Кот - девочка");
            }
        }
        /**
         * Анонимный класс
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Run!");
            }
        };
        runnable.run();
    }
}
