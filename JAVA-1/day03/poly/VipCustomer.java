package poly;

public class VipCustomer extends Customer {
    double salesRatio;
    private int agentID;

    public VipCustomer(int customerID, String name){
        this.customerID = customerID;
        this.customerName =name;
        customerGrade ="VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }
    @Override
    public int CalcPrice(int price) {
        bonusPoint += price + bonusRatio;
        return  price -(int)(price *salesRatio);
    }
}
