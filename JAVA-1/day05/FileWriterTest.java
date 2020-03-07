package day05;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("writer.txt");
        fileWriter.write("a");
        fileWriter.write("안녕하세요");
        System.out.println("end");
    }
}
