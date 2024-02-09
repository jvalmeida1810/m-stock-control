package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter Product data: ");
        System.out.println("Name: ");
        product.name = sc.next();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity in stock:");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println(" Product data: " + product.toString());
        System.out.println();
        System.out.println("Enter the number of products to be added in stock:");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println();
        System.out.println(" Updated data: " + product.toString());
        System.out.println();
        System.out.println("Enter the number of products to be removed from stock:");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println();
        System.out.println(" Updated data: " + product.toString());
        sc.close();
    }
}
