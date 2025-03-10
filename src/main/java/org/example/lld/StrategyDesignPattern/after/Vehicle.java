package org.example.lld.StrategyDesignPattern.after;

public class Vehicle {
    private final DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }
    public void drive(){
        this.driveStrategy.drive();
    }
}
