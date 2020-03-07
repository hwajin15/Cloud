package ramda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("wjtjghk");
        list.add("tngsh");
        list.add("rijyh");

        Stream<String> stream =list.stream();
        stream.forEach(s-> System.out.print(s +" "));
        System.out.println();

        list.parallelStream().sorted().forEach(s-> System.out.println(s + " "));
        System.out.println();
        list.stream().map(s->s.length()).forEach(n-> System.out.println(n));
    }
}
