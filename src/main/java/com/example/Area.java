package com.example;

public class Area{

    public double calculateArea (double radio){
        return Math.PI * Math.pow(radio,2);
    }
    public int calculateArea (int base, int heigth){
        return base * heigth;
    }
    public double calculateArea (double base, double heigth){
        return (base * heigth)/2;
    }
}
class Main {
    public static void main(String[] args) {
        Area Area = new Area();
        int Area1 = Area.calculateArea(1, 1);
        int Area2 = Area.calculateArea(1, 1);
        double Area3 = Area.calculateArea(10.0, 10.0);
        System.out.println(Area1);
        System.out.println(Area2);
        System.out.println(Area3);
    }
}