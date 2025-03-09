package org.example.lld.StrategyDesignPattern.after;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle() {
        super(new SportsDriveStrategy());
    }
}
