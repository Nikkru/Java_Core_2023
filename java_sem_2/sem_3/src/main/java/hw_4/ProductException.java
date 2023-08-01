package hw_4;

import lombok.Data;

@Data
public class ProductException extends RuntimeException {
    private String name;

    public ProductException(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
        return String.format("Данный товар %s отсутствует на складе", name);
    }
}
