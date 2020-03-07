package ramda;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
    public static void main(String[] args) {
        TravelCustomer customerlee = new TravelCustomer("이순신",40, 100);
        TravelCustomer customerpark = new TravelCustomer("박박박",20, 50);
        TravelCustomer customerhong = new TravelCustomer("홍길동",10, 70);

        List<TravelCustomer> customers = new ArrayList<TravelCustomer>();
        customers.add(customerlee);
        customers.add(customerpark);
        customers.add(customerhong);
        System.out.println(customers);

        customers.stream().map(c->c.getName()).forEach(s-> System.out.println(s));
        int total = customers.stream().mapToInt(c->c.getPrice()).sum();
        System.out.println(total);

        customers.stream().filter(c->c.getAge() >=20).map(c->c.getName()).sorted().forEach(s-> System.out.println(s));


    }
}
