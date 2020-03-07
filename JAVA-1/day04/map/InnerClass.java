package map;

class OutClass{
    private int num =10;
    private static int snum =20;
    private InClass inClass;

    public OutClass(){
        inClass = new InClass();
    }
    class InClass{
        int inum = 100;
        void  inTest(){
            System.out.println(num);
            System.out.println(snum);
        }
    }
    public void usingInner(){
        inClass.inTest();
    }
    static class InstaticClass{
        int innum =100;
        static int Isnum = 200;

        void inTest(){
            System.out.println(innum);
            System.out.println(Isnum);
            System.out.println(snum);

        }

    static void sTest(){
        System.out.println(Isnum);
        System.out.println(snum);
    }

}
}


public class InnerClass {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.usingInner();
        OutClass.InClass inClass =outClass.new InClass();
        inClass.inTest();
        System.out.println();

      // OutClass.InClass inClass1 = new OutClass.InClass();
        OutClass.InstaticClass.sTest();
    }
}
