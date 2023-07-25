package ru.gb;

import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        int max = 7;
        int[] input = { 3, 4, 3, 2, 5, 7, 4, 3, 5, 1, 0, 2, 5, 0 };
        int[] c = sortByCountElement(input, max);
        System.out.println(Arrays.toString(c));

        String text = "Я умереть хотел бы как закат, как луч последний в багряце агоний.";
        System.out.printf("Входящий текст на шифрование:  %s", text + System.lineSeparator());
        String codeText = ceasar(text, 3, true);
        System.out.printf("Выходящий текст шифрования:  %s", codeText + System.lineSeparator());
        System.out.println("Дешивровка:");
        System.out.println(ceasar(codeText, 3, false));
    }
// 2. Написать метод «Шифр Цезаря», с булевым параметром зашифрования и расшифро- вания и числовым ключом;

    /**
     * Метод сортировки массива подсчетом
     * @param arr массив для сортировки
     * @param max_num максимальное значение в массиве
     * arrayFrequenceDifference - промежуточный массив,
     *                размером в количество неповторяемых элементов входного массива,
     *                где значения показывают сколько оригинальных элементов входящего массива
     *                меньше или равно его максимальному значению
     * первым циклом для каждого числа входного массива мы вычисляем его частоту.
     *                вторым циклом - складываем последовательные элементы вместе, чтобы вычислить,
     *                сколько меньше или равно максималльному значению
     * @return отсортированный массив
     */

    private static int[] sortByCountElement(int[] arr, int max_num) {
        int[] arrayFrequenceDifference = new int[max_num + 1];
        int[] sorted = new  int[arr.length];

        Arrays.fill(arrayFrequenceDifference, 0);

        for (int i : arr) {
            arrayFrequenceDifference[i] += 1;
//            System.out.println(i);
        }

        for (int i = 1; i < arrayFrequenceDifference.length; i++) {
            arrayFrequenceDifference[i] += arrayFrequenceDifference[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int current = arr[i];
            sorted[arrayFrequenceDifference[current] - 1] = current;
            arrayFrequenceDifference[current] -= 1;
        }
        return sorted;
    }

    /**
     * Метод шифрования/дешифрования текста
     * @param in - входящий текст
     * @param key - ключ шифрования
     * @param encrypt - тригер для направления шифрования
     * @return - вывод обработанного текста
     */
    private static String ceasar(String in, int key, boolean encrypt) {
        if (in == null || in.isEmpty()) {
            throw new IllegalArgumentException("Длина текста на входе не соответствует процедуре шифра Цезаря");
        }
    final int len = in.length();
    char[] out = new char[len];
    for (int i = 0; i < len; ++i) {
        out[i] = (char) (in.charAt(i) + ((encrypt) ? key : -key));
    }
        return new String(out);
    }
}
