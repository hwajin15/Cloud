package classpart;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person() ;
        person.age =40;
        person.name ="james";
        person.isMarried =true;
        person.childCount =3;

        System.out.println("나이는" +person.age);
        System.out.println("이름은" +person.name);
        System.out.println("결혼여부는" + person.isMarried);
        System.out.println("자녀수는" +person.childCount);

    }
}
