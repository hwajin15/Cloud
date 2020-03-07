package day05;

import java.io.IOException;
import java.io.InputStreamReader;

public class SysteminTest {
    public static void main(String[] args) {
        System.out.println("입력후 끝:");
        try {
           int i;
            InputStreamReader isr =new InputStreamReader(System.in);
            while ( (i = System.in.read()) != '끝');
            System.out.println(i);
            System.out.print((char)i);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
