package thisex;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.age =25;
        person.name="정서화";
        person.showInfo();

        Person person1 =new Person();
        person1.showInfo();
        System.out.println(person);

        Person p = person.getSelf();
        System.out.println(p);
    }
}
