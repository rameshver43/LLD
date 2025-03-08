package org.example.hibernate.StrategyDesignPattern.after;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super(new NormalDriveStrategy());
    }
}
