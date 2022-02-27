package com.lesson15.homework;

import java.util.Scanner;

public class InvoiceCalculator {
    public static void main(String[] args) {
        Invoice invoice;
        String deviceModel;
        String productDescription;
        int qtyOfProductsPurchased;
        double priceForProduct;
        Scanner scanner = new Scanner(System.in);
        int k;
        System.out.println(" To initialize the object via Constructor enter 1.");
        System.out.println(" To initialize the object via Setter enter 2.");
        k = scanner.nextInt();
        scanner.nextLine();
        switch (k) {
            case 1:
                System.out.println("Enter the device model:");
                deviceModel = scanner.nextLine();
                System.out.println("Enter the product description:");
                productDescription = scanner.nextLine();
                System.out.println("Enter the quantity of products purchased:");
                qtyOfProductsPurchased = scanner.nextInt();
                System.out.println("Enter the product price:");
                priceForProduct = scanner.nextDouble();
                invoice = new Invoice(deviceModel, productDescription, qtyOfProductsPurchased, priceForProduct);
                System.out.println(invoice.toString());
                System.out.println("The amount of invoice is : " + invoice.getAmount());
                break;

            case 2:
                invoice = new Invoice();
                System.out.println("Enter the device model:");
                invoice.setDeviceModel(scanner.nextLine());
                System.out.println("Enter the product description:");
                invoice.setProductDescription(scanner.nextLine());
                System.out.println("Enter the quantity of products purchased:");
                invoice.setQtyOfProductsPurchased(scanner.nextInt());
                System.out.println("Enter the product price:");
                invoice.setPriceForProduct(scanner.nextDouble());

                System.out.println(invoice.toString());
                System.out.println("The amount of invoice is : " + invoice.getAmount());
                break;

        }
        scanner.close();

    }
}
