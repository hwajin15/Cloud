package generic;

public class Power extends Material{
    public String toString(){
        return "재료는 파우더입니다.";
    }

    @Override
    public String doPrint() {
        System.out.println("powerpriter");
        return null;
    }
}
