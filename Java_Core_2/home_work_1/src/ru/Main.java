package ru;

import java.util.Scanner;
import java.time.LocalDate;

/**
 * Основной класс приложения. Здесь мы можем описать
 * его основное назначение и способы взаимодействия с ним.
 **/
public class Main {
    /**
     * Точка входа в программу. С неё всегда всё начинается.
     *
     * @param args стандартные аргументы командной строки
     **/
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        Scanner sc = new Scanner(System.in);
        System.out.println("Сделайте запись:");

        String note = sc.nextLine();
        String date = LogDecorator.getDate(today);
        System.out.println(date + ": сделана запись: " + note);
        Writer.add(date + ": " + note);

        sc.close();
    }
}