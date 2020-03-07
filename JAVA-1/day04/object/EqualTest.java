package object;

import java.util.Objects;

class  Student{
    int studentNum;
    String studentName;

    public Student(int studentNum, String studentName){
        this.studentNum = studentNum;
        this.studentName = studentName;
    }
    @Override
    public boolean equals(Object object){
        if (object instanceof Student){
            Student std = (Student)object;
            return (this.studentNum == std.studentNum);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }


}
public class EqualTest {
    public static void main(String[] args) {
//        Student lee = new Student(100, "이순신");
//        Student lee2 = lee;
//        Student lee1 = new Student(100,"이순신");
//        System.out.println(lee.equals(lee2));
//        System.out.println(lee.equals(lee1));
//
        Integer l1 =new Integer(100);
        Integer l2 = 100;
        System.out.println(l1.equals(l2));
        System.out.println(l1.hashCode());
        System.out.println(l2.hashCode());
        System.out.println(System.identityHashCode(l2));
        System.out.println(System.identityHashCode(l1));
    }
}
