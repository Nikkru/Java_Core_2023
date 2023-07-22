package ru;

import java.time.LocalDate;

public class LogDecorator {

    /**
     * Функция представления текущей даты
     * в виде строки с преамбулой 'Дата: '
     * @param a дата (LocalDate), требующая декорации
     * @return Отформатированная строка.
     */

    public static String getDate(LocalDate a) {
        /**
         * @param a дата (LocalDate), требующая декорации
         * @return Отформатированная строка.
         **/
        return String.format("Дата: %s.", (a));
    }
}
