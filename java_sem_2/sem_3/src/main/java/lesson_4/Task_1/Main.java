package lesson_4.Task_1;

import java.util.Scanner;

public class Main {
    private  static String password = "";
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите логин не больше 20 знаков: ");
            String login = scanner.nextLine();
            try {
                PasswordLogin.isLogIn(login);
                break;
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            System.out.println("Введите пароль не больше 20 знаков: ");
            password = scanner.nextLine();
            try {
                PasswordLogin.isPasswordLength(password);
                break;
            } catch (WrongPasswordLenghtException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            System.out.println("Подтвердите пароль: ");
            String confirmPassword = scanner.nextLine();
            try {
                PasswordLogin.isPasswordConfirm(password, confirmPassword);
                System.out.println("Поздравляю! Регистрация успешная!");
                break;
            } catch (WrongPasswordConfirmException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
