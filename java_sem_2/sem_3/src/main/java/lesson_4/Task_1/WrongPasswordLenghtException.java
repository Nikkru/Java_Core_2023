package lesson_4.Task_1;

import lombok.Data;

@Data
public class WrongPasswordLenghtException extends RuntimeException {
    private int currentLength;

    public WrongPasswordLenghtException(int currentLength) {
        this.currentLength = currentLength;
    }

    @Override
    public String getMessage() {
        return String.format("Ваш пароль превышает допустимую длину (до 20 знаков) на %d", (currentLength - 19));
    }
}
