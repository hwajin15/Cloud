package com.example.day02;

public class Demo4 {
    public static void main(String[] args) {

        // stack                heap
        // strArray     ->     [0][1][2]
        String[] strArray =new String[3];
        strArray[0]="java 1.8";
        strArray[1]="java 1.12";
        strArray[2]=new String("java 1.3");

        String[] newArray =new String[10];
        System.arraycopy(strArray, 0, newArray,0,strArray.length);
        for(String str : newArray){
            System.out.println(str);
        }

    }
}
