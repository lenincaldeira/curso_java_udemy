package application;

import entities.Product;
import entities.Product2;
import entities.ProductAula79;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAula79 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ProductAula79 prod = new ProductAula79();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        Product2 product;
        prod = new ProductAula79(name, price);

        prod.setName("Computer");
        System.out.println("Updated name: " + prod.getName());
        prod.setPrice(1200.00);
        System.out.println("Updated price: " + prod.getPrice());

        System.out.println();
        System.out.println("Product data: " + prod);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        prod.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + prod);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        prod.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + prod);

        sc.close();

    }
}