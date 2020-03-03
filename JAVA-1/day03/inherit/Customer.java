package inherit;

public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    double bonusPoint;
    double bonusRatio;

    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName =customerName;
        customerGrade ="SLIVER";
        bonusRatio = 0.01;
    }

    public Customer() {
    }

    public int CalcPrice(int price){
        bonusPoint = price * bonusRatio;
        return price;
    }
    public String showCusotomerInfo(){
        return  customerName +"님의 등급은" + customerGrade +"이며 적립된 포인트는" + bonusPoint + " 입니다";
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
