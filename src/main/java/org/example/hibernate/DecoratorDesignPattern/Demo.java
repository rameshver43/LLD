package org.example.hibernate.DecoratorDesignPattern;

import org.example.hibernate.DecoratorDesignPattern.Topping.ExtraCheese;
import org.example.hibernate.DecoratorDesignPattern.Topping.Mushroom;

public class Demo {
    public static void main(String[] args) {

        BasePizza newPizza = new ExtraCheese(new Mushroom(new ExtraCheese(new Margherita())));
        System.out.println("Cost: " + newPizza.cost());

    }
}
