package staticex;

public class Student {
    public static int serialNum =1000;
    private int Studnetid;
    public String Studnetname;
    public String address;

    public Student(String name){
        Studnetname = name ;
        serialNum++;
        Studnetid = serialNum;

    }

    public Student(int id , String name){
        Studnetid = id;
        Studnetname = name;
        address ="주소없음";
        serialNum++;
    }

    public int getStudnetid(){
        return Studnetid;
    }
    public void showStudentInfo(){
        System.out.println(Studnetname +":" + address);
    }
    public String getName(){
        return Studnetname;
    }
}
//stack 호출이 끝나면 사라짐