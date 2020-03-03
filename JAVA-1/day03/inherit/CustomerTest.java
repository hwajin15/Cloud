package inherit;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer(1000,"이순신");
//        customer.setCustomerName("이순신");
//        customer.setCustomerID(10010);
        customer.bonusPoint=1000;
        System.out.println(customer.showCusotomerInfo());

        VipCustomer vipCustomer = new VipCustomer(2020,"김유신");
        vipCustomer.bonusPoint=1000;
        System.out.println(vipCustomer.showCusotomerInfo());
    }
}
