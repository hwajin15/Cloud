package map;
class  Outer2{
    int outNum =100;
    static int sNum =200;
    Runnable getRunnable(int i) {
        int num = 100;
        return new Runnable() {
            @Override
            public void run() {

                System.out.println(outNum);
                System.out.println(Outer.sNum);
            }
        };
    }
    Runnable runnner = new Runnable() {
        @Override
        public void run() {
            System.out.println("Test");
        }
    };
}


public class AnnoymousClassTest {
    public static void main(String[] args) {
    Outer2 outer = new Outer2();
    outer.runnner.run();
    Runnable runnable = outer.getRunnable(50);
    runnable.run();
    }
}
