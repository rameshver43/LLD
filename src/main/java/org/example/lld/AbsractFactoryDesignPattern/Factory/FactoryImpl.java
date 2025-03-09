package org.example.lld.AbsractFactoryDesignPattern.Factory;

import org.example.lld.AbsractFactoryDesignPattern.Factory.VehicleFactory.LuxuaryVehicle;
import org.example.lld.AbsractFactoryDesignPattern.Factory.VehicleFactory.OrdinaryVehicle;
import org.example.lld.AbsractFactoryDesignPattern.Factory.VehicleFactory.VehicleFactory;

public class FactoryImpl implements Factory{
    @Override
    public VehicleFactory getShape(String input) {
        switch (input){
            case "lux":
                return new LuxuaryVehicle();
            case "ordinary":
                return new OrdinaryVehicle();
            default:
                return null;
        }
    }
}
