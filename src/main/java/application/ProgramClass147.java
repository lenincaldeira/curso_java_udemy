package application;

import entities.OrderClass147;
import entities.enums.OrderStatusClass147;

import java.util.Date;

public class ProgramClass147 {

    public static void main(String[] args) {

        OrderClass147 order = new OrderClass147(1080, new Date(), OrderStatusClass147.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatusClass147 os1 = OrderStatusClass147.DELIVERED;
        OrderStatusClass147 os2 = OrderStatusClass147.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
