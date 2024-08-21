package com.test_07_22.Interface.exp3;

public class VihicleTest {
    public static void main(String[] args) {
        Developer d1 = new Developer();

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Bicycle();
        vehicles[1] = new Car();
        vehicles[2] = new ElectricVehicle();

        for(Vehicle i : vehicles) {
            d1.takingVehicle(i);
            if(i instanceof IPower) {
                ((IPower) i).power();
            }
        }


        //        for (int i = 0; i < vehicles.length; i++) {
        //            d1.takingVehicle(vehicles[i]);
        //            if(vehicles[i] instanceof IPower) {
        //                ((IPower) vehicles[i]).power();
        //            }
        //        }
    }
}
