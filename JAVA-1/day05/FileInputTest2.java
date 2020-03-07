package day05;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest2 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input2.txt")) {
            int i;
            byte[] bi = new byte[10];
            while ((i = fis.read(bi)) != -1) {
                for (byte b : bi) {
                    System.out.println((char)b);
                }
                System.out.println();
            }
            System.out.println("End");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}