package org.example.designpatterns.factorydesignpattern;

public class Pellets extends Food{
    public Pellets(int quantity) {
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Hay eaten:" + getQuantity());
    }
}
