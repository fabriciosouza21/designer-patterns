package org.example.cars;

import org.example.cars.components.Engine;
import org.example.cars.components.GPSNavigator;
import org.example.cars.components.Transmission;
import org.example.cars.components.TripComputer;

public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;

    private final GPSNavigator gpsNavigator;

    private final TripComputer tripComputer;

    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, GPSNavigator gpsNavigator, TripComputer tripComputer) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.gpsNavigator = gpsNavigator;
        this.tripComputer = tripComputer;
    }

    public CarType getCarType() {
        return carType;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }
}
