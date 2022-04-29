package com.ec.oop.exercises.problem12;

import com.ec.oop.exercises.problem12.entity.Car;
import com.ec.oop.exercises.problem12.entity.Motorbike;
import com.ec.oop.exercises.problem12.entity.Vehicle;
import com.ec.oop.exercises.problem12.entity.Truck;
import com.ec.oop.exercises.problem12.service.VehicleManager;

public class Main {

    public static void main(String[] args) {

        VehicleManager vehicleManager = new VehicleManager();

        Vehicle car1 =
            new Car(1, "Mercedes", 2019, 500000, "Black", 5, "V8");

        Vehicle motorbike1 =
            new Motorbike(2, "Honda", 2020, 1500, "Blue", 150);

        Vehicle truck1 =
            new Truck(3, "Thaco", 2016, 5000, "White", 20);

        Vehicle car2 =
            new Car(4, "Honda", 2022, 300000, "Black", 7, "V6");

        vehicleManager.addVehicle(car1);
        vehicleManager.addVehicle(motorbike1);
        vehicleManager.addVehicle(truck1);
        vehicleManager.addVehicle(car2);

        vehicleManager.showList();

        /*System.out.println(vehicleManager.removeById(2));
        vehicleManager.showList();*/

        System.out.println("Find by manufacturer: Honda");
        System.out.println(vehicleManager.findByManufacturer("honda"));

        System.out.println("Find by color: Black");
        System.out.println(vehicleManager.findByColor("black"));

    }

}
