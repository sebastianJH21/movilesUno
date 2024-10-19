package com.example;

public class Calculadora{

    public int sumar (int numOne,int numTwo){
        return  numOne + numTwo;
    }
    public int sumar (int numOne,int numTwo, int numThree){
        return  numOne + numTwo + numThree;
    }
    public double  sumar (double  numOne,double  numTwo){
        return  numOne + numTwo;
    }
}
class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int suma1 = calculadora.sumar(1, 1);
        int suma2 = calculadora.sumar(1, 1, 1);
        double suma3 = calculadora.sumar(1.5, 1.5);
        System.out.println(suma1);
        System.out.println(suma2);
        System.out.println(suma3);
    }
}