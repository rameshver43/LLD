package org.example.hibernate.StrategyDesignPattern.after;

public class SportsVehicle extends Vehicle{

    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
