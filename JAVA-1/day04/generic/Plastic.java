package generic;

public class Plastic extends Material{
    public String toString(){
        return "재료는 플라스틱 입니다.";
    }

    @Override
    public String doPrint() {
        System.out.println("plastic 프린팅입니다.");

        return null;
    }
}
