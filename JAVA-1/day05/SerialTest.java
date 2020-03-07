package day05;


import java.io.*;

class  Person implements Serializable {
    String name;
    String job;
    public Person(String name, String job){
        this.name =name;
        this.job = job;
    }
    public String toString(){
        return name +", "+job;
    }
}

public class SerialTest {
    public static void main(String[] args) {
        Person personlee = new Person("이순신", "엔지니어");
        Person personkim = new Person("김유신", "선생님");
        try (FileOutputStream fos = new FileOutputStream("serial.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(personlee);
            oos.writeObject(personkim);
        } catch (IOException e) {
            System.out.println(e);
        }
        try (FileInputStream fis = new FileInputStream("serial.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Person pi1 = (Person)ois.readObject();
            Person pi2 = (Person)ois.readObject();

            System.out.println(pi1);
            System.out.println(pi2);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}