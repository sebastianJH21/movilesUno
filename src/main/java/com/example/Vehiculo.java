package com.example;

public class Vehiculo {

    public void acelerate (){
        System.out.println("El vehiculo esta acelerando");
    }

}

class Auto extends  Vehiculo {
    public void acelerate (){
        System.out.println("El vehiculo esta acelerando a 100 Km/h");
    }
}

// class Main {
//     public static void main(String[] args) {
//         Vehiculo myVehiculo1 = new Vehiculo();
//         myVehiculo1.acelerate();
//         Vehiculo myVehiculo2 = new Auto();
//         myVehiculo2.acelerate();
//     }
// }