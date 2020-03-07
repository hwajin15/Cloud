package day05;
class MyThread extends Thread{
    public void run(){
        int i;
        for (i =0; i<=200;i++);

        try {
            sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        System.out.println("start");
        MyThread th1 =new MyThread();
        MyThread th2 =new MyThread();

        th1.run();
        th2.run();
        System.out.println("end");
    }
}
