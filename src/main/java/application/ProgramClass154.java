package application;

import java.text.ParseException;

import entities.ClientClass154;
import entities.OrderClass154;
import entities.OrderItemClass154;
import entities.ProductClass154;
import entities.enums.OrderStatusClass154;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramClass154 {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        ClientClass154 client = new ClientClass154(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatusClass154 status = OrderStatusClass154.valueOf(sc.next());

        OrderClass154 orderClass154 = new OrderClass154(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            ProductClass154 product = new ProductClass154(productName, productPrice);

            OrderItemClass154 it = new OrderItemClass154(quantity, productPrice, product);

            orderClass154.addItem(it);
        }

        System.out.println();
        System.out.println(orderClass154);

        sc.close();

    }
}
