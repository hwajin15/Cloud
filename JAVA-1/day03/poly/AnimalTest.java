package poly;

import java.util.ArrayList;

class Animal{
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}
class Human extends Animal{
    public void move(){
        System.out.println("사람이 움직입니다");
    }
    public void read(){
        System.out.println("책을 읽습니다.");
    }
}
class  Tiger extends Animal{
    public void move(){
        System.out.println("네발로 뜁니다.");
    }
    public void hunting(){
        System.out.println("사냥을 합니다.");
    }
}

class Eagle extends  Animal{
    public void move(){
        System.out.println("날아다닙니다.");
    }
    public void flying(){
        System.out.println("날개로 날아다닙니다.");
    }
}
public class AnimalTest {
    public static void main(String[] args) {

        Animal animal1 = new Human();
        Animal animal2 = new Tiger();
        Animal animal3 = new Eagle();
//        Human human = (Human)animal1;
//        if (animal1 instanceof Human){
//            Human human = (Human)animal1 ;
//            human.read();
//        }

//        AnimalTest test =new AnimalTest();
//        test.moveAnimal(animal1);
//        test.moveAnimal(animal2);
//        test.moveAnimal(animal3);

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        AnimalTest test = new AnimalTest();
        test.TestDownCasting(animals);
//        for (Animal animal : animals){
//            animal.move();
//        }
    }
    public void TestDownCasting(ArrayList<Animal>list){
        for (int i =0; i<list.size(); i++) {
            Animal ani = list.get(i);
            if (ani instanceof Human){
                Human human =(Human)ani;
                human.read();
            }else if(ani instanceof Tiger){
                Tiger tiger =(Tiger)ani;
                tiger.hunting();
            }else if (ani instanceof Eagle){
                Eagle eagle =(Eagle)ani;
                eagle.flying();
            }


        }
    }
    public void moveAnimal(Animal animal){
        animal.move();
    }
}
