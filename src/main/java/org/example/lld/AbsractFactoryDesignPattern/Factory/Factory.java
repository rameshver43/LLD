package org.example.lld.AbsractFactoryDesignPattern.Factory;

import org.example.lld.AbsractFactoryDesignPattern.Factory.VehicleFactory.VehicleFactory;
import org.example.lld.AbsractFactoryDesignPattern.Vehicle;

public interface Factory {
    VehicleFactory getShape(String input);
}
