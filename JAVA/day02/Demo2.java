package com.example.day02;

public class Demo2 {
    public static void main(String[] args) {
//        int[] scores = {1,2,3,4,5,6,7};
//        System.out.println(scores.length);
//        System.out.println(scores[0]);
//        System.out.println(scores[6]);
//        ///System.out.println(scores[7]); ArrayIndexOutOfBoundsException
//
//        String[] names ={"A","BB","CCC","DDDD","EEEEE"};
//        System.out.println(names.length);
//        System.out.println(names[1]);
//        names[4] ="java";
//        System.out.println(names[4]);


        String[] names = new String[]{"A","BB","CCC","DDDD","EEEEE"};
        int[] scores;
        scores =new int[]{1,2,3,4,5,6,7};

        String[] animals =new String[5];
        animals[0] =new String("DOG");
        animals[1] =new String("CAT");
        animals[2] =new String("LION");
        animals[3] =new String("RAT");
        animals[4] =new String("TIGER");
//
//        for(int i=0; i< animals.length; i++){
//            System.out.println(animals[i]);
//        }
        int index =0;
        for(String a : animals){
            System.out.println(index++ +"="+a);


        double[] d = new double[5];
        d[0] =0.0;
        d[1]=3.14f;
        d[2]= 100;
        d[3]=3_200_000_000L;
        d[4]= 'A';

        for(double _d :d){
            System.out.println(_d);
        }
        }
    }
}
