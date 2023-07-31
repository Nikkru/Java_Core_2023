package lesson_4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;

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
        System.out.println("***");
        for (Cat cat: catList) {
            System.out.println(cat.getMale().getRussianMaleTitile());
        }
        System.out.println("***");
        /**
         * Анонимный класс
         **/
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Run!");
            }
        };
        /**
         * лямда-выражения
         **/
        Runnable runnable2 = () -> {
                System.out.println("NEWWW Run!");
            };
        BiFunction<Integer, Integer, String> biFunction = new BiFunction<Integer, Integer, String>() {
            @Override
            public String apply(Integer a, Integer b) {
                return String.format("%s + %s = %s", a, b, a + b);
            }
        };
        /**
         * лямда-выражения
         **/
        BiFunction<Integer, Integer, String> biFunction2 = (a, b) -> String.format("%s + %s = %s", a, b, a + b);

        runnable.run();
        runnable2.run();
        System.out.println(biFunction.apply(5, 7));
        System.out.println(biFunction2.apply(10, 2));
    }
}
