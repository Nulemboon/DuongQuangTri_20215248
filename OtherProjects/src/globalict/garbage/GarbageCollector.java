package globalict.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GarbageCollector {
    public static void main(String[] args) throws IOException {
        Path filename = Paths.get("test.txt");
        byte[] inputBytes = { 0 };
        long startTime, endTime;
        inputBytes = Files.readAllBytes(filename);
        startTime = System.currentTimeMillis();
        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char)b;
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        startTime = System.currentTimeMillis();
        StringBuilder outputStringBuilder = new StringBuilder();
        for (byte b : inputBytes) {
            outputStringBuilder.append((char)b);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
