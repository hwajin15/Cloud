package com.example;

import java.util.Scanner;

public class SwichCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("국어점수=");
        int kor = s.nextInt();
        System.out.print("영어점수=");
        int eng =s.nextInt();
        System.out.print("수학점수=");
        int mat = s.nextInt();

        int total = kor+eng+mat;
        float avg = total/3.0f;

        System.out.println("총점은" +total);
        System.out.println("평균은"+avg);

        switch ( (int) (avg/10)){
            case 10:
            case  9:
                System.out.println("A");
                break;
            case  8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("c");
                break;
            case 6:
                System.out.println("d");
                break;
            default:
                System.out.println("f");
                break;



        }
    }
}
