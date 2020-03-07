package day05;

public class CoffeeTest {
    public static void main(String[] args) {
         Coffee america =new KenyaAmericano();
         america.brewing();

         Coffee kenyaLatte = new Latte(new KenyaAmericano());
        kenyaLatte.brewing();
    }
}
