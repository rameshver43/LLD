package org.example.lld.StrategyDesignPattern.after;

public class GoodsVehicle extends Vehicle{
    GoodsVehicle() {
        super(new SportsDriveStrategy());
    }
}
