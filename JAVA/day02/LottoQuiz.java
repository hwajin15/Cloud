package com.example.day02;

import java.util.Random;
import java.util.Scanner;

public class LottoQuiz {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("6개의 숫자를 입력하세요");
        int[] intVal = new int[6];
        int [] a =new int[6];
        for(int i=0; i<a.length; i++){
            a[i] =sc.nextInt();
        }
        Random r = new Random(System.currentTimeMillis());


        for (int i = 0; i < 6; i++) {
             intVal[i] = r.nextInt(45)+1;
            System.out.println(intVal[i]);
        }
        for(int i =0; i<a.length; i++){
            for (int j=0; j<intVal.length; j++){
                if(a[i] == intVal[j]){
                    System.out.println("123");
                }
            }
        }

    }
}
