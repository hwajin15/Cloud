package day05;

import java.io.*;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {
        FileReader fis = new FileReader("rede.txt");

        int i;
         while ((i= fis.read())!=-1){
             System.out.print((char)i);
         }
         fis.close();
    }
}
