package coperation;

public class BeanCoffee {
    int money;
    public  String buy(){
        this.money -= money;
        if (money == Meue.BEANAMERICANO){
            return "콩다방 아메리카노를 구입하였습니다.";
        }else if (money == Meue.BEANLATTEE){
            return "콩다방 라뗴를 구매하였습니다. ";
        }else {
            return null;
        }
    }

}
