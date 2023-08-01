package hw_4;

import lombok.Data;

@Data
public class CustomerException extends RuntimeException {
    private String name;

    public CustomerException(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
        return String.format("Данное имя %s не найдено в списке покупателей", name);
    }
}
