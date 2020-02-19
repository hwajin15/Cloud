package com.example.day02;

import java.util.Random;
import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {
        Random rnd = new Random(System.currentTimeMillis());
        int[] comNumber = new int[6];
        int index = 0;
        while (true) {
            int temp = rnd.nextInt(45) + 1;
            boolean isDuplicated = false;
            for (int previousVal : comNumber) {
                if (previousVal == temp) {
                    isDuplicated = true;
                    break;
                }
            }
            if (isDuplicated) {
                continue;
            }
            comNumber[index] = temp;
            if (index == 6) {
                break;
            }

            for (int num : comNumber) {
                System.out.println(num);
            }
        }

        Scanner s =new Scanner(System.in);
        int [] userNumber = new int[6];
        for(int i =0; i< userNumber.length; i++){
            userNumber[i] =s.nextInt();
        }
        int count =0;
        for(int comVal : comNumber){
            for(int userVal : userNumber){
                if(comVal == userVal){
                    count++;
                }
            }
        }
        System.out.println("맞춘 개수는 " +count);
    }
}
