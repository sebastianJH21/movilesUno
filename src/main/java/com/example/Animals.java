package com.example;

public class Animals {

    public void makeSound (){
        System.out.println("El animal hace reuido");
    }

}

class Cat extends  Animals {
    public void makeSound (){
        System.out.println("El Gato Maulla");
    }
}
class Dog extends  Animals {
    public void makeSound (){
        System.out.println("El Perro Ladra");
    }
}
class Cow extends  Animals {
    public void makeSound (){
        System.out.println("La Vaca Muge");
    }
}

// class Main {
//     public static void main(String[] args) {
//         Animals Cat = new Cat();
//         Animals Dog = new Dog();
//         Animals Cow = new Cow();
//         Cat.makeSound();
//         Dog.makeSound();
//         Cow.makeSound();
//     }
// }