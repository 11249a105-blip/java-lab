class OrderPlacement extends Thread {
    public void run() {
        System.out.println("Order Placed");
    }
}
class OrderDelivery extends Thread {
    public void run() {
        System.out.println("Order Delivered");
    }
}
public class FoodDelivery {
public static void main(String[]args) {
OrderPlacement t1 = new OrderPlacement();
    OrderDelivery t2 = new OrderDelivery();
    t1.start();
    t2.start();
}
}