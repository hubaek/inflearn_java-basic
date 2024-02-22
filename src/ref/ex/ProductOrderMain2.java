package ref.ex;


public class ProductOrderMain2 {

    public static void main(String[] args) {

        ProductOrder[] orders = new ProductOrder[3];

        orders[0] = creatOrder("김치",2,2000);
        orders[1] = creatOrder("두부",1,5000);
        orders[2] = creatOrder("콜라",2,1500);

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);   // opt+cmd+v 
        System.out.println("총 결제 금액  = " + totalAmount);
    }

    static ProductOrder creatOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }
    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}

