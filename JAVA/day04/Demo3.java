package com.example.day04;

public class Demo3 {
    public static void main(String[] args) {
//        Counter.count =Counter.count +1;
//        Counter c = new Counter();
//        c.count = c.count +1;
//        c.count = c.count+ 1;
//        c.count = c.count +1;
//
//        System.out.println("c1:" +c.count);
//
//        Counter c2 = new Counter();
//        c2.count = c2.count +1;
//        c2.count = c2.count+ 1;
//        System.out.println("c2:" +c2.count);
//        System.out.println(c.count);
        Counter.addCount();
        Counter.addCount();
        Counter.addCount();
        Counter c1 =new Counter();
        System.out.println(c1.getCount());

    }
}
