package set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;
class Mycompare implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2) *(-1);
    }
}
public class CompartorTest {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>(new Mycompare());
        set.add("홍길동");
        set.add("김유신");
        set.add("정서화");

        for (String str : set){
            System.out.println(str);
        }
    }
}
