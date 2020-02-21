package com.example.day05;

public class CarFactory {
    public static void main(String[] args) {
        Car car1 = new Car("쏘나타 YF",4);
        car1.displayInfo();
        Car car2 = new Car("소나타 NF",4);
        car2.displayInfo();
        SportsCar sportsCar1 = new SportsCar("SP ONE",2);
        sportsCar1.displayInfo();
        SportsCar sportsCar2 = new SportsCar("제네시스",2);
        sportsCar2.displayInfo();
        Bus bus= new Bus("마을버스",15);
        bus.displayInfo();



    }

}
