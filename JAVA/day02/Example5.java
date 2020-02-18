package com.example;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        int lineNumber =1;
        int count =0;
        
        boolean isNotPrime = false;
        for(int num =2; num <= 107; num++){
            for(int i =2; i <num; i++){
                isNotPrime =false;
                if(num % i ==0){
                    isNotPrime =true;
                    break;
                }
            }
            if(!isNotPrime){
                System.out.print(num +"\t");
                count++;
            }
            if(lineNumber ==count){
                System.out.println();
                lineNumber++;
                count=0;
            }
        }

    }
}
