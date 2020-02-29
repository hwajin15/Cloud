package classpart;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(2019330,"정서화");
        studentLee.address="서울시 강서구";
        studentLee.showStudentInfo();
        Student studentKim = new Student(2019222, "정서화1");
        studentKim.showStudentInfo();
    }
}
