public class qizeCase {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        String operator ="-";
        int result =0;

        switch (operator) {
            case "+": result =a+b;
            break;
            case "-": result = a-b;
            break;
            case "*": result = a*b;
            break;
            case "/": result = a/b;
            break;
            default:
                System.out.println("잘못된 연산입니다.");
                break;
        }
        System.out.println("출력된 결과는 " + result + "입니다.");
    }

}
