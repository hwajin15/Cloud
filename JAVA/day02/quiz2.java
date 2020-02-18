package com.example;

public class quiz2 {
    public static void main(String[] args) {

        int previousNumber =1;
        int nextNumber =1;
        int currentNumber =0;
        int count =0;

        System.out.println(previousNumber);
        System.out.println(nextNumber);

        while (currentNumber< 1000){
            currentNumber= previousNumber + nextNumber;
            System.out.println(currentNumber);

            previousNumber =nextNumber;
            nextNumber =currentNumber;
             count ++;
        }
        System.out.println("1000번을 넘는 숫자는 " + count);
    }


}
