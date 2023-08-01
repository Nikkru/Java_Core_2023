package hw_4;

import lombok.Data;

@Data
public class KeyProductCollectionException extends RuntimeException {
    private String name;

    public KeyProductCollectionException(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
        return String.format("Данная позиция - %s есть в ассортименте", name);
    }
}
