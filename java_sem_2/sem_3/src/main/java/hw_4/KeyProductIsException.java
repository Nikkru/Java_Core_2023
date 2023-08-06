package hw_4;

public class KeyProductIsException extends RuntimeException {
    private final String name;

    public KeyProductIsException(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
        return String.format("Данная позиция - %s в ассортименте отсутствует.", name);
    }
}
