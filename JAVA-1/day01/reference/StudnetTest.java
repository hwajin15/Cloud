package reference;

public class StudnetTest {
    public static void main(String[] args) {
        Student student = new Student(0000,"정서화");
        student.setKoreaSubject("국어",100);
        student.setMathSubject("수학",90);
        student.showStudnetInfo();
    }
}
