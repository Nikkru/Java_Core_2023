package ru.gb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] startArray = {1, 2, 3, 4, 5};
        int num = 7;
        int index = 3;
        Integer[] resultArray = addToArray(startArray, num);
        Integer[] resArray = appendToArray(startArray, num);
        Integer[] resArrayByIndex = insertIntoArrayByIndex(startArray, num, index);
        Integer[] resArrayInEnd = insertIntoArrayByIndex(startArray, num);
        System.out.println("Исходный массив " + Arrays.toString(startArray));
        System.out.println("Конечный массив с новым значением в конце 1: " + Arrays.toString(resultArray));
        System.out.println("Конечный массив с новым значением в конце 2: " + Arrays.toString(resArray));
        System.out.println("Конечный массив с новым значением в конце 3: " + Arrays.toString(resArrayInEnd));
        System.out.println("Конечный массив со значением добавленным по индексу: " + Arrays.toString(resArrayByIndex));
    }
    private static Integer[] addToArray(Integer[] arr, int num) {
        List <Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.add(num);
        return  list.toArray(new Integer[0]);
    }
    private  static  Integer[] appendToArray(Integer[] arr, int num) {
        Integer[] finishArray = new Integer[arr.length + 1];
        int a = finishArray.length;
        System.out.printf("Добавляем значение %d в конец массива." + System.lineSeparator(), (a));
        System.arraycopy(arr, 0, finishArray, 0, arr.length);
        finishArray[finishArray.length - 1] = num;
        return  finishArray;
    }
    private  static  Integer[] insertIntoArrayByIndex(Integer[] arr, int num, int index) {
        if (index < 0 || index > arr.length) {
            throw new IllegalArgumentException(String.format("Заданный индекс %d со значением %d лежит за пределами границ массива длиной %d.",
                    (index),
                    (num),
                    (arr.length)));
        }
        Integer[] finishArray = new Integer[arr.length + 1];
        System.out.printf("Добавляем значение %d в массив по индексу %d." + System.lineSeparator(), (num), (index));
//        if (index > arr.length) {
//            System.out.printf("Заданный индекс %d со значением %d лежит за пределами границ массива длиной %d." + System.lineSeparator(),
//                    (index),
//                    (num),
//                    (finishArray.length));
//            return null;
//        }
        System.arraycopy(arr, 0, finishArray, 0, index);
        System.arraycopy(arr,
                    index,
                    finishArray,
                    index + 1,
                    finishArray.length - (index + 1));
        finishArray[index] = num;
        return  finishArray;
    }
    private  static  Integer[] insertIntoArrayByIndex(Integer[] arr, int num) {
        return insertIntoArrayByIndex(arr, num, arr.length);
    }
}