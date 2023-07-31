package lesson_4.Task_1;

import lombok.Data;

@Data
public class WrongPasswordException extends RuntimeException {
    private int currentLength;
    private boolean matchConfirm;

    public WrongPasswordException(int currentLength, boolean matchConfirm) {
        this.currentLength = currentLength;
        this.matchConfirm = matchConfirm;
    }

    @Override
    public String getMessage() {
        boolean badlength = currentLength <= 20;
        return String.format("Ваш пароль %sдопустимой длины%s %d",
                ((badlength) ? "в пределах" : ""),
                ((badlength) ? ", исключение > 20, дано" : ","),
                currentLength,
                (matchConfirm) ? "" : "не совпадает ");
    }
}
