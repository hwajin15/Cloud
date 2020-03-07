package ramda;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length >= s2.getBytes().length)
            return s1;
        else  return s2;
    }
}

public class ReduceTest {
    public static void main(String[] args) {
        String [] greeting ={"안녕하세요","hello","good morning"};
        System.out.println( Arrays.stream(greeting).reduce("",(s1,s2)->{
            if (s1.getBytes().length >= s2.getBytes().length)
                return s1;
            else  return s2;
        }));
        System.out.println(Arrays.stream(greeting).reduce(new CompareString()).get());
    }
}
