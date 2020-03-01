package staticex;

public class StudnetIdTest {
    public static void main(String[] args) {
        Student studentLee = new Student("wjdtjghk");
        System.out.println(Student.serialNum);
        Student studentKim = new Student("rlatjgjhk");
        System.out.println(Student.serialNum);
        System.out.println(Student.serialNum);

        System.out.println(studentLee.getStudnetid());
        System.out.println(studentKim.getStudnetid());
        System.out.println(studentLee.getStudnetid());
    }
}
