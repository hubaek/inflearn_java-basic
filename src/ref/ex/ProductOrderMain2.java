package ref.ex;


public class ProductOrderMain2 {

    public static void main(String[] args) {

        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder order1 = creatOrder("김치",2,2000);
        ProductOrder order2 = creatOrder("두부",1,5000);
        ProductOrder order3 = creatOrder("콜라",2,1500);
        orders[0] = order1;
        orders[1] = order2;
        orders[2] = order3;

        printOrders(orders);
        System.out.println("총 결제 금액  = " + getTotalAmount(orders));

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

