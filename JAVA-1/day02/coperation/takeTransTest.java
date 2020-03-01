package coperation;

public class takeTransTest {
    public static void main(String[] args) {
        Student student = new Student("정서화",10000);
        Student student1 = new Student("wjdtjghk", 5000);
        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);
        Subway subwaypupple =new Subway(5);
        Subway subwaygreen = new Subway(2);

        student.takeBus(bus100);
        student1.takeSubway(subwaygreen);

        student.showInfo();
        student1.showInfo();


}
}
