package array;

public class StudnetTest {
    public static void main(String[] args) {
        Student studentLee = new Student(2010222,"lee");
        Student studentKim = new Student(2018344,"kim");

        studentLee.addSubject("국어",100);
        studentLee.addSubject("수학",80);
        studentLee.addSubject("영어",70);
        studentLee.showStudentInfo();
        System.out.println("------------------------------------");
        studentKim.addSubject("국어",100);
        studentKim.addSubject("수학",90);
        studentKim.addSubject("영어",70);
        studentKim.showStudentInfo();


    }
}
