package com.example;

public class Example3 {
    public static void main(String[] args){
     int jumsu =60;
     if (jumsu ==100){
         String message ="축하합니다.";
         System.out.println(message +"만점입니다.");
     } else if (jumsu >= 60) {
         String message ="축하합니다.";
         System.out.println(message +"합격입니다.");

     }else {
         String message ="죄송합니다.";
         System.out.println(message +"불합격입니다.ㄴ");
     }
        int a =10;
        switch (a){
            case 10:
                System.out.println("10을 선택하셨습니다.");
                break;
            case 9:
                System.out.println("9을 선택하셨습니다.");
                break;
            case 8:
                System.out.println("8을 선택하셨습니다.");
                break;
            default:
                System.out.println("다른값을 선택하셨습니다.");
                break;
        }
        System.out.println("end");

    }

}
