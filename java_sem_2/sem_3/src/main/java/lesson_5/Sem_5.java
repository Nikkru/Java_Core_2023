package lesson_5;

import org.checkerframework.checker.units.qual.C;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Sem_5 {
    public static void main(String[] args) throws IOException {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        writeToFile(array);
//        readFromFile();
//        readWriteFileBuffer("save.txt", "in.txt");
        readChangeWriteFileBuffer("save.txt", "in.txt", '1', "TRUE");
    }
    public static void writeToFile(int[] arr) throws  IOException {
        FileOutputStream fos = new FileOutputStream("save.txt", true);
        fos.write(Arrays.toString(arr).getBytes());
        fos.close();
    }
    public  static ArrayList<Integer> readFromFile() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        try(FileInputStream fin = new FileInputStream("save.txt")) {

            byte[] buffer = new byte[256];
            System.out.println("File data:");
            int count;
            while ((count = fin.read(buffer)) != -1) {
                for (int i=0; i < count; i++) {
                    System.out.println((char) buffer[i]);
                }
            }
//            int i;
//            while (( i = fin.read()) != -1) {
//                arrayList.add((Integer) i);
////                System.out.println((char) i);
//            }
//            System.out.println(arrayList.toString());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        ArrayList<Integer> array = arrayList;
        return array;
    }
    /**
     * метод на классе BufferedReader и java.io.BufferedWriter для оптимизированного процесса чтения и записи файла
     * через буфер
     */

    public static void readWriteFileBuffer(String out, String to) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(out))){
            try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(to))) {
                String line;
                while ((line = bufferedReader.readLine())!=null){
                    bufferedWriter.write(line);
                    System.out.println(line + System.lineSeparator());
                }
//                int i;
//                while ((i=bufferedReader.read())!=-1) {
//                    bufferedWriter.write(i);
//                }
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readChangeWriteFileBuffer(String out, String to, char ex, String pro) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(out))) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(to))) {
                StringBuilder content = new StringBuilder();
                int value;
                while ((value = bufferedReader.read())!=-1) {
                    if ((char)value == ex) {
                        content.append(pro);
                    } else {
                        content.append((char) value);
                    }
                    System.out.println(content);
                }
                bufferedWriter.write(content.toString());
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
