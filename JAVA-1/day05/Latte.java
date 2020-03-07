package day05;

public class Latte extends Decorator {
    public Latte(Coffee coffee) {
        super(coffee);
    }
    public void brewing(){
        super.brewing();
        System.out.print("adding Milk");
    }
}
