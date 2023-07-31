package lesson_4.Task_1;

import lombok.Data;


public class WrongPasswordConfirmException extends RuntimeException {

    @Override
    public String getMessage() {
        return String.format("Потверждающий ввод пароля не совпадает с первым");
    }
}
