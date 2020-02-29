package reference;

public class Student {
    int studnetId;
    String studnetName;

    Subject korea;
    Subject eng;
    Subject math;

    public Student(int id, String name){
        studnetId =id;
        studnetName = name;
        korea = new Subject();
        math = new Subject();
    }

    public void setKoreaSubject(String name, int score){
        korea.subjectName =name;
        korea.score =score;

    }
    public void setMathSubject(String name, int score){
        math.subjectName =name;
        math.score =score;

    }
    public void showStudnetInfo(){
        int total = korea.score+math.score;
        System.out.println(studnetName+"학생의 총점은" +total +"점입니다.");

    }

}
