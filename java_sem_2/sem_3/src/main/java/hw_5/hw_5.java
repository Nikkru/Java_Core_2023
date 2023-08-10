package hw_5;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/**
 * 1. Написать функцию, создающую резервную копию
 * всех файлов в директории(без поддиректорий) во вновь созданную папку ./backup
 */
public class hw_5 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/main/java/hw_5/folder/");
        System.out.println("Working directory = " + System.getProperty("user.dir"));
        try {
            copyAllFilesFromDirectory(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     static void copyAllFilesFromDirectory(Path src) throws IOException {
        try (DirectoryStream<Path> sources = Files.newDirectoryStream(src)) {
            int i = 1;
            String backup_folder_name = "/backup";
            Path dest = Path.of(src.toString() + backup_folder_name);
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
            File less = new File(dest.toString() + backup_folder_name);
            less.delete();
        }
    }
}
