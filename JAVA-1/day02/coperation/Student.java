package coperation;

public class Student {
    String studentName;
    int grade;
    int money;

    public Student(String studnetName, int money){
        this.studentName =studnetName;
        this.money = money;
    }
    public void takeBus(Bus bus){
        bus.take(1000);
        this.money -=1000;
    }
    public void takeSubway(Subway subway){
        subway.take(1200);
        this.money -= 1200;
    }

    public void showInfo(){
        System.out.println(studentName + "님의 남은 돈은" + money +"입니다.");
    }
}
