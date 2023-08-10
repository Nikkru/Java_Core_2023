package hw_5;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 2. Предположить, что числа в исходном массиве из 9 элементов имеют диапазон[0, 3],
 * и представляют собой, например, состояния ячеек поля для игры в крестикинолики,
 * где 0 – это пустое поле,
 * 1 – это поле с крестиком,
 * 2 – это поле с ноликом,
 * 3 – резервное значение.
 * Такое предположение позволит хранить в одном числе типа int всё поле 3х3.
 * Реализовать функционал с записью в файл и обратно игрового поля.
 * Выводить в консоль игровое поле после импорта, заменяя числа символами X, O, •(пусто)
 */
public class Task2 {
    public static void main(String[] args) throws IOException {
        int[] array = {1, 2, 0, 3, 1, 0, 2, 1, 2};
        String folder_save_name = "ticTac.out";
        saveDataInFile(array, folder_save_name);
        readFileData(folder_save_name);
    }
    static void saveDataInFile(int[] arr, String folder) throws IOException {
        FileOutputStream fos = new FileOutputStream(folder);
        fos.write(Arrays.toString(arr).getBytes());
        fos.close();
    }
    static void readFileData(String folder) throws IOException {
        Map<Character, Character> ticTacDecoder = new HashMap<>();
        ticTacDecoder.put('0', ' ');
        ticTacDecoder.put('1', 'X');
        ticTacDecoder.put('2', 'O');
        ticTacDecoder.put('3', 'Y');
        try (FileInputStream fis = new FileInputStream(folder)){
            BufferedInputStream bis = new BufferedInputStream(fis, 256);
            int b;
            int i = 0;
            while ((b = bis.read()) !=- 1) {
                if (Character.isDigit(b)) {
                    i ++;
                    if ((i % 3) != 0) {
                        System.out.print(ticTacDecoder.get((char)b));
                    } else {
                        System.out.println(ticTacDecoder.get((char)b));
                    }
                }
            }
        }
    }
}
