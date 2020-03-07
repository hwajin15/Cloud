package ramda;

public class TestString {
    public static void main(String[] args) {
       StringCompl stringCompl = new StringCompl();
       stringCompl.MakeString("hello","world");

       StringConcat concat =(s,v) -> System.out.println(s+"," +v);
       concat.MakeString("hello","world");

       StringConcat concat1 = new StringConcat() {
           @Override
           public void MakeString(String s1, String s2) {
               System.out.println(s1 +","+ s2);
           }
       };
       concat1.MakeString("hello","world");
    }
}
