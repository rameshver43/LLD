package org.example.hibernate.DecoratorDesignPattern.Topping;

import org.example.hibernate.DecoratorDesignPattern.BasePizza;

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
