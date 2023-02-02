package org.example.designpatterns.factorydesignpattern;

public class Fish extends Food{
    public Fish(int quantity) {
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Hay eaten:" + getQuantity());
    }
}
