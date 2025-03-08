package org.example.hibernate.StrategyDesignPattern.after;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle() {
        super(new SportsDriveStrategy());
    }
}
