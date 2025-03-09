package org.example.lld.AbsractFactoryDesignPattern.Factory.VehicleFactory;

import org.example.lld.AbsractFactoryDesignPattern.Vehicle;

public interface VehicleFactory {
    Vehicle getShape(String input);
}
