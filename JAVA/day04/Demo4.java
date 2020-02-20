package com.example.day04;

public class Demo4 {
    private  static Demo4 obj = new Demo4();
    private  Demo4(){ }

    public static Demo4 getInstance(){
        if(obj ==null){
            obj =new Demo4();
        }

        return obj;
    }
}
