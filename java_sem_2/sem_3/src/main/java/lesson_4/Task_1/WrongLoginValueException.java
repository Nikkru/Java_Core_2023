package lesson_4.Task_1;

import lombok.Data;

@Data
public class WrongLoginValueException extends RuntimeException {
    private String currentValue;
    public WrongLoginValueException(String currentValue) {
        this.currentValue = currentValue;
    }

    @Override
    public String getMessage() {
        return String.format("Логин %s уже занят", currentValue);
    }
}
