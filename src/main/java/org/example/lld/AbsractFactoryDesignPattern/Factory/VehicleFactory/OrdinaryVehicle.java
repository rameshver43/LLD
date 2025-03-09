package org.example.lld.AbsractFactoryDesignPattern.Factory.VehicleFactory;

import org.example.lld.AbsractFactoryDesignPattern.Honda;
import org.example.lld.AbsractFactoryDesignPattern.Ordinary;
import org.example.lld.AbsractFactoryDesignPattern.Vehicle;

public class OrdinaryVehicle implements VehicleFactory{
    @Override
    public Vehicle getShape(String input) {
        switch (input){
            case "honda":
                return new Honda();
            case "ordinary":
                return new Ordinary();
            default:
                return null;
        }
    }
}
