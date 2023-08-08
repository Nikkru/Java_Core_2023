package hw_5;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/**
 * 1. Написать функцию, создающую резервную копию
 * всех файлов в директории(без поддиректорий) во вновь созданную папку ./backup
 * 2. Предположить, что числа в исходном массиве из 9 элементов имеют диапазон[0, 3],
 * и представляют собой, например, состояния ячеек поля для игры в крестикинолики,
 * где 0 – это пустое поле,
 * 1 – это поле с крестиком,
 * 2 – это поле с ноликом,
 * 3 – резервное значение.
 * Такое предположение позволит хранить в одном числе типа int всё поле 3х3.
 * Реализовать функционал с записью в файл и обратно игрового поля.
 * Выводить в консоль игровое поле после импорта, заменяя числа символами X, O, •(пусто)
 */
public class hw_5 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/main/java/hw_5/folder/");
        System.out.println("Working directory = " + System.getProperty("user.dir"));
//        copyAllFilesFromDirectory(path);

        try {
            copyAllFilesFromDirectory(path);
//            System.out.println("Копирование целой директории выполненно.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void copyAllFilesFromDirectory(Path src) throws IOException {
//        Files.walk(src).forEach(source -> {
//            try {
//                Path dest = Path.of(src.toString() + "/backup");
//                Files.copy(source, dest.resolve(src.relativize(source)), StandardCopyOption.REPLACE_EXISTING);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        });
//        DirectoryStream<Path> _src = new DirectoryStream<Path>() {
//            @Override
//            public Iterator<Path> iterator() {
//                return null;
//            }
//
//            @Override
//            public void close() throws IOException {
//
//            }
//        };

        try (DirectoryStream<Path> sources = Files.newDirectoryStream(src)) {
            int i = 1;
//            File backup = new File((src.toString() + "/backup"));
            Path dest = Path.of(src.toString() + "/backup");
            Files.createDirectories(dest);
            for (Path source : sources) {
                System.out.println("Файл №" + i + " : " + source);
                i ++;
                try {
                    Files.copy(source, dest.resolve(src.relativize(source)),
                            StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
