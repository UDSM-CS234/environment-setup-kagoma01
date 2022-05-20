package com.company;
import java.util.Scanner;
public class InvoiceTest {
    public static void main(String[] args){
        Invoice inv1 = new Invoice("2", "Indoor", 5, 35.0);

        // print invoice
        System.out.printf("Invoice: %n%s: %s (%s) %n%s: %d %n%s: %.2f",
                "part number", inv1.getPartNumber(), inv1.getPartDescription(),
                "quantity", inv1.getQuantity(), "price per item", inv1.getPricePerItem()
        );

        Scanner input = new Scanner(System.in);

        System.out.printf("%nEnter part number: ");
        String partNumber = input.nextLine();
        System.out.printf("%nEnter part description: ");
        String partDescription = input.nextLine();
        System.out.printf("%nEnter item quantity (number): ");
        int quantity = input.nextInt();
        System.out.printf("%nEnter price per item value: ");
        double pricePerItem = input.nextDouble();

        inv1.setPartNumber(partNumber);
        inv1.setPartDescription(partDescription);
        inv1.setQuantity(quantity);
        inv1.setPricePerItem(pricePerItem);
        inv1.getTotalCost();

        System.out.printf("Invoice: %n%s: %s (%s) %n%s: %d %n%s: %.2f %n%s: %.2f",
                "part number", inv1.getPartNumber(), inv1.getPartDescription(),
                "quantity", inv1.getQuantity(), "price per item", inv1.getPricePerItem(), "Total Cost", inv1.getTotalCost()
        );
    }
}
