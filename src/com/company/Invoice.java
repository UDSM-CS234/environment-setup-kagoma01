package com.company;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    private double totalCost;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem){
        // validating quantity
        if(quantity < 0){
            System.out.println("Invalid quantity data");
        }
        if(pricePerItem < 0){
            System.out.println("Invalid price per item value");
        }

        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
        totalCost = 0.0;
    }

    // getters for the instance variables
    public String getPartNumber(){
        return partNumber;
    }

    public String getPartDescription(){
        return partDescription;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getTotalCost(){
        totalCost = this.getPricePerItem() * this.getQuantity();
        return totalCost;
    }

    public double getPricePerItem(){
        return pricePerItem;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
