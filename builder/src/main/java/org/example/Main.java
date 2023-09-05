package org.example;

import org.example.builders.CarManualBuilder;
import org.example.builders.Carbuilder;
import org.example.cars.Car;
import org.example.cars.Manual;
import org.example.director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Carbuilder carbuilder = new Carbuilder();
        director.constructSportsCar(carbuilder);

        Car car = carbuilder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSportsCar(carManualBuilder);
        Manual carManual = carManualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}