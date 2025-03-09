package org.example.lld.FactoryDesignPattern.Factory;

import org.example.lld.FactoryDesignPattern.Shape;

public interface ShapeFactory {
    Shape getShape(String input);
}
