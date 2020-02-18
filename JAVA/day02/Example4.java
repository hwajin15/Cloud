package com.example;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요");
        int i = sc.nextInt();

        for(int a =1; a <= i ; a++){
            if(i % a == 0){
                System.out.println(a);
            }

        }

    }
}
