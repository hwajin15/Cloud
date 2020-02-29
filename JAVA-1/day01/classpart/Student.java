package classpart;

public class Student {
    public int Studnetid;
    public String Studnetname;
    public String address;

    public Student(int id , String name){
        Studnetid = id;
        Studnetname = name;
    }

    public void showStudentInfo(){
        System.out.println(Studnetname +":" + address);
    }
    public String getName(){
        return Studnetname;
    }
}
//stack 호출이 끝나면 사라짐