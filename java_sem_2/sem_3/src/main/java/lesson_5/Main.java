package lesson_5;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        long timeStart = System.nanoTime();
        String s = "Example";
            for (int i = 0; i < 300_000; i++) {
                s = s + 1;
        }
            double deltaTime = (System.nanoTime() - timeStart) * 0.000000001;
        System.out.println("Delta time (sec):" + deltaTime);

        timeStart = System.nanoTime();

        StringBuilder sb = new StringBuilder("Example");
        for (int i = 0; i < 300_000; i++) {
            sb.append(i);
        }
        double deltaTimeSB = (System.nanoTime() - timeStart) * 0.000000001;
        System.out.println("DeltaSB time (sec):" + deltaTimeSB);

        System.out.println(s.equals(sb.toString()));
    }
}
