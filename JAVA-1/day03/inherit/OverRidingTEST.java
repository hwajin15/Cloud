package inherit;

public class OverRidingTEST {
    public static void main(String[] args) {
        Customer customer = new Customer(1000,"이순신");
        customer.bonusPoint=1000;
        VipCustomer vipCustomer = new VipCustomer(2020,"김유신");
        vipCustomer.bonusPoint =10000;

        int priceLee  = customer.CalcPrice(10000);
        int priceKim = vipCustomer.CalcPrice(10000);

        System.out.println(customer.showCusotomerInfo() + "지불금액은" + priceLee +"입니다.");
        System.out.println(vipCustomer.showCusotomerInfo() + "지불금액은" + priceKim +"입니다.");

        Customer customer1 = new VipCustomer(10030," wjdtjghk");
        customer1.bonusPoint =10000;
        System.out.println(vipCustomer.showCusotomerInfo() + "지불금액은" + customer1.CalcPrice(10000) +"입니다.");

    }
}
