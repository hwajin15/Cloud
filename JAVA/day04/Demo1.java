package com.example.day04;

public class Demo1 {
    public static void main(String[] args) {
      Calculator cal = new Calculator();
//      int result =  cal.add(10,20);
//        System.out.println(result);
//        double result1 =cal.add(10.1,20.2);
//
//        int x =20;
//        int y= 49;
//        int result3 =cal.add(x,y);
//        System.out.printf("%s,%s,%s",x,y,result3);
//
//       int [] sum = {100,200,300,400};
//       sum = new int[]{};
//       int result4= cal.add((sum));
//        System.out.println(result4);
        System.out.println(cal.add(1,2,3));
        System.out.println(cal.add(1,2,3,4));
        System.out.println(cal.add(1,2,3,4,5));
        System.out.println(cal.add(1,2,3,4,5,6));


    }
}
