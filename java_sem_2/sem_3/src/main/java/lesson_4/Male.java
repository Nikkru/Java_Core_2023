package lesson_4;

public enum Male {
//    экземпляры анонимных классов
    MALE("мальчик"),
    FEMALE("девочка");

    private final String russianMaleTitile;

    Male(String russianMaleTitile) {
        this.russianMaleTitile = russianMaleTitile;
    }

    public String getRussianMaleTitile() {
        return russianMaleTitile;
    }
//    abstract void test();
}
