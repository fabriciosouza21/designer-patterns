package org.example.builders;

import org.example.cars.CarType;
import org.example.cars.components.Engine;
import org.example.cars.components.GPSNavigator;
import org.example.cars.components.Transmission;
import org.example.cars.components.TripComputer;

public interface Builder {

        void setCarType(CarType type);

        void setSeats(int seats);

        void setEngine(Engine engine);

        void setTransmission(Transmission transmission);

        void setTripComputer(TripComputer tripComputer);

        void setGPSNavigator(GPSNavigator gpsNavigator);
}
