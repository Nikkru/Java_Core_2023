package hw_4;

import lombok.Data;

@Data
public class AmountException extends RuntimeException {
    private int count_available;
    private int count_required;

    private String name;

    public AmountException(int count_available, int count_required, String name) {
        this.count_available = count_available;
        this.count_required = count_required;
        this.name = name;
    }

    @Override
    public String getMessage() {
        return String.format("Товар %s отсутствует в необходимом объеме %d, не хватает %d единиц товара. Будет продана 1 единица",
                name,
                count_required,
                (count_required - count_available));
    }
}
