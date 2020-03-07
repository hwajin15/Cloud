package ramda;
interface  PrintString{
    void showString(String str);
}
public class TestRamda {
    public static void main(String[] args) {
        PrintString lamda = s-> System.out.println(s);
        lamda.showString("Test");
        showMysting(lamda);

        PrintString test = returnString();
        test.showString("test3");
    }
    public static void showMysting(PrintString p){
        p.showString("test2");
    }
    public static PrintString returnString(){
        return s-> System.out.println(s + "!!!");
    }
}
