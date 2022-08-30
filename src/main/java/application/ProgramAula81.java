package application;

import entities.Product;
import entities.Product2;
import entities.ProductAula81;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAula81 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ProductAula81 prod = new ProductAula81();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        ProductAula81 product;
        prod = new ProductAula81(name, price);

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