package coperation;

import java.awt.*;

public class StarCofffee {
    int money;

    public String buy(int money){
        this.money -= money;
        if (money == Meue.STARAMERICANO){
            return "별다방 아메리카노를 구매했습니다.";
        }else if (money ==Meue.STARLATTEE ){
            return "별다방 라떼를 구매하였습니다.";

        }else {
            return null;
        }
    }
}
