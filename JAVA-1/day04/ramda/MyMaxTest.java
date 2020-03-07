package ramda;

public class MyMaxTest {
    public static void main(String[] args) {
        MyMax myMax = (x,y) ->(x >= y ) ? x :y;
        System.out.println(myMax.getMaxNumber(10,20));
    }
}
