package ru;

import java.io.*;
public class Writer {
    /**
     * Функция записи в файл строки
     * @param a строка для добавления в файл
     **/
    public static void add(String a) {

        try(FileWriter writer = new FileWriter("log.txt", true))
        {
            /**
             * @param text - строка для записи в файл
             *
             */
            // запись всей строки
            String text = a;
            writer.write(text + System.lineSeparator());

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
