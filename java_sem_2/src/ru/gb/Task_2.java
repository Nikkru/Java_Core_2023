package ru.gb;

import java.util.Arrays;
import java.util.TreeMap;

public class Task_2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 30, 4, 3, 5, 2, 20, 3, 13, 23, 25, 6, 8, 9, 3, 2, 15 };
        System.out.println(Arrays.toString(countSort(arr)));
    }

    /**
     *
     * @param arr массив для сортировки
     * @return метод возвращает отсортированный с помощью treemap массив
     */
    private static int[] countSort(int[] arr) {
        int[] tmpArr = new int[arr.length];
        TreeMap<Integer, Integer> map_ = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            map_.put(arr[i], map_.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println("Map: " + map_.toString());
        int i = 0;
        for (Integer key : map_.keySet()) {
            for (int j = 0; j < map_.get(key); j++) {
                tmpArr[i++] = key;
            }
        }
        return tmpArr;
    }
}
