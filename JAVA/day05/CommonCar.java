package com.example.day05;

public abstract class CommonCar {
    protected String brandName;
    protected String carName;
    protected Engine engine;

    public CommonCar(){
        System.out.println("PARENT CLASS");
        this.brandName="HYUNDAI(현대 자동차)";
        this.engine =new Engine();
    }
    public abstract void displayInfo();

}
