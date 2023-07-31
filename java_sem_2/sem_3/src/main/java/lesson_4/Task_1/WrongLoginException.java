package lesson_4.Task_1;

import lombok.Data;

@Data
public class WrongLoginException extends RuntimeException {
    private int currentLength;
    public WrongLoginException(int currentLength) {
        super();
        this.currentLength = currentLength;
    }

    @Override
    public String getMessage() {
        return String.format("Ваш логин превышает допустимую длину (до 20 знаков) на %d", (currentLength - 19));
    }
}
