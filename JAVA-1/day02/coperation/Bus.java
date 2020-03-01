package coperation;

public class Bus {
    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber){
        this.busNumber = busNumber;
    }
    public void take(int money){  //승차 메서드
        this.money += money;
        passengerCount++;

    }
    public void BusInfo(){
        System.out.println(busNumber + "번의 승객은" + passengerCount +" 이고 , 수입은" + money +"입니다.");
    }
}
