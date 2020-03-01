package coperation;

public class Subway {
    int subwayLine;
    int passengerCount;
    int money;

    public Subway(int subwayLine){
        this.subwayLine = subwayLine;
    }
    public void take(int money ){
        this.money += money;
        passengerCount++;
    }
    public void showSubInfo(){
        System.out.println(subwayLine +"라인은 승객은" +passengerCount +"명이고, 금액은" + money + "입니다.");
    }
}
