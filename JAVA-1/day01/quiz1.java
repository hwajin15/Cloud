import org.w3c.dom.ls.LSOutput;

public class quiz1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        String operator = "-";
        int result = 0;

        if(operator == "+"){
            result = a+ b;
        }else if(operator == "-"){
            result = a-b;

        }else  if (operator == "*"){
            result = a*b;

        } else if (operator == "/") {
            result = a/b;

        }else{
            System.out.println("연산자 오류입니다.");
            return;
        }
        System.out.println("결과값은" + result +" 입니다");
    }

}
