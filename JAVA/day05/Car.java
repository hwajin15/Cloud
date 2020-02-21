package com.example.day05;

public class Car extends CommonCar {

    private int doorCount;
    private Engine engine;


    public Car(String carName, int doorCount){
        System.out.println("CHILD CLASS");
        this.carName =carName;
        this.doorCount = doorCount;


    }
    @Override
    public void displayInfo(){
        System.out.printf("%s,%s(도어수 :%s)\n", brandName,carName,doorCount);
    }

}
