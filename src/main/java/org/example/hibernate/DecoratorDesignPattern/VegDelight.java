package org.example.hibernate.DecoratorDesignPattern;

public class VegDelight implements BasePizza{
    @Override
    public int cost() {
        return 120;
    }
}
