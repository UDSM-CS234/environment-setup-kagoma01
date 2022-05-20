package com.company;

public class Pencil {
    String color;
    double length;
    double price;

    Pencil(String c, double l, double p){
        this. color = c;
        this.length = l;
        this.price = p;
    }

    public void display(){
        System.out.println("the color of the pencil is " + color);
        System.out.println("the length of the pencil is " + length);
        System.out.println("the price of the pencil is " + price);
    }

    public static void main(String[] args){

        Pencil  large = new Pencil("red", 9.56, 5.0);
        Pencil small = new Pencil("blue", 4.35, 3.08);

        large.display();
        small.display();

    }
}
