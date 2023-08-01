package hw_4;

import lombok.Data;

@Data
public class KeyBuyerCollectionException extends RuntimeException {
    private String key;

    public KeyBuyerCollectionException(String key) {
        this.key = key;
    }

    @Override
    public String getMessage() {
        return String.format("Ошибка инициализации нового клиента! С номером телефона %s уже есть покупатель", key);
    }
}
