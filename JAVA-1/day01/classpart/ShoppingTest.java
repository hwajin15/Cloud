package classpart;

public class ShoppingTest {
    public static void main(String[] args) {
        Shopping shopping = new Shopping();
        shopping.orderNumber =2721001;
        shopping.orderId ="abc123";
        shopping.orderDate ="2019년 7월 21일";
        shopping.orderName ="홍길순";
        shopping.orderItem="PD0345-12";
        shopping.address ="서울시 영등포구 여의도동 20번지";

        System.out.println(shopping.orderNumber);
        System.out.println(shopping.orderId);
        System.out.println(shopping.orderDate);
        System.out.println(shopping.orderName);
        System.out.println(shopping.orderItem);
        System.out.println(shopping.address);

    }
}
