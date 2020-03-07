package day05;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile("random.txt","rw");
        rf.writeInt(100);
        System.out.println(rf.getFilePointer());
        rf.writeDouble(3.14);
        rf.seek(0);
        int i = rf.readInt();
        double d = rf.readDouble();

        System.out.println(i);
        System.out.println(d);

    }
}
