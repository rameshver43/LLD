package org.example.hibernate.StrategyDesignPattern.after;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle() {
        super(new SportsDriveStrategy());
    }
}
