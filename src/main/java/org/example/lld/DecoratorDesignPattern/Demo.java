package org.example.lld.DecoratorDesignPattern;

import org.example.lld.DecoratorDesignPattern.Topping.ExtraCheese;
import org.example.lld.DecoratorDesignPattern.Topping.Mushroom;

public class Demo {
    public static void main(String[] args) {

        BasePizza newPizza = new ExtraCheese(new Mushroom(new ExtraCheese(new Margherita())));
        System.out.println("Cost: " + newPizza.cost());

    }
}
