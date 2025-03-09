package org.example.lld.DecoratorDesignPattern.Topping;

import org.example.lld.DecoratorDesignPattern.BasePizza;

public class Mushroom implements ToppingDecorator{
    BasePizza basePizza;

    public Mushroom(BasePizza basePizza){
        this.basePizza  = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 15;
    }
}
