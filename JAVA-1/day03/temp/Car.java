package temp;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public void startCar(){
        System.out.println("시동을 켭니다.");
    }
    public void turnoff(){
        System.out.println("시동을 끕니다.");
    }
    public void washCar(){
    }
   final public void run(){
        startCar();
        drive();
        turnoff();
        washCar();
    }
}
