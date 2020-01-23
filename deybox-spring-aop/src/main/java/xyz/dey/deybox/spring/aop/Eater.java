package xyz.dey.deybox.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Eater {

    public void eatCake() {
        System.out.println("eat a piece of cake ...");
    }

    public void eatSteak() {
        System.out.println("eat a steak ...");
    }

    public void eatPizza(String name) {
        Pizza pizza = new Pizza(name);
        System.out.println("eat a pizza:" + pizza.getName());
    }

    public void eatPizza(Pizza pizza) {
        System.out.println("eat a pizza:" + pizza.getName());
    }

    public void eatSeafood(){
        System.out.println("eat seafood");
    }
}

